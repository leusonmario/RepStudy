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
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_EXCLUDE_GROUP_SETTING;
        org.junit.Assert.assertNotNull(settingsSetting0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [hi!]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_MINIMUM_COMPATIBLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.minimum_compatible" + "'", str0, "index.version.minimum_compatible");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) 0, 1L);
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.minimum_compatible]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FILESYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem" + "'", str0, "index.shared_filesystem");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_PRIORITY_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_AUTO_EXPAND_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.auto_expand_replicas" + "'", str0, "index.auto_expand_replicas");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem.recover_on_any_node" + "'", str0, "index.shared_filesystem.recover_on_any_node");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded_string" + "'", str0, "index.version.upgraded_string");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.data_path" + "'", str0, "index.data_path");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.common.settings.Settings.Builder builder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.settings(builder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_replicas" + "'", str0, "index.number_of_replicas");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_READ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read" + "'", str0, "index.blocks.read");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str0 = org.elasticsearch.action.bulk.TransportShardBulkAction.ACTION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "indices:data/write/bulk[s]" + "'", str0, "indices:data/write/bulk[s]");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [100]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putAlias(aliasMetaData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes;
        org.junit.Assert.assertNull(strMap0);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHADOW_REPLICAS_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_READ_ONLY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read_only" + "'", str0, "index.blocks.read_only");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_SHARDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_shards" + "'", str0, "index.number_of_shards");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_WRITE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.write" + "'", str0, "index.blocks.write");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_REPLICAS_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_UUID;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.primaryTerm(0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
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
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_METADATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.metadata" + "'", str0, "index.blocks.metadata");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FILESYSTEM_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_UUID_NA_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_na_" + "'", str0, "_na_");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date" + "'", str0, "index.creation_date");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.putMapping(mappingMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.putAlias(aliasMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created_string" + "'", str0, "index.version.created_string");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created" + "'", str0, "index.version.created");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHADOW_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shadow_replicas" + "'", str0, "index.shadow_replicas");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.version.created");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.minimum_compatible]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
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
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
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
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
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
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.read_only]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, java.io.Serializable> indicesOptionsTuple4 = org.elasticsearch.common.collect.Tuple.tuple(indicesOptions2, (java.io.Serializable) "index.blocks.read_only");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(indicesOptionsTuple4);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
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
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_PRIMARY_TERMS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "primary_terms" + "'", str0, "primary_terms");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
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
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(params2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_PRIORITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.priority" + "'", str0, "index.priority");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.shared_filesystem]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest5.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_REQUIRE_GROUP_SETTING;
        org.junit.Assert.assertNotNull(settingsSetting0);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putMapping("hi!", "index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
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
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.readDiffFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.common.settings.Settings.Builder builder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.settings(builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingMetaData2.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SETTING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index." + "'", str0, "index.");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
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
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_ACTIVE_ALLOCATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_allocations" + "'", str0, "active_allocations");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_INDEX_UUID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.uuid" + "'", str0, "index.uuid");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date_string" + "'", str0, "index.creation_date_string");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.readDiffFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [100]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str6 = versionType0.explainConflictForReads((long) (byte) -1, (long) 0);
        java.lang.String str10 = versionType0.explainConflictForWrites((long) 10, (long) ' ', true);
        boolean boolean13 = versionType0.isVersionConflictForReads((long) (short) 100, (long) (byte) 10);
        org.elasticsearch.index.VersionType versionType14 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType14.writeTo(streamOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str6, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str10, "current version [10] is different than the one provided [32]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(versionType14);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [10] is different than the one provided [32]");
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
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.action.support.IndicesOptions> indexMetaDataDiffTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.action.support.IndicesOptions>(indexMetaDataDiff0, indicesOptions3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
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
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded" + "'", str0, "index.version.upgraded");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int10 = bulkItemRequest9.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest9.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest5.remoteAddress(transportAddress6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.primaryTerm();
        bulkShardRequest12.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest12.timeout(timeValue16);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.ActionRequest actionRequest19 = bulkItemRequest18.request();
        org.elasticsearch.tasks.TaskId taskId20 = actionRequest19.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task21 = bulkShardRequest5.createTask((long) (short) 0, "current version [0] is different than the one provided [1]", "index.shadow_replicas", taskId20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(actionRequest19);
        org.junit.Assert.assertNotNull(taskId20);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_READ_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state0 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte1 = state0.id();
        byte byte2 = state0.id();
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state0.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest3.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bulkShardRequest5.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(version5);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = builder1.primaryTerm((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        java.lang.Class<?> wildcardClass6 = taskId4.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_STATE_FILE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "state-" + "'", str0, "state-");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        int int9 = bulkItemRequest7.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfShards((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: [index.version.created] is not present in the index settings for index with uuid: [null]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("state-", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_METADATA_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder6.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting3 = settingsSettingTuple2.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str6 = builder5.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.version((long) '4');
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting3, builder10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = builder10.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertNotNull(settingsSetting3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.version.minimum_compatible" + "'", str6, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.version.minimum_compatible", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bulkShardRequest4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
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
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting3 = settingsSettingTuple2.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str6 = builder5.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.version((long) '4');
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting3, builder10);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putAlias(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertNotNull(settingsSetting3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.version.minimum_compatible" + "'", str6, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        long long4 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest3.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.timeout("index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.shadow_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions5);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        java.util.Set<java.lang.String> strSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putActiveAllocationIds(0, strSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [10] is different than the one provided [32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [10] is different than the one provided [32]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
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
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
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
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest3.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest9.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        boolean boolean8 = indexMetaData0.equals((java.lang.Object) state7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        boolean boolean8 = indexMetaData0.equals((java.lang.Object) state7);
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest7.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNull(actionRequestValidationException8);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.version.created");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.readDiffFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData1.getMappings();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, java.lang.Iterable<com.carrotsearch.hppc.cursors.ObjectObjectCursor<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData>>> serializableTuple6 = org.elasticsearch.common.collect.Tuple.tuple((java.io.Serializable) "active_allocations", (java.lang.Iterable<com.carrotsearch.hppc.cursors.ObjectObjectCursor<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData>>) strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(serializableTuple6);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.timeout("index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.number_of_shards]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = indexMetaData0.primaryTerm((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("active_allocations");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [active_allocations]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_DATA_PATH_SETTING;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long7 = indexMetaData4.getVersion();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData4.getSettings();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder3.settings(settings8);
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
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        java.lang.String[] strArray26 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder1.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet27);
        int int30 = builder29.numberOfReplicas();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder29.putAlias(aliasMetaData31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putMapping(mappingMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        boolean boolean5 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) '#');
        java.lang.String str8 = versionType0.explainConflictForReads(0L, (long) (byte) 1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [0] is different than the one provided [1]" + "'", str8, "current version [0] is different than the one provided [1]");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.created_string");
        int int4 = indexMetaData0.getNumberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        java.lang.String str4 = bulkShardRequest0.index();
        java.lang.String str5 = bulkShardRequest0.index();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
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
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest12, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest13.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task17 = bulkShardRequest0.createTask(0L, "", "index.blocks.read_only", taskId16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(taskId16);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state0 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        byte byte1 = state0.id();
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state0.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest5.timeout("current version [3] is different than the one provided [11]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [3] is different than the one provided [11]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        long long4 = indexMetaData0.getVersion();
        org.elasticsearch.index.Index index5 = indexMetaData0.getIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.readDiffFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromString("", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.version(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.primaryTerm((int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.version((long) (byte) -1);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        long long8 = indexMetaData0.getCreationDate();
        java.lang.Class<?> wildcardClass9 = indexMetaData0.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [10] is different than the one provided [100]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.write] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.shared_filesystem.recover_on_any_node", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        bulkShardRequest0.setParentTask("index.version.upgraded", (long) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData12.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap16 = indexMetaData12.getMappings();
        int int17 = indexMetaData12.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData12.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom22 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder20.putCustom("index.blocks.read", custom22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder20.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.version(0L);
        boolean boolean27 = indexMetaData12.equals((java.lang.Object) builder24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long30 = bulkShardRequest29.primaryTerm();
        bulkShardRequest29.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest29.timeout(timeValue33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.ActionRequest actionRequest36 = bulkItemRequest35.request();
        org.elasticsearch.tasks.TaskId taskId37 = actionRequest36.getParentTask();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long41 = bulkShardRequest40.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions42 = bulkShardRequest40.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException43 = bulkShardRequest40.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure45 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting38, "primary_terms", (java.lang.Throwable) actionRequestValidationException43, "index.priority");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.IllegalArgumentException> taskIdTuple46 = org.elasticsearch.common.collect.Tuple.tuple(taskId37, (java.lang.IllegalArgumentException) actionRequestValidationException43);
        boolean boolean47 = indexMetaData12.equals((java.lang.Object) taskId37);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task48 = bulkShardRequest0.createTask((long) (-1), "index.creation_date", "index.creation_date", taskId37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNotNull(actionRequest36);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions42);
        org.junit.Assert.assertNotNull(actionRequestValidationException43);
        org.junit.Assert.assertNotNull(taskIdTuple46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple6);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        java.lang.String str5 = bulkShardRequest3.index();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str5, "current version [-1] is different than the one provided [0]");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder2 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params3 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = indexMetaData0.toXContent(xContentBuilder2, params3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(params3);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.putMapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]", "index.creation_date");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str7 = versionType1.explainConflictForReads((long) (byte) -1, (long) 0);
        java.lang.String str11 = versionType1.explainConflictForWrites((long) 10, (long) ' ', true);
        boolean boolean14 = versionType1.isVersionConflictForReads((long) (short) 100, (long) (byte) 10);
        org.elasticsearch.index.VersionType versionType15 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean17 = versionType1.validateVersionForWrites((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.fromString("index.creation_date", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str7, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str11, "current version [10] is different than the one provided [32]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        int int6 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) (short) -1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        boolean boolean5 = versionType0.isVersionConflictForReads(0L, 0L);
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 10);
        java.lang.String str10 = versionType0.explainConflictForReads((long) '#', (long) (short) 100);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [35] is different than the one provided [100]" + "'", str10, "current version [35] is different than the one provided [100]");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putCustom("index.version.upgraded_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate(0L);
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder4.settings(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        boolean boolean10 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest6.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        java.lang.String str5 = builder1.index();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.version.upgraded_string" + "'", str5, "index.version.upgraded_string");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads(101L, 1L);
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
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putAlias(aliasMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(settings4);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        long long10 = bulkShardRequest7.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkShardRequest7.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings4);
        org.elasticsearch.transport.TransportService transportService6 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService7 = null;
        org.elasticsearch.indices.IndicesService indicesService8 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool9 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction10 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction11 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper12 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters13 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction15 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings4, transportService6, clusterService7, indicesService8, threadPool9, shardStateAction10, mappingUpdatedAction11, updateHelper12, actionFilters13, indexNameExpressionResolver14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings5);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfShards((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("index.blocks.write", custom8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: [index.version.created] is not present in the index settings for index with uuid: [null]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.index.VersionType versionType15 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType16 = versionType15.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple17 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest14, versionType15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long20 = bulkShardRequest19.seqNo();
        long long21 = bulkShardRequest19.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest22.getParentTask();
        bulkShardRequest19.setParentTask(taskId23);
        bulkShardRequest14.setParentTask(taskId23);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task26 = bulkShardRequest0.createTask(36L, "current version [10] is different than the one provided [-1]", "index.shared_filesystem.recover_on_any_node", taskId23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(taskId23);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        boolean boolean6 = indexMetaData0.isSameUUID("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.readDiffFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = indexMetaData0.primaryTerm(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
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
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mapping("hi!");
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
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        boolean boolean6 = bulkShardRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.read_only] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest7.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(actionRequest8);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        java.lang.String[] strArray26 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder1.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet27);
        int int30 = builder29.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder29.version((long) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder29.putMapping(mappingMetaData33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.readDiffFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str7 = versionType1.explainConflictForReads((long) (byte) -1, (long) 0);
        java.lang.String str11 = versionType1.explainConflictForWrites((long) 10, (long) ' ', true);
        byte byte12 = versionType1.getValue();
        long long15 = versionType1.updateVersion((long) '#', 100L);
        boolean boolean19 = versionType1.isVersionConflictForWrites((long) (-1), (long) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType20 = org.elasticsearch.index.VersionType.fromString("index.data_path", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str7, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str11, "current version [10] is different than the one provided [32]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36L + "'", long15 == 36L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.elasticsearch.index.Index index9 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.index.Index index10 = indexMetaData4.getMergeSourceIndex();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNotNull(params12);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        int int6 = builder1.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.upgraded_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForReads((long) 1);
        boolean boolean6 = versionType1.isVersionConflictForReads(0L, 0L);
        boolean boolean8 = versionType1.validateVersionForReads((long) (short) 10);
        java.lang.String str11 = versionType1.explainConflictForReads((long) '#', (long) (short) 100);
        java.lang.String str14 = versionType1.explainConflictForReads((long) (byte) 0, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType15 = org.elasticsearch.index.VersionType.fromString("current version [0] is different than the one provided [35]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [0] is different than the one provided [35]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [35] is different than the one provided [100]" + "'", str11, "current version [35] is different than the one provided [100]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "current version [0] is different than the one provided [35]" + "'", str14, "current version [0] is different than the one provided [35]");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_shards");
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [0] is different than the one provided [1]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        long long10 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest7.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest11.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.version.created" + "'", str10, "index.version.created");
        org.junit.Assert.assertNotNull(actionRequest12);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.read", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.version(0L);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) builder12);
        org.elasticsearch.common.xcontent.XContentParser xContentParser16 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexMetaData0.fromXContent(xContentParser16, parseFieldMatcher17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        boolean boolean5 = versionType0.isVersionConflictForReads(0L, 0L);
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.index("index.priority");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = bulkShardRequest9.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params4 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder3, params4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(params4);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        long long9 = indexMetaData4.getCreationDate();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(params11);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str7 = versionType1.explainConflictForReads((long) (byte) -1, (long) 0);
        java.lang.String str11 = versionType1.explainConflictForWrites((long) 10, (long) ' ', true);
        boolean boolean14 = versionType1.isVersionConflictForReads(0L, (-1L));
        boolean boolean16 = versionType1.validateVersionForReads((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType17 = org.elasticsearch.index.VersionType.fromString("current version [3] is different than the one provided [11]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [3] is different than the one provided [11]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str7, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str11, "current version [10] is different than the one provided [32]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        java.util.Set<java.lang.String> strSet5 = indexMetaData0.activeAllocationIds(0);
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
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.removeAlias("index.number_of_shards");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.putMapping(mappingMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str6 = versionType0.explainConflictForReads((long) (byte) -1, (long) 0);
        java.lang.String str10 = versionType0.explainConflictForWrites((long) 10, (long) ' ', true);
        byte byte11 = versionType0.getValue();
        long long14 = versionType0.updateVersion((long) '#', 100L);
        boolean boolean18 = versionType0.isVersionConflictForWrites((long) (-1), (long) '#', true);
        byte byte19 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str6, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str10, "current version [10] is different than the one provided [32]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36L + "'", long14 == 36L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
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
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shared_filesystem", throwable2, "index.shared_filesystem");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        java.lang.String str6 = shardFailure4.reason;
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.shared_filesystem" + "'", str6, "index.shared_filesystem");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        boolean boolean5 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) '#');
        java.lang.String str8 = versionType0.explainConflictForReads(0L, (long) (byte) 1);
        byte byte9 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [0] is different than the one provided [1]" + "'", str8, "current version [0] is different than the one provided [1]");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.number_of_replicas", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("index.shared_filesystem");
        int int12 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(version5);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromString("index.auto_expand_replicas", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.auto_expand_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int4 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.settings(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        int int9 = bulkItemRequest7.id();
        org.elasticsearch.action.ActionRequest actionRequest10 = bulkItemRequest7.request();
        org.elasticsearch.action.ActionRequest actionRequest11 = bulkItemRequest7.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(actionRequest10);
        org.junit.Assert.assertNotNull(actionRequest11);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_replicas");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
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
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.read", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.version(0L);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) builder12);
        long long16 = indexMetaData0.getVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexMetaData0.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest5.timeout("current version [10] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [10] is different than the one provided [100]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.requireFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = indexMetaData0.primaryTerm((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (-1), (-1L));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest7.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(actionRequest8);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putCustom("index.version.upgraded_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate((long) '#');
        java.lang.String str10 = builder9.index();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.version.minimum_compatible" + "'", str10, "index.version.minimum_compatible");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        boolean boolean5 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest0.timeout("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.blocks.write] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = builder6.mapping("index.number_of_replicas");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.primaryTerm((int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        bulkShardRequest0.seqNo(0L);
        boolean boolean6 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest10.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple18 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest15, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest16.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task20 = bulkShardRequest0.createTask(11L, "index.blocks.metadata", "index.version.upgraded_string", taskId19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(taskId19);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.timeout("current version [0] is different than the one provided [35]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [0] is different than the one provided [35]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
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
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest7.timeout("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.blocks.read]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.apache.lucene.util.Version version7 = indexMetaData0.getMinimumCompatibleVersion();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.created_string");
        java.lang.String str4 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.version(0L);
        int int8 = builder5.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = builder5.mapping("index.blocks.read");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder5.putAlias(aliasMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(mappingMetaData10);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        long long11 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest12.getParentTask();
        bulkShardRequest9.setParentTask(taskId13);
        bulkShardRequest4.setParentTask(taskId13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNull(writeConsistencyLevel16);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.apache.lucene.util.Version version9 = indexMetaData4.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long11 = indexMetaData10.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData4.diff(indexMetaData10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData10.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long7 = indexMetaData4.getVersion();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData4.getSettings();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder3.settings(settings8);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.putAlias(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_replicas");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
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
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.readDiffFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        long long4 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest9.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest14, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest15.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task19 = bulkShardRequest3.createTask((long) 97, "current version [35] is different than the one provided [100]", "index.blocks.read", taskId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(taskId18);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting3 = settingsSettingTuple2.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str6 = builder5.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.version((long) '4');
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting3, builder10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = settingsSettingTuple11.v2();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting13 = settingsSettingTuple11.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder15.putCustom("index.blocks.read", custom17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.creationDate((long) ' ');
        java.lang.String[] strArray40 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder15.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder15.numberOfShards((int) (byte) 10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting13, builder45);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder45.putMapping(mappingMetaData47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertNotNull(settingsSetting3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.version.minimum_compatible" + "'", str6, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(settingsSetting13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest5.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest5.remoteAddress(transportAddress7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.index("current version [-1] is different than the one provided [0]");
        long long13 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.common.io.stream.StreamInput streamInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest5.readFrom(streamInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        long long6 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        int int9 = bulkItemRequest7.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bulkItemRequest7.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(actionRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        boolean boolean9 = indexMetaData0.isSameUUID("index.creation_date");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = indexMetaData0.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(params11);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        boolean boolean10 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest6.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest3.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.timeout("index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.number_of_shards]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(version6);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        int int6 = builder1.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder1.primaryTerm((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.elasticsearch.index.Index index9 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.index.Index index10 = indexMetaData4.getMergeSourceIndex();
        java.lang.Class<?> wildcardClass11 = indexMetaData4.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.created_string");
        int int4 = indexMetaData0.getNumberOfReplicas();
        int int5 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.index("index.priority");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest13.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.index("index.version.created");
        bulkShardRequest13.primaryTerm((long) '#');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long22 = bulkShardRequest21.seqNo();
        long long23 = bulkShardRequest21.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest24.getParentTask();
        bulkShardRequest21.setParentTask(taskId25);
        bulkShardRequest13.setParentTask(taskId25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task28 = bulkShardRequest9.createTask(36L, "index.blocks.read_only", "current version [10] is different than the one provided [32]", taskId25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(taskId25);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.putCustom("index.auto_expand_replicas", custom9);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.putAlias(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest7.request();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        actionRequest9.remoteAddress(transportAddress10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = indexMetaData0.readFrom(streamInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        long long9 = indexMetaData4.getCreationDate();
        int int10 = indexMetaData4.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData4.readDiffFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequest actionRequest6 = bulkItemRequest5.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkItemRequest5.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(actionRequest6);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfShards((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("index.blocks.write", custom8);
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.settings(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.putCustom("", custom9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.putMapping("current version [11] is different than the one provided [0]", "state-");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("state-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [state-]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForReads((long) 1);
        boolean boolean6 = versionType1.isVersionConflictForReads((long) (byte) 0, (long) '#');
        java.lang.String str9 = versionType1.explainConflictForReads(0L, (long) (byte) 1);
        byte byte10 = versionType1.getValue();
        boolean boolean12 = versionType1.validateVersionForReads(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType13 = org.elasticsearch.index.VersionType.fromString("", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [0] is different than the one provided [1]" + "'", str9, "current version [0] is different than the one provided [1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest9.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(taskId6);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mapping("hi!");
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
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.primaryTerm((int) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("index.shadow_replicas");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.primaryTerm(1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest5.consistencyLevel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.version(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.putMapping("index.shared_filesystem", "hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        long long5 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest0.validate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task16 = bulkShardRequest0.createTask(1L, "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]", "index.number_of_shards", taskId14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(taskId14);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
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
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.ActionRequest actionRequest10 = bulkItemRequest9.request();
        org.elasticsearch.action.ActionRequest actionRequest11 = bulkItemRequest9.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bulkItemRequest9.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(actionRequest10);
        org.junit.Assert.assertNotNull(actionRequest11);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.index("index.priority");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest6.timeout("current version [0] is different than the one provided [35]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [0] is different than the one provided [35]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shadow_replicas");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.readDiffFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        int int4 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData5.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long8 = indexMetaData5.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData5.requireFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = indexMetaData5.getState();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(indexMetaDataDiff10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.primaryTerm();
        bulkShardRequest10.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest10.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.ActionRequest actionRequest17 = bulkItemRequest16.request();
        org.elasticsearch.tasks.TaskId taskId18 = actionRequest17.getParentTask();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long22 = bulkShardRequest21.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = bulkShardRequest21.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting19, "primary_terms", (java.lang.Throwable) actionRequestValidationException24, "index.priority");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.IllegalArgumentException> taskIdTuple27 = org.elasticsearch.common.collect.Tuple.tuple(taskId18, (java.lang.IllegalArgumentException) actionRequestValidationException24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task28 = bulkShardRequest0.createTask((long) (byte) 10, "current version [3] is different than the one provided [11]", "index.version.upgraded_string", taskId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(actionRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(taskIdTuple27);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest5.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = bulkShardRequest5.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.setShardId(shardId3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_shards");
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        bulkShardRequest4.remoteAddress(transportAddress9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkShardRequest4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putMapping(mappingMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        int int6 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.getInitialRecoveryFilters();
        int int8 = indexMetaData0.getNumberOfShards();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_replicas");
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_shards");
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        long long10 = bulkShardRequest1.seqNo();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_NAME;
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
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        long long6 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.metadata");
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
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        int int5 = indexMetaData0.getTotalNumberOfShards();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        long long5 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        bulkShardRequest0.primaryTerm((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long7 = indexMetaData4.getVersion();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData4.getSettings();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder3.settings(settings8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = indexMetaData11.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData11);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData15.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state18 = indexMetaData15.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData21 = indexMetaData19.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = indexMetaData19.getState();
        boolean boolean23 = indexMetaData15.equals((java.lang.Object) state22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder14.state(state22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder3.state(state22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder25.primaryTerm((int) (byte) 0, (long) 0);
        org.elasticsearch.common.settings.Settings.Builder builder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder28.settings(builder29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertNull(mappingMetaData13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertNull(mappingMetaData17);
        org.junit.Assert.assertTrue("'" + state18 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state18.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertNull(mappingMetaData21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("index.blocks.read", custom8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder6.creationDate((long) ' ');
        java.lang.String[] strArray31 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder6.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.AbstractSet<java.lang.String>> streamableTuple35 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest3, (java.util.AbstractSet<java.lang.String>) strSet32);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest3.timeout("index.uuid");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.uuid]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(streamableTuple35);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [-1] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [-1] is different than the one provided [0]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.read", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.version(0L);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) builder12);
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.settings(builder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.index.Index index5 = indexMetaData0.getMergeSourceIndex();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) '4');
        java.lang.String str7 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.version((long) 'a');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.putMapping(mappingMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.version.minimum_compatible" + "'", str7, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        int int7 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("index.shared_filesystem");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params13 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder14 = indexMetaData0.toXContent(xContentBuilder12, params13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(params13);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shared_filesystem", throwable2, "index.shared_filesystem");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        java.lang.String str6 = shardFailure4.reason;
        java.lang.Throwable throwable7 = shardFailure4.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = shardFailure4.routing;
        org.junit.Assert.assertNull(throwable5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.shared_filesystem" + "'", str6, "index.shared_filesystem");
        org.junit.Assert.assertNull(throwable7);
        org.junit.Assert.assertNull(shardRouting8);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [10]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        boolean boolean10 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.index("index.creation_date_string");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest12.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.priority");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.common.settings.Settings.Builder builder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(version8);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte2 = versionType1.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting3 = settingsSettingTuple2.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str6 = builder5.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.version((long) '4');
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting3, builder10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = settingsSettingTuple11.v2();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putMapping("current version [32] is different than the one provided [3]", "index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertNotNull(settingsSetting3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.version.minimum_compatible" + "'", str6, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.read", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.version(0L);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) builder12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long18 = bulkShardRequest17.primaryTerm();
        bulkShardRequest17.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.timeout(timeValue21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.ActionRequest actionRequest24 = bulkItemRequest23.request();
        org.elasticsearch.tasks.TaskId taskId25 = actionRequest24.getParentTask();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long29 = bulkShardRequest28.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions30 = bulkShardRequest28.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = bulkShardRequest28.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting26, "primary_terms", (java.lang.Throwable) actionRequestValidationException31, "index.priority");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.IllegalArgumentException> taskIdTuple34 = org.elasticsearch.common.collect.Tuple.tuple(taskId25, (java.lang.IllegalArgumentException) actionRequestValidationException31);
        boolean boolean35 = indexMetaData0.equals((java.lang.Object) taskId25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long37 = bulkShardRequest36.seqNo();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest36.setShardId(shardId38);
        boolean boolean40 = indexMetaData0.equals((java.lang.Object) bulkShardRequest39);
        org.elasticsearch.common.transport.TransportAddress transportAddress41 = null;
        bulkShardRequest39.remoteAddress(transportAddress41);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(actionRequest24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions30);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(taskIdTuple34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate((long) ' ');
        int int7 = builder6.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putCustom("_na_", custom9);
        long long11 = builder6.version();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder6.putAlias(aliasMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForReads((long) 1);
        boolean boolean6 = versionType1.isVersionConflictForReads((long) (byte) 0, (long) '#');
        java.lang.String str9 = versionType1.explainConflictForReads(0L, (long) (byte) 1);
        byte byte10 = versionType1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.fromString("index.version.created", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [0] is different than the one provided [1]" + "'", str9, "current version [0] is different than the one provided [1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.data_path");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.numberOfReplicas((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = builder3.primaryTerm((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = indexMetaData8.getState();
        boolean boolean12 = indexMetaData4.equals((java.lang.Object) state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder3.state(state11);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.putAlias(aliasMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.apache.lucene.util.Version version9 = indexMetaData4.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long11 = indexMetaData10.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData4.diff(indexMetaData10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData4.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        bulkShardRequest4.remoteAddress(transportAddress9);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest4.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        java.util.Set<java.lang.String> strSet6 = null; // flaky: indexMetaData0.activeAllocationIds(10);
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.excludeFilters();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.settings(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkShardRequest0.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        long long11 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest12.getParentTask();
        bulkShardRequest9.setParentTask(taskId13);
        bulkShardRequest4.setParentTask(taskId13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest4.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = bulkShardRequest4.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNull(writeConsistencyLevel16);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        bulkShardRequest9.primaryTerm((long) 10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.transport.TransportRequest> bulkItemRequestTuple13 = org.elasticsearch.common.collect.Tuple.tuple(bulkItemRequest8, (org.elasticsearch.transport.TransportRequest) bulkShardRequest9);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkItemRequestTuple13);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        bulkShardRequest0.setParentTask("index.version.upgraded", (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = bulkShardRequest0.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int10 = bulkItemRequest9.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkItemRequest9.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("indices:data/write/bulk[s]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = indexMetaData0.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mapping("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = mappingMetaData8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting3 = settingsSettingTuple2.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str6 = builder5.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder5.version((long) '4');
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting3, builder10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = settingsSettingTuple11.v2();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting13 = settingsSettingTuple11.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder15.putCustom("index.blocks.read", custom17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.creationDate((long) ' ');
        java.lang.String[] strArray40 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder15.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder15.numberOfShards((int) (byte) 10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>(settingsSetting13, builder45);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = builder45.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertNotNull(settingsSetting3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.version.minimum_compatible" + "'", str6, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(settingsSetting13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        boolean boolean8 = indexMetaData0.equals((java.lang.Object) state7);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
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
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [10] is different than the one provided [32]");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putAlias(aliasMetaData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str2, "current version [10] is different than the one provided [32]");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest5.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest5.remoteAddress(transportAddress7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.index("current version [-1] is different than the one provided [0]");
        long long13 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bulkShardRequest15.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfShards(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putCustom("index.version.upgraded_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate((long) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.removeAlias("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData12.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff17 = indexMetaData12.diff(indexMetaData16);
        org.elasticsearch.index.Index index18 = indexMetaData16.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData20 = indexMetaData16.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.elasticsearch.index.Index index21 = indexMetaData16.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.settings(settings24);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData28 = indexMetaData26.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long29 = indexMetaData26.getVersion();
        org.elasticsearch.common.settings.Settings settings30 = indexMetaData26.getSettings();
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder25.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData35 = indexMetaData33.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData33);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData39 = indexMetaData37.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state40 = indexMetaData37.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData41 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData43 = indexMetaData41.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state44 = indexMetaData41.getState();
        boolean boolean45 = indexMetaData37.equals((java.lang.Object) state44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder36.state(state44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder25.state(state44);
        boolean boolean48 = indexMetaData16.equals((java.lang.Object) builder25);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state49 = indexMetaData16.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder11.state(state49);
        org.elasticsearch.common.settings.Settings.Builder builder51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder11.settings(builder51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(indexMetaDataDiff17);
        org.junit.Assert.assertNull(index18);
        org.junit.Assert.assertNull(mappingMetaData20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertNull(mappingMetaData28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertNull(mappingMetaData35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertNull(mappingMetaData39);
        org.junit.Assert.assertTrue("'" + state40 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state40.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData41);
        org.junit.Assert.assertNull(mappingMetaData43);
        org.junit.Assert.assertTrue("'" + state44 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state44.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + state49 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state49.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        bulkShardRequest5.setParentTask("index.shadow_replicas", 100L);
        bulkShardRequest5.primaryTerm(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version(1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.putCustom("index.blocks.read", custom15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder13.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder13.creationDate((long) ' ');
        java.lang.String[] strArray38 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder13.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder10.putActiveAllocationIds((-1), (java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom44 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder42.putCustom("current version [-1] is different than the one provided [0]", custom44);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder45.primaryTerm((int) ' ', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        long long3 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("current version [-1] is different than the one provided [11]");
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        bulkShardRequest9.primaryTerm((long) 10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.transport.TransportRequest> bulkItemRequestTuple13 = org.elasticsearch.common.collect.Tuple.tuple(bulkItemRequest8, (org.elasticsearch.transport.TransportRequest) bulkShardRequest9);
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest8.request();
        boolean boolean15 = actionRequest14.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkItemRequestTuple13);
        org.junit.Assert.assertNotNull(actionRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("index.shared_filesystem");
        int int12 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.Version version13 = indexMetaData0.getCreationVersion();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(params15);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.created_string");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.primaryTerm(10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("primary_terms");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [primary_terms]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.write]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest5.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean2 = versionType0.validateVersionForWrites((long) 1);
        long long5 = versionType0.updateVersion((long) (byte) 1, (long) 100);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shadow_replicas");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfShards((int) 'a');
        int int7 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.settings(settings10);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData12.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long15 = indexMetaData12.getVersion();
        org.elasticsearch.common.settings.Settings settings16 = indexMetaData12.getSettings();
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.settings(settings16);
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder1.settings(settings16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder20.primaryTerm((int) (byte) -1, 11L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.numberOfReplicas((int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder3.settings(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        long long6 = indexMetaData0.getVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        long long11 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest12.getParentTask();
        bulkShardRequest9.setParentTask(taskId13);
        bulkShardRequest4.setParentTask(taskId13);
        bulkShardRequest4.setParentTask("index.version.upgraded", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = bulkShardRequest22.validate();
        org.elasticsearch.common.unit.TimeValue timeValue26 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest22.timeout(timeValue26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long29 = bulkShardRequest28.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest28.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest28.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long35 = bulkShardRequest34.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest33, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest34.getParentTask();
        bulkShardRequest27.setParentTask(taskId37);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task39 = bulkShardRequest4.createTask((-1L), "current version [-1] is different than the one provided [10]", "index.priority", taskId37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions24);
        org.junit.Assert.assertNotNull(actionRequestValidationException25);
        org.junit.Assert.assertNotNull(timeValue26);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(taskId37);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        java.util.Set<java.lang.String> strSet6 = null; // flaky: indexMetaData0.activeAllocationIds(10);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shadow_replicas");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putCustom("index.version.upgraded_string", custom6);
        long long8 = builder7.version();
        long long9 = builder7.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.putMapping("current version [-1] is different than the one provided [11]", "current version [10] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.created_string");
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.index.Index index5 = indexMetaData0.getIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        byte byte5 = state4.id();
        byte byte6 = state4.id();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        byte byte3 = versionType0.getValue();
        java.lang.String str7 = versionType0.explainConflictForWrites((long) '#', (long) (short) -1, true);
        boolean boolean10 = versionType0.isVersionConflictForReads((long) (short) 10, 101L);
        org.elasticsearch.index.VersionType versionType11 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [35] is different than the one provided [-1]" + "'", str7, "current version [35] is different than the one provided [-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [10] is different than the one provided [32]");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = builder1.primaryTerm(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        java.lang.String str3 = settingsSettingTuple2.toString();
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]" + "'", str3, "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("");
        boolean boolean8 = indexMetaData0.isSameUUID("index.auto_expand_replicas");
        long long9 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.elasticsearch.index.Index index9 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData4.getActiveAllocationIds();
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("active_allocations");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [active_allocations]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        bulkShardRequest0.setParentTask("current version [-1] is different than the one provided [11]", (long) (byte) 10);
        long long9 = bulkShardRequest0.primaryTerm();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str6 = versionType0.explainConflictForReads((long) (byte) -1, (long) 0);
        java.lang.String str10 = versionType0.explainConflictForWrites((long) 10, (long) ' ', true);
        boolean boolean13 = versionType0.isVersionConflictForReads(0L, (-1L));
        boolean boolean15 = versionType0.validateVersionForReads((long) 'a');
        boolean boolean17 = versionType0.validateVersionForReads(11L);
        byte byte18 = versionType0.getValue();
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str6, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [10] is different than the one provided [32]" + "'", str10, "current version [10] is different than the one provided [32]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData7.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData7.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = indexMetaData7.getState();
        byte byte12 = state11.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder6.state(state11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder6.putMapping("indices:data/write/bulk[s]", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_replicas");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putCustom("index.version.upgraded_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder7.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.minimum_compatible]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.numberOfShards((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.read", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder8.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder14.putCustom("index.auto_expand_replicas", custom16);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData19 = builder17.mapping("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData22 = indexMetaData20.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state23 = indexMetaData20.getState();
        byte byte24 = state23.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder17.state(state23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder6.state(state23);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder6.putMapping(mappingMetaData27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(mappingMetaData19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertNull(mappingMetaData22);
        org.junit.Assert.assertTrue("'" + state23 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state23.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        long long6 = indexMetaData0.getCreationDate();
        boolean boolean8 = indexMetaData0.isSameUUID("index.uuid");
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bulkShardRequest6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        byte byte5 = state4.id();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [-1]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putMapping("current version [32] is different than the one provided [3]", "index.version.upgraded");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = builder8.primaryTerm(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.index("index.version.created");
        // The following exception was thrown during execution in test generation
        try {
            long long6 = builder2.primaryTerm((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [35] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [35] is different than the one provided [100]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        long long6 = indexMetaData0.getVersion();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(settings7);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest8.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("current version [-1] is different than the one provided [11]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.primaryTerm((int) (short) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.apache.lucene.util.Version version9 = indexMetaData4.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long11 = indexMetaData10.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData4.diff(indexMetaData10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData4.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        long long5 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.setShardId(shardId6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bulkShardRequest7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shared_filesystem", throwable2, "index.shared_filesystem");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        java.lang.Throwable throwable7 = shardFailure4.cause;
        java.lang.String str8 = shardFailure4.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure4.routing;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shared_filesystem" + "'", str5, "index.shared_filesystem");
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertNull(throwable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index.shared_filesystem" + "'", str8, "index.shared_filesystem");
        org.junit.Assert.assertNull(shardRouting9);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest4.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.timeout("index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.number_of_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        bulkShardRequest0.seqNo(0L);
        boolean boolean6 = bulkShardRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkShardRequest0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shadow_replicas");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(settings7);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        boolean boolean6 = indexMetaData0.isSameUUID("current version [-1] is different than the one provided [0]");
        org.elasticsearch.index.Index index7 = indexMetaData0.getIndex();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(index7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        boolean boolean6 = indexMetaData0.isSameUUID("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.number_of_shards", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("");
        int int4 = builder3.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.primaryTerm((int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.read", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.version(0L);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) builder12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long18 = bulkShardRequest17.primaryTerm();
        bulkShardRequest17.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.timeout(timeValue21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.ActionRequest actionRequest24 = bulkItemRequest23.request();
        org.elasticsearch.tasks.TaskId taskId25 = actionRequest24.getParentTask();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long29 = bulkShardRequest28.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions30 = bulkShardRequest28.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = bulkShardRequest28.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting26, "primary_terms", (java.lang.Throwable) actionRequestValidationException31, "index.priority");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.IllegalArgumentException> taskIdTuple34 = org.elasticsearch.common.collect.Tuple.tuple(taskId25, (java.lang.IllegalArgumentException) actionRequestValidationException31);
        boolean boolean35 = indexMetaData0.equals((java.lang.Object) taskId25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long37 = bulkShardRequest36.seqNo();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest36.setShardId(shardId38);
        boolean boolean40 = indexMetaData0.equals((java.lang.Object) bulkShardRequest39);
        org.elasticsearch.common.io.stream.StreamInput streamInput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff42 = indexMetaData0.readDiffFrom(streamInput41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(actionRequest24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions30);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(taskIdTuple34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.index("index.priority");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest6.timeout("index.");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("hi!");
        int int5 = indexMetaData0.getTotalNumberOfShards();
        long long6 = indexMetaData0.getVersion();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "index.shared_filesystem", throwable10, "index.shared_filesystem");
        java.lang.String str13 = shardFailure12.reason;
        java.lang.String str14 = shardFailure12.indexUUID;
        java.lang.String str15 = shardFailure12.reason;
        java.lang.String str16 = shardFailure12.reason;
        java.lang.String str17 = shardFailure12.indexUUID;
        boolean boolean18 = indexMetaData0.equals((java.lang.Object) shardFailure12);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.settings.Settings settings20 = indexMetaData0.getSettings();
        long long21 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index.shared_filesystem" + "'", str13, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "index.shared_filesystem" + "'", str14, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index.shared_filesystem" + "'", str15, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index.shared_filesystem" + "'", str16, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "index.shared_filesystem" + "'", str17, "index.shared_filesystem");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [10] is different than the one provided [35]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForReads((long) 1);
        boolean boolean6 = versionType1.isVersionConflictForReads(0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType7 = org.elasticsearch.index.VersionType.fromString("index.uuid", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.uuid]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [11] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [11] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.state(state7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putMapping("current version [-1] is different than the one provided [11]", "current version [35] is different than the one provided [-1]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        boolean boolean5 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) '#');
        java.lang.String str8 = versionType0.explainConflictForReads(0L, (long) (byte) 1);
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) 10, 10L, false);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [0] is different than the one provided [1]" + "'", str8, "current version [0] is different than the one provided [1]");
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads((long) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        boolean boolean8 = indexMetaData0.equals((java.lang.Object) state7);
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData10.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long13 = indexMetaData10.getVersion();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData10.getSettings();
        java.lang.String str15 = indexMetaData10.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap16 = indexMetaData10.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap17 = indexMetaData10.getAliases();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff18 = indexMetaData0.diff(indexMetaData10);
        org.elasticsearch.common.io.stream.StreamInput streamInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData10.readDiffFrom(streamInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_na_" + "'", str15, "_na_");
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap16);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNotNull(indexMetaDataDiff18);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        boolean boolean6 = bulkShardRequest0.getShouldPersistResult();
        bulkShardRequest0.setParentTask("index.", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long6 = bulkShardRequest5.seqNo();
        long long7 = bulkShardRequest5.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest8.getParentTask();
        bulkShardRequest5.setParentTask(taskId9);
        bulkShardRequest4.setParentTask(taskId9);
        bulkShardRequest3.setParentTask(taskId9);
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        bulkShardRequest3.remoteAddress(transportAddress13);
        org.elasticsearch.index.shard.ShardId shardId15 = bulkShardRequest3.shardId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = bulkShardRequest3.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNull(shardId15);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("index.shared_filesystem");
        int int12 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.index.Index index13 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.index.Index index14 = indexMetaData0.getMergeSourceIndex();
        org.apache.lucene.util.Version version15 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertNull(version15);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.index.VersionType versionType10 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType11 = versionType10.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple12 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest9, versionType10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        long long16 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest17.getParentTask();
        bulkShardRequest14.setParentTask(taskId18);
        bulkShardRequest9.setParentTask(taskId18);
        bulkShardRequest0.setParentTask(taskId18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = bulkShardRequest0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(taskId18);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [10] is different than the one provided [-1]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("indices:data/write/bulk[s]", "index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shared_filesystem", throwable2, "index.shared_filesystem");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        java.lang.String str7 = shardFailure4.reason;
        java.lang.Throwable throwable8 = shardFailure4.cause;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shared_filesystem" + "'", str5, "index.shared_filesystem");
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.shared_filesystem" + "'", str7, "index.shared_filesystem");
        org.junit.Assert.assertNull(throwable8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        long long8 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = indexMetaData0.getState();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = indexMetaData0.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(params11);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest8.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest5.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest5.remoteAddress(transportAddress7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest5.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(shardId6);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.timeout("current version [-1] is different than the one provided [10]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [-1] is different than the one provided [10]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        java.lang.String str4 = bulkShardRequest0.index();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout(timeValue5);
        java.lang.Class<?> wildcardClass7 = bulkShardRequest6.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "index.shared_filesystem", throwable10, "index.shared_filesystem");
        java.lang.String str13 = shardFailure12.reason;
        java.lang.String str14 = shardFailure12.indexUUID;
        java.lang.String str15 = shardFailure12.reason;
        java.lang.String str16 = shardFailure12.reason;
        java.lang.String str17 = shardFailure12.indexUUID;
        boolean boolean18 = indexMetaData0.equals((java.lang.Object) shardFailure12);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.index.Index index20 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap21 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params23 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder22, params23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index.shared_filesystem" + "'", str13, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "index.shared_filesystem" + "'", str14, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index.shared_filesystem" + "'", str15, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index.shared_filesystem" + "'", str16, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "index.shared_filesystem" + "'", str17, "index.shared_filesystem");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertNull(index20);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap21);
        org.junit.Assert.assertNotNull(params23);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        bulkShardRequest0.remoteAddress(transportAddress4);
        bulkShardRequest0.setParentTask("index.version.upgraded", (long) (short) 100);
        bulkShardRequest0.seqNo(1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = bulkShardRequest0.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) (-1), (-1L));
        java.lang.String str7 = versionType1.explainConflictForReads((long) (byte) -1, (long) 0);
        org.elasticsearch.common.collect.Tuple<java.lang.Comparable<java.lang.String>, org.elasticsearch.common.io.stream.Writeable> strComparableTuple8 = org.elasticsearch.common.collect.Tuple.tuple((java.lang.Comparable<java.lang.String>) "index.creation_date", (org.elasticsearch.common.io.stream.Writeable) versionType1);
        long long11 = versionType1.updateVersion((long) (short) 10, (long) (byte) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str7, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertNotNull(strComparableTuple8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.setParentTask("index.version.created_string", (long) (byte) -1);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setShardId(shardId11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bulkShardRequest12.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.shared_filesystem.recover_on_any_node");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.shared_filesystem.recover_on_any_node]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.version((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.putMapping("current version [10] is different than the one provided [100]", "hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.index.shard.ShardId shardId11 = bulkShardRequest7.shardId();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(shardId11);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.numberOfReplicas((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.upgraded_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.upgraded_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData4.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.elasticsearch.index.Index index9 = indexMetaData4.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.settings(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData16 = indexMetaData14.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long17 = indexMetaData14.getVersion();
        org.elasticsearch.common.settings.Settings settings18 = indexMetaData14.getSettings();
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder13.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData23 = indexMetaData21.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData21);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData27 = indexMetaData25.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state28 = indexMetaData25.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData31 = indexMetaData29.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state32 = indexMetaData29.getState();
        boolean boolean33 = indexMetaData25.equals((java.lang.Object) state32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder24.state(state32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder13.state(state32);
        boolean boolean36 = indexMetaData4.equals((java.lang.Object) builder13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder37.putAlias(aliasMetaData38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertNull(mappingMetaData16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertNull(mappingMetaData23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertNull(mappingMetaData27);
        org.junit.Assert.assertTrue("'" + state28 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state28.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertNull(mappingMetaData31);
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state32.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder1.mapping("index.version.created_string");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(mappingMetaData6);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        bulkShardRequest0.seqNo(0L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest0.validate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.primaryTerm();
        bulkShardRequest7.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.timeout(timeValue11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest12.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        bulkShardRequest12.remoteAddress(transportAddress14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.index("current version [-1] is different than the one provided [0]");
        long long20 = bulkShardRequest19.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel21);
        bulkShardRequest0.primaryTerm((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.setParentTask("", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel21 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel21.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.read]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [10] is different than the one provided [32]");
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
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
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.version.created" + "'", str10, "index.version.created");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap7 = indexMetaData0.getMappings();
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData0.readDiffFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest0.shardId();
        long long11 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.version((long) (byte) -1);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.AnnotatedElement, org.elasticsearch.common.unit.TimeValue> annotatedElementTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.AnnotatedElement, org.elasticsearch.common.unit.TimeValue>((java.lang.reflect.AnnotatedElement) wildcardClass7, timeValue8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        long long5 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.setShardId(shardId6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = bulkShardRequest7.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mapping("hi!");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
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
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("index.shared_filesystem");
        int int12 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((-1), actionRequest1);
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
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData8.mapping("hi!");
        int int13 = indexMetaData8.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData8.mapping("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.version(1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom23 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder21.putCustom("index.blocks.read", custom23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder21.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder21.creationDate((long) ' ');
        java.lang.String[] strArray46 = new java.lang.String[] { "index.blocks.write", "index.priority", "current version [0] is different than the one provided [1]", "index.blocks.read", "index.priority", "index.blocks.read_only", "", "index.blocks.read_only", "index.version.minimum_compatible", "index.version.minimum_compatible", "index.data_path", "indices:data/write/bulk[s]", "primary_terms", "index.version.created_string", "index.blocks.read", "index.version.minimum_compatible", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder21.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder18.putActiveAllocationIds((-1), (java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder1.putActiveAllocationIds(97, (java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData53 = builder1.mapping("current version [11] is different than the one provided [0]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData54 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.upgraded_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(mappingMetaData15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(mappingMetaData53);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.index.Index index2 = indexMetaData0.getIndex();
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
        org.junit.Assert.assertNotNull(index2);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.auto_expand_replicas", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        java.lang.Class<?> wildcardClass6 = indexMetaData0.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        java.lang.String str5 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_na_" + "'", str5, "_na_");
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.blocks.metadata", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.index.VersionType versionType10 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType11 = versionType10.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple12 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest9, versionType10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        long long16 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest17.getParentTask();
        bulkShardRequest14.setParentTask(taskId18);
        bulkShardRequest9.setParentTask(taskId18);
        bulkShardRequest0.setParentTask(taskId18);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            taskId18.writeTo(streamOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(taskId18);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData12.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state15 = indexMetaData12.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData18 = indexMetaData16.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = indexMetaData16.getState();
        boolean boolean20 = indexMetaData12.equals((java.lang.Object) state19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder11.state(state19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder3.state(state19);
        java.lang.String str23 = builder22.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder22.removeAlias("index.blocks.read");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder25.putMapping(mappingMetaData26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertTrue("'" + state15 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state15.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNull(mappingMetaData18);
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest3.setShardId(shardId4);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData6.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap10 = indexMetaData6.getMappings();
        int int11 = indexMetaData6.getNumberOfReplicas();
        org.apache.lucene.util.Version version12 = indexMetaData6.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap13 = indexMetaData6.getActiveAllocationIds();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "index.shared_filesystem", throwable16, "index.shared_filesystem");
        java.lang.String str19 = shardFailure18.reason;
        java.lang.String str20 = shardFailure18.indexUUID;
        java.lang.String str21 = shardFailure18.reason;
        java.lang.String str22 = shardFailure18.reason;
        java.lang.String str23 = shardFailure18.indexUUID;
        boolean boolean24 = indexMetaData6.equals((java.lang.Object) shardFailure18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.shard.IndexShard.ShardFailure> bulkShardRequestTuple25 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, shardFailure18);
        bulkShardRequest3.setParentTask("index.priority", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long34 = bulkShardRequest33.primaryTerm();
        bulkShardRequest33.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest33.timeout(timeValue37);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.action.ActionRequest actionRequest40 = bulkItemRequest39.request();
        org.elasticsearch.tasks.TaskId taskId41 = actionRequest40.getParentTask();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting42 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long45 = bulkShardRequest44.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions46 = bulkShardRequest44.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException47 = bulkShardRequest44.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure49 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting42, "primary_terms", (java.lang.Throwable) actionRequestValidationException47, "index.priority");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.IllegalArgumentException> taskIdTuple50 = org.elasticsearch.common.collect.Tuple.tuple(taskId41, (java.lang.IllegalArgumentException) actionRequestValidationException47);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task51 = bulkShardRequest3.createTask(0L, "current version [35] is different than the one provided [100]", "index.number_of_shards", taskId41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "index.shared_filesystem" + "'", str19, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "index.shared_filesystem" + "'", str20, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "index.shared_filesystem" + "'", str21, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "index.shared_filesystem" + "'", str22, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "index.shared_filesystem" + "'", str23, "index.shared_filesystem");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple25);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertNotNull(actionRequest40);
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions46);
        org.junit.Assert.assertNotNull(actionRequestValidationException47);
        org.junit.Assert.assertNotNull(taskIdTuple50);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData4.diff(indexMetaData8);
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData8.mapping("Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.elasticsearch.index.Index index13 = indexMetaData8.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.settings(settings16);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData20 = indexMetaData18.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        long long21 = indexMetaData18.getVersion();
        org.elasticsearch.common.settings.Settings settings22 = indexMetaData18.getSettings();
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder17.settings(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData27 = indexMetaData25.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData25);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData31 = indexMetaData29.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state32 = indexMetaData29.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData35 = indexMetaData33.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = indexMetaData33.getState();
        boolean boolean37 = indexMetaData29.equals((java.lang.Object) state36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder28.state(state36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder17.state(state36);
        boolean boolean40 = indexMetaData8.equals((java.lang.Object) builder17);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state41 = indexMetaData8.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder3.state(state41);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder42.primaryTerm((int) (byte) 3, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertNull(mappingMetaData20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertNull(mappingMetaData27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertNull(mappingMetaData31);
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state32.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertNull(mappingMetaData35);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + state41 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state41.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = builder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        bulkShardRequest0.seqNo(0L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest0.validate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.primaryTerm();
        bulkShardRequest7.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.timeout(timeValue11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest12.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        bulkShardRequest12.remoteAddress(transportAddress14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.index("current version [-1] is different than the one provided [0]");
        long long20 = bulkShardRequest19.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel21);
        bulkShardRequest0.primaryTerm((long) (byte) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel21 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel21.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> settingsSettingTuple2 = org.elasticsearch.common.collect.Tuple.tuple(settingsSetting0, builder1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = settingsSettingTuple2.v2();
        java.lang.String str4 = settingsSettingTuple2.toString();
        java.lang.String str5 = settingsSettingTuple2.toString();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.setShardId(shardId8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.setShardId(shardId10);
        boolean boolean12 = settingsSettingTuple2.equals((java.lang.Object) bulkShardRequest9);
        bulkShardRequest9.setParentTask("active_allocations", (long) (byte) 3);
        org.junit.Assert.assertNotNull(settingsSetting0);
        org.junit.Assert.assertNotNull(settingsSettingTuple2);
        org.junit.Assert.assertNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]" + "'", str4, "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]" + "'", str5, "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = indexMetaData0.toXContent(xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(settings7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(actionRequest8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("current version [-1] is different than the one provided [11]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [current version [-1] is different than the one provided [11]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        long long5 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest0.remoteAddress(transportAddress6);
        java.lang.Class<?> wildcardClass8 = bulkShardRequest0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest0.remoteAddress(transportAddress6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest11.validate();
        org.elasticsearch.common.unit.TimeValue timeValue15 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest11.timeout(timeValue15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long18 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest17.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long24 = bulkShardRequest23.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest23.getParentTask();
        bulkShardRequest16.setParentTask(taskId26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task28 = bulkShardRequest0.createTask((long) (short) 1, "index.blocks.metadata", "state-", taskId26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(taskId26);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest3.getParentTask();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        long long4 = bulkShardRequest0.seqNo();
        long long5 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.minimum_compatible", (long) (short) 10);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shared_filesystem", throwable2, "index.shared_filesystem");
        java.lang.String str5 = shardFailure4.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure4.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = shardFailure4.routing;
        java.lang.String str8 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.shared_filesystem" + "'", str5, "index.shared_filesystem");
        org.junit.Assert.assertNull(shardRouting6);
        org.junit.Assert.assertNull(shardRouting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index.shared_filesystem" + "'", str8, "index.shared_filesystem");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple7 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest4, versionType5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest8.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bulkItemRequest8.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple7);
        org.junit.Assert.assertNotNull(actionRequest9);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        bulkShardRequest0.remoteAddress(transportAddress3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions5);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        bulkShardRequest2.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.ActionRequest actionRequest10 = bulkItemRequest9.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest9.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(actionRequest10);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder8.removeAllAliases();
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.settings(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.version((long) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.settings(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        int int9 = bulkItemRequest7.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(actionRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.index("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.putMapping(mappingMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [-1] is different than the one provided [11]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        java.lang.String str9 = bulkShardRequest5.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.index("indices:data/write/bulk[s]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest5.timeout("index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.shared_filesystem]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "index.version.created" + "'", str9, "index.version.created");
        org.junit.Assert.assertNotNull(bulkShardRequest11);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "index.shared_filesystem", throwable10, "index.shared_filesystem");
        java.lang.String str13 = shardFailure12.reason;
        java.lang.String str14 = shardFailure12.indexUUID;
        java.lang.String str15 = shardFailure12.reason;
        java.lang.String str16 = shardFailure12.reason;
        java.lang.String str17 = shardFailure12.indexUUID;
        boolean boolean18 = indexMetaData0.equals((java.lang.Object) shardFailure12);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.settings.Settings settings20 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData22 = indexMetaData0.mappingOrDefault("current version [0] is different than the one provided [1]");
        org.elasticsearch.Version version23 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.xcontent.XContentParser xContentParser24 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = indexMetaData0.fromXContent(xContentParser24, parseFieldMatcher25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index.shared_filesystem" + "'", str13, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "index.shared_filesystem" + "'", str14, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index.shared_filesystem" + "'", str15, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index.shared_filesystem" + "'", str16, "index.shared_filesystem");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "index.shared_filesystem" + "'", str17, "index.shared_filesystem");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNull(mappingMetaData22);
        org.junit.Assert.assertNotNull(version23);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shadow_replicas");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        long long12 = bulkShardRequest6.seqNo();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest6.getParentTask();
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest6.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.version.created" + "'", str10, "index.version.created");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(taskId13);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.numberOfReplicas((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfReplicas(1);
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
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.blocks.read", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.index("index.version.created_string");
        int int9 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = builder1.mapping("");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(mappingMetaData11);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean5 = versionType1.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean7 = versionType1.validateVersionForReads((long) (-1));
        boolean boolean9 = versionType1.validateVersionForReads(101L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType10 = org.elasticsearch.index.VersionType.fromString("current version [11] is different than the one provided [0]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [11] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [101] is different than the one provided [0]", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        bulkShardRequest1.remoteAddress(transportAddress5);
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.common.unit.TimeValue timeValue8 = bulkShardRequest1.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bulkItemRequest9.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(timeValue8);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        int int9 = bulkItemRequest7.id();
        org.elasticsearch.action.ActionRequest actionRequest10 = bulkItemRequest7.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest7.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(actionRequest10);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = builder1.primaryTerm((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean3 = versionType1.validateVersionForReads((long) 1);
        byte byte4 = versionType1.getValue();
        java.lang.String str8 = versionType1.explainConflictForWrites((long) '#', (long) (short) -1, true);
        java.lang.String str12 = versionType1.explainConflictForWrites((long) '4', 0L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType13 = org.elasticsearch.index.VersionType.fromString("index.version.created", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.created]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [35] is different than the one provided [-1]" + "'", str8, "current version [35] is different than the one provided [-1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "current version [52] is different than the one provided [0]" + "'", str12, "current version [52] is different than the one provided [0]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putAlias(aliasMetaData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate((long) ' ');
        int int7 = builder6.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putCustom("_na_", custom9);
        long long11 = builder6.version();
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder6.settings(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
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
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.setShardId(shardId5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest9.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        java.lang.String str2 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfShards((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.putAlias(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index.version.minimum_compatible" + "'", str2, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean2 = versionType0.validateVersionForReads((long) 1);
        boolean boolean5 = versionType0.isVersionConflictForReads(0L, 0L);
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 10);
        java.lang.String str10 = versionType0.explainConflictForReads((long) '#', (long) (short) 100);
        java.lang.String str13 = versionType0.explainConflictForReads((long) (byte) 0, (long) '#');
        java.lang.String str17 = versionType0.explainConflictForWrites((-1L), (long) 10, false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [35] is different than the one provided [100]" + "'", str10, "current version [35] is different than the one provided [100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "current version [0] is different than the one provided [35]" + "'", str13, "current version [0] is different than the one provided [35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "current version [-1] is different than the one provided [10]" + "'", str17, "current version [-1] is different than the one provided [10]");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.common.unit.TimeValue timeValue4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest0.remoteAddress(transportAddress6);
        boolean boolean8 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.index("current version [-1] is different than the one provided [0]");
        long long13 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel14);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.timeout("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.created_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData4.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData4.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData8.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = indexMetaData8.getState();
        boolean boolean12 = indexMetaData4.equals((java.lang.Object) state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder3.state(state11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder3.putMapping("index.uuid", "index.version.created");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
    }
}
