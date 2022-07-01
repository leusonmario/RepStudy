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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_ACTIVE_ALLOCATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_allocations" + "'", str0, "active_allocations");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date" + "'", str0, "index.creation_date");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_READ_ONLY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read_only" + "'", str0, "index.blocks.read_only");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created" + "'", str0, "index.version.created");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [100]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.creation_date", custom1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        java.lang.Class<?> wildcardClass1 = versionType0.getClass();
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_INDEX_UUID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.uuid" + "'", str0, "index.uuid");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_replicas" + "'", str0, "index.number_of_replicas");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_PRIORITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.priority" + "'", str0, "index.priority");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_ONLY_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_MINIMUM_COMPATIBLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.minimum_compatible" + "'", str0, "index.version.minimum_compatible");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_AUTO_EXPAND_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.auto_expand_replicas" + "'", str0, "index.auto_expand_replicas");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [100]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded_string" + "'", str0, "index.version.upgraded_string");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_WRITE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_READ_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_DATA_PATH_SETTING;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_STATE_FILE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "state-" + "'", str0, "state-");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SETTING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index." + "'", str0, "index.");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem.recover_on_any_node" + "'", str0, "index.shared_filesystem.recover_on_any_node");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
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
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) '#', indexMetaData1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (10) must be greater than the shard id: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String str0 = org.elasticsearch.action.bulk.TransportShardBulkAction.ACTION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "indices:data/write/bulk[s]" + "'", str0, "indices:data/write/bulk[s]");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 10, indexMetaData1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (10) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.priority");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.priority]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_WRITE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.write" + "'", str0, "index.blocks.write");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created_string" + "'", str0, "index.version.created_string");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.setParentTask("", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.primaryTerm((int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [hi!]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        int int5 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHADOW_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shadow_replicas" + "'", str0, "index.shadow_replicas");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("active_allocations", custom1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = builder3.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putMapping(mappingMetaData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            refreshPolicy2.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = null; // flaky: bulkItemRequest2.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest3);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
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
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putAlias(aliasMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(settings4);
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.xcontent.XContentParser xContentParser2 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = indexMetaData0.fromXContent(xContentParser2, parseFieldMatcher3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_READ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read" + "'", str0, "index.blocks.read");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FILESYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem" + "'", str0, "index.shared_filesystem");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_SHARDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_shards" + "'", str0, "index.number_of_shards");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.collect.Tuple<java.lang.RuntimeException, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> runtimeExceptionTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.RuntimeException, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>((java.lang.RuntimeException) actionRequestValidationException4, builder6);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify positive number of shards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
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
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded" + "'", str0, "index.version.upgraded");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.io.stream.StreamInput streamInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff3 = indexMetaData0.readDiffFrom(streamInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
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
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
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
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.settings(settings5);
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
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bulkShardRequest15.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_PRIORITY_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.settings(settings5);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        int int2 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putAlias(builder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.setRefreshPolicy("index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.shared_filesystem].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_NAME;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = indexMetaData0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.readDiffFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.settings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.version((long) (short) 100);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.putAlias(aliasMetaData9);
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
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(settings4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = builder3.numberOfShards();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("state-");
        int int3 = indexMetaData0.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = indexMetaData0.primaryTerm((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.fromString("", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putAlias(builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(transportAddress16);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.blocks.read_only", custom1);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.primaryTerm(100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        boolean boolean5 = indexMetaData1.isSameUUID("state-");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData1.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 3, indexMetaData1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(transportAddress16);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout("indices:data/write/bulk[s]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [indices:data/write/bulk[s]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.created_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        java.lang.String[] strArray16 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder3.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet17);
        java.lang.String str20 = builder3.index();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = builder3.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "index.creation_date" + "'", str20, "index.creation_date");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        int int7 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.putMapping(mappingMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("state-");
        int int3 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.readDiffFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.data_path" + "'", str0, "index.data_path");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
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
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType1.isVersionConflictForWrites((long) (short) 10, 10L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType7 = org.elasticsearch.index.VersionType.fromString("active_allocations", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [active_allocations]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.readDiffFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        int int6 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params8 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder7, params8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date_string" + "'", str0, "index.creation_date_string");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
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
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_UUID_NA_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_na_" + "'", str0, "_na_");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.setShardId(shardId3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromString("index.number_of_replicas", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.number_of_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequest3);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder1.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte4 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 3 + "'", byte4 == (byte) 3);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("active_allocations");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [active_allocations]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        java.lang.String str7 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_na_" + "'", str7, "_na_");
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = indexMetaData0.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mappingOrDefault("state-");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet5 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(0, indexMetaData1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.blocks.write]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        int int6 = indexMetaData0.getRoutingNumShards();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
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
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_METADATA_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        bulkShardRequest12.remoteAddress(transportAddress13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest12.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest16.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str20 = bulkShardRequest19.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = bulkShardRequest19.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = bulkShardRequest4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bulkShardRequest13.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet4 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) 'a', indexMetaData1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putMapping(mappingMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        bulkShardRequest0.primaryTerm((long) ' ');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        bulkShardRequest9.remoteAddress(transportAddress10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest9.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest13.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str17 = bulkShardRequest16.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest16.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest16.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest13.setShardId(shardId21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str25 = bulkShardRequest24.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy26 = bulkShardRequest24.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest24.getParentTask();
        bulkShardRequest22.setParentTask(taskId28);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task30 = bulkShardRequest0.createTask((-1L), "index.creation_date", "", taskId28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + refreshPolicy26 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy26.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId28);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.readDiffFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest7.getParentTask();
        bulkShardRequest0.setParentTask(taskId11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest0.timeout("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.created_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.tasks.TaskId taskId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task7 = bulkShardRequest1.createTask(10L, "index.uuid", "index.version.created", taskId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.tasks.TaskId taskId15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task16 = bulkShardRequest11.createTask(0L, "index.version.created_string", "index.uuid", taskId15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = indexMetaData0.toXContent(xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
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
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify positive number of shards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_PRIMARY_TERMS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "primary_terms" + "'", str0, "primary_terms");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.collect.Tuple<java.lang.RuntimeException, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> runtimeExceptionTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.RuntimeException, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>((java.lang.RuntimeException) actionRequestValidationException4, builder6);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.putAlias(aliasMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.creation_date_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_METADATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.metadata" + "'", str0, "index.blocks.metadata");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType5 = versionType1.versionTypeForReplicationAndRecovery();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("state-", versionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [state-]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(versionType5);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        boolean boolean5 = indexMetaData1.isSameUUID("state-");
        int int6 = indexMetaData1.getNumberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(0, indexMetaData1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet6 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) -1, indexMetaData1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        boolean boolean5 = indexMetaData1.isSameUUID("index.blocks.read");
        boolean boolean7 = indexMetaData1.isSameUUID("indices:data/write/bulk[s]");
        java.lang.String str8 = indexMetaData1.getIndexUUID();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet10 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 0, indexMetaData1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.state(state7);
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
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest11.setRefreshPolicy("");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest11.index("index.shadow_replicas");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        bulkShardRequest19.remoteAddress(transportAddress20);
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest19.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        bulkShardRequest19.remoteAddress(transportAddress23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str27 = bulkShardRequest26.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy28 = bulkShardRequest26.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest26.getParentTask();
        bulkShardRequest19.setParentTask(taskId30);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task32 = bulkShardRequest15.createTask((long) (short) 1, "index.shared_filesystem", "indices:data/write/bulk[s]", taskId30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(indicesOptions22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + refreshPolicy28 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy28.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId30);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder3.mapping("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest15.getRefreshPolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest15.setRefreshPolicy("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.version.minimum_compatible].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        long long3 = versionType0.updateVersion((long) (short) 100, (long) (byte) 10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData5.requireFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = indexMetaData5.primaryTerm((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        long long4 = builder3.version();
        org.elasticsearch.common.settings.Settings.Builder builder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.settings(builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder8.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder30.putAlias(aliasMetaData31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params6 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder5, params6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        bulkShardRequest0.primaryTerm((long) ' ');
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHADOW_REPLICAS_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        java.lang.String str5 = bulkShardRequest0.index();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData1.getState();
        boolean boolean6 = indexMetaData1.isSameUUID("index.");
        long long7 = indexMetaData1.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData1.includeFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet10 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) -1, indexMetaData1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest15.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = null;
        bulkShardRequest20.remoteAddress(transportAddress21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = bulkShardRequest20.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = null;
        bulkShardRequest20.remoteAddress(transportAddress24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str28 = bulkShardRequest27.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy29 = bulkShardRequest27.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.tasks.TaskId taskId31 = bulkShardRequest27.getParentTask();
        bulkShardRequest20.setParentTask(taskId31);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task33 = bulkShardRequest15.createTask((long) 35, "", "index.version.minimum_compatible", taskId31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + refreshPolicy29 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy29.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId31);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
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
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.common.xcontent.XContentParser xContentParser5 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.fromXContent(xContentParser5, parseFieldMatcher6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.primaryTerm((int) (byte) 3, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = null;
        bulkShardRequest17.remoteAddress(transportAddress18);
        org.elasticsearch.action.support.IndicesOptions indicesOptions20 = bulkShardRequest17.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = null;
        bulkShardRequest17.remoteAddress(transportAddress21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str25 = bulkShardRequest24.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy26 = bulkShardRequest24.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest24.getParentTask();
        bulkShardRequest17.setParentTask(taskId28);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task30 = bulkShardRequest4.createTask(0L, "_na_", "index.number_of_replicas", taskId28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(indicesOptions20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + refreshPolicy26 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy26.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId28);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = bulkShardRequest4.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequest3);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet5 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 10, indexMetaData1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (10) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.settings(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = indexMetaData0.toXContent(xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 1, indexMetaData1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap2 = indexMetaData0.getCustoms();
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
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest0.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout("indices:data/write/bulk[s]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [indices:data/write/bulk[s]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean6 = versionType1.validateVersionForWrites((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType7 = org.elasticsearch.index.VersionType.fromString("state-", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [state-]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [-1]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean4 = versionType2.validateVersionForWrites((long) (byte) 3);
        boolean boolean6 = versionType2.validateVersionForReads((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType7 = org.elasticsearch.index.VersionType.fromString("primary_terms", versionType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [primary_terms]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = builder4.primaryTerm(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        int int4 = builder1.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = builder1.primaryTerm((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        int int6 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.readDiffFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + refreshPolicy1 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy1.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putAlias(aliasMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        int int5 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        int int4 = builder1.numberOfShards();
        int int5 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getCreationDate();
        long long9 = indexMetaData7.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData7.getState();
        boolean boolean12 = indexMetaData7.isSameUUID("index.");
        org.elasticsearch.Version version13 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData7.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder6.settings(settings14);
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings14);
        org.elasticsearch.transport.TransportService transportService18 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService19 = null;
        org.elasticsearch.indices.IndicesService indicesService20 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool21 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction22 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction23 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper24 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters25 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction27 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings14, transportService18, clusterService19, indicesService20, threadPool21, shardStateAction22, mappingUpdatedAction23, updateHelper24, actionFilters25, indexNameExpressionResolver26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_UUID;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = strSetting0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSetting0);
        org.junit.Assert.assertNotNull(params2);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.setRefreshPolicy(refreshPolicy7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.setRefreshPolicy("index.creation_date");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.creation_date].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bulkShardRequest4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        int int6 = indexMetaData0.getRoutingNumShards();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple2 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock0, (java.lang.Comparable<java.lang.String>) "index.version.created");
        java.lang.Comparable<java.lang.String> strComparable3 = clusterBlockTuple2.v2();
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock4 = clusterBlockTuple2.v1();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params6 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = clusterBlock4.toXContent(xContentBuilder5, params6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(clusterBlock0);
        org.junit.Assert.assertEquals("'" + strComparable3 + "' != '" + "index.version.created" + "'", strComparable3, "index.version.created");
        org.junit.Assert.assertNotNull(clusterBlock4);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        long long8 = indexMetaData5.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData5.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData5.includeFilters();
        java.lang.String str11 = indexMetaData5.getIndexUUID();
        int int12 = indexMetaData5.getTotalNumberOfShards();
        boolean boolean13 = indexMetaData0.equals((java.lang.Object) indexMetaData5);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder14 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params15 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = indexMetaData0.toXContent(xContentBuilder14, params15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(params15);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest3);
        org.junit.Assert.assertNull(actionRequest4);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest11.setRefreshPolicy("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = bulkShardRequest11.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.setShardId(shardId7);
        bulkShardRequest8.setParentTask("state-", (long) (byte) -1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest8.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL;
        java.lang.String str5 = versionType1.explainConflictForWrites(1L, (long) (short) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("current version [52] is higher or equal to the one provided [100]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [52] is higher or equal to the one provided [100]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [1] is higher or equal to the one provided [-1]" + "'", str5, "current version [1] is higher or equal to the one provided [-1]");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest4.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        boolean boolean5 = indexMetaData1.isSameUUID("index.blocks.read");
        boolean boolean7 = indexMetaData1.isSameUUID("indices:data/write/bulk[s]");
        java.lang.String str8 = indexMetaData1.getIndexUUID();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet10 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(0, indexMetaData1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException2 = bulkShardRequest0.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.timeout("index.version.upgraded");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.version.upgraded]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + refreshPolicy1 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy1.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(actionRequestValidationException2);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) '#', (long) (byte) 0, true);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        long long4 = indexMetaData1.getVersion();
        int int5 = indexMetaData1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long7 = indexMetaData6.getCreationDate();
        org.apache.lucene.util.Version version8 = indexMetaData6.getMinimumCompatibleVersion();
        boolean boolean10 = indexMetaData6.isSameUUID("index.blocks.read");
        boolean boolean12 = indexMetaData6.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData1.diff(indexMetaData6);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData6.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData16 = indexMetaData6.mapping("index.");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet18 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(0, indexMetaData6, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNull(mappingMetaData16);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
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
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        long long8 = indexMetaData5.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData5.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData5.includeFilters();
        java.lang.String str11 = indexMetaData5.getIndexUUID();
        int int12 = indexMetaData5.getTotalNumberOfShards();
        boolean boolean13 = indexMetaData0.equals((java.lang.Object) indexMetaData5);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData5.readDiffFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getCreationDate();
        long long9 = indexMetaData7.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData7.getState();
        boolean boolean12 = indexMetaData7.isSameUUID("index.");
        org.elasticsearch.Version version13 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData7.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder6.settings(settings14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder6.putMapping(mappingMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.state(state7);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = builder8.primaryTerm((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.requireFilters();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        java.lang.Class<?> wildcardClass2 = versionType1.getClass();
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock3 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock3, (java.lang.Comparable<java.lang.String>) "index.version.created");
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.Type, org.elasticsearch.common.xcontent.ToXContent> typeTuple6 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.Type, org.elasticsearch.common.xcontent.ToXContent>((java.lang.reflect.Type) wildcardClass2, (org.elasticsearch.common.xcontent.ToXContent) clusterBlock3);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params8 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = clusterBlock3.toXContent(xContentBuilder7, params8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(clusterBlock3);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.shadow_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        boolean boolean3 = bulkShardRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = bulkShardRequest0.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        boolean boolean5 = indexMetaData1.isSameUUID("state-");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData1.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 0, indexMetaData1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.index("indices:data/write/bulk[s]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest11.setRefreshPolicy("current version [97] is higher than the one provided [32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [97] is higher than the one provided [32]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [10]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.blocks.write", throwable2, "index.creation_date");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.putCustom("index.uuid", custom7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder3.numberOfReplicas((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType1.isVersionConflictForWrites((long) (short) 10, 10L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType7 = org.elasticsearch.index.VersionType.fromString("current version [0] is different than the one provided [1]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [0] is different than the one provided [1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType5 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType1.validateVersionForReads(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.fromString("", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.io.stream.StreamInput streamInput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff2 = indexMetaData0.readDiffFrom(streamInput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        long long16 = bulkShardRequest15.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = bulkShardRequest15.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        long long8 = indexMetaData5.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData5.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData5.includeFilters();
        java.lang.String str11 = indexMetaData5.getIndexUUID();
        int int12 = indexMetaData5.getTotalNumberOfShards();
        boolean boolean13 = indexMetaData0.equals((java.lang.Object) indexMetaData5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = indexMetaData5.primaryTerm(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        int int3 = indexMetaData0.getNumberOfShards();
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
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [0] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [0] is different than the one provided [1]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("_na_");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest15.timeout("index.shared_filesystem.recover_on_any_node");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.shared_filesystem.recover_on_any_node] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = null; // flaky: bulkItemRequest2.request();
        int int6 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
        org.junit.Assert.assertNull(actionRequest5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.upgraded_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getCreationDate();
        long long9 = indexMetaData7.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData7.getState();
        boolean boolean12 = indexMetaData7.isSameUUID("index.");
        org.elasticsearch.Version version13 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData7.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder6.settings(settings14);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction25 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings14, transportService16, clusterService17, indicesService18, threadPool19, shardStateAction20, mappingUpdatedAction21, updateHelper22, actionFilters23, indexNameExpressionResolver24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest0.timeout();
        boolean boolean6 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest7.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        bulkShardRequest7.primaryTerm((long) ' ');
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest7.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest0.timeout(timeValue13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest0.setRefreshPolicy("index.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.number_of_replicas", custom1);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [10]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("state-");
        int int3 = indexMetaData0.getRoutingNumShards();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        long long7 = builder6.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.primaryTerm((int) (byte) 3, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL;
        java.lang.String str5 = versionType1.explainConflictForWrites((long) '#', 100L, true);
        java.lang.String str8 = versionType1.explainConflictForReads(0L, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType9 = org.elasticsearch.index.VersionType.fromString("current version [1] is higher or equal to the one provided [-1]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [1] is higher or equal to the one provided [-1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [35] is higher or equal to the one provided [100]" + "'", str5, "current version [35] is higher or equal to the one provided [100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [0] is different than the one provided [1]" + "'", str8, "current version [0] is different than the one provided [1]");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest3);
        org.junit.Assert.assertNull(actionRequest4);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [3]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.common.io.stream.StreamInput streamInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest15.readFrom(streamInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest7.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest7.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.timeout(timeValue12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bulkShardRequest1.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = null; // flaky: bulkItemRequest2.request();
        int int6 = 0; // flaky: bulkItemRequest2.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
        org.junit.Assert.assertNull(actionRequest5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        byte byte6 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.state(state7);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.putMapping(mappingMetaData9);
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
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("", custom1);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(versionType4);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        long long4 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData1.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData1.getInitialRecoveryFilters();
        org.elasticsearch.Version version7 = indexMetaData1.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet11 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 0, indexMetaData9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(indexMetaData9);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        java.lang.String str7 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_na_" + "'", str7, "_na_");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest1.remoteAddress(transportAddress8);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest1.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNull(actionRequestValidationException10);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("_na_");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest15.setRefreshPolicy("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.blocks.write].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest3);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder6.primaryTerm(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [-1] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [-1] is different than the one provided [100]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest4.setRefreshPolicy("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.version.upgraded_string].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.read]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.putCustom("index.uuid", custom7);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.putAlias(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long17 = indexMetaData16.getCreationDate();
        long long18 = indexMetaData16.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = indexMetaData16.getState();
        java.util.Set<java.lang.String> strSet21 = null; // flaky: indexMetaData16.activeAllocationIds((int) (short) 1);
        java.lang.String str22 = indexMetaData16.getIndexUUID();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData9.diff(indexMetaData16);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff24 = indexMetaData0.diff(indexMetaData9);
        org.elasticsearch.common.io.stream.StreamInput streamInput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = indexMetaData9.readFrom(streamInput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_na_" + "'", str22, "_na_");
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertNotNull(indexMetaDataDiff24);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        java.lang.Class<?> wildcardClass16 = bulkShardRequest4.getClass();
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.setShardId(shardId7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.timeout(timeValue9);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest8.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest1.remoteAddress(transportAddress8);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest1.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNull(actionRequestValidationException10);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.");
        org.elasticsearch.common.settings.Settings.Builder builder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.priority");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.priority]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params8 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder7, params8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
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
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.diff(indexMetaData9);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = indexMetaData9.primaryTerm(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        long long8 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = indexMetaData0.toXContent(xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.");
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("_na_");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = null;
        bulkShardRequest18.remoteAddress(transportAddress19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest18.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.timeout(timeValue23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest22.setShardId(shardId25);
        org.elasticsearch.common.unit.TimeValue timeValue27 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest26.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest17.timeout(timeValue27);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest17.setRefreshPolicy("index.priority");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.priority].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest13.remoteAddress();
        boolean boolean15 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        bulkShardRequest19.remoteAddress(transportAddress20);
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest19.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        bulkShardRequest19.remoteAddress(transportAddress23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str27 = bulkShardRequest26.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy28 = bulkShardRequest26.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest26.getParentTask();
        bulkShardRequest19.setParentTask(taskId30);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task32 = bulkShardRequest13.createTask(10L, "primary_terms", "index.uuid", taskId30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(transportAddress14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indicesOptions22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + refreshPolicy28 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy28.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId30);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest6.setRefreshPolicy("current version [-1] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [-1] is different than the one provided [100]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest15.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = bulkShardRequest15.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bulkShardRequest15.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str16 = bulkShardRequest15.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest15.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest15.getParentTask();
        bulkShardRequest13.setParentTask(taskId19);
        bulkShardRequest13.primaryTerm((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = bulkShardRequest13.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId19);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder7.build();
        boolean boolean10 = indexMetaData8.isSameUUID("index.blocks.metadata");
        int int11 = indexMetaData8.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = indexMetaData8.getState();
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData8.readDiffFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.setShardId(shardId7);
        bulkShardRequest8.setParentTask("state-", (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bulkShardRequest8.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [97] is higher than the one provided [32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [97] is higher than the one provided [32]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        int int7 = builder1.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.putMapping("hi!", "primary_terms");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest5.remoteAddress(transportAddress6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest5.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.timeout(timeValue10);
        bulkShardRequest11.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest11.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest11.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.setRefreshPolicy(refreshPolicy18);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest19);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.index("index.number_of_shards");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.putAlias(aliasMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest7.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest7.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.timeout(timeValue12);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest13.timeout("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.read_only] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder8.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet27);
        int int31 = builder8.numberOfReplicas();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder8.putAlias(builder32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getCreationDate();
        long long9 = indexMetaData7.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData7.getState();
        boolean boolean12 = indexMetaData7.isSameUUID("index.");
        org.elasticsearch.Version version13 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData7.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder6.settings(settings14);
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params19 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = settings16.toXContent(xContentBuilder18, params19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(params19);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.index("index.number_of_shards");
        int int10 = builder9.numberOfReplicas();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.diff(indexMetaData9);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest7.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest7.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.timeout(timeValue12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = null;
        bulkShardRequest14.remoteAddress(transportAddress15);
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = null;
        bulkShardRequest14.remoteAddress(transportAddress18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str22 = bulkShardRequest21.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy23 = bulkShardRequest21.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest21.getParentTask();
        bulkShardRequest14.setParentTask(taskId25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = null;
        bulkShardRequest27.remoteAddress(transportAddress28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest27.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest31.timeout(timeValue32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str35 = bulkShardRequest34.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy36 = bulkShardRequest34.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest31.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest14.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.common.io.stream.StreamInput streamInput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + refreshPolicy23 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy23.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + refreshPolicy36 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy36.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel37 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel37.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder8.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom32 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder8.putCustom("index.version.upgraded_string", custom32);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = builder8.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str16 = bulkShardRequest15.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest15.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest15.getParentTask();
        bulkShardRequest13.setParentTask(taskId19);
        bulkShardRequest13.primaryTerm((long) 100);
        boolean boolean23 = bulkShardRequest13.getShouldPersistResult();
        java.lang.Class<?> wildcardClass24 = bulkShardRequest13.getClass();
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("_na_");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = null;
        bulkShardRequest18.remoteAddress(transportAddress19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest18.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.timeout(timeValue23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str26 = bulkShardRequest25.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy27 = bulkShardRequest25.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest22.setShardId(shardId30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str34 = bulkShardRequest33.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy35 = bulkShardRequest33.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest33.getParentTask();
        bulkShardRequest31.setParentTask(taskId37);
        bulkShardRequest15.setParentTask(taskId37);
        org.elasticsearch.common.io.stream.StreamInput streamInput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest15.readFrom(streamInput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + refreshPolicy27 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy27.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + refreshPolicy35 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy35.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId37);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.equals((java.lang.Object) (-1L));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForWrites((long) (short) 100);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType3 = org.elasticsearch.index.VersionType.fromString("index.version.created", versionType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [0] is different than the one provided [1]", custom1);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder8.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom32 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder8.putCustom("index.version.upgraded_string", custom32);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder8.primaryTerm((int) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest4 = bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequest3);
        org.junit.Assert.assertNotNull(actionRequest4);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = indexMetaData0.toXContent(xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("current version [35] is higher or equal to the one provided [100]");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putAlias(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForWrites((long) (byte) 10);
        boolean boolean4 = versionType0.validateVersionForWrites((long) '#');
        boolean boolean6 = versionType0.validateVersionForReads((long) (short) 0);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.setShardId(shardId7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bulkShardRequest8.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.setShardId(shardId6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.setShardId(shardId8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest9.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.timeout("index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.shadow_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.removeAlias("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder13.primaryTerm((int) (byte) 3, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        boolean boolean9 = indexMetaData4.isSameUUID("index.");
        long long10 = indexMetaData4.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData4.includeFilters();
        org.elasticsearch.Version version12 = indexMetaData4.getCreationVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder14 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params15 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = indexMetaData0.toXContent(xContentBuilder14, params15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertNotNull(params15);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.auto_expand_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.auto_expand_replicas]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.index("indices:data/write/bulk[s]");
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest14.index("state-");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest14.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = bulkShardRequest14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "indices:data/write/bulk[s]" + "'", str15, "indices:data/write/bulk[s]");
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("_na_");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = null;
        bulkShardRequest18.remoteAddress(transportAddress19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest18.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.timeout(timeValue23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest22.setShardId(shardId25);
        org.elasticsearch.common.unit.TimeValue timeValue27 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest26.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest17.timeout(timeValue27);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest29.setRefreshPolicy("index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.shared_filesystem].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType5.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.putMapping(mappingMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.auto_expand_replicas", custom1);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.index("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray30 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState> indexShardStateList31 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList31, indexShardStateArray30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte34 = state33.id();
        byte byte35 = state33.id();
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateCollectionTuple36 = org.elasticsearch.common.collect.Tuple.tuple((java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList31, state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte38 = state37.id();
        org.elasticsearch.common.collect.Tuple<java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateListTuple39 = org.elasticsearch.common.collect.Tuple.tuple(indexShardStateList31, state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder13.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder5.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder5.version((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData44 = builder43.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.blocks.read_only]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(indexShardStateArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateCollectionTuple36);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateListTuple39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder1.mapping("index.blocks.write");
        int int6 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.numberOfReplicas((int) (short) -1);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.putAlias(aliasMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        java.util.Set<java.lang.String> strSet10 = indexMetaData0.activeAllocationIds((int) (short) 0);
        int int11 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = indexMetaData0.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        int int2 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putAlias(aliasMetaData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putMapping("index.blocks.metadata", "_na_");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.index("index.blocks.read_only");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.primaryTerm(1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.uuid");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.uuid]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.primaryTerm(1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.uuid");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.uuid]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest5.remoteAddress(transportAddress6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest5.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.timeout(timeValue10);
        bulkShardRequest11.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest11.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest11.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.setRefreshPolicy(refreshPolicy18);
        org.elasticsearch.common.io.stream.StreamInput streamInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest19.readFrom(streamInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest19);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mappingOrDefault("primary_terms");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock9 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock9, (java.lang.Comparable<java.lang.String>) "index.version.created");
        boolean boolean13 = clusterBlockTuple11.equals((java.lang.Object) (byte) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = null;
        bulkShardRequest14.remoteAddress(transportAddress15);
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = bulkShardRequest14.validate();
        java.lang.String str19 = bulkShardRequest14.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest14.consistencyLevel();
        boolean boolean21 = clusterBlockTuple11.equals((java.lang.Object) writeConsistencyLevel20);
        boolean boolean22 = indexMetaData0.equals((java.lang.Object) clusterBlockTuple11);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params24 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder23, params24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(clusterBlock9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(params24);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.common.xcontent.XContentParser xContentParser13 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = indexMetaData0.fromXContent(xContentParser13, parseFieldMatcher14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        java.lang.String str7 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.removeAlias("index.blocks.write");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.putMapping("current version [35] is higher or equal to the one provided [100]", "current version [97] is higher than the one provided [32]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.creation_date" + "'", str7, "index.creation_date");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.setShardId(shardId6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = bulkShardRequest7.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [0] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [0] is different than the one provided [1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.state(state7);
        int int9 = builder8.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.putMapping(mappingMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        int int5 = 0; // flaky: bulkItemRequest2.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mappingOrDefault("primary_terms");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock9 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock9, (java.lang.Comparable<java.lang.String>) "index.version.created");
        boolean boolean13 = clusterBlockTuple11.equals((java.lang.Object) (byte) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = null;
        bulkShardRequest14.remoteAddress(transportAddress15);
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = bulkShardRequest14.validate();
        java.lang.String str19 = bulkShardRequest14.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest14.consistencyLevel();
        boolean boolean21 = clusterBlockTuple11.equals((java.lang.Object) writeConsistencyLevel20);
        boolean boolean22 = indexMetaData0.equals((java.lang.Object) clusterBlockTuple11);
        org.elasticsearch.common.io.stream.StreamInput streamInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = indexMetaData0.readFrom(streamInput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(clusterBlock9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = indexMetaData8.primaryTerm((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(indexMetaData8);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.primaryTerm((int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder1.mapping("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putCustom("index.creation_date", custom7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.primaryTerm((int) ' ', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        bulkShardRequest6.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str10 = bulkShardRequest9.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        bulkShardRequest14.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue20 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest14.timeout(timeValue20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest6.timeout(timeValue20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.setShardId(shardId23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str29 = bulkShardRequest28.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy30 = bulkShardRequest28.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest28.index("index.");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str35 = bulkShardRequest34.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy36 = bulkShardRequest34.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.tasks.TaskId taskId38 = bulkShardRequest34.getParentTask();
        bulkShardRequest28.setParentTask(taskId38);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task40 = bulkShardRequest22.createTask((long) (short) 0, "index.version.created", "index.blocks.read", taskId38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + refreshPolicy30 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy30.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + refreshPolicy36 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy36.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId38);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        byte byte4 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 3 + "'", byte4 == (byte) 3);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long17 = indexMetaData16.getCreationDate();
        long long18 = indexMetaData16.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = indexMetaData16.getState();
        java.util.Set<java.lang.String> strSet21 = null; // flaky: indexMetaData16.activeAllocationIds((int) (short) 1);
        java.lang.String str22 = indexMetaData16.getIndexUUID();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData9.diff(indexMetaData16);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff24 = indexMetaData0.diff(indexMetaData9);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData9.writeTo(streamOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_na_" + "'", str22, "_na_");
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertNotNull(indexMetaDataDiff24);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.upgraded");
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        long long8 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.creationDate((long) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.settings(builder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.number_of_replicas]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        long long3 = indexMetaData1.getVersion();
        int int4 = indexMetaData1.getNumberOfReplicas();
        java.util.Set<java.lang.String> strSet6 = null; // flaky: indexMetaData1.activeAllocationIds(100);
        java.util.Set<java.lang.String> strSet8 = indexMetaData1.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData1.excludeFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet11 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(35, indexMetaData1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (10) must be greater than the shard id: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest5.remoteAddress(transportAddress6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest5.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.timeout(timeValue10);
        bulkShardRequest11.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest11.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest11.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.setRefreshPolicy(refreshPolicy18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str24 = bulkShardRequest23.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy25 = bulkShardRequest23.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest23.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = bulkShardRequest23.validate();
        org.elasticsearch.tasks.TaskId taskId29 = bulkShardRequest23.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task30 = bulkShardRequest0.createTask(0L, "index.number_of_shards", "index.shared_filesystem", taskId29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + refreshPolicy25 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy25.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNull(actionRequestValidationException28);
        org.junit.Assert.assertNotNull(taskId29);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder5.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfReplicas((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putMapping("index.auto_expand_replicas", "current version [1] is higher or equal to the one provided [-1]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        java.lang.String[] strArray16 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder3.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray20 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState> indexShardStateList21 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList21, indexShardStateArray20);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state23 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte24 = state23.id();
        byte byte25 = state23.id();
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateCollectionTuple26 = org.elasticsearch.common.collect.Tuple.tuple((java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList21, state23);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state27 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte28 = state27.id();
        org.elasticsearch.common.collect.Tuple<java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateListTuple29 = org.elasticsearch.common.collect.Tuple.tuple(indexShardStateList21, state27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder3.state(state27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder3.setRoutingNumShards((-1));
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder3.putMapping(mappingMetaData33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexShardStateArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + state23 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state23.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateCollectionTuple26);
        org.junit.Assert.assertTrue("'" + state27 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state27.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateListTuple29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap2 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.version.minimum_compatible");
        org.elasticsearch.common.xcontent.XContentParser xContentParser5 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.fromXContent(xContentParser5, parseFieldMatcher6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        long long4 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData1.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData1.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData1.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap8 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData1.excludeFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet11 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 1, indexMetaData1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (-1) must be greater than the shard id: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str16 = bulkShardRequest15.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest15.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest15.getParentTask();
        bulkShardRequest13.setParentTask(taskId19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest13.index("indices:data/write/bulk[s]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.timeout("_na_");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [_na_] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        bulkShardRequest6.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str10 = bulkShardRequest9.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        bulkShardRequest14.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue20 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest14.timeout(timeValue20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest6.timeout(timeValue20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.setShardId(shardId23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        bulkShardRequest25.remoteAddress(transportAddress26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest25.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest29.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str33 = bulkShardRequest32.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy34 = bulkShardRequest32.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest29.consistencyLevel(writeConsistencyLevel35);
        org.elasticsearch.common.unit.TimeValue timeValue37 = bulkShardRequest36.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = null;
        bulkShardRequest38.remoteAddress(transportAddress39);
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest38.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = bulkShardRequest38.validate();
        java.lang.String str43 = bulkShardRequest38.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = bulkShardRequest38.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest36.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel44);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest46.timeout("index.auto_expand_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.auto_expand_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + refreshPolicy34 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy34.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel35 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel35.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertNull(timeValue37);
        org.junit.Assert.assertNotNull(indicesOptions41);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        bulkShardRequest6.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str10 = bulkShardRequest9.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            refreshPolicy13.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        int int7 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.setRoutingNumShards((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.primaryTerm((int) '4', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.setShardId(shardId3);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long9 = indexMetaData8.getCreationDate();
        long long10 = indexMetaData8.getVersion();
        long long11 = indexMetaData8.getVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        bulkShardRequest12.remoteAddress(transportAddress13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest12.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest16.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str20 = bulkShardRequest19.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = bulkShardRequest19.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest16.setShardId(shardId24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest16.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest27.index("_na_");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress31 = null;
        bulkShardRequest30.remoteAddress(transportAddress31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest30.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest34.timeout(timeValue35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str38 = bulkShardRequest37.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy39 = bulkShardRequest37.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest37.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest34.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest34.setShardId(shardId42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str46 = bulkShardRequest45.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy47 = bulkShardRequest45.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.tasks.TaskId taskId49 = bulkShardRequest45.getParentTask();
        bulkShardRequest43.setParentTask(taskId49);
        bulkShardRequest27.setParentTask(taskId49);
        boolean boolean52 = indexMetaData8.equals((java.lang.Object) taskId49);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task53 = bulkShardRequest4.createTask(52L, "current version [52] is higher or equal to the one provided [100]", "current version [-1] is higher than the one provided [52]", taskId49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + refreshPolicy39 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy39.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel40 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel40.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest41);
        org.junit.Assert.assertNotNull(bulkShardRequest43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + refreshPolicy47 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy47.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData1.getState();
        boolean boolean6 = indexMetaData1.isSameUUID("index.creation_date");
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData1.getSettings();
        int int8 = indexMetaData1.getRoutingFactor();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet10 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 3, indexMetaData1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout("index.priority");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.priority] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.setShardId(shardId5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest6.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) -1, 35L);
        boolean boolean12 = versionType4.isVersionConflictForWrites((long) (-1), (long) 10, true);
        boolean boolean15 = versionType4.isVersionConflictForReads((long) 1, (long) (short) -1);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
        org.junit.Assert.assertNull(actionRequest5);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte5 = versionType1.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType7 = org.elasticsearch.index.VersionType.fromString("state-", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [state-]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        java.lang.String str5 = versionType0.explainConflictForWrites((long) 'a', 32L, true);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) -1, (-1L), false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [97] is higher than the one provided [32]" + "'", str5, "current version [97] is higher than the one provided [32]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getCreationDate();
        org.apache.lucene.util.Version version3 = indexMetaData1.getMinimumCompatibleVersion();
        boolean boolean5 = indexMetaData1.isSameUUID("state-");
        int int6 = indexMetaData1.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData1.includeFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet9 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 10, indexMetaData1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putMapping("index.priority", "current version [97] is higher than the one provided [32]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        bulkShardRequest6.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str10 = bulkShardRequest9.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        bulkShardRequest14.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue20 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest14.timeout(timeValue20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest6.timeout(timeValue20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.setShardId(shardId23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        bulkShardRequest25.remoteAddress(transportAddress26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest25.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest29.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str33 = bulkShardRequest32.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy34 = bulkShardRequest32.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest29.consistencyLevel(writeConsistencyLevel35);
        org.elasticsearch.common.unit.TimeValue timeValue37 = bulkShardRequest36.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = null;
        bulkShardRequest38.remoteAddress(transportAddress39);
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest38.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = bulkShardRequest38.validate();
        java.lang.String str43 = bulkShardRequest38.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = bulkShardRequest38.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest36.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.common.io.stream.StreamInput streamInput47 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest24.readFrom(streamInput47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + refreshPolicy34 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy34.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel35 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel35.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertNull(timeValue37);
        org.junit.Assert.assertNotNull(indicesOptions41);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.upgraded_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mappingOrDefault("index.blocks.metadata");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = indexMetaData0.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(mappingMetaData10);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean9 = versionType1.isVersionConflictForReads((long) (short) 10, (long) ' ');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        bulkShardRequest13.remoteAddress(transportAddress14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest13.validate();
        java.lang.String str18 = bulkShardRequest13.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = bulkShardRequest11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest20);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.setRoutingNumShards((int) (short) 1);
        java.lang.String str4 = builder1.index();
        int int5 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index.blocks.write" + "'", str4, "index.blocks.write");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.diff(indexMetaData9);
        java.lang.String str17 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap18 = indexMetaData0.getAliases();
        boolean boolean20 = indexMetaData0.isSameUUID("current version [52] is higher or equal to the one provided [100]");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = indexMetaData0.toXContent(xContentBuilder21, params22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(params22);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = indexMetaData0.toXContent(xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.index("index.shared_filesystem");
        int int8 = builder1.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.putMapping("index.version.upgraded_string", "current version [-1] is higher than the one provided [52]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.settings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.version((long) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.setRoutingNumShards((int) ' ');
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder6.putAlias(aliasMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify positive number of shards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(settings4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfShards((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("_na_");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest17.timeout("current version [-1] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [-1] is different than the one provided [100]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest11.setRefreshPolicy("");
        bulkShardRequest13.primaryTerm(10L);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest13.getRefreshPolicy();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest13.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        java.lang.Class<?> wildcardClass2 = bulkShardRequest0.getClass();
        org.junit.Assert.assertTrue("'" + refreshPolicy1 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy1.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.read_only] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType4.isVersionConflictForReads(0L, (long) (short) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest0.timeout();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.setShardId(shardId6);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.setRefreshPolicy("index.creation_date");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.creation_date].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mappingOrDefault("index.version.minimum_compatible");
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData0.readDiffFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.index("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray30 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState> indexShardStateList31 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList31, indexShardStateArray30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte34 = state33.id();
        byte byte35 = state33.id();
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateCollectionTuple36 = org.elasticsearch.common.collect.Tuple.tuple((java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList31, state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte38 = state37.id();
        org.elasticsearch.common.collect.Tuple<java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateListTuple39 = org.elasticsearch.common.collect.Tuple.tuple(indexShardStateList31, state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder13.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder5.state(state37);
        byte byte42 = state37.id();
        byte byte43 = state37.id();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(indexShardStateArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateCollectionTuple36);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateListTuple39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 0 + "'", byte42 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 0 + "'", byte43 == (byte) 0);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder4.numberOfReplicas((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify positive number of shards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType6.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.diff(indexMetaData9);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putMapping("index.version.upgraded_string", "index.auto_expand_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.index("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray30 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState> indexShardStateList31 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList31, indexShardStateArray30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte34 = state33.id();
        byte byte35 = state33.id();
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateCollectionTuple36 = org.elasticsearch.common.collect.Tuple.tuple((java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList31, state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte38 = state37.id();
        org.elasticsearch.common.collect.Tuple<java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateListTuple39 = org.elasticsearch.common.collect.Tuple.tuple(indexShardStateList31, state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder13.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder5.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder5.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder5.putMapping(mappingMetaData44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(indexShardStateArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateCollectionTuple36);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertNotNull(indexShardStateListTuple39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        bulkShardRequest4.remoteAddress(transportAddress5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str12 = bulkShardRequest11.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = bulkShardRequest11.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest8.setShardId(shardId16);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest8.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest19.index("_na_");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        bulkShardRequest22.remoteAddress(transportAddress23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest22.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest26.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str30 = bulkShardRequest29.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy31 = bulkShardRequest29.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest29.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest26.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest26.setShardId(shardId34);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str38 = bulkShardRequest37.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy39 = bulkShardRequest37.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.tasks.TaskId taskId41 = bulkShardRequest37.getParentTask();
        bulkShardRequest35.setParentTask(taskId41);
        bulkShardRequest19.setParentTask(taskId41);
        boolean boolean44 = indexMetaData0.equals((java.lang.Object) taskId41);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + refreshPolicy31 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy31.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(bulkShardRequest35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + refreshPolicy39 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy39.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        boolean boolean6 = indexMetaData0.isSameUUID("current version [97] is higher than the one provided [32]");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest0.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("index.blocks.write");
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest7.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task14 = bulkShardRequest7.createTask((long) 'a', "index.data_path", "index.creation_date", taskId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.removeAlias("index.blocks.metadata");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.creationDate((long) (short) 100);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.putMapping(mappingMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        boolean boolean6 = indexMetaData0.isSameUUID("indices:data/write/bulk[s]");
        long long8 = indexMetaData0.primaryTerm(0);
        long long9 = indexMetaData0.getVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        boolean boolean3 = bulkShardRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.putMapping("index.version.upgraded_string", "index.version.created");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        org.apache.lucene.util.Version version6 = indexMetaData4.getMinimumCompatibleVersion();
        org.elasticsearch.Version version7 = indexMetaData4.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData4.requireFilters();
        boolean boolean10 = indexMetaData4.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getCreationDate();
        long long13 = indexMetaData11.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state14 = indexMetaData11.getState();
        java.util.Set<java.lang.String> strSet16 = null; // flaky: indexMetaData11.activeAllocationIds((int) (short) 1);
        java.lang.String str17 = indexMetaData11.getIndexUUID();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff18 = indexMetaData4.diff(indexMetaData11);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData0.diff(indexMetaData11);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData11.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + state14 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state14.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(indexMetaDataDiff18);
        org.junit.Assert.assertNotNull(indexMetaDataDiff19);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder1.mapping("index.blocks.write");
        int int6 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.numberOfReplicas((int) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.creationDate((long) (short) 100);
        java.lang.String str11 = builder10.index();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putAlias(aliasMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index.creation_date" + "'", str11, "index.creation_date");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.index("index.blocks.metadata");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest14.timeout("Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=index.version.created]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=index.version.created]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest11.setRefreshPolicy("");
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        bulkShardRequest13.remoteAddress(transportAddress14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = bulkShardRequest13.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putMapping(mappingMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 10);
        boolean boolean5 = versionType1.validateVersionForWrites((long) '#');
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType7 = versionType6.versionTypeForReplicationAndRecovery();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.fromString("index.version.created", versionType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(versionType7);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.numberOfShards((int) (short) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.putAlias(aliasMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        long long7 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.removeAlias("current version [0] is different than the one provided [100]");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.putAlias(aliasMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        java.lang.Class<?> wildcardClass10 = bulkShardRequest8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bulkShardRequest4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [2]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.isVersionConflictForReads((long) 10, (long) 10);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest4.timeout("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.upgraded_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.settings(settings4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = builder3.getRoutingNumShards();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest0.remoteAddress(transportAddress7);
        bulkShardRequest0.setParentTask("index.blocks.read_only", (long) (byte) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.numberOfShards((int) '4');
        java.lang.String str13 = builder12.index();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index.creation_date" + "'", str13, "index.creation_date");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        boolean boolean5 = versionType0.validateVersionForReads(0L);
        boolean boolean7 = versionType0.validateVersionForWrites(52L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (short) -1, (long) ' ');
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        long long7 = indexMetaData5.getVersion();
        int int8 = indexMetaData5.getNumberOfReplicas();
        long long9 = indexMetaData5.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData0.diff(indexMetaData5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData5, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff10);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) 100, 32L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getCreationDate();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.uuid");
        java.lang.String[] strArray26 = new java.lang.String[] { "index.shadow_replicas", "hi!", "index.auto_expand_replicas", "index.number_of_shards", "index.version.created_string", "index.", "index.version.created", "index.uuid", "indices:data/write/bulk[s]", "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder8.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom32 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder8.putCustom("index.version.upgraded_string", custom32);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = builder8.primaryTerm((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [-1] is higher than the one provided [52]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [-1] is higher than the one provided [52]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
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
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.diff(indexMetaData9);
        java.lang.String str17 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap18 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData0.diff(indexMetaData19);
        org.elasticsearch.common.io.stream.StreamInput streamInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff22 = indexMetaData0.readDiffFrom(streamInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder1.mapping("index.blocks.write");
        int int6 = builder1.numberOfShards();
        int int7 = builder1.getRoutingNumShards();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest0.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout("current version [52] is higher or equal to the one provided [100]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [52] is higher or equal to the one provided [100]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(shardId6);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = null; // flaky: bulkItemRequest2.request();
        int int6 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(actionRequest4);
        org.junit.Assert.assertNull(actionRequest5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder8.putCustom("state-", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long15 = indexMetaData14.getCreationDate();
        long long16 = indexMetaData14.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state17 = indexMetaData14.getState();
        boolean boolean19 = indexMetaData14.isSameUUID("index.");
        org.elasticsearch.Version version20 = indexMetaData14.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings21 = indexMetaData14.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder13.settings(settings21);
        boolean boolean23 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder6.settings(settings24);
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings24);
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings26);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder28 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params29 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = settings27.toXContent(xContentBuilder28, params29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + state17 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state17.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(params29);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.lang.String str7 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_na_" + "'", str7, "_na_");
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        boolean boolean3 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        long long6 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("primary_terms", (long) (short) -1);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.setShardId(shardId7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.timeout(timeValue9);
        java.lang.Class<?> wildcardClass11 = bulkShardRequest10.getClass();
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("state-", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getCreationDate();
        long long9 = indexMetaData7.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData7.getState();
        boolean boolean12 = indexMetaData7.isSameUUID("index.");
        org.elasticsearch.Version version13 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData7.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder6.settings(settings14);
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings14);
        boolean boolean18 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings14);
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings14);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction29 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings14, transportService20, clusterService21, indicesService22, threadPool23, shardStateAction24, mappingUpdatedAction25, updateHelper26, actionFilters27, indexNameExpressionResolver28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.settings(settings5);
        java.lang.String str7 = builder6.index();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.creation_date" + "'", str7, "index.creation_date");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest15.getRefreshPolicy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = bulkShardRequest15.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "hi!");
        java.lang.String str5 = shardFailure4.indexUUID;
        java.lang.String str6 = shardFailure4.reason;
        java.lang.String str7 = shardFailure4.reason;
        java.lang.String str8 = shardFailure4.indexUUID;
        java.lang.String str9 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.setShardId(shardId5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkShardRequest0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.numberOfShards(1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.removeAllAliases();
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.settings(builder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        java.lang.String str10 = bulkShardRequest8.index();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.");
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = indexMetaData0.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.blocks.read_only]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL;
        java.lang.String str5 = versionType1.explainConflictForWrites((long) '#', 100L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("index.number_of_replicas", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.number_of_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [35] is higher or equal to the one provided [100]" + "'", str5, "current version [35] is higher or equal to the one provided [100]");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.setParentTask("", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.setShardId(shardId6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.setShardId(shardId8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest9.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.setRefreshPolicy("index.version.created");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.version.created].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.version.created");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.shared_filesystem.recover_on_any_node", custom1);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest5.remoteAddress(transportAddress6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest5.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.timeout(timeValue10);
        bulkShardRequest11.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest11.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest11.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.setRefreshPolicy(refreshPolicy18);
        java.lang.String str20 = bulkShardRequest19.index();
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        bulkShardRequest1.remoteAddress(transportAddress2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest1.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("index.blocks.write");
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest8.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest10.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(shardId9);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean6 = versionType1.validateVersionForWrites((long) (short) 1);
        boolean boolean8 = versionType1.validateVersionForWrites(10L);
        boolean boolean10 = versionType1.validateVersionForReads(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.fromString("index.shadow_replicas", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.shadow_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        bulkShardRequest6.primaryTerm(100L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str10 = bulkShardRequest9.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str15 = bulkShardRequest14.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest14.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        bulkShardRequest14.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue20 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest14.timeout(timeValue20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest6.timeout(timeValue20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.setShardId(shardId23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        bulkShardRequest25.remoteAddress(transportAddress26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest25.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest29.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str33 = bulkShardRequest32.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy34 = bulkShardRequest32.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest29.consistencyLevel(writeConsistencyLevel35);
        org.elasticsearch.common.unit.TimeValue timeValue37 = bulkShardRequest36.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = null;
        bulkShardRequest38.remoteAddress(transportAddress39);
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest38.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = bulkShardRequest38.validate();
        java.lang.String str43 = bulkShardRequest38.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = bulkShardRequest38.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest36.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel44);
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest46.setParentTask("", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + refreshPolicy34 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy34.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel35 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel35.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertNull(timeValue37);
        org.junit.Assert.assertNotNull(indicesOptions41);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params14 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData5, xContentBuilder13, params14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNotNull(params14);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str16 = bulkShardRequest15.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest15.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest15.getParentTask();
        bulkShardRequest13.setParentTask(taskId19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest13.index("indices:data/write/bulk[s]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = bulkShardRequest22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder3.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        long long7 = indexMetaData5.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = indexMetaData5.getState();
        boolean boolean10 = indexMetaData5.isSameUUID("index.");
        org.elasticsearch.Version version11 = indexMetaData5.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData5.getSettings();
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder3.settings(settings12);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder3.putMapping("index.shared_filesystem", "index.blocks.write");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
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
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        int int6 = builder5.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.index("current version [0] is different than the one provided [100]");
        // The following exception was thrown during execution in test generation
        try {
            long long12 = builder5.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = indexMetaData9.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNotNull(params11);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest0.remoteAddress(transportAddress7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        bulkShardRequest9.remoteAddress(transportAddress10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest9.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest13.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str17 = bulkShardRequest16.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest16.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest16.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = null;
        bulkShardRequest21.remoteAddress(transportAddress22);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest21.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest25.timeout(timeValue26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str29 = bulkShardRequest28.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy30 = bulkShardRequest28.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = bulkShardRequest28.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray35 = bulkShardRequest34.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + refreshPolicy30 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy30.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        java.lang.String str4 = bulkShardRequest0.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        bulkShardRequest8.remoteAddress(transportAddress9);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        bulkShardRequest8.remoteAddress(transportAddress12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str16 = bulkShardRequest15.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest15.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest15.getParentTask();
        bulkShardRequest8.setParentTask(taskId19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task21 = bulkShardRequest0.createTask((long) 'a', "index.creation_date_string", "current version [97] is higher than the one provided [32]", taskId19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId1);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(indicesOptions11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId19);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) (byte) 100);
        long long7 = builder6.version();
        int int8 = builder6.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest7.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest7.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.timeout(timeValue12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = null;
        bulkShardRequest14.remoteAddress(transportAddress15);
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = null;
        bulkShardRequest14.remoteAddress(transportAddress18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str22 = bulkShardRequest21.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy23 = bulkShardRequest21.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest21.getParentTask();
        bulkShardRequest14.setParentTask(taskId25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = null;
        bulkShardRequest27.remoteAddress(transportAddress28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest27.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest31.timeout(timeValue32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str35 = bulkShardRequest34.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy36 = bulkShardRequest34.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest31.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest14.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel37);
        long long41 = bulkShardRequest40.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest40.setRefreshPolicy("index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.shared_filesystem].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + refreshPolicy23 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy23.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + refreshPolicy36 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy36.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel37 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel37.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long7 = indexMetaData6.getCreationDate();
        long long8 = indexMetaData6.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = indexMetaData6.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.state(state9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder5.numberOfReplicas((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putMapping("indices:data/write/bulk[s]", "hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long6 = indexMetaData5.getCreationDate();
        org.apache.lucene.util.Version version7 = indexMetaData5.getMinimumCompatibleVersion();
        boolean boolean9 = indexMetaData5.isSameUUID("index.blocks.read");
        boolean boolean11 = indexMetaData5.isSameUUID("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData5.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData5.mapping("index.");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap16 = indexMetaData5.getMappings();
        org.elasticsearch.common.xcontent.XContentParser xContentParser17 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = indexMetaData5.fromXContent(xContentParser17, parseFieldMatcher18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNull(mappingMetaData15);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.numberOfReplicas((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder4.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfShards((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAlias("index.version.upgraded_string");
        int int11 = builder10.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder10.putMapping("index.version.created_string", "Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=current version [35] is higher or equal to the one provided [100]]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        bulkShardRequest12.remoteAddress(transportAddress13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest12.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest16.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str20 = bulkShardRequest19.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = bulkShardRequest19.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest24.setShardId(shardId25);
        bulkShardRequest26.setParentTask("index.blocks.read_only", (long) (short) 1);
        org.elasticsearch.index.shard.ShardId shardId30 = bulkShardRequest26.shardId();
        org.elasticsearch.common.io.stream.StreamInput streamInput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest26.readFrom(streamInput31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNull(shardId30);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = null;
        bulkShardRequest0.remoteAddress(transportAddress1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.creation_date");
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest4.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str8 = bulkShardRequest7.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.setShardId(shardId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str18 = bulkShardRequest17.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = bulkShardRequest17.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest17.index("index.");
        long long22 = bulkShardRequest17.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = bulkShardRequest23.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest17.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest4.setRefreshPolicy(refreshPolicy24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = bulkShardRequest4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(transportAddress16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.includeFilters();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        java.lang.String str6 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData9.getMinimumCompatibleVersion();
        org.elasticsearch.Version version12 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.requireFilters();
        boolean boolean15 = indexMetaData9.isSameUUID("current version [97] is higher than the one provided [32]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.diff(indexMetaData9);
        java.lang.String str17 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap18 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long20 = indexMetaData19.getCreationDate();
        org.apache.lucene.util.Version version21 = indexMetaData19.getMinimumCompatibleVersion();
        boolean boolean23 = indexMetaData19.isSameUUID("state-");
        int int24 = indexMetaData19.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters25 = indexMetaData19.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff26 = indexMetaData0.diff(indexMetaData19);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap27 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(version21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters25);
        org.junit.Assert.assertNotNull(indexMetaDataDiff26);
        org.junit.Assert.assertNotNull(strImmutableOpenMap27);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.readDiffFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) -1, (long) (-1));
        boolean boolean6 = versionType0.isVersionConflictForReads((long) 35, 10L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setRefreshPolicy("indices:data/write/bulk[s]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [indices:data/write/bulk[s]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + refreshPolicy3 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy3.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest7 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> indexMetaDataFromXContentBuilderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, bulkShardRequestReplicationRequest7);
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings6);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData0.getSettings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = settings5.toXContent(xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean8 = versionType1.validateVersionForReads((long) (byte) -1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForWrites((long) 35);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}
