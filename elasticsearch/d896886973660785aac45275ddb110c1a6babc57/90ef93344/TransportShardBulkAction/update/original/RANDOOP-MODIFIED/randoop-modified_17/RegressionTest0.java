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
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction6 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper7 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters8 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction10 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings0, transportService1, clusterService2, indicesService3, threadPool4, shardStateAction5, mappingUpdatedAction6, updateHelper7, actionFilters8, indexNameExpressionResolver9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created_string" + "'", str0, "index.version.created_string");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FILESYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem" + "'", str0, "index.shared_filesystem");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded_string" + "'", str0, "index.version.upgraded_string");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.elasticsearch.common.io.stream.StreamInput streamInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest1 = org.elasticsearch.action.bulk.BulkItemRequest.readBulkItem(streamInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHADOW_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shadow_replicas" + "'", str0, "index.shadow_replicas");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.junit.Assert.assertNull(shardRouting5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_PRIMARY_TERMS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "primary_terms" + "'", str0, "primary_terms");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_SHARDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_shards" + "'", str0, "index.number_of_shards");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "primary_terms");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_ACTIVE_ALLOCATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_allocations" + "'", str0, "active_allocations");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_DATA_PATH_SETTING;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.data_path" + "'", str0, "index.data_path");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest2.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout("primary_terms");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [primary_terms]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_REPLICAS_SETTING;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = intSetting0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_STATE_FILE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "state-" + "'", str0, "state-");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.number_of_shards", custom1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [hi!]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [10]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_UUID_NA_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_na_" + "'", str0, "_na_");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem.recover_on_any_node" + "'", str0, "index.shared_filesystem.recover_on_any_node");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SETTING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index." + "'", str0, "index.");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_ONLY_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = org.elasticsearch.action.bulk.TransportShardBulkAction.ACTION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "indices:data/write/bulk[s]" + "'", str0, "indices:data/write/bulk[s]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date_string" + "'", str0, "index.creation_date_string");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.elasticsearch.common.io.stream.StreamInput streamInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.Builder.readFrom(streamInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_MINIMUM_COMPATIBLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.minimum_compatible" + "'", str0, "index.version.minimum_compatible");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, "index.version.created_string");
        java.lang.Class<?> wildcardClass6 = bulkShardRequest1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded" + "'", str0, "index.version.upgraded");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_READ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read" + "'", str0, "index.blocks.read");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_NAME;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("hi!");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> toXContentTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>((org.elasticsearch.common.xcontent.ToXContent) strSetting0, builder2);
        org.junit.Assert.assertNotNull(strSetting0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_shards", throwable2, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date" + "'", str0, "index.creation_date");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte1 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INCLUDE_GROUP_SETTING;
        org.junit.Assert.assertNotNull(settingsSetting0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.created_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_replicas" + "'", str0, "index.number_of_replicas");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_AUTO_EXPAND_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.auto_expand_replicas" + "'", str0, "index.auto_expand_replicas");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.elasticsearch.common.settings.Settings settings0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putMapping(mappingMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.tasks.TaskId taskId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task7 = bulkShardRequest1.createTask((long) (byte) 0, "index.auto_expand_replicas", "index.creation_date", taskId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (short) 10, bulkItemRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = serializableTuple6.v2();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(bulkItemRequest7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_UUID;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("hi!", custom5);
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.settings(settings7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.primaryTerm((int) '4', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shadow_replicas", throwable2, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_PRIORITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.priority" + "'", str0, "index.priority");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_WRITE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.write" + "'", str0, "index.blocks.write");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("hi!", custom5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder6.primaryTerm(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.number_of_replicas]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.elasticsearch.common.unit.TimeValue timeValue0 = null;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting1 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.unit.TimeValue, org.elasticsearch.action.support.ToXContentToBytes> timeValueTuple2 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.unit.TimeValue, org.elasticsearch.action.support.ToXContentToBytes>(timeValue0, (org.elasticsearch.action.support.ToXContentToBytes) settingsSetting1);
        org.junit.Assert.assertNotNull(settingsSetting1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.creation_date", throwable2, "_na_");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.created_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_READ_ONLY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read_only" + "'", str0, "index.blocks.read_only");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.common.settings.Settings settings0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.elasticsearch.common.settings.Settings settings0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("hi!", custom5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder3.primaryTerm(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putCustom("index.", custom6);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "hi!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.elasticsearch.common.xcontent.XContentParser xContentParser0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.Builder.fromXContent(xContentParser0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_METADATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.metadata" + "'", str0, "index.blocks.metadata");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.common.io.stream.StreamInput streamInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.readFromStream(streamInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shadow_replicas", throwable2, "index.shared_filesystem");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.minimum_compatible]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        boolean boolean6 = serializableTuple4.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (byte) -1);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder10.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = serializableTuple4.equals((java.lang.Object) builder17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_replicas", throwable2, "index.blocks.write");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = builder2.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [0] is higher or equal to the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [0] is higher or equal to the one provided [1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = indexMetaData0.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem.recover_on_any_node");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("current version [0] is higher or equal to the one provided [0]", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest4.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder4, params5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        int int4 = builder3.numberOfReplicas();
        java.util.Set<java.lang.String> strSet6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putActiveAllocationIds((int) (byte) 0, strSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        int int4 = builder3.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putMapping("index.creation_date_string", "index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.transport.TransportService transportService4 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService5 = null;
        org.elasticsearch.indices.IndicesService indicesService6 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool7 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction8 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction9 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper10 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters11 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction13 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings3, transportService4, clusterService5, indicesService6, threadPool7, shardStateAction8, mappingUpdatedAction9, updateHelper10, actionFilters11, indexNameExpressionResolver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.creation_date_string", throwable2, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte1 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (-1L), bulkItemRequest3);
        int int5 = 0; // flaky: bulkItemRequest3.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData4.includeFilters();
        org.elasticsearch.common.xcontent.XContentParser xContentParser10 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = indexMetaData4.fromXContent(xContentParser10, parseFieldMatcher11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes;
        org.junit.Assert.assertNull(strMap0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData4, xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [0] is higher or equal to the one provided [1]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.minimum_compatible", throwable2, "index.blocks.read_only");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = indexMetaData0.toXContent(xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        java.lang.String str2 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = indexMetaData0.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_na_" + "'", str2, "_na_");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version11 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder12, params13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNull(version11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "hi!");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.blocks.read_only", bulkItemRequest5);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest5.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest4);
        boolean boolean7 = serializableTuple5.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = serializableTuple5.equals((java.lang.Object) builder18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest21.consistencyLevel();
        boolean boolean25 = serializableTuple5.equals((java.lang.Object) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.index.shard.ShardId shardId27 = bulkShardRequest21.shardId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray28 = bulkShardRequest21.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(shardId27);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap11 = indexMetaData8.getMappings();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>> indexMetaDataFromXContentBuilderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = indexMetaData0.toXContent(xContentBuilder13, params14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.index("index.number_of_replicas");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = builder7.numberOfReplicas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.blocks.read]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("hi!", custom5);
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.settings(settings7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = builder3.numberOfReplicas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("hi!", custom5);
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.settings(settings7);
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder3.settings(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_na_", custom5);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putAlias(aliasMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        java.lang.String str2 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params4 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = indexMetaData0.toXContent(xContentBuilder3, params4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_na_" + "'", str2, "_na_");
        org.junit.Assert.assertNotNull(params4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.version((long) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.version((long) (short) 100);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putAlias(aliasMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.xcontent.XContentParser xContentParser9 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = indexMetaData0.fromXContent(xContentParser9, parseFieldMatcher10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        byte byte2 = versionType1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType3 = org.elasticsearch.index.VersionType.fromString("_na_", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [_na_]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest6.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("active_allocations");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [active_allocations]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created" + "'", str0, "index.version.created");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        org.elasticsearch.transport.TransportService transportService5 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService6 = null;
        org.elasticsearch.indices.IndicesService indicesService7 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool8 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction9 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction10 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper11 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters12 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction14 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings4, transportService5, clusterService6, indicesService7, threadPool8, shardStateAction9, mappingUpdatedAction10, updateHelper11, actionFilters12, indexNameExpressionResolver13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.state(state4);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putAlias(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest15.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10, indicesOptions18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions> transportRequestTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.transport.TransportRequest) bulkShardRequest3, indicesOptions18);
        org.elasticsearch.common.io.stream.StreamInput streamInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions18);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData5.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        boolean boolean12 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexMetaData0.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_replicas", throwable2, "index.shadow_replicas");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shadow_replicas" + "'", str5, "index.shadow_replicas");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.read_only] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        org.elasticsearch.common.xcontent.XContentParser xContentParser6 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.fromXContent(xContentParser6, parseFieldMatcher7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest5);
        boolean boolean8 = serializableTuple6.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.version((long) (byte) -1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder12.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = serializableTuple6.equals((java.lang.Object) builder19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = bulkShardRequest22.consistencyLevel();
        boolean boolean26 = serializableTuple6.equals((java.lang.Object) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = bulkShardRequest22.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId29 = null;
        bulkShardRequest22.setParentTask(taskId29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.common.io.stream.StreamInput streamInput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest22.readFrom(streamInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(transportAddress28);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        org.elasticsearch.transport.TransportService transportService5 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService6 = null;
        org.elasticsearch.indices.IndicesService indicesService7 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool8 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction9 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction10 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper11 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters12 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction14 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings3, transportService5, clusterService6, indicesService7, threadPool8, shardStateAction9, mappingUpdatedAction10, updateHelper11, actionFilters12, indexNameExpressionResolver13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap11 = indexMetaData8.getMappings();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>> indexMetaDataFromXContentBuilderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params14 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = indexMetaData0.toXContent(xContentBuilder13, params14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(params14);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        boolean boolean9 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_na_", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.version((long) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder16.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder6.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder6.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder6.putAlias(aliasMetaData28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest5);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple7 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (short) 10, bulkItemRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = serializableTuple7.v2();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple9 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.version.upgraded_string", bulkItemRequest8);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(bulkItemRequest8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = indexMetaData0.toXContent(xContentBuilder4, params5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.version((long) (short) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params6 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = indexMetaData0.toXContent(xContentBuilder5, params6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte5 = versionType4.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest3, (org.elasticsearch.common.io.stream.Writeable) versionType4);
        boolean boolean10 = versionType4.isVersionConflictForWrites(0L, 1L, false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        org.elasticsearch.transport.TransportService transportService8 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService9 = null;
        org.elasticsearch.indices.IndicesService indicesService10 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool11 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction12 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction13 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper14 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters15 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction17 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService8, clusterService9, indicesService10, threadPool11, shardStateAction12, mappingUpdatedAction13, updateHelper14, actionFilters15, indexNameExpressionResolver16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        org.elasticsearch.transport.TransportService transportService13 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService14 = null;
        org.elasticsearch.indices.IndicesService indicesService15 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool16 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction17 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction18 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper19 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters20 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction22 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings9, transportService13, clusterService14, indicesService15, threadPool16, shardStateAction17, mappingUpdatedAction18, updateHelper19, actionFilters20, indexNameExpressionResolver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest5.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        boolean boolean6 = serializableTuple4.equals((java.lang.Object) 1L);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = serializableTuple4.v2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bulkItemRequest7.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(bulkItemRequest7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest3.timeout("index.auto_expand_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.auto_expand_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData0, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest5.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.created");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.created]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder3.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet8);
        java.lang.String str11 = builder3.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder3.creationDate((long) (short) -1);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.putAlias(aliasMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.tasks.TaskId taskId2 = null;
        bulkShardRequest0.setParentTask(taskId2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (short) 100, bulkItemRequest5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        java.lang.String str11 = indexMetaData4.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap12 = indexMetaData4.getActiveAllocationIds();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params14 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = indexMetaData4.toXContent(xContentBuilder13, params14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap12);
        org.junit.Assert.assertNotNull(params14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putAlias(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.shared_filesystem.recover_on_any_node");
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        boolean boolean6 = serializableTuple4.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (byte) -1);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder10.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = serializableTuple4.equals((java.lang.Object) builder17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest20.consistencyLevel();
        boolean boolean24 = serializableTuple4.equals((java.lang.Object) bulkShardRequest20);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest20.setShardId(shardId25);
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest26.setParentTask("", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [0] is different than the one provided [100]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.settings(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.settings(settings7);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings7, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_BLOCK;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("_na_", custom8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.version((long) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder14.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder9.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params2, (java.lang.Iterable<java.lang.String>) strSet24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = clusterBlock0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(clusterBlock0);
        org.junit.Assert.assertNotNull(params2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [-1] is higher or equal to the one provided [0]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("", "index.shared_filesystem.recover_on_any_node");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.readDiffFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [3]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple9 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) true, bulkItemRequest8);
        int int10 = bulkItemRequest8.id();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData4.includeFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = indexMetaData4.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(params11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        int int4 = builder3.numberOfShards();
        java.lang.String str5 = builder3.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.numberOfShards((int) '#');
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.settings(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shared_filesystem" + "'", str5, "index.shared_filesystem");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        int int4 = builder3.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putMapping("index.version.upgraded", "current version [-1] is higher or equal to the one provided [0]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        int int6 = indexMetaData0.getNumberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = indexMetaData0.primaryTerm((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        org.elasticsearch.transport.TransportService transportService10 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService11 = null;
        org.elasticsearch.indices.IndicesService indicesService12 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool13 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction14 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction15 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper16 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters17 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction19 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService10, clusterService11, indicesService12, threadPool13, shardStateAction14, mappingUpdatedAction15, updateHelper16, actionFilters17, indexNameExpressionResolver18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putAlias(aliasMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putMapping("active_allocations", "index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = indexMetaData0.primaryTerm((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder16.putCustom("_na_", custom18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.version((long) (byte) -1);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder29.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder24.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder19.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple39 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params12, (java.lang.Iterable<java.lang.String>) strSet34);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder40 = indexMetaData4.toXContent(xContentBuilder11, params12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(params12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) 'a', (long) (short) -1);
        boolean boolean6 = versionType0.validateVersionForWrites((long) (short) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData4.includeFilters();
        org.elasticsearch.Version version10 = indexMetaData4.getCreationVersion();
        org.elasticsearch.common.xcontent.XContentParser xContentParser11 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = indexMetaData4.fromXContent(xContentParser11, parseFieldMatcher12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(version10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.putAlias(aliasMetaData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params4 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("_na_", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.version((long) (byte) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder21.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder16.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder11.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet26);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple31 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params4, (java.lang.Iterable<java.lang.String>) strSet26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = indexMetaData0.toXContent(xContentBuilder3, params4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(params4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.transport.TransportService transportService8 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService9 = null;
        org.elasticsearch.indices.IndicesService indicesService10 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool11 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction12 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction13 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper14 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters15 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction17 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings7, transportService8, clusterService9, indicesService10, threadPool11, shardStateAction12, mappingUpdatedAction13, updateHelper14, actionFilters15, indexNameExpressionResolver16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(settings7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [100]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData5.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.diff(indexMetaData5);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = indexMetaData0.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [0] is higher or equal to the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [0] is higher or equal to the one provided [0]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.version((long) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.putAlias(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putMapping("current version [0] is different than the one provided [100]", "index.data_path");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingMetaData5.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_shards", throwable2, "index.creation_date");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.number_of_shards" + "'", str5, "index.number_of_shards");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.creation_date" + "'", str6, "index.creation_date");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_INDEX_UUID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.uuid" + "'", str0, "index.uuid");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentParser xContentParser6 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.fromXContent(xContentParser6, parseFieldMatcher7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.shadow_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.transport.TransportService transportService9 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService10 = null;
        org.elasticsearch.indices.IndicesService indicesService11 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool12 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction13 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction14 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper15 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters16 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction18 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService9, clusterService10, indicesService11, threadPool12, shardStateAction13, mappingUpdatedAction14, updateHelper15, actionFilters16, indexNameExpressionResolver17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.shared_filesystem.recover_on_any_node");
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("_na_", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.version((long) (byte) -1);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder24.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder14.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params7, (java.lang.Iterable<java.lang.String>) strSet29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(params7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [-1]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [0] is higher or equal to the one provided [0]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("index.uuid", "index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = builder1.primaryTerm(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.creationDate((long) '#');
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.minimum_compatible", throwable2, "index.shadow_replicas");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shadow_replicas" + "'", str5, "index.shadow_replicas");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest1.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout("index.blocks.metadata");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.metadata] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(transportAddress5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData0, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = indexMetaData0.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        java.lang.String str2 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params4 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("_na_", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.version((long) (byte) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder21.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder16.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder11.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet26);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple31 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params4, (java.lang.Iterable<java.lang.String>) strSet26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = indexMetaData0.toXContent(xContentBuilder3, params4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_na_" + "'", str2, "_na_");
        org.junit.Assert.assertNotNull(params4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.putCustom("_na_", custom15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.version((long) (byte) -1);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder26.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder21.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder16.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params9, (java.lang.Iterable<java.lang.String>) strSet31);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(params9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.xcontent.XContentParser xContentParser3 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = indexMetaData0.fromXContent(xContentParser3, parseFieldMatcher4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.version.created", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings11, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean11 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        long long11 = indexMetaData4.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = indexMetaData4.primaryTerm((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_na_", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.version((long) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder16.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder6.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet21);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder25.putMapping("index.uuid", "index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData3.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData3.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        org.elasticsearch.transport.TransportMessage transportMessage9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder13.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>> transportMessageTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>>(transportMessage9, (java.util.Collection<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder7.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder1.putActiveAllocationIds((int) ' ', (java.util.Set<java.lang.String>) strSet18);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder1.primaryTerm((int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHADOW_REPLICAS_SETTING;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = booleanSetting0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanSetting0);
        org.junit.Assert.assertNotNull(params2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.shadow_replicas]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData4.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff11 = indexMetaData0.readDiffFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.transport.TransportService transportService13 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService14 = null;
        org.elasticsearch.indices.IndicesService indicesService15 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool16 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction17 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction18 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper19 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters20 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction22 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService13, clusterService14, indicesService15, threadPool16, shardStateAction17, mappingUpdatedAction18, updateHelper19, actionFilters20, indexNameExpressionResolver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData5.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        boolean boolean12 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = builder13.mapping("primary_terms");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(mappingMetaData15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = indexMetaData0.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shadow_replicas", throwable2, "index.blocks.write");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        org.junit.Assert.assertNull(throwable5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        bulkShardRequest6.setParentTask("index.creation_date_string", (-1L));
        long long10 = bulkShardRequest6.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.timeout("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.minimum_compatible] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = indexMetaData0.toXContent(xContentBuilder4, params5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("current version [100] is higher or equal to the one provided [1]");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest1.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.setShardId(shardId6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest1.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest10.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indicesOptions8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        bulkShardRequest0.setParentTask("index.number_of_replicas", (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout("index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.number_of_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.version((long) 'a');
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings9);
        org.elasticsearch.transport.TransportService transportService14 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService15 = null;
        org.elasticsearch.indices.IndicesService indicesService16 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool17 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction18 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction19 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper20 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters21 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction23 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings9, transportService14, clusterService15, indicesService16, threadPool17, shardStateAction18, mappingUpdatedAction19, updateHelper20, actionFilters21, indexNameExpressionResolver22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) 'a', (long) (short) -1);
        byte byte5 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType6.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest5);
        boolean boolean8 = serializableTuple6.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.version((long) (byte) -1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder12.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = serializableTuple6.equals((java.lang.Object) builder19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = bulkShardRequest22.consistencyLevel();
        boolean boolean26 = serializableTuple6.equals((java.lang.Object) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = bulkShardRequest22.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId29 = null;
        bulkShardRequest22.setParentTask(taskId29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest22.setParentTask("", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(transportAddress28);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData9.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData9.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        org.elasticsearch.transport.TransportMessage transportMessage15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.version((long) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>> transportMessageTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>>(transportMessage15, (java.util.Collection<java.lang.String>) strSet24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder13.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder7.putActiveAllocationIds((int) (byte) 100, (java.util.Set<java.lang.String>) strSet24);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = builder7.numberOfShards();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple7 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.blocks.read_only", bulkItemRequest6);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest6);
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest6.request();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "_na_", throwable2, "index.version.upgraded_string");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.junit.Assert.assertNull(shardRouting5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("state-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [state-]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("index.number_of_replicas", custom5);
        java.lang.String str7 = builder6.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.creationDate((long) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfReplicas((int) '#');
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.settings(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest4.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        java.lang.String str11 = indexMetaData4.getIndexUUID();
        int int12 = indexMetaData4.getNumberOfReplicas();
        org.elasticsearch.common.settings.Settings settings13 = indexMetaData4.getSettings();
        org.elasticsearch.transport.TransportService transportService14 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService15 = null;
        org.elasticsearch.indices.IndicesService indicesService16 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool17 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction18 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction19 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper20 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters21 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction23 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings13, transportService14, clusterService15, indicesService16, threadPool17, shardStateAction18, mappingUpdatedAction19, updateHelper20, actionFilters21, indexNameExpressionResolver22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(settings13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params8 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = indexMetaData0.toXContent(xContentBuilder7, params8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple7 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.blocks.read_only", bulkItemRequest6);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest6);
        java.io.Serializable serializable9 = serializableTuple8.v1();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + 10.0f + "'", serializable9, 10.0f);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = indexMetaData0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff11 = indexMetaData0.readDiffFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkItemRequest3.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) 'a', (long) (short) -1);
        byte byte5 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest10.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.shared_filesystem]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [-1] is higher or equal to the one provided [0]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [current version [-1] is higher or equal to the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(version6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.transport.TransportService transportService13 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService14 = null;
        org.elasticsearch.indices.IndicesService indicesService15 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool16 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction17 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction18 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper19 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters20 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction22 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings12, transportService13, clusterService14, indicesService15, threadPool16, shardStateAction17, mappingUpdatedAction18, updateHelper19, actionFilters20, indexNameExpressionResolver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder3.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData5.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData5);
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData5.getSettings();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder4.settings(settings8);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings8, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) '#', 1L);
        boolean boolean7 = versionType0.isVersionConflictForReads(1L, (long) (-1));
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure9 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.created", (java.lang.Throwable) actionRequestValidationException7, "indices:data/write/bulk[s]");
        java.lang.String str10 = shardFailure9.indexUUID;
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "indices:data/write/bulk[s]" + "'", str10, "indices:data/write/bulk[s]");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mapping("active_allocations");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder14.putCustom("_na_", custom16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder25.version((long) (byte) -1);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder27.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder22.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder17.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params10, (java.lang.Iterable<java.lang.String>) strSet32);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder38 = indexMetaData0.toXContent(xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(params10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (short) 10, bulkItemRequest4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest4.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData9.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData9.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        org.elasticsearch.transport.TransportMessage transportMessage15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.version((long) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>> transportMessageTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>>(transportMessage15, (java.util.Collection<java.lang.String>) strSet24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder13.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder7.putActiveAllocationIds((int) (byte) 100, (java.util.Set<java.lang.String>) strSet24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        long long4 = bulkShardRequest1.primaryTerm();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType3 = org.elasticsearch.index.VersionType.fromString("index.priority", versionType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.priority]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.creationDate(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple4 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest3);
        boolean boolean6 = serializableTuple4.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (byte) -1);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder10.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = serializableTuple4.equals((java.lang.Object) builder17);
        java.lang.Class<?> wildcardClass19 = builder17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.readDiffFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.shared_filesystem]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        bulkShardRequest1.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.numberOfReplicas(1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.putMapping("index.version.created_string", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.version.created", (java.lang.Throwable) actionRequestValidationException15, "index.");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.blocks.read_only", (java.lang.Throwable) actionRequestValidationException15, "index.creation_date");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.data_path", (java.lang.Throwable) actionRequestValidationException15, "index.version.upgraded_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.blocks.read_only", (java.lang.Throwable) actionRequestValidationException15, "current version [3] is different than the one provided [0]");
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest12.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest10.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.creation_date_string", (java.lang.Throwable) actionRequestValidationException13, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException13, "index.version.created");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.creation_date", (java.lang.Throwable) actionRequestValidationException13, "index.creation_date_string");
        java.lang.String str22 = shardFailure21.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "index.creation_date" + "'", str22, "index.creation_date");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_na_", custom5);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putMapping(mappingMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.shared_filesystem", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        bulkShardRequest1.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout("current version [0] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [0] is different than the one provided [100]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        java.lang.String str11 = indexMetaData4.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.xcontent.XContentParser xContentParser13 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = indexMetaData4.fromXContent(xContentParser13, parseFieldMatcher14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        int int10 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = indexMetaData0.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        int int8 = bulkItemRequest7.id();
        int int9 = bulkItemRequest7.id();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData3.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData3.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        org.elasticsearch.transport.TransportMessage transportMessage9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder13.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>> transportMessageTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>>(transportMessage9, (java.util.Collection<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder7.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder1.putActiveAllocationIds((int) ' ', (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.putAlias(builder24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest2.shardId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean5 = versionType2.isVersionConflictForReads((long) (short) 10, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("primary_terms", versionType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [primary_terms]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', actionRequest1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings9);
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.transport.TransportService transportService15 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService16 = null;
        org.elasticsearch.indices.IndicesService indicesService17 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool18 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction19 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction20 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper21 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters22 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction24 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings9, transportService15, clusterService16, indicesService17, threadPool18, shardStateAction19, mappingUpdatedAction20, updateHelper21, actionFilters22, indexNameExpressionResolver23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(settings14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.primaryTerm((int) (byte) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.primaryTerm((int) (byte) 3, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest4);
        boolean boolean7 = serializableTuple5.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = serializableTuple5.equals((java.lang.Object) builder18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest21.consistencyLevel();
        boolean boolean25 = serializableTuple5.equals((java.lang.Object) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.index.shard.ShardId shardId27 = bulkShardRequest21.shardId();
        boolean boolean28 = bulkShardRequest21.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray29 = bulkShardRequest21.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(shardId27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest10.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(indicesOptions9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.numberOfReplicas(1);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple9 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) true, bulkItemRequest8);
        java.io.Serializable serializable10 = serializableTuple9.v1();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + true + "'", serializable10, true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) 'a', (long) (short) -1);
        byte byte5 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest4);
        boolean boolean7 = serializableTuple5.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = serializableTuple5.equals((java.lang.Object) builder18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest21.consistencyLevel();
        boolean boolean25 = serializableTuple5.equals((java.lang.Object) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = bulkShardRequest21.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId28 = null;
        bulkShardRequest21.setParentTask(taskId28);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest21.timeout(timeValue30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = bulkShardRequest21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(transportAddress27);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.setShardId(shardId8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = bulkShardRequest2.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("current version [-1] is different than the one provided [32]");
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        java.lang.Class<?> wildcardClass8 = indexMetaData0.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest5.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentParser xContentParser7 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.fromXContent(xContentParser7, parseFieldMatcher8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.state(state4);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.version.upgraded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.upgraded]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.created_string", throwable2, "index.data_path");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertNull(throwable6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest5);
        boolean boolean8 = serializableTuple6.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.version((long) (byte) -1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder12.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = serializableTuple6.equals((java.lang.Object) builder19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = bulkShardRequest22.consistencyLevel();
        boolean boolean26 = serializableTuple6.equals((java.lang.Object) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple28 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) true, bulkItemRequest27);
        int int29 = bulkItemRequest27.id();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData4.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("");
        bulkShardRequest7.setParentTask("index.creation_date_string", (-1L));
        long long11 = bulkShardRequest7.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest12.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long5 = indexMetaData0.primaryTerm((int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "hi!");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.String str6 = shardFailure4.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = shardFailure4.routing;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(shardRouting7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = indexMetaData4.toXContent(xContentBuilder11, params12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(params12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("indices:data/write/bulk[s]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [indices:data/write/bulk[s]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.creation_date", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest4.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.settings(settings9);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings9, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean11 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.transport.TransportService transportService13 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService14 = null;
        org.elasticsearch.indices.IndicesService indicesService15 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool16 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction17 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction18 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper19 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters20 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction22 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService13, clusterService14, indicesService15, threadPool16, shardStateAction17, mappingUpdatedAction18, updateHelper19, actionFilters20, indexNameExpressionResolver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        int int6 = indexMetaData0.getNumberOfShards();
        long long7 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.action.ActionRequest actionRequest20 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest20);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple22 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) strSet16, bulkItemRequest21);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.HashSet<java.lang.String>> indexMetaDataFromXContentBuilderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.HashSet<java.lang.String>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (java.util.HashSet<java.lang.String>) strSet16);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = indexMetaData0.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        int int6 = indexMetaData0.getNumberOfShards();
        long long7 = indexMetaData0.getVersion();
        int int8 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.settings(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [3] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [3] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.version.created", (java.lang.Throwable) actionRequestValidationException15, "index.");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.blocks.read_only", (java.lang.Throwable) actionRequestValidationException15, "index.number_of_shards");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException15, "index.blocks.write");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.created_string", (java.lang.Throwable) actionRequestValidationException15, "index.");
        java.lang.Class<?> wildcardClass26 = actionRequestValidationException15.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData4.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap10 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.putMapping(mappingMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.xcontent.XContentParser xContentParser8 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.fromXContent(xContentParser8, parseFieldMatcher9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.creationDate((long) (byte) 3);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putMapping(mappingMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [1] is different than the one provided [10]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.xcontent.XContentParser xContentParser4 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = indexMetaData0.fromXContent(xContentParser4, parseFieldMatcher5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [-1] is higher or equal to the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas(1);
        long long4 = builder1.version();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        byte byte7 = state6.id();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings11);
        org.elasticsearch.transport.TransportService transportService13 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService14 = null;
        org.elasticsearch.indices.IndicesService indicesService15 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool16 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction17 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction18 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper19 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters20 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction22 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings11, transportService13, clusterService14, indicesService15, threadPool16, shardStateAction17, mappingUpdatedAction18, updateHelper19, actionFilters20, indexNameExpressionResolver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        bulkShardRequest2.seqNo((long) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        java.lang.String str7 = bulkShardRequest6.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest6.remoteAddress();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.number_of_shards" + "'", str7, "index.number_of_shards");
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [1] is different than the one provided [10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [1] is different than the one provided [10]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [0] is different than the one provided [100]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.settings(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.settings(settings7);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = builder10.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout("current version [0] is higher or equal to the one provided [0]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [0] is higher or equal to the one provided [0]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.version((long) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.creationDate((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.putMapping("", "index.");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params8 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom14 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putCustom("_na_", custom14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.version((long) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder25.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder20.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder15.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params8, (java.lang.Iterable<java.lang.String>) strSet30);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder36 = indexMetaData0.toXContent(xContentBuilder7, params8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(params8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.common.xcontent.XContentParser xContentParser8 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.fromXContent(xContentParser8, parseFieldMatcher9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("active_allocations");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = builder1.primaryTerm(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        bulkShardRequest10.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = bulkShardRequest18.remoteAddress();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(transportAddress19);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        bulkShardRequest1.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        int int7 = bulkItemRequest6.id();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings12);
        org.elasticsearch.transport.TransportService transportService14 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService15 = null;
        org.elasticsearch.indices.IndicesService indicesService16 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool17 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction18 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction19 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper20 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters21 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction23 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings12, transportService14, clusterService15, indicesService16, threadPool17, shardStateAction18, mappingUpdatedAction19, updateHelper20, actionFilters21, indexNameExpressionResolver22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params13 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder12, params13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(params13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [10]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        long long5 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.readDiffFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        int int9 = bulkItemRequest8.id();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple10 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest8);
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        byte byte12 = versionType11.getValue();
        boolean boolean16 = versionType11.isVersionConflictForWrites((long) 97, (long) (short) 1, true);
        boolean boolean18 = versionType11.validateVersionForReads((long) (short) -1);
        org.elasticsearch.index.VersionType versionType19 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte20 = versionType19.getValue();
        boolean boolean24 = versionType19.isVersionConflictForWrites((long) 0, (long) '#', false);
        boolean boolean26 = versionType19.validateVersionForWrites((long) (byte) -1);
        org.elasticsearch.action.ActionRequest actionRequest28 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', actionRequest28);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple30 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType19, bulkItemRequest29);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple31 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) boolean18, bulkItemRequest29);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple32 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest29);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 3 + "'", byte12 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putAlias(aliasMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData4.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData4.requireFilters();
        org.elasticsearch.common.settings.Settings settings11 = indexMetaData4.getSettings();
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings11, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(settings11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        boolean boolean7 = indexMetaData0.isSameUUID("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentParser xContentParser8 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.fromXContent(xContentParser8, parseFieldMatcher9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.version.created", (java.lang.Throwable) actionRequestValidationException15, "index.");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.blocks.read_only", (java.lang.Throwable) actionRequestValidationException15, "index.creation_date");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [0] is different than the one provided [100]", (java.lang.Throwable) actionRequestValidationException15, "index.blocks.read");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException15, "index.");
        org.elasticsearch.action.ActionRequest actionRequest28 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest28);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple30 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest29);
        boolean boolean32 = serializableTuple30.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder34.version((long) (byte) -1);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder36.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = serializableTuple30.equals((java.lang.Object) builder43);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean47 = bulkShardRequest46.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest46);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel49 = bulkShardRequest46.consistencyLevel();
        boolean boolean50 = serializableTuple30.equals((java.lang.Object) bulkShardRequest46);
        org.elasticsearch.index.shard.ShardId shardId51 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest46.setShardId(shardId51);
        org.elasticsearch.common.collect.Tuple<java.lang.Throwable, org.elasticsearch.action.bulk.BulkShardRequest> throwableTuple53 = new org.elasticsearch.common.collect.Tuple<java.lang.Throwable, org.elasticsearch.action.bulk.BulkShardRequest>((java.lang.Throwable) actionRequestValidationException15, bulkShardRequest46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = bulkShardRequest46.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel49 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel49.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest52);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest5);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple7 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (short) 10, bulkItemRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = serializableTuple7.v2();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple9 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (short) 0, bulkItemRequest8);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(bulkItemRequest8);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId3 = bulkShardRequest0.shardId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = shardId3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        long long8 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue4 = bulkShardRequest1.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.timeout(timeValue12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest16.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        int int10 = indexMetaData0.getTotalNumberOfShards();
        int int11 = indexMetaData0.getNumberOfShards();
        java.util.Set<java.lang.String> strSet13 = null; // flaky: indexMetaData0.activeAllocationIds(52);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.readDiffFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.putAlias(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        java.lang.String str2 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder4, params5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_na_" + "'", str2, "_na_");
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [-1] is higher or equal to the one provided [0]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.upgraded_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest7);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 97, 0L, true);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest4);
        boolean boolean7 = serializableTuple5.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = serializableTuple5.equals((java.lang.Object) builder18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest21.consistencyLevel();
        boolean boolean25 = serializableTuple5.equals((java.lang.Object) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = bulkShardRequest21.remoteAddress();
        long long28 = bulkShardRequest21.primaryTerm();
        bulkShardRequest21.setParentTask("index.creation_date", (long) (byte) -1);
        org.elasticsearch.common.io.stream.StreamInput streamInput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest21.readFrom(streamInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(transportAddress27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData3.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData3.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        org.elasticsearch.transport.TransportMessage transportMessage9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder13.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>> transportMessageTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>>(transportMessage9, (java.util.Collection<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder7.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder1.putActiveAllocationIds((int) ' ', (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder1.putAlias(aliasMetaData24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("index.creation_date_string", custom5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.shared_filesystem]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.blocks.write", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.index("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(aliasMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        long long5 = indexMetaData0.getVersion();
        int int6 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData8.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = indexMetaData8.mapping("index.priority");
        org.elasticsearch.Version version14 = indexMetaData8.getCreationVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData8);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(mappingMetaData13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        long long11 = indexMetaData4.getVersion();
        long long12 = indexMetaData4.getVersion();
        org.elasticsearch.common.xcontent.XContentParser xContentParser13 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = indexMetaData4.fromXContent(xContentParser13, parseFieldMatcher14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.version.upgraded_string", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("state-");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [state-]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [3] is different than the one provided [0]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = indexMetaData0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.action.IndicesRequest> versionTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.action.IndicesRequest>(version4, (org.elasticsearch.action.IndicesRequest) bulkShardRequest7);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest7.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.timeout("index.version.created");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.version.created]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        int int4 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.creationDate(100L);
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.settings(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.settings(settings9);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings9, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.blocks.write]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        int int10 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.readDiffFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte6 = versionType5.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest4, (org.elasticsearch.common.io.stream.Writeable) versionType5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.fromString("primary_terms", versionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [primary_terms]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = indexMetaData0.toXContent(xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        org.elasticsearch.index.Index index6 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        byte byte8 = state7.id();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.putCustom("_na_", custom11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.version((long) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder22.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder17.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder12.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params5, (java.lang.Iterable<java.lang.String>) strSet27);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder33 = indexMetaData0.toXContent(xContentBuilder4, params5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(params5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData4.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap10 = indexMetaData0.getAliases();
        org.elasticsearch.Version version11 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params14 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder13, params14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(params14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL;
        java.lang.String str4 = versionType1.explainConflictForReads((long) (-1), (long) '#');
        byte byte5 = versionType1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("current version [1] is different than the one provided [10]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [1] is different than the one provided [10]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [-1] is different than the one provided [35]" + "'", str4, "current version [-1] is different than the one provided [35]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        long long5 = indexMetaData0.getCreationDate();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        boolean boolean9 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        boolean boolean12 = versionType0.isVersionConflictForReads(100L, (-1L));
        java.lang.String str15 = versionType0.explainConflictForReads((long) 100, 32L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "current version [100] is different than the one provided [32]" + "'", str15, "current version [100] is different than the one provided [32]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        org.elasticsearch.Version version7 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
        org.elasticsearch.transport.TransportService transportService9 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService10 = null;
        org.elasticsearch.indices.IndicesService indicesService11 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool12 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction13 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction14 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper15 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters16 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction18 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings8, transportService9, clusterService10, indicesService11, threadPool12, shardStateAction13, mappingUpdatedAction14, updateHelper15, actionFilters16, indexNameExpressionResolver17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(settings8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.transport.TransportService transportService15 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService16 = null;
        org.elasticsearch.indices.IndicesService indicesService17 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool18 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction19 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction20 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper21 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters22 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction24 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService15, clusterService16, indicesService17, threadPool18, shardStateAction19, mappingUpdatedAction20, updateHelper21, actionFilters22, indexNameExpressionResolver23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(settings14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        org.elasticsearch.index.Index index6 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            index6.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNull(index6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.putCustom("index.version.upgraded", custom7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putMapping("index.version.created_string", "index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.state(state4);
        int int6 = builder3.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.primaryTerm((int) (byte) 3, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("hi!", custom5);
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.settings(settings7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder3.putMapping("index.version.minimum_compatible", "index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest4.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_REQUIRE_GROUP_SETTING;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = settingsSetting0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settingsSetting0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.index("index.number_of_replicas");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.putMapping("primary_terms", "index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte5 = versionType4.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest3, (org.elasticsearch.common.io.stream.Writeable) versionType4);
        boolean boolean10 = versionType4.isVersionConflictForWrites((long) (short) 0, (long) (byte) 0, false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.version.upgraded", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) ' ', (long) (short) 1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', actionRequest1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        org.elasticsearch.transport.TransportService transportService14 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService15 = null;
        org.elasticsearch.indices.IndicesService indicesService16 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool17 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction18 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction19 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper20 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters21 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction23 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService14, clusterService15, indicesService16, threadPool17, shardStateAction18, mappingUpdatedAction19, updateHelper20, actionFilters21, indexNameExpressionResolver22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("state-");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putMapping(mappingMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.numberOfReplicas(1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.creationDate(32L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.upgraded_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm((long) (short) 100);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long7 = bulkShardRequest2.seqNo();
        java.lang.String str8 = bulkShardRequest2.index();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest2.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte6 = versionType5.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest4, (org.elasticsearch.common.io.stream.Writeable) versionType5);
        java.lang.String str11 = versionType5.explainConflictForWrites((long) (byte) 0, (long) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType12 = org.elasticsearch.index.VersionType.fromString("", versionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [0] is higher or equal to the one provided [0]" + "'", str11, "current version [0] is higher or equal to the one provided [0]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData4.readDiffFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.apache.lucene.util.Version version3 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNull(version3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData4.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData4.requireFilters();
        int int11 = indexMetaData4.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [_na_]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.upgraded_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = builder1.mapping("index.version.upgraded");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        long long8 = bulkShardRequest4.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("_na_", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.version((long) (byte) -1);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder24.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder14.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params7, (java.lang.Iterable<java.lang.String>) strSet29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(params7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        java.lang.String str2 = indexMetaData0.getIndexUUID();
        int int3 = indexMetaData0.getNumberOfReplicas();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_na_" + "'", str2, "_na_");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings9);
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.transport.TransportService transportService15 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService16 = null;
        org.elasticsearch.indices.IndicesService indicesService17 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool18 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction19 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction20 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper21 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters22 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction24 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings14, transportService15, clusterService16, indicesService17, threadPool18, shardStateAction19, mappingUpdatedAction20, updateHelper21, actionFilters22, indexNameExpressionResolver23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(settings14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.settings(settings9);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings11, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem");
        int int2 = builder1.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = builder1.primaryTerm(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        int int9 = indexMetaData0.getNumberOfShards();
        int int10 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.read]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        java.lang.String str11 = indexMetaData4.getIndexUUID();
        int int12 = indexMetaData4.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData4.includeFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData4.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        int int4 = builder3.numberOfShards();
        java.lang.String str5 = builder3.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.numberOfShards((int) '#');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putMapping(mappingMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shared_filesystem" + "'", str5, "index.shared_filesystem");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.state(state6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData10.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData10);
        org.elasticsearch.common.settings.Settings settings13 = indexMetaData10.getSettings();
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder9.settings(settings13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder7.settings(settings13);
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings13);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder1.settings(settings18);
        org.elasticsearch.transport.TransportService transportService20 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService21 = null;
        org.elasticsearch.indices.IndicesService indicesService22 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool23 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction24 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction25 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper26 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters27 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction29 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings18, transportService20, clusterService21, indicesService22, threadPool23, shardStateAction24, mappingUpdatedAction25, updateHelper26, actionFilters27, indexNameExpressionResolver28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [-1] is higher or equal to the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas(1);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putAlias(builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings7);
        org.elasticsearch.transport.TransportService transportService9 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService10 = null;
        org.elasticsearch.indices.IndicesService indicesService11 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool12 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction13 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction14 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper15 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters16 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction18 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings8, transportService9, clusterService10, indicesService11, threadPool12, shardStateAction13, mappingUpdatedAction14, updateHelper15, actionFilters16, indexNameExpressionResolver17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap11 = indexMetaData8.getMappings();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>> indexMetaDataFromXContentBuilderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = indexMetaData0.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putMapping(mappingMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder3.removeAllAliases();
        java.lang.String str5 = builder4.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder4.putMapping("indices:data/write/bulk[s]", "index.uuid");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.version.upgraded_string" + "'", str5, "index.version.upgraded_string");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest9.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest13.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = bulkShardRequest13.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest13.setShardId(shardId18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Streamable> streamableTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Streamable>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest9, (org.elasticsearch.common.io.stream.Streamable) bulkItemRequest20);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple22 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest20);
        boolean boolean24 = versionType0.validateVersionForReads((long) '4');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        org.elasticsearch.common.settings.Settings.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        int int9 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.xcontent.XContentParser xContentParser10 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = indexMetaData0.fromXContent(xContentParser10, parseFieldMatcher11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.putMapping(mappingMetaData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest9.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest13.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = bulkShardRequest13.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest13.setShardId(shardId18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Streamable> streamableTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Streamable>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest9, (org.elasticsearch.common.io.stream.Streamable) bulkItemRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        java.lang.String str23 = bulkShardRequest9.index();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = bulkShardRequest4.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest4.timeout("index.blocks.metadata");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.metadata] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        long long11 = bulkShardRequest9.primaryTerm();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.ActionRequest actionRequest10 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest10);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple12 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest11);
        int int13 = 0; // flaky: bulkItemRequest11.id();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple14 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) writeConsistencyLevel7, bulkItemRequest11);
        org.elasticsearch.action.ActionRequest actionRequest15 = null; // flaky: bulkItemRequest11.request();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(actionRequest15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        boolean boolean7 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData5.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        boolean boolean12 = indexMetaData0.isSameUUID("index.shared_filesystem");
        int int13 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData0.mapping("index.data_path");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params17 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom23 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder21.putCustom("_na_", custom23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder32.version((long) (byte) -1);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder34.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder29.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder24.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params17, (java.lang.Iterable<java.lang.String>) strSet39);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder45 = indexMetaData0.toXContent(xContentBuilder16, params17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(mappingMetaData15);
        org.junit.Assert.assertNotNull(params17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte5 = versionType4.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest3, (org.elasticsearch.common.io.stream.Writeable) versionType4);
        boolean boolean8 = versionType4.validateVersionForWrites(10L);
        java.lang.String str12 = versionType4.explainConflictForWrites((long) 0, 1L, true);
        byte byte13 = versionType4.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "current version [0] is higher or equal to the one provided [1]" + "'", str12, "current version [0] is higher or equal to the one provided [1]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings9);
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.transport.TransportService transportService16 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService17 = null;
        org.elasticsearch.indices.IndicesService indicesService18 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool19 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction20 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction21 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper22 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters23 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction25 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings15, transportService16, clusterService17, indicesService18, threadPool19, shardStateAction20, mappingUpdatedAction21, updateHelper22, actionFilters23, indexNameExpressionResolver24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder3.mapping("current version [-1] is higher or equal to the one provided [0]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentParser xContentParser8 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.fromXContent(xContentParser8, parseFieldMatcher9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        long long5 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params8 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = indexMetaData0.toXContent(xContentBuilder7, params8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [52] is higher or equal to the one provided [35]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [52] is higher or equal to the one provided [35]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData0, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData5.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        boolean boolean12 = indexMetaData0.isSameUUID("index.shared_filesystem");
        int int13 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder14 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder14, params15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        long long5 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequest actionRequest10 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest10);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple12 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest11);
        boolean boolean14 = serializableTuple12.equals((java.lang.Object) 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.version((long) (byte) -1);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder18.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = serializableTuple12.equals((java.lang.Object) builder25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean29 = bulkShardRequest28.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = bulkShardRequest28.consistencyLevel();
        boolean boolean32 = serializableTuple12.equals((java.lang.Object) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = bulkShardRequest28.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId35 = null;
        bulkShardRequest28.setParentTask(taskId35);
        org.elasticsearch.common.unit.TimeValue timeValue37 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest28.timeout(timeValue37);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, org.elasticsearch.common.unit.TimeValue> indicesOptionsTuple39 = org.elasticsearch.common.collect.Tuple.tuple(indicesOptions6, timeValue37);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(transportAddress34);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertNotNull(indicesOptionsTuple39);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        boolean boolean10 = indexMetaData4.isSameUUID("index.shared_filesystem.recover_on_any_node");
        java.lang.String str11 = indexMetaData4.getIndexUUID();
        int int12 = indexMetaData4.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData4);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = indexMetaData4.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.transport.TransportMessage transportMessage0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.version((long) (byte) -1);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder4.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>> transportMessageTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.util.Collection<java.lang.String>>(transportMessage0, (java.util.Collection<java.lang.String>) strSet9);
        java.lang.Class<?> wildcardClass13 = transportMessageTuple12.getClass();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.setShardId(shardId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.index("indices:data/write/bulk[s]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkShardRequest8.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [32] is different than the one provided [32]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.creation_date_string", (java.lang.Throwable) actionRequestValidationException15, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "current version [0] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException15, "index.version.created");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.creation_date", (java.lang.Throwable) actionRequestValidationException15, "index.creation_date_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [3] is different than the one provided [0]", (java.lang.Throwable) actionRequestValidationException15, "index.number_of_replicas");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = shardFailure25.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNull(shardRouting26);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int10 = bulkItemRequest9.id();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_shards", throwable2, "_na_");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.junit.Assert.assertNull(throwable5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [100] is different than the one provided [32]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("state-");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putAlias(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        bulkShardRequest6.setParentTask("index.creation_date_string", (-1L));
        long long10 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest6.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.putMapping(mappingMetaData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData1.getMappings();
        org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData>> charSequenceTuple5 = new org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData>>((java.lang.CharSequence) "index.number_of_shards", strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData0, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.settings.Settings settings11 = indexMetaData0.getSettings();
        org.elasticsearch.transport.TransportService transportService12 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService13 = null;
        org.elasticsearch.indices.IndicesService indicesService14 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool15 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction16 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction17 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper18 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters19 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction21 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings11, transportService12, clusterService13, indicesService14, threadPool15, shardStateAction16, mappingUpdatedAction17, updateHelper18, actionFilters19, indexNameExpressionResolver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNotNull(settings11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [32] is different than the one provided [-1]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("primary_terms");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.state(state2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.settings(settings9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder3.settings(settings9);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = builder3.mapping("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder3.settings(builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(mappingMetaData14);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData2);
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData2.getSettings();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings5);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.priority");
        int int6 = indexMetaData0.getNumberOfShards();
        long long7 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.action.ActionRequest actionRequest20 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest20);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple22 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) strSet16, bulkItemRequest21);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.HashSet<java.lang.String>> indexMetaDataFromXContentBuilderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.HashSet<java.lang.String>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (java.util.HashSet<java.lang.String>) strSet16);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters24 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = indexMetaData0.readFrom(streamInput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(discoveryNodeFilters24);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_na_", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.version((long) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder16.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder11.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder6.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state26 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte27 = state26.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder25.state(state26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom30 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder25.putCustom("", custom30);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder31.putMapping(mappingMetaData32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + state26 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state26.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings7);
        org.elasticsearch.transport.TransportService transportService9 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService10 = null;
        org.elasticsearch.indices.IndicesService indicesService11 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool12 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction13 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction14 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper15 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters16 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction18 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings7, transportService9, clusterService10, indicesService11, threadPool12, shardStateAction13, mappingUpdatedAction14, updateHelper15, actionFilters16, indexNameExpressionResolver17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean5 = versionType2.isVersionConflictForReads((long) (short) 10, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("index.shared_filesystem.recover_on_any_node", versionType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.shared_filesystem.recover_on_any_node]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("_na_", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.version((long) (byte) -1);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder24.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder14.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>> paramsTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.Iterable<java.lang.String>>(params7, (java.lang.Iterable<java.lang.String>) strSet29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = indexMetaData0.toXContent(xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(params7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.excludeFilters();
        boolean boolean6 = indexMetaData0.isSameUUID("index.shared_filesystem");
        long long8 = indexMetaData0.primaryTerm((int) (byte) 0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        int int9 = indexMetaData0.getNumberOfShards();
        int int10 = indexMetaData0.getNumberOfReplicas();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.isSameUUID("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.shared_filesystem.recover_on_any_node");
        int int5 = indexMetaData0.getNumberOfReplicas();
        long long7 = indexMetaData0.primaryTerm((int) (short) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.version.created");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte6 = versionType5.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest4, (org.elasticsearch.common.io.stream.Writeable) versionType5);
        boolean boolean11 = versionType5.isVersionConflictForWrites((long) (byte) -1, (long) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType12 = org.elasticsearch.index.VersionType.fromString("primary_terms", versionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [primary_terms]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest5.setShardId(shardId11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = bulkShardRequest5.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.state(state4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.removeAlias("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.version((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = builder9.primaryTerm((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest3.request();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 100L, bulkItemRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = serializableTuple5.v2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkItemRequest6.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest4);
// flaky:         org.junit.Assert.assertNotNull(bulkItemRequest6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        java.util.Set<java.lang.String> strSet5 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, java.util.Set<java.lang.String>> indicesOptionsTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, java.util.Set<java.lang.String>>(indicesOptions4, strSet5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, org.elasticsearch.action.support.IndicesOptions> indicesOptionsTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, org.elasticsearch.action.support.IndicesOptions>(indicesOptions4, indicesOptions9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(indicesOptions9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest7.timeout("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.blocks.read]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.setShardId(shardId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData0, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.common.xcontent.XContentParser xContentParser10 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = indexMetaData0.fromXContent(xContentParser10, parseFieldMatcher11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shared_filesystem.recover_on_any_node", throwable2, "primary_terms");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple5 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (-1L), bulkItemRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 1.0f, bulkItemRequest4);
        java.lang.String str7 = serializableTuple6.toString();
        java.io.Serializable serializable8 = serializableTuple6.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.index("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom14 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putCustom("_na_", custom14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.version((long) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "index.shadow_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder25.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder20.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder15.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder15.numberOfShards((int) (byte) 0);
        boolean boolean37 = serializableTuple6.equals((java.lang.Object) builder36);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state38 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte39 = state38.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder36.state(state38);
        org.elasticsearch.common.settings.Settings.Builder builder41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder40.settings(builder41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + 1.0f + "'", serializable8, 1.0f);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + state38 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state38.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest2.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest2.timeout("current version [10] is different than the one provided [35]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [10] is different than the one provided [35]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte2 = versionType1.getValue();
        boolean boolean6 = versionType1.isVersionConflictForWrites((long) 0, (long) '#', false);
        boolean boolean8 = versionType1.validateVersionForWrites((long) (byte) -1);
        org.elasticsearch.action.ActionRequest actionRequest10 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', actionRequest10);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple12 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType1, bulkItemRequest11);
        byte byte13 = versionType1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType14 = org.elasticsearch.index.VersionType.fromString("current version [-1] is different than the one provided [35]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [-1] is different than the one provided [35]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }
}
