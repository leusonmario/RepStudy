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
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded_string" + "'", str0, "index.version.upgraded_string");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.elasticsearch.common.io.stream.StreamInput streamInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.readSettingsFromStream(streamInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.index.IndexSettings.QUERY_STRING_ANALYZE_WILDCARD;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_WRITE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.write" + "'", str0, "index.blocks.write");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_PRIORITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.priority" + "'", str0, "index.priority");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_BLOCK;
        org.junit.Assert.assertNotNull(clusterBlock0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_UUID_NA_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_na_" + "'", str0, "_na_");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_AUTO_EXPAND_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.auto_expand_replicas" + "'", str0, "index.auto_expand_replicas");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.data_path" + "'", str0, "index.data_path");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.index.IndexSettings.DEFAULT_FIELD_SETTING;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_ONLY_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.index.IndexSettings.MAX_RESCORE_WINDOW_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.index.IndexSettings.ALLOW_UNMAPPED;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        java.util.function.Predicate<java.lang.String> strPredicate2 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.IndexSettings indexSettings4 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1, strPredicate2, indexScopedSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.index.IndexSettings.MAX_REFRESH_LISTENERS_PER_SHARD;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SETTING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index." + "'", str0, "index.");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_PRIMARY_TERMS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "primary_terms" + "'", str0, "primary_terms");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_REQUIRE_GROUP_SETTING;
        org.junit.Assert.assertNotNull(settingsSetting0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem.recover_on_any_node" + "'", str0, "index.shared_filesystem.recover_on_any_node");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.ByteSizeValue> byteSizeValueSetting0 = org.elasticsearch.index.IndexSettings.INDEX_TRANSLOG_FLUSH_THRESHOLD_SIZE_SETTING;
        org.junit.Assert.assertNotNull(byteSizeValueSetting0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting0 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.junit.Assert.assertNotNull(timeValueSetting0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_DATA_PATH_SETTING;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.primaryTerm((int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet0 = org.elasticsearch.common.settings.IndexScopedSettings.BUILT_IN_INDEX_SETTINGS;
        org.junit.Assert.assertNotNull(wildcardSettingSet0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder2 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = settings0.toXContent(xContentBuilder2, params3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created" + "'", str0, "index.version.created");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.index.IndexSettings.INDEX_TTL_DISABLE_PURGE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = org.elasticsearch.common.settings.AbstractScopedSettings.ARCHIVED_SETTINGS_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "archived." + "'", str0, "archived.");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_STATE_FILE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "state-" + "'", str0, "state-");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.index.IndexSettings.INDEX_WARMER_ENABLED_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_SHARDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_shards" + "'", str0, "index.number_of_shards");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_READ_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_INDEX_UUID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.uuid" + "'", str0, "index.uuid");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_UUID;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = strSetting0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.index.IndexSettings.MAX_RESULT_WINDOW_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date_string" + "'", str0, "index.creation_date_string");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_MINIMUM_COMPATIBLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.minimum_compatible" + "'", str0, "index.version.minimum_compatible");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.junit.Assert.assertNotNull(clusterBlock0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting0 = org.elasticsearch.index.IndexSettings.INDEX_TRANSLOG_SYNC_INTERVAL_SETTING;
        org.junit.Assert.assertNotNull(timeValueSetting0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long6 = builder2.primaryTerm(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_WRITE_BLOCK;
        org.junit.Assert.assertNotNull(clusterBlock0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded" + "'", str0, "index.version.upgraded");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_READ_ONLY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read_only" + "'", str0, "index.blocks.read_only");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FILESYSTEM_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_REPLICAS_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("index.blocks.write");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 0, indexMetaData1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (-1) must be greater than the shard id: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date_string");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("", "index.creation_date_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FILESYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem" + "'", str0, "index.shared_filesystem");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_WRITE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataMetaDataStateFormat0 = org.elasticsearch.cluster.metadata.IndexMetaData.FORMAT;
        org.junit.Assert.assertNotNull(indexMetaDataMetaDataStateFormat0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_NAME;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_replicas" + "'", str0, "index.number_of_replicas");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.primaryTerm((int) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.index.IndexSettings.QUERY_STRING_LENIENT_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = indexScopedSettings0.updateDynamicSettings(settings1, builder7, builder8, "index.blocks.write");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date" + "'", str0, "index.creation_date");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_ACTIVE_ALLOCATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_allocations" + "'", str0, "active_allocations");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        java.lang.String str5 = builder4.index();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.data_path" + "'", str5, "index.data_path");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder2.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = builder8.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.putMapping(mappingMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.index.translog.Translog.Durability> durabilitySetting0 = org.elasticsearch.index.IndexSettings.INDEX_TRANSLOG_DURABILITY_SETTING;
        org.junit.Assert.assertNotNull(durabilitySetting0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_READ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read" + "'", str0, "index.blocks.read");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        int int3 = builder1.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_METADATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.metadata" + "'", str0, "index.blocks.metadata");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_METADATA_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created_string" + "'", str0, "index.version.created_string");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting0 = org.elasticsearch.index.IndexSettings.INDEX_REFRESH_INTERVAL_SETTING;
        org.junit.Assert.assertNotNull(timeValueSetting0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean14 = settings11.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.settings.Settings settings19 = settings16.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = settings19.toXContent(xContentBuilder21, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = settings11.toXContent(xContentBuilder15, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings8.toXContent(xContentBuilder10, params22);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings8.filter(strPredicate26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.ByteSizeValue byteSizeValue30 = settings27.getAsMemory("index.shared_filesystem", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse setting [index.shared_filesystem] with value [] as a size in bytes: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNull(xContentBuilder23);
        org.junit.Assert.assertNull(xContentBuilder24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_PRIORITY_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(0, indexMetaData1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder34 = builder23.put(objDictionary33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder7.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = builder7.primaryTerm((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings11);
        org.elasticsearch.common.settings.Settings settings14 = settings11.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        org.elasticsearch.Version version17 = null;
        org.elasticsearch.Version version18 = settings14.getAsVersion("index.data_path", version17);
        org.elasticsearch.common.unit.SizeValue sizeValue20 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue21 = settings14.getAsSize("state-", sizeValue20);
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("index.version.upgraded_string", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [index.version.upgraded_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNull(version18);
        org.junit.Assert.assertNull(sizeValue21);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putMapping(mappingMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHADOW_REPLICAS_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("", custom1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder2.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHADOW_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shadow_replicas" + "'", str0, "index.shadow_replicas");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings4.getAsGroups();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.writeSettingsToStream(settings4, streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.Version version45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder46 = builder43.put("index.priority", version45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("active_allocations");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        long long4 = indexMetaData1.getCreationDate();
        org.elasticsearch.index.Index index5 = indexMetaData1.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet7 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 0, indexMetaData1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.Settings settings4 = builder0.build();
        java.lang.String str6 = builder0.remove("state-");
        org.elasticsearch.common.settings.Settings.Builder builder7 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder7.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean16 = settings13.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap18 = settings13.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings20 = settings13.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings12.dryRun(settings20);
        java.lang.String[] strArray28 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray29 = settings21.getAsArray("index.blocks.read_only", strArray28);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder7.extendArray("state-", strArray28);
        java.lang.String str32 = builder30.remove("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings35 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean39 = settings36.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap41 = settings36.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings43 = settings36.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings44 = indexScopedSettings35.dryRun(settings43);
        java.lang.String[] strArray51 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray52 = settings44.getAsArray("index.blocks.read_only", strArray51);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings53 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings54 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean57 = settings54.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap59 = settings54.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings61 = settings54.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings62 = indexScopedSettings53.dryRun(settings61);
        java.lang.String[] strArray69 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray70 = settings62.getAsArray("index.blocks.read_only", strArray69);
        org.elasticsearch.common.settings.Settings.Builder builder71 = builder30.put("index.creation_date_string", "", strArray52, strArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder72 = builder0.put((java.lang.Object[]) strArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array settings of key + value order doesn't hold correct number of arguments (5)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(indexScopedSettings35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + true + "'", boolean39, true);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(indexScopedSettings53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertEquals("'" + boolean57 + "' != '" + true + "'", boolean57, true);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(settings61);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.data_path");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData2.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData1.diff(indexMetaData2);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData1.includeFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(1, indexMetaData1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean10 = settings7.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap12 = settings7.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings14 = settings7.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings6.dryRun(settings14);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = null;
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean20 = settings17.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean23 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings22);
        org.elasticsearch.common.settings.Settings settings25 = settings22.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings25);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params28 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder29 = settings25.toXContent(xContentBuilder27, params28);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = settings17.toXContent(xContentBuilder21, params28);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder31 = settings14.toXContent(xContentBuilder16, params28);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = indexMetaData0.toXContent(xContentBuilder5, params28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(params28);
        org.junit.Assert.assertNull(xContentBuilder29);
        org.junit.Assert.assertNull(xContentBuilder30);
        org.junit.Assert.assertNull(xContentBuilder31);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder4.mapping("index.blocks.read_only");
        java.lang.String str7 = builder4.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.creation_date_string" + "'", str7, "index.creation_date_string");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.creation_date_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.creation_date_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long6 = builder4.primaryTerm((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.index.IndexSettings.DEFAULT_GC_DELETES;
        org.elasticsearch.common.unit.TimeValue timeValue7 = settings3.getAsTime("index.version.upgraded", timeValue6);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        java.nio.file.Path path51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder52 = builder45.loadFromPath(path51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        java.nio.file.Path path54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder55 = builder51.loadFromPath(path54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.index.IndexSettings.QUERY_STRING_ALLOW_LEADING_WILDCARD;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("index.", 0.0d);
        java.nio.file.Path path49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder50 = builder48.loadFromPath(path49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.version.minimum_compatible", custom1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        java.lang.String[] strArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.extendArray("", strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [-1]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder52 = builder45.put(objDictionary51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean8 = settings5.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings5.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings12 = settings5.getByPrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.putMapping("index.shared_filesystem.recover_on_any_node", "state-");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings34 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean38 = settings35.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap40 = settings35.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings42 = settings35.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings43 = indexScopedSettings34.dryRun(settings42);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder44 = null;
        org.elasticsearch.common.settings.Settings settings45 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean48 = settings45.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder49 = null;
        org.elasticsearch.common.settings.Settings settings50 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean51 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings50);
        org.elasticsearch.common.settings.Settings settings53 = settings50.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings54 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings53);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder55 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params56 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder57 = settings53.toXContent(xContentBuilder55, params56);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder58 = settings45.toXContent(xContentBuilder49, params56);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder59 = settings42.toXContent(xContentBuilder44, params56);
        org.elasticsearch.common.unit.SizeValue sizeValue61 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue62 = settings42.getAsSize("index.version.upgraded_string", sizeValue61);
        java.lang.String[] strArray64 = settings42.getAsArray("index.creation_date_string");
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder23.putArray("state-", strArray64);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(indexScopedSettings34);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + true + "'", boolean38, true);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertEquals("'" + boolean48 + "' != '" + true + "'", boolean48, true);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(params56);
        org.junit.Assert.assertNull(xContentBuilder57);
        org.junit.Assert.assertNull(xContentBuilder58);
        org.junit.Assert.assertNull(xContentBuilder59);
        org.junit.Assert.assertNull(sizeValue62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.blocks.read_only]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.creation_date_string", custom1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = builder23.internalMap();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.number_of_shards", custom1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for []");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.putNull("index.blocks.read_only");
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder31 = builder27.put("index.shadow_replicas", (long) (short) 100, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.blocks.read");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.blocks.read]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.setRoutingNumShards((int) (short) -1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putMapping(mappingMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        int int4 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.index.Index index5 = indexMetaData0.getIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = builder1.primaryTerm((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping("", "_na_");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.xcontent.XContentParser xContentParser1 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = indexMetaData0.fromXContent(xContentParser1, parseFieldMatcher2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean8 = settings5.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings5.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings12 = settings5.getByPrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings5);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue15 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue16 = settings5.getAsBytesSize("", byteSizeValue15);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.ByteSizeValue byteSizeValue19 = settings5.getAsMemory("index.blocks.metadata", "index.blocks.write");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse setting [index.blocks.metadata] with value [index.blocks.write] as a size in bytes: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(byteSizeValue16);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.nio.file.Path path33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder34 = builder32.loadFromPath(path33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.putCustom("hi!", custom6);
        java.util.Set<java.lang.String> strSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putActiveAllocationIds((int) 'a', strSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = settings0.getAsBytesSize("index.auto_expand_replicas", byteSizeValue2);
        java.util.Set<java.lang.String> strSet4 = settings0.names();
        boolean boolean5 = settings0.isEmpty();
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNull(byteSizeValue3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder61 = builder57.put("primary_terms", (long) 'a', byteSizeUnit60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.uuid", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean14 = settings11.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.settings.Settings settings19 = settings16.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = settings19.toXContent(xContentBuilder21, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = settings11.toXContent(xContentBuilder15, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings8.toXContent(xContentBuilder10, params22);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings8.filter(strPredicate26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.ByteSizeValue byteSizeValue30 = settings27.getAsMemory("index.blocks.metadata", "index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse setting [index.blocks.metadata] with value [index.number_of_replicas] as a size in bytes: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNull(xContentBuilder23);
        org.junit.Assert.assertNull(xContentBuilder24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [10]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = settings0.getAsBytesSize("index.auto_expand_replicas", byteSizeValue2);
        java.util.Set<java.lang.String> strSet4 = settings0.names();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap7 = settings0.getGroups("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal setting prefix ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNull(byteSizeValue3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.numberOfReplicas((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("_na_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [_na_]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.creationDate((long) (byte) -1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder5.mapping("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.version.created", "index.blocks.read", "primary_terms", "index.blocks.read_only", "index.blocks.metadata", "index.creation_date", "index.priority", "index.version.upgraded", "index.blocks.metadata" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder10.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder5.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder5.primaryTerm((int) (byte) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData2.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData1.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData7.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData6.diff(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData6.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData1.diff(indexMetaData6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet14 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) -1, indexMetaData6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNotNull(indexMetaDataDiff10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder8 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder8.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean17 = settings14.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings14.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings21 = settings14.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings13.dryRun(settings21);
        java.lang.String[] strArray29 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray30 = settings22.getAsArray("index.blocks.read_only", strArray29);
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder8.extendArray("state-", strArray29);
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean33 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings32);
        org.elasticsearch.common.settings.Settings settings35 = settings32.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings35);
        java.lang.String[] strArray38 = settings36.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = settings36.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder31.put(strMap39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder2.settings(builder40);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = builder40.internalMap();
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder44 = builder40.put(objDictionary43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder43.loadFromSource("index.number_of_shards");
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder51 = builder47.put("_all", (long) '4', byteSizeUnit50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean6 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        org.elasticsearch.common.settings.Settings settings8 = settings5.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = settings8.toXContent(xContentBuilder10, params11);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = settings0.toXContent(xContentBuilder4, params11);
        org.elasticsearch.common.unit.SizeValue sizeValue15 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue16 = settings0.getAsSize("index.blocks.metadata", sizeValue15);
        java.lang.String str19 = settings0.get("index.version.created", "index.blocks.metadata");
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNull(xContentBuilder12);
        org.junit.Assert.assertNull(xContentBuilder13);
        org.junit.Assert.assertNull(sizeValue16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "index.blocks.metadata" + "'", str19, "index.blocks.metadata");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
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
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder50.replacePropertyPlaceholders();
        java.lang.String[] strArray78 = new java.lang.String[] { "index.", "index.number_of_shards", "index.shadow_replicas", "index.auto_expand_replicas", "index.blocks.read_only", "primary_terms", "index.priority", "index.data_path", "index.uuid", "index.blocks.read_only", "state-", "index.data_path", "index.blocks.write", "archived.", "index.version.upgraded_string", "index.uuid", "index.uuid", "index.blocks.metadata", "index.shared_filesystem.recover_on_any_node", "index.uuid", "index.blocks.write", "_all", "hi!", "index.blocks.read_only", "_na_" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        org.elasticsearch.common.settings.Settings.Builder builder81 = builder51.putArray("index.shared_filesystem.recover_on_any_node", (java.util.List<java.lang.String>) strList79);
        org.elasticsearch.common.settings.Settings.Builder builder83 = builder51.normalizePrefix("index.number_of_replicas");
        java.io.InputStream inputStream85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder86 = builder83.loadFromStream("index.version.upgraded_string", inputStream85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder31 = builder24.put("index.shadow_replicas", 10L, byteSizeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.created");
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(version8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean14 = settings11.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.settings.Settings settings19 = settings16.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = settings19.toXContent(xContentBuilder21, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = settings11.toXContent(xContentBuilder15, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings8.toXContent(xContentBuilder10, params22);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings8.filter(strPredicate26);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.writeSettingsToStream(settings27, streamOutput28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNull(xContentBuilder23);
        org.junit.Assert.assertNull(xContentBuilder24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        int int2 = builder1.numberOfReplicas();
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap7 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting1 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_EXCLUDE_GROUP_SETTING;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting2 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INCLUDE_GROUP_SETTING;
        java.util.function.BiConsumer<org.elasticsearch.common.settings.Settings, org.elasticsearch.common.settings.Settings> settingsBiConsumer3 = null;
        indexScopedSettings0.addSettingsUpdateConsumer(settingsSetting1, settingsSetting2, settingsBiConsumer3);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting5 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INITIAL_RECOVERY_GROUP_SETTING;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings6 = indexScopedSettings0.get(settingsSetting5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: settings scope doesn't match the setting scope [IndexScope] not in [[]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settingsSetting1);
        org.junit.Assert.assertNotNull(settingsSetting2);
        org.junit.Assert.assertNotNull(settingsSetting5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        java.lang.String[] strArray34 = new java.lang.String[] { "index.blocks.write", "hi!", "index.creation_date", "index.blocks.write", "index.creation_date" };
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder24.extendArray("index.version.created", strArray34);
        java.util.concurrent.TimeUnit timeUnit38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder39 = builder24.put("index.blocks.metadata", 0L, timeUnit38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        int int2 = builder1.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = builder1.primaryTerm((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.uuid");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.uuid]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_all");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.number_of_replicas");
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = settings0.getAsStructuredMap();
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder4.putMapping("index.blocks.write", "state-");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putCustom("index.priority", custom9);
        int int11 = builder6.getRoutingNumShards();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.number_of_replicas");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData1.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.version.minimum_compatible");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.number_of_shards]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings11);
        org.elasticsearch.common.settings.Settings settings14 = settings11.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params17 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = settings14.toXContent(xContentBuilder16, params17);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = settings6.toXContent(xContentBuilder10, params17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder5, params17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(params17);
        org.junit.Assert.assertNull(xContentBuilder18);
        org.junit.Assert.assertNull(xContentBuilder19);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder23.put("index.number_of_replicas", (double) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("_na_", (double) 10);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder35 = builder33.put(objDictionary34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        java.lang.String str5 = settings0.toDelimitedString('a');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.RatioValue ratioValue8 = settings0.getAsRatio("index.shared_filesystem.recover_on_any_node", "index.blocks.metadata");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Invalid ratio or percentage [index.blocks.metadata]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        java.lang.String[] strArray12 = new java.lang.String[] { "index.version.created", "index.blocks.read", "primary_terms", "index.blocks.read_only", "index.blocks.metadata", "index.creation_date", "index.priority", "index.version.upgraded", "index.blocks.metadata" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder1.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder1.putMapping(mappingMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.setRoutingNumShards((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        java.lang.String[] strArray6 = settings4.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = settings4.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate8 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings9 = settings4.filter(strPredicate8);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings4);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings2 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue4 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = settings2.getAsBytesSize("active_allocations", byteSizeValue4);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = settings2.toXContent(xContentBuilder6, params7);
        org.elasticsearch.common.settings.Settings settings10 = settings2.getAsSettings("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder1.primaryTerm((-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNull(byteSizeValue5);
        org.junit.Assert.assertNotNull(params7);
        org.junit.Assert.assertNull(xContentBuilder8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean13 = settings10.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap15 = settings10.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings17 = settings10.getAsSettings("index.creation_date_string");
        java.lang.String str19 = settings10.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.diff(settings10, settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder6 = builder3.loadFromStream("index.priority", inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        int int11 = builder10.numberOfShards();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.setRoutingNumShards((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder9.putMapping("index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = builder5.primaryTerm(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getRoutingNumShards();
        int int2 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.index.Index index3 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue7 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue8 = settings5.getAsBytesSize("active_allocations", byteSizeValue7);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = settings5.toXContent(xContentBuilder9, params10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder4, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNull(byteSizeValue8);
        org.junit.Assert.assertNotNull(params10);
        org.junit.Assert.assertNull(xContentBuilder11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        java.lang.String str5 = builder3.remove("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder3.normalizePrefix("index.shared_filesystem");
        java.lang.String str9 = builder7.get("index.auto_expand_replicas");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder2.putCustom("index.uuid", custom10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = indexMetaData0.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.version((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder4.primaryTerm((int) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        java.lang.String str6 = settings3.get("index.creation_date", "index.blocks.metadata");
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.blocks.metadata" + "'", str6, "index.blocks.metadata");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.version.upgraded_string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        java.nio.file.Path path49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder50 = builder48.loadFromPath(path49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
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
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder2.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.primaryTerm(1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder0.put("primary_terms", (float) (short) -1);
        java.lang.Object[] objArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder28 = builder0.put(objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder50.replacePropertyPlaceholders();
        java.lang.String[] strArray78 = new java.lang.String[] { "index.", "index.number_of_shards", "index.shadow_replicas", "index.auto_expand_replicas", "index.blocks.read_only", "primary_terms", "index.priority", "index.data_path", "index.uuid", "index.blocks.read_only", "state-", "index.data_path", "index.blocks.write", "archived.", "index.version.upgraded_string", "index.uuid", "index.uuid", "index.blocks.metadata", "index.shared_filesystem.recover_on_any_node", "index.uuid", "index.blocks.write", "_all", "hi!", "index.blocks.read_only", "_na_" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        org.elasticsearch.common.settings.Settings.Builder builder81 = builder51.putArray("index.shared_filesystem.recover_on_any_node", (java.util.List<java.lang.String>) strList79);
        org.elasticsearch.common.settings.Settings.Builder builder83 = builder51.normalizePrefix("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings85 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean86 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings85);
        java.lang.String[] strArray88 = settings85.getAsArray("");
        org.elasticsearch.common.settings.Settings.Builder builder89 = builder83.putArray("index.shadow_replicas", strArray88);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(settings85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        java.lang.String str12 = settings8.get("index.number_of_shards", "primary_terms");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "primary_terms" + "'", str12, "primary_terms");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder10.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean19 = settings16.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings16.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings23 = settings16.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings24 = indexScopedSettings15.dryRun(settings23);
        java.lang.String[] strArray31 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray32 = settings24.getAsArray("index.blocks.read_only", strArray31);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder10.extendArray("state-", strArray31);
        java.lang.String str35 = builder33.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder33.put("index.data_path", (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse value [true] for setting [index.priority]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + true + "'", boolean19, true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder7.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.putAlias(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = settings0.getAsMemory("", "index.blocks.read_only");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse setting [] with value [index.blocks.read_only] as a size in bytes: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.setRoutingNumShards(0);
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean11 = settings8.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap13 = settings8.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings15 = settings8.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings7.dryRun(settings15);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean21 = settings18.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = null;
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean24 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings23);
        org.elasticsearch.common.settings.Settings settings26 = settings23.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings26);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder28 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params29 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = settings26.toXContent(xContentBuilder28, params29);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder31 = settings18.toXContent(xContentBuilder22, params29);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = settings15.toXContent(xContentBuilder17, params29);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder33 = null;
        org.elasticsearch.common.settings.Settings settings34 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean35 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings34);
        org.elasticsearch.common.settings.Settings settings37 = settings34.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings38 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings37);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder39 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params40 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder41 = settings37.toXContent(xContentBuilder39, params40);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder42 = settings15.toXContent(xContentBuilder33, params40);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder43 = indexMetaData0.toXContent(xContentBuilder6, params40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + true + "'", boolean21, true);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(params29);
        org.junit.Assert.assertNull(xContentBuilder30);
        org.junit.Assert.assertNull(xContentBuilder31);
        org.junit.Assert.assertNull(xContentBuilder32);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(params40);
        org.junit.Assert.assertNull(xContentBuilder41);
        org.junit.Assert.assertNull(xContentBuilder42);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.index.Index index4 = indexMetaData0.getIndex();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(index4);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder5.mapping("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.version.created", "index.blocks.read", "primary_terms", "index.blocks.read_only", "index.blocks.metadata", "index.creation_date", "index.priority", "index.version.upgraded", "index.blocks.metadata" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder10.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder5.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom27 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder5.putCustom("_all", custom27);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder28.putMapping(mappingMetaData29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.blocks.write");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean13 = settings10.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap15 = settings10.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings17 = settings10.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings9.dryRun(settings17);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = null;
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean23 = settings20.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = null;
        org.elasticsearch.common.settings.Settings settings25 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean26 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings25);
        org.elasticsearch.common.settings.Settings settings28 = settings25.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings28);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params31 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = settings28.toXContent(xContentBuilder30, params31);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder33 = settings20.toXContent(xContentBuilder24, params31);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = settings17.toXContent(xContentBuilder19, params31);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = null;
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean37 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings36);
        org.elasticsearch.common.settings.Settings settings39 = settings36.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings39);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder41 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params42 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder43 = settings39.toXContent(xContentBuilder41, params42);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder44 = settings17.toXContent(xContentBuilder35, params42);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder45 = indexMetaData0.toXContent(xContentBuilder8, params42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + true + "'", boolean23, true);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(params31);
        org.junit.Assert.assertNull(xContentBuilder32);
        org.junit.Assert.assertNull(xContentBuilder33);
        org.junit.Assert.assertNull(xContentBuilder34);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertNotNull(params42);
        org.junit.Assert.assertNull(xContentBuilder43);
        org.junit.Assert.assertNull(xContentBuilder44);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        int int2 = builder1.getRoutingNumShards();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        boolean boolean6 = indexMetaData0.isSameUUID("archived.");
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.putNull("index.blocks.read_only");
        java.lang.String str29 = builder27.remove("index.number_of_shards");
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder33 = builder27.put("primary_terms", (long) (short) 0, timeUnit32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate(0L);
        java.lang.String str10 = builder4.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder4.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder4.primaryTerm((int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.number_of_replicas" + "'", str10, "index.number_of_replicas");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings9);
        org.elasticsearch.common.settings.Settings settings12 = settings9.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings12);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder14 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params15 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = settings12.toXContent(xContentBuilder14, params15);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder8, params15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(params15);
        org.junit.Assert.assertNull(xContentBuilder16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
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
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.putMapping("_all", "index.creation_date_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        java.lang.String[] strArray3 = settings0.getAsArray("");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings0.getGroups("index.shared_filesystem");
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
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
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        java.lang.String[] strArray12 = new java.lang.String[] { "index.version.created", "index.blocks.read", "primary_terms", "index.blocks.read_only", "index.blocks.metadata", "index.creation_date", "index.priority", "index.version.upgraded", "index.blocks.metadata" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder1.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet13);
        long long16 = builder15.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.primaryTerm((int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.minimum_compatible]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate(0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder4.setRoutingNumShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder4.putAlias(aliasMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.setRoutingNumShards(0);
        org.elasticsearch.common.settings.Settings.Builder builder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.settings(builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder7.setRoutingNumShards((int) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom57 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = builder7.putCustom("index.shadow_replicas", custom57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder7.numberOfShards((int) '4');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.putAlias(aliasMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean6 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings5);
        org.elasticsearch.common.settings.Settings settings8 = settings5.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = settings8.toXContent(xContentBuilder10, params11);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = settings0.toXContent(xContentBuilder4, params11);
        org.elasticsearch.common.unit.SizeValue sizeValue15 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue16 = settings0.getAsSize("index.blocks.metadata", sizeValue15);
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings0);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNull(xContentBuilder12);
        org.junit.Assert.assertNull(xContentBuilder13);
        org.junit.Assert.assertNull(sizeValue16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("archived.", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings4.getGroups("index.");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to get setting group for [index.] setting prefix and setting [index.number_of_replicas] because of a missing '.'");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putMapping("index.creation_date", "_na_");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
        org.junit.Assert.assertNull(strMap0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
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
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder2 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean7 = settings4.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings4.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings11 = settings4.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings3.dryRun(settings11);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean17 = settings14.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = null;
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean20 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings19);
        org.elasticsearch.common.settings.Settings settings22 = settings19.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params25 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = settings22.toXContent(xContentBuilder24, params25);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = settings14.toXContent(xContentBuilder18, params25);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder28 = settings11.toXContent(xContentBuilder13, params25);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder29 = null;
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean31 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings30);
        org.elasticsearch.common.settings.Settings settings33 = settings30.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings34 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params36 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = settings33.toXContent(xContentBuilder35, params36);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder38 = settings11.toXContent(xContentBuilder29, params36);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder39 = indexMetaData0.toXContent(xContentBuilder2, params36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(params25);
        org.junit.Assert.assertNull(xContentBuilder26);
        org.junit.Assert.assertNull(xContentBuilder27);
        org.junit.Assert.assertNull(xContentBuilder28);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(params36);
        org.junit.Assert.assertNull(xContentBuilder37);
        org.junit.Assert.assertNull(xContentBuilder38);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) -1);
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        java.io.InputStream inputStream53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder54 = builder48.loadFromStream("index.uuid", inputStream53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("_all");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder2.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder24.putNull("index.auto_expand_replicas");
        java.nio.file.Path path30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder31 = builder24.loadFromPath(path30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder6.mapping("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.putMapping(mappingMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        int int5 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfShards(0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder4.primaryTerm(0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = settings0.getAsBytesSize("active_allocations", byteSizeValue2);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = settings0.toXContent(xContentBuilder4, params5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.RatioValue ratioValue9 = settings0.getAsRatio("archived.", "true");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Invalid ratio or percentage [true]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNull(byteSizeValue3);
        org.junit.Assert.assertNotNull(params5);
        org.junit.Assert.assertNull(xContentBuilder6);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("_na_", 0.0f);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder32 = builder27.put(objDictionary31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder10.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("index.", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.version((-1L));
        boolean boolean19 = indexMetaData0.equals((java.lang.Object) builder16);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder16.putAlias(aliasMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        java.lang.String str5 = builder1.index();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.creation_date_string" + "'", str5, "index.creation_date_string");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
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
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = indexMetaData0.primaryTerm((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mappingOrDefault("active_allocations");
        org.elasticsearch.index.Index index9 = indexMetaData0.getIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(index9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder43.loadFromSource("index.number_of_shards");
        org.elasticsearch.Version version49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("index.blocks.read_only", version49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean14 = settings11.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.settings.Settings settings19 = settings16.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = settings19.toXContent(xContentBuilder21, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = settings11.toXContent(xContentBuilder15, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings8.toXContent(xContentBuilder10, params22);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings8.filter(strPredicate26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.RatioValue ratioValue30 = settings8.getAsRatio("_na_", "index.creation_date_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Invalid ratio or percentage [index.creation_date_string]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNull(xContentBuilder23);
        org.junit.Assert.assertNull(xContentBuilder24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder51.creationDate((long) (byte) 10);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder51.putAlias(aliasMetaData54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.getRoutingNumShards();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        java.lang.String[] strArray34 = new java.lang.String[] { "index.blocks.write", "hi!", "index.creation_date", "index.blocks.write", "index.creation_date" };
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder24.extendArray("index.version.created", strArray34);
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder24.put("", (double) 100);
        java.nio.file.Path path39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder40 = builder38.loadFromPath(path39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean14 = settings11.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.settings.Settings settings19 = settings16.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = settings19.toXContent(xContentBuilder21, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = settings11.toXContent(xContentBuilder15, params22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings8.toXContent(xContentBuilder10, params22);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings8.filter(strPredicate26);
        java.lang.Boolean boolean30 = settings27.getAsBoolean("hi!", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder31 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder33 = settings27.toXContent(xContentBuilder31, params32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNull(xContentBuilder23);
        org.junit.Assert.assertNull(xContentBuilder24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + true + "'", boolean30, true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.setRoutingNumShards((int) (short) 0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putAlias(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
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
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.creation_date");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_all", custom5);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.putMapping(mappingMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.blocks.read_only", (int) (short) 10);
        java.nio.file.Path path36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder37 = builder32.loadFromPath(path36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        boolean boolean4 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings0);
        org.elasticsearch.Version version6 = null;
        org.elasticsearch.Version version7 = settings0.getAsVersion("index.data_path", version6);
        java.lang.Boolean boolean10 = settings0.getAsBoolean("index.version.created_string", (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings2 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        org.elasticsearch.common.settings.Settings settings5 = settings2.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        java.lang.Boolean boolean9 = settings5.getAsBoolean("index.blocks.write", (java.lang.Boolean) false);
        org.elasticsearch.index.IndexSettings indexSettings10 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings5);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.data_path", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [100]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder7.mapping("");
        // The following exception was thrown during execution in test generation
        try {
            long long11 = builder7.primaryTerm((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder10.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean19 = settings16.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings16.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings23 = settings16.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings24 = indexScopedSettings15.dryRun(settings23);
        java.lang.String[] strArray31 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray32 = settings24.getAsArray("index.blocks.read_only", strArray31);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder10.extendArray("state-", strArray31);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder10.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder34.put("index.number_of_shards", (float) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder7.settings(builder34);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder43 = builder34.put(objDictionary42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + true + "'", boolean19, true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.number_of_shards");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting1 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_EXCLUDE_GROUP_SETTING;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting2 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INCLUDE_GROUP_SETTING;
        java.util.function.BiConsumer<org.elasticsearch.common.settings.Settings, org.elasticsearch.common.settings.Settings> settingsBiConsumer3 = null;
        indexScopedSettings0.addSettingsUpdateConsumer(settingsSetting1, settingsSetting2, settingsBiConsumer3);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("index.shadow_replicas");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settingsSetting1);
        org.junit.Assert.assertNotNull(settingsSetting2);
        org.junit.Assert.assertNotNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.index.IndexSettings.INDEX_CHECK_ON_STARTUP;
        org.junit.Assert.assertNotNull(strSetting0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder24.put("_na_", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder24.put("index.data_path", (double) (-1));
        java.lang.String str35 = builder33.get("index.number_of_shards");
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder39 = builder33.put("index.version.minimum_compatible", (long) 10000, byteSizeUnit38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.shadow_replicas", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.numberOfShards((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder53.putMapping("index.blocks.metadata", "archived.");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData1.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(10, indexMetaData1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (10) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder51.removeAlias("index.uuid");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData54 = builder53.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings0.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings7 = settings0.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean12 = settings9.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap14 = settings9.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings16 = settings9.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        org.elasticsearch.common.settings.Settings settings21 = settings18.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings21.getAsVersion("index.data_path", version24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean28 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings27);
        org.elasticsearch.common.settings.Settings settings30 = settings27.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings30);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params33 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = settings30.toXContent(xContentBuilder32, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = settings21.toXContent(xContentBuilder26, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder36 = settings9.toXContent(xContentBuilder17, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = settings0.toXContent(xContentBuilder8, params33);
        org.elasticsearch.common.settings.Settings settings38 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings0);
        boolean boolean39 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings38);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(params33);
        org.junit.Assert.assertNull(xContentBuilder34);
        org.junit.Assert.assertNull(xContentBuilder35);
        org.junit.Assert.assertNull(xContentBuilder36);
        org.junit.Assert.assertNull(xContentBuilder37);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        long long4 = indexMetaData1.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData1.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap7 = indexMetaData1.getMappings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet9 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) -1, indexMetaData1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.settings.Settings settings58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder59 = builder57.put(settings58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (short) 10, 60000L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfReplicas for index [index.number_of_shards]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        boolean boolean6 = indexMetaData1.isSameUUID("index.creation_date");
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData1.readDiffFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = settings54.getAsStructuredMap();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.setRoutingNumShards((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.putCustom("", custom7);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder7.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAlias("index.auto_expand_replicas");
        java.lang.String str11 = builder8.index();
        int int12 = builder8.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index.creation_date_string" + "'", str11, "index.creation_date_string");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        long long4 = indexMetaData0.getVersion();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        int int7 = builder1.getRoutingNumShards();
        long long8 = builder1.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.putMapping("index.number_of_replicas", "index.creation_date_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting1 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_EXCLUDE_GROUP_SETTING;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting2 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_INCLUDE_GROUP_SETTING;
        java.util.function.BiConsumer<org.elasticsearch.common.settings.Settings, org.elasticsearch.common.settings.Settings> settingsBiConsumer3 = null;
        indexScopedSettings0.addSettingsUpdateConsumer(settingsSetting1, settingsSetting2, settingsBiConsumer3);
        org.elasticsearch.common.settings.Settings.Builder builder5 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder8 = builder5.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean14 = settings11.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap16 = settings11.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings18 = settings11.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings10.dryRun(settings18);
        java.lang.String[] strArray26 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray27 = settings19.getAsArray("index.blocks.read_only", strArray26);
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder5.extendArray("state-", strArray26);
        java.lang.String str30 = builder28.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder28.put("index.creation_date", (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settingsSetting1);
        org.junit.Assert.assertNotNull(settingsSetting2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder24.put("_na_", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder24.put("index.data_path", (double) (-1));
        java.lang.String[] strArray56 = new java.lang.String[] { "index.auto_expand_replicas", "index.version.minimum_compatible", "index.blocks.write", "index.version.created", "index.", "index.", "_all", "active_allocations", "index.version.upgraded", "index.shared_filesystem", "active_allocations", "index.blocks.write", "active_allocations", "index.blocks.metadata", "index.blocks.read", "index.version.created_string", "archived.", "index.version.created_string", "primary_terms", "index.version.minimum_compatible", "index.blocks.metadata" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder33.putArray("index.data_path", (java.util.List<java.lang.String>) strList57);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder61 = builder59.put(objDictionary60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date_string");
        int int2 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.version((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("index.", 0.0d);
        java.lang.String str50 = builder45.get("state-");
        java.lang.String str52 = builder45.get("index.version.created");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("_na_");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean8 = settings5.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings5.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings12 = settings5.getByPrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings5);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue15 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue16 = settings5.getAsBytesSize("", byteSizeValue15);
        java.lang.String[] strArray18 = settings5.getAsArray("index.shared_filesystem.recover_on_any_node");
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(byteSizeValue16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("primary_terms");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder23.put("index.data_path", (long) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder28.normalizePrefix("index.version.upgraded");
        java.nio.file.Path path31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder32 = builder28.loadFromPath(path31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = builder7.primaryTerm((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        long long4 = indexMetaData1.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet7 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 1, indexMetaData1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.version((long) (-1));
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings28 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean32 = settings29.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap34 = settings29.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings36 = settings29.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings37 = indexScopedSettings28.dryRun(settings36);
        java.lang.String[] strArray44 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray45 = settings37.getAsArray("index.blocks.read_only", strArray44);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean50 = settings47.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap52 = settings47.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = settings47.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings55 = indexScopedSettings46.dryRun(settings54);
        java.lang.String[] strArray62 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray63 = settings55.getAsArray("index.blocks.read_only", strArray62);
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder23.put("index.creation_date_string", "", strArray45, strArray62);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = builder64.internalMap();
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder69 = builder64.put("index.uuid", (long) (byte) 1, byteSizeUnit68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(indexScopedSettings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + true + "'", boolean32, true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + true + "'", boolean50, true);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(strMap65);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings settings52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.put(settings52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        java.lang.String[] strArray12 = new java.lang.String[] { "index.version.created", "index.blocks.read", "primary_terms", "index.blocks.read_only", "index.blocks.metadata", "index.creation_date", "index.priority", "index.version.upgraded", "index.blocks.metadata" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder1.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.number_of_shards]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.version((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder53.putMapping("index.priority", "true");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.creationDate((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long14 = builder10.primaryTerm((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData1.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.creation_date_string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings1.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings8 = settings1.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings9.getAsGroups();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder23.put("index.", "index.");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder48 = builder46.put(objDictionary47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putMapping("archived.", "index.version.upgraded");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder2.putAlias(aliasMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.putAlias(aliasMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getRoutingNumShards();
        int int2 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.index.Index index3 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.readDiffFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.setRoutingNumShards(0);
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.priority");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        java.util.concurrent.TimeUnit timeUnit60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder61 = builder51.put("index.version.created", (long) (short) 0, timeUnit60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = indexMetaData0.getState();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder51.normalizePrefix("_all");
        org.elasticsearch.common.settings.Settings settings60 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean61 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings60);
        org.elasticsearch.common.settings.Settings settings63 = settings60.getAsSettings("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder51.put(settings63);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder51.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder68 = builder51.put("_all", (float) (short) -1);
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder72 = builder68.put("index.", (long) 1000, byteSizeUnit71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder24.put("index.number_of_shards", (float) (-1));
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("archived.", false);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder33.loadFromSource("index.number_of_replicas");
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder39 = builder35.put("index.", (long) 'a', byteSizeUnit38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder51.normalizePrefix("_all");
        org.elasticsearch.common.settings.Settings settings60 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean61 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings60);
        org.elasticsearch.common.settings.Settings settings63 = settings60.getAsSettings("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder51.put(settings63);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder51.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder67 = builder51.loadFromSource("index.version.created");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.version((long) (-1));
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder7.mapping("index.version.upgraded");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date_string");
        int int2 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.version((long) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.uuid");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = builder1.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder23.put("index.", "index.");
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean50 = settings47.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder46.put(settings47);
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder46.put("index.creation_date", (-1L));
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder54.put("index.priority", "primary_terms");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + true + "'", boolean50, true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder10.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("index.", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.version((-1L));
        boolean boolean19 = indexMetaData0.equals((java.lang.Object) builder16);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder51.normalizePrefix("_all");
        org.elasticsearch.common.settings.Settings settings60 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean61 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings60);
        org.elasticsearch.common.settings.Settings settings63 = settings60.getAsSettings("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder51.put(settings63);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder51.replacePropertyPlaceholders();
        java.lang.String[] strArray67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder68 = builder65.extendArray("index.creation_date", strArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String str34 = builder23.get("true");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shadow_replicas");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData6.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData5.diff(indexMetaData6);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData5.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff11 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData5.getSettings();
        org.elasticsearch.common.unit.RatioValue ratioValue15 = settings12.getAsRatio("index.number_of_shards", "index.creation_date");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(indexMetaDataDiff11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(ratioValue15);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.created_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder51.creationDate((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder51.putMapping("index.blocks.metadata", "index.version.upgraded");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        long long4 = indexMetaData0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putCustom("index.priority", custom9);
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder6.settings(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date_string");
        int int2 = builder1.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.Version version1 = indexMetaData0.getCreationVersion();
        java.util.Set<java.lang.String> strSet3 = null; // flaky: indexMetaData0.activeAllocationIds((int) '4');
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.readDiffFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder51.removeAlias("index.uuid");
        int int54 = builder53.getRoutingNumShards();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.version((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.creationDate((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder7.putMapping("index.blocks.write", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        int int4 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder5, params6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.setRoutingNumShards((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.creationDate((long) (-1));
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.putAlias(aliasMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.primaryTerm(1000, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
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
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        java.lang.String[] strArray6 = settings4.getAsArray("state-");
        java.lang.String[] strArray8 = settings4.getAsArray("index.shadow_replicas");
        org.elasticsearch.common.unit.SizeValue sizeValue10 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue11 = settings4.getAsSize("index.version.created_string", sizeValue10);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings4);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData1.activeAllocationIds((int) ' ');
        int int6 = indexMetaData1.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData1.activeAllocationIds(10000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet10 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) '4', indexMetaData1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (1) must be greater than the shard id: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (short) 10, 60000L);
        long long7 = builder1.version();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        java.lang.String[] strArray6 = settings4.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = settings4.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate8 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings9 = settings4.filter(strPredicate8);
        java.lang.String[] strArray11 = settings4.getAsArray("index.blocks.write");
        org.elasticsearch.common.unit.SizeValue sizeValue13 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue14 = settings4.getAsSize("true", sizeValue13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.RatioValue ratioValue17 = settings4.getAsRatio("_all", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Invalid ratio or percentage []");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(sizeValue14);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean10 = indexMetaData0.equals((java.lang.Object) "true");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData0.mappingOrDefault("archived.");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(mappingMetaData12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("_all");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [_all]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.blocks.write");
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = indexMetaData0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        long long5 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.setRoutingNumShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.version(100L);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.creation_date");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder34 = builder32.put(objDictionary33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder50.replacePropertyPlaceholders();
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.put(objDictionary52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.numberOfShards((int) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder7.putMapping(mappingMetaData54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        java.lang.String str5 = builder3.remove("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder3.normalizePrefix("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder3.loadFromSource("index.uuid");
        java.nio.file.Path path10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder11 = builder9.loadFromPath(path10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        int int4 = indexMetaData0.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.removeAlias("index.uuid");
        int int15 = builder14.numberOfReplicas();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.blocks.read_only", (int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder35.put("index.data_path", 0.0d);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings39 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean43 = settings40.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap45 = settings40.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings47 = settings40.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings48 = indexScopedSettings39.dryRun(settings47);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder49 = null;
        org.elasticsearch.common.settings.Settings settings50 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder54 = null;
        org.elasticsearch.common.settings.Settings settings55 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean56 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings55);
        org.elasticsearch.common.settings.Settings settings58 = settings55.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings59 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings58);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder60 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params61 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder62 = settings58.toXContent(xContentBuilder60, params61);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder63 = settings50.toXContent(xContentBuilder54, params61);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder64 = settings47.toXContent(xContentBuilder49, params61);
        org.elasticsearch.common.unit.SizeValue sizeValue66 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue67 = settings47.getAsSize("index.version.upgraded_string", sizeValue66);
        java.lang.String[] strArray69 = settings47.getAsArray("index.creation_date_string");
        org.elasticsearch.common.settings.Settings.Builder builder70 = builder38.put((java.lang.Object[]) strArray69);
        java.io.InputStream inputStream72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder73 = builder70.loadFromStream("index.creation_date", inputStream72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(indexScopedSettings39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertEquals("'" + boolean43 + "' != '" + true + "'", boolean43, true);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + true + "'", boolean53, true);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertNotNull(params61);
        org.junit.Assert.assertNull(xContentBuilder62);
        org.junit.Assert.assertNull(xContentBuilder63);
        org.junit.Assert.assertNull(xContentBuilder64);
        org.junit.Assert.assertNull(sizeValue67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfShards(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder4.state(state9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.", true);
        org.elasticsearch.common.settings.Settings settings52 = builder51.build();
        java.util.concurrent.TimeUnit timeUnit55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder56 = builder51.put("index.shadow_replicas", (long) 10, timeUnit55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.", (double) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder24.put("index.auto_expand_replicas", "index.number_of_shards");
        java.io.InputStream inputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder33 = builder24.loadFromStream("index.data_path", inputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData9.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData8.diff(indexMetaData9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData8.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.diff(indexMetaData8);
        java.util.Set<java.lang.String> strSet16 = null; // flaky: indexMetaData8.activeAllocationIds((int) (byte) 100);
        org.elasticsearch.index.Index index17 = indexMetaData8.getMergeSourceIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = indexMetaData8.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(index17);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        int int11 = builder2.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.numberOfShards((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder53.numberOfReplicas((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = builder55.putMapping("index.shadow_replicas", "index.blocks.write");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate(0L);
        java.lang.String str10 = builder4.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder4.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.index("archived.");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.primaryTerm(0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.number_of_replicas" + "'", str10, "index.number_of_replicas");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.index("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.creationDate(1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.removeAlias("_na_");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder13.putAlias(aliasMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.version((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.creationDate((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.data_path]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean12 = settings9.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean15 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings14);
        org.elasticsearch.common.settings.Settings settings17 = settings14.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings17);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params20 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = settings17.toXContent(xContentBuilder19, params20);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings9.toXContent(xContentBuilder13, params20);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = indexMetaData0.toXContent(xContentBuilder8, params20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(params20);
        org.junit.Assert.assertNull(xContentBuilder21);
        org.junit.Assert.assertNull(xContentBuilder22);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder24.put("index.number_of_shards", (float) (-1));
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder32 = builder24.put(objDictionary31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = settings0.getAsBytesSize("active_allocations", byteSizeValue2);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = settings0.toXContent(xContentBuilder4, params5);
        org.elasticsearch.common.settings.Settings settings8 = settings0.getAsSettings("index.version.upgraded");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = settings0.getAsStructuredMap();
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNull(byteSizeValue3);
        org.junit.Assert.assertNotNull(params5);
        org.junit.Assert.assertNull(xContentBuilder6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        java.lang.String[] strArray34 = new java.lang.String[] { "index.blocks.write", "hi!", "index.creation_date", "index.blocks.write", "index.creation_date" };
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder24.extendArray("index.version.created", strArray34);
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder35.put("_na_", (int) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder40 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder40.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings45 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings46 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean49 = settings46.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap51 = settings46.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings53 = settings46.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings54 = indexScopedSettings45.dryRun(settings53);
        java.lang.String[] strArray61 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray62 = settings54.getAsArray("index.blocks.read_only", strArray61);
        org.elasticsearch.common.settings.Settings.Builder builder63 = builder40.extendArray("state-", strArray61);
        org.elasticsearch.common.settings.Settings settings64 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean65 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings64);
        org.elasticsearch.common.settings.Settings settings67 = settings64.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings68 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings67);
        java.lang.String[] strArray70 = settings68.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap71 = settings68.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder72 = builder63.put(strMap71);
        java.lang.String[] strArray80 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        org.elasticsearch.common.settings.Settings.Builder builder83 = builder63.putArray("state-", (java.util.List<java.lang.String>) strList81);
        org.elasticsearch.common.settings.Settings.Builder builder84 = builder35.putArray("index.version.upgraded", (java.util.List<java.lang.String>) strList81);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(indexScopedSettings45);
        org.junit.Assert.assertNotNull(settings46);
        org.junit.Assert.assertEquals("'" + boolean49 + "' != '" + true + "'", boolean49, true);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(settings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(settings67);
        org.junit.Assert.assertNotNull(settings68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData1.activeAllocationIds((int) ' ');
        int int6 = indexMetaData1.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData1.activeAllocationIds(10000);
        java.lang.String str9 = indexMetaData1.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder11.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom14 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putCustom("index.", custom14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.version((-1L));
        boolean boolean20 = indexMetaData1.equals((java.lang.Object) builder17);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData1.getInitialRecoveryFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet23 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) '#', indexMetaData1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_na_" + "'", str9, "_na_");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        int int6 = indexMetaData1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData1.mappingOrDefault("index.number_of_replicas");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(mappingMetaData8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.putCustom("index.blocks.write", custom11);
        int int13 = builder12.getRoutingNumShards();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("archived.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings2 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue4 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = settings2.getAsBytesSize("active_allocations", byteSizeValue4);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = settings2.toXContent(xContentBuilder6, params7);
        org.elasticsearch.common.settings.Settings settings10 = settings2.getAsSettings("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.numberOfReplicas(10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = builder11.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNull(byteSizeValue5);
        org.junit.Assert.assertNotNull(params7);
        org.junit.Assert.assertNull(xContentBuilder8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.numberOfShards((int) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.removeAlias("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.putCustom("", custom16);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.putAlias(builder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        java.nio.file.Path path44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder45 = builder23.loadFromPath(path44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder51.normalizePrefix("_all");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData63 = indexMetaData61.mapping("archived.");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap64 = indexMetaData61.getMappings();
        java.lang.Class<?> wildcardClass65 = indexMetaData61.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder66 = builder51.put("index.version.upgraded_string", (java.lang.Class) wildcardClass65);
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder51.put("", (long) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNull(mappingMetaData63);
        org.junit.Assert.assertNotNull(strImmutableOpenMap64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        java.util.concurrent.TimeUnit timeUnit60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder61 = builder51.put("index.priority", (long) (-1), timeUnit60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.blocks.read_only", (int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder32.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder32.put("", 0.0d);
        java.util.concurrent.TimeUnit timeUnit42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder43 = builder32.put("index.data_path", 100L, timeUnit42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        java.lang.String str6 = builder4.index();
        long long7 = builder4.version();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.putAlias(aliasMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.data_path" + "'", str6, "index.data_path");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.numberOfShards((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder7.putMapping("index.version.created", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (short) 10, 60000L);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putAlias(aliasMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.Version version3 = indexMetaData2.getCreationVersion();
        org.elasticsearch.Version version4 = indexMetaData2.getUpgradedVersion();
        org.elasticsearch.Version version5 = settings0.getAsVersion("index.blocks.read", version4);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean4 = settings1.getAsBoolean("index.", (java.lang.Boolean) true);
        boolean boolean5 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings1);
        org.elasticsearch.Version version7 = null;
        org.elasticsearch.Version version8 = settings1.getAsVersion("index.data_path", version7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.IndexSettings indexSettings9 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(version8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.putAlias(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData6.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData5.diff(indexMetaData6);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData5.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff11 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData5.getSettings();
        org.apache.lucene.util.Version version13 = indexMetaData5.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaDataDiff9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(indexMetaDataDiff11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNull(version13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.version.created_string", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        boolean boolean8 = indexMetaData0.isSameUUID("index.blocks.read");
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mapping("hi!");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("archived.");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNull(mappingMetaData6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("_na_", 0.0f);
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder27.putNull("primary_terms");
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder36 = builder27.put("", (long) 1, byteSizeUnit35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        org.elasticsearch.Version version6 = null;
        org.elasticsearch.Version version7 = settings3.getAsVersion("index.data_path", version6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings3.getGroups("_na_", true);
        org.elasticsearch.common.settings.Settings settings12 = settings3.getAsSettings("index.version.created_string");
        java.lang.String str15 = settings12.get("index.", "index.version.upgraded_string");
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index.version.upgraded_string" + "'", str15, "index.version.upgraded_string");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.upgraded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.upgraded]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        int int7 = builder1.getRoutingNumShards();
        long long8 = builder1.version();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = builder1.mapping("index.blocks.write");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(mappingMetaData10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder27.putNull("index.version.created");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder31 = builder27.put(objDictionary30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder7.mapping("");
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder10.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean19 = settings16.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings16.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings23 = settings16.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings24 = indexScopedSettings15.dryRun(settings23);
        java.lang.String[] strArray31 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray32 = settings24.getAsArray("index.blocks.read_only", strArray31);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder10.extendArray("state-", strArray31);
        org.elasticsearch.common.settings.Settings settings34 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean35 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings34);
        org.elasticsearch.common.settings.Settings settings37 = settings34.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings38 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings37);
        java.lang.String[] strArray40 = settings38.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = settings38.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder33.put(strMap41);
        java.lang.String[] strArray50 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder33.putArray("state-", (java.util.List<java.lang.String>) strList51);
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder33.put("index.", "index.");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder59.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom62 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = builder60.putCustom("index.", custom62);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = builder63.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder65.version((-1L));
        java.lang.Class<?> wildcardClass68 = builder67.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder56.put("index.shared_filesystem", (java.lang.Class) wildcardClass68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder70 = builder7.settings(builder56);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder7.putMapping("", "index.blocks.read");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + true + "'", boolean19, true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings0.getGroups("index.uuid");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap7 = settings0.getAsGroups(true);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings0.getGroups("active_allocations", true);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.", true);
        org.elasticsearch.common.settings.Settings settings52 = builder51.build();
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder56 = builder51.put("index.number_of_shards", 1L, byteSizeUnit55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder7.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.primaryTerm((int) '#', (long) 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.blocks.read_only", (int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder35.loadFromSource("index.data_path");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder7.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAlias("index.auto_expand_replicas");
        java.lang.String str11 = builder8.index();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder8.putAlias(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index.creation_date_string" + "'", str11, "index.creation_date_string");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (short) 10, 60000L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.version(60000L);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.putMapping(mappingMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        int int6 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        int int4 = indexMetaData0.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.blocks.write");
        long long8 = indexMetaData0.getCreationDate();
        java.lang.String str9 = indexMetaData0.getIndexUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_na_" + "'", str9, "_na_");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        boolean boolean8 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.apache.lucene.util.Version version9 = indexMetaData0.getMinimumCompatibleVersion();
        org.apache.lucene.util.Version version10 = indexMetaData0.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertNull(version10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getRoutingFactor();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder7.setRoutingNumShards((int) (short) 1);
        int int56 = builder55.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = builder55.version((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData59 = builder55.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue15 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue16 = settings13.getAsBytesSize("active_allocations", byteSizeValue15);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params18 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = settings13.toXContent(xContentBuilder17, params18);
        org.elasticsearch.common.settings.Settings settings21 = settings13.getAsSettings("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder12.settings(settings13);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap24 = settings13.getAsGroups(true);
        org.elasticsearch.common.unit.SizeValue sizeValue26 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue27 = settings13.getAsSize("index.version.upgraded_string", sizeValue26);
        java.lang.Boolean boolean30 = settings13.getAsBoolean("_all", (java.lang.Boolean) true);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder7.settings(settings13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder7.putMapping("archived.", "true");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNull(byteSizeValue16);
        org.junit.Assert.assertNotNull(params18);
        org.junit.Assert.assertNull(xContentBuilder19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(sizeValue27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + true + "'", boolean30, true);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        boolean boolean8 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.index.Index index9 = indexMetaData0.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(index9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.creation_date");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putMapping(mappingMetaData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        java.lang.String[] strArray6 = settings4.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = settings4.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate8 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings9 = settings4.filter(strPredicate8);
        java.lang.String[] strArray11 = settings9.getAsArray("");
        java.lang.Class<?> wildcardClass12 = settings9.getClass();
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean10 = settings7.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap12 = settings7.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings14 = settings7.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings16);
        org.elasticsearch.common.settings.Settings settings19 = settings16.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        org.elasticsearch.Version version22 = null;
        org.elasticsearch.Version version23 = settings19.getAsVersion("index.data_path", version22);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = null;
        org.elasticsearch.common.settings.Settings settings25 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean26 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings25);
        org.elasticsearch.common.settings.Settings settings28 = settings25.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings28);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params31 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = settings28.toXContent(xContentBuilder30, params31);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder33 = settings19.toXContent(xContentBuilder24, params31);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = settings7.toXContent(xContentBuilder15, params31);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder6, params31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNull(version23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(params31);
        org.junit.Assert.assertNull(xContentBuilder32);
        org.junit.Assert.assertNull(xContentBuilder33);
        org.junit.Assert.assertNull(xContentBuilder34);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.state(state3);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putMapping("index.version.upgraded", "state-");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.metadata", "index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder51.build();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put("", "index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder51.normalizePrefix("_all");
        org.elasticsearch.common.settings.Settings settings60 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean61 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings60);
        org.elasticsearch.common.settings.Settings settings63 = settings60.getAsSettings("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder51.put(settings63);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder51.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings settings66 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean67 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings66);
        org.elasticsearch.common.settings.Settings settings69 = settings66.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings70 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings69);
        java.lang.String[] strArray72 = settings70.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap73 = settings70.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate74 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings75 = settings70.filter(strPredicate74);
        org.elasticsearch.common.settings.Settings.Builder builder76 = builder51.put(settings75);
        org.elasticsearch.common.settings.Settings.Builder builder79 = builder76.put("", (long) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(settings69);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strPredicate74);
        org.junit.Assert.assertNotNull(settings75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) -1);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder3.mapping("index.data_path");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(mappingMetaData5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.blocks.write]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder23.put("index.data_path", (long) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder23.put("index.creation_date_string", "index.version.upgraded_string");
        java.io.InputStream inputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder34 = builder23.loadFromStream("primary_terms", inputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData1.mapping("index.");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.version((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.creationDate((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = builder7.primaryTerm(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder23.put("index.", "index.");
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean50 = settings47.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder46.put(settings47);
        java.io.InputStream inputStream53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder54 = builder46.loadFromStream("index.creation_date_string", inputStream53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + true + "'", boolean50, true);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder23.put("index.", "index.");
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder23.put("false", false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder24.replacePropertyPlaceholders();
        java.nio.file.Path path26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder27 = builder25.loadFromPath(path26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings28 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean32 = settings29.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap34 = settings29.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings36 = settings29.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings37 = indexScopedSettings28.dryRun(settings36);
        java.lang.String[] strArray44 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray45 = settings37.getAsArray("index.blocks.read_only", strArray44);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean50 = settings47.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap52 = settings47.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = settings47.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings55 = indexScopedSettings46.dryRun(settings54);
        java.lang.String[] strArray62 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray63 = settings55.getAsArray("index.blocks.read_only", strArray62);
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder23.put("index.creation_date_string", "", strArray45, strArray62);
        org.elasticsearch.common.settings.Settings.Builder builder67 = builder23.put("state-", true);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder69 = builder23.put(objDictionary68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(indexScopedSettings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + true + "'", boolean32, true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + true + "'", boolean50, true);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.read");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean1 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        org.elasticsearch.common.settings.Settings settings3 = settings0.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings3);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings4.getAsGroups();
        boolean boolean6 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings4);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings4.getGroups("index.auto_expand_replicas", true);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        java.lang.Class<?> wildcardClass7 = indexMetaData0.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.index("index.number_of_shards");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = builder7.mapping("index.blocks.write");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = builder7.mapping("index.version.upgraded");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder7.putAlias(builder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(mappingMetaData13);
        org.junit.Assert.assertNull(mappingMetaData15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
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
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        boolean boolean8 = indexMetaData0.isSameUUID("index.blocks.read");
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings11);
        org.elasticsearch.common.settings.Settings settings14 = settings11.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params17 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = settings14.toXContent(xContentBuilder16, params17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder10, params17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(params17);
        org.junit.Assert.assertNull(xContentBuilder18);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings0.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings7 = settings0.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings9);
        org.elasticsearch.common.settings.Settings settings12 = settings9.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings12);
        org.elasticsearch.Version version15 = null;
        org.elasticsearch.Version version16 = settings12.getAsVersion("index.data_path", version15);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        org.elasticsearch.common.settings.Settings settings21 = settings18.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params24 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings21.toXContent(xContentBuilder23, params24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = settings12.toXContent(xContentBuilder17, params24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = settings0.toXContent(xContentBuilder8, params24);
        org.elasticsearch.common.unit.SizeValue sizeValue29 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue30 = settings0.getAsSize("", sizeValue29);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNull(version16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(params24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNull(xContentBuilder26);
        org.junit.Assert.assertNull(xContentBuilder27);
        org.junit.Assert.assertNull(sizeValue30);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder4.mapping("index.blocks.read_only");
        int int7 = builder4.numberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder4.putMapping("state-", "active_allocations");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData9.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData8.diff(indexMetaData9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData8.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.diff(indexMetaData8);
        java.util.Set<java.lang.String> strSet16 = null; // flaky: indexMetaData8.activeAllocationIds((int) (byte) 100);
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexMetaData8.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putCustom("index.priority", custom9);
        java.lang.String str11 = builder10.index();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index.creation_date_string" + "'", str11, "index.creation_date_string");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder7.setRoutingNumShards((int) (short) 1);
        int int56 = builder55.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            long long58 = builder55.primaryTerm((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        java.lang.String str6 = builder4.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.putMapping("false", "index.auto_expand_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.data_path" + "'", str6, "index.data_path");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        int int4 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        boolean boolean8 = indexMetaData0.isSameUUID("index.shared_filesystem");
        long long9 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.creation_date");
        int int2 = builder1.getRoutingNumShards();
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.", true);
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder53.put("index.blocks.write", "index.blocks.metadata");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder58 = builder53.put(objDictionary57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.auto_expand_replicas");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder2.mapping("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder2.putCustom("index.number_of_replicas", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.index("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putMapping("_na_", "active_allocations");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder23.put("index.", "index.");
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean50 = settings47.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder46.put(settings47);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder46.replacePropertyPlaceholders();
        java.lang.Object[] objArray53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder54 = builder46.put(objArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertEquals("'" + boolean50 + "' != '" + true + "'", boolean50, true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.version.created");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("index.", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean25 = settings22.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings22.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings29 = settings22.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings21.dryRun(settings29);
        java.lang.String[] strArray37 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray38 = settings30.getAsArray("index.blocks.read_only", strArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder16.extendArray("state-", strArray37);
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings40);
        org.elasticsearch.common.settings.Settings settings43 = settings40.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings43);
        java.lang.String[] strArray46 = settings44.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = settings44.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(strMap47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder10.settings(builder48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = builder48.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder7.settings(builder48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder7.numberOfShards((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder53.numberOfReplicas((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = builder55.primaryTerm((int) (byte) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder50.replacePropertyPlaceholders();
        java.lang.String[] strArray78 = new java.lang.String[] { "index.", "index.number_of_shards", "index.shadow_replicas", "index.auto_expand_replicas", "index.blocks.read_only", "primary_terms", "index.priority", "index.data_path", "index.uuid", "index.blocks.read_only", "state-", "index.data_path", "index.blocks.write", "archived.", "index.version.upgraded_string", "index.uuid", "index.uuid", "index.blocks.metadata", "index.shared_filesystem.recover_on_any_node", "index.uuid", "index.blocks.write", "_all", "hi!", "index.blocks.read_only", "_na_" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        org.elasticsearch.common.settings.Settings.Builder builder81 = builder51.putArray("index.shared_filesystem.recover_on_any_node", (java.util.List<java.lang.String>) strList79);
        java.lang.Class<?> wildcardClass82 = strList79.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.loadFromSource("");
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder50.put("index.", (int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder54 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder54.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings59 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings60 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean63 = settings60.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap65 = settings60.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings67 = settings60.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings68 = indexScopedSettings59.dryRun(settings67);
        java.lang.String[] strArray75 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray76 = settings68.getAsArray("index.blocks.read_only", strArray75);
        org.elasticsearch.common.settings.Settings.Builder builder77 = builder54.extendArray("state-", strArray75);
        org.elasticsearch.common.settings.Settings settings78 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean79 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings78);
        org.elasticsearch.common.settings.Settings settings81 = settings78.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings82 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings81);
        java.lang.String[] strArray84 = settings82.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap85 = settings82.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder86 = builder77.put(strMap85);
        java.lang.String[] strArray94 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList95 = new java.util.ArrayList<java.lang.String>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList95, strArray94);
        org.elasticsearch.common.settings.Settings.Builder builder97 = builder77.putArray("state-", (java.util.List<java.lang.String>) strList95);
        org.elasticsearch.common.settings.Settings settings98 = builder97.build();
        org.elasticsearch.common.settings.Settings.Builder builder99 = builder53.put(settings98);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(indexScopedSettings59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertEquals("'" + boolean63 + "' != '" + true + "'", boolean63, true);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(settings67);
        org.junit.Assert.assertNotNull(settings68);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(settings78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(settings81);
        org.junit.Assert.assertNotNull(settings82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(settings98);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(100, indexMetaData1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (52) must be greater than the shard id: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder24.putNull("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder24.put("index.shared_filesystem.recover_on_any_node", (double) (byte) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder23.put("index.creation_date", (double) 1L);
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder28.put("index.version.upgraded", (double) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder28.put("index.version.minimum_compatible", (double) (-1L));
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder38 = builder28.put("index.blocks.read", 100L, byteSizeUnit37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.version.minimum_compatible");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.number_of_shards]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.lang.String[] strArray30 = settings28.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings28.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.put(strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder23.putArray("state-", (java.util.List<java.lang.String>) strList41);
        org.elasticsearch.common.settings.Settings settings44 = builder43.build();
        org.elasticsearch.common.settings.Settings.Builder builder46 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder46.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings51 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean55 = settings52.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap57 = settings52.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings59 = settings52.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings60 = indexScopedSettings51.dryRun(settings59);
        java.lang.String[] strArray67 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray68 = settings60.getAsArray("index.blocks.read_only", strArray67);
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder46.extendArray("state-", strArray67);
        org.elasticsearch.common.settings.Settings settings70 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean71 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings70);
        org.elasticsearch.common.settings.Settings settings73 = settings70.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings74 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings73);
        java.lang.String[] strArray76 = settings74.getAsArray("state-");
        java.util.Map<java.lang.String, java.lang.String> strMap77 = settings74.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder78 = builder69.put(strMap77);
        java.lang.String[] strArray86 = new java.lang.String[] { "index.", "index.blocks.read", "_na_", "index.auto_expand_replicas", "active_allocations", "index.blocks.write" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        org.elasticsearch.common.settings.Settings.Builder builder89 = builder69.putArray("state-", (java.util.List<java.lang.String>) strList87);
        org.elasticsearch.common.settings.Settings.Builder builder90 = builder43.putArray("index.blocks.metadata", (java.util.List<java.lang.String>) strList87);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData92 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData94 = indexMetaData92.mapping("archived.");
        long long95 = indexMetaData92.getCreationDate();
        long long96 = indexMetaData92.getVersion();
        org.elasticsearch.index.Index index97 = indexMetaData92.getMergeSourceIndex();
        org.elasticsearch.Version version98 = indexMetaData92.getUpgradedVersion();
        org.elasticsearch.common.settings.Settings.Builder builder99 = builder43.put("index.data_path", version98);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(indexScopedSettings51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertEquals("'" + boolean55 + "' != '" + true + "'", boolean55, true);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(settings73);
        org.junit.Assert.assertNotNull(settings74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(indexMetaData92);
        org.junit.Assert.assertNull(mappingMetaData94);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-1L) + "'", long95 == (-1L));
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1L + "'", long96 == 1L);
        org.junit.Assert.assertNull(index97);
        org.junit.Assert.assertNotNull(version98);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData2.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData1.diff(indexMetaData2);
        boolean boolean7 = indexMetaData2.isSameUUID("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet9 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) '#', indexMetaData2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings0.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings7 = settings0.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean12 = settings9.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap14 = settings9.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings16 = settings9.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        org.elasticsearch.common.settings.Settings settings21 = settings18.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings21.getAsVersion("index.data_path", version24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean28 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings27);
        org.elasticsearch.common.settings.Settings settings30 = settings27.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings30);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params33 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = settings30.toXContent(xContentBuilder32, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = settings21.toXContent(xContentBuilder26, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder36 = settings9.toXContent(xContentBuilder17, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = settings0.toXContent(xContentBuilder8, params33);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = settings0.getAsMap();
        java.lang.String str40 = settings0.get("index.version.created_string");
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(params33);
        org.junit.Assert.assertNull(xContentBuilder34);
        org.junit.Assert.assertNull(xContentBuilder35);
        org.junit.Assert.assertNull(xContentBuilder36);
        org.junit.Assert.assertNull(xContentBuilder37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData2.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData1.diff(indexMetaData2);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData2.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData2.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet9 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(100, indexMetaData2, 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("", (long) 1);
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder30.normalizePrefix("index.version.minimum_compatible");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder34 = builder30.put(objDictionary33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder10.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("index.", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.version((-1L));
        boolean boolean19 = indexMetaData0.equals((java.lang.Object) builder16);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap20 = indexMetaData0.getCustoms();
        long long21 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("", (long) 1);
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder30.normalizePrefix("index.version.minimum_compatible");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings34 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean38 = settings35.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap40 = settings35.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings42 = settings35.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings43 = indexScopedSettings34.dryRun(settings42);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder44 = null;
        org.elasticsearch.common.settings.Settings settings45 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean48 = settings45.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder49 = null;
        org.elasticsearch.common.settings.Settings settings50 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean51 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings50);
        org.elasticsearch.common.settings.Settings settings53 = settings50.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings54 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings53);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder55 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params56 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder57 = settings53.toXContent(xContentBuilder55, params56);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder58 = settings45.toXContent(xContentBuilder49, params56);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder59 = settings42.toXContent(xContentBuilder44, params56);
        java.util.function.Predicate<java.lang.String> strPredicate60 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings61 = settings42.filter(strPredicate60);
        java.lang.Class<?> wildcardClass62 = settings42.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder63 = builder32.put("index.creation_date", (java.lang.Class) wildcardClass62);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(indexScopedSettings34);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + true + "'", boolean38, true);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertEquals("'" + boolean48 + "' != '" + true + "'", boolean48, true);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(params56);
        org.junit.Assert.assertNull(xContentBuilder57);
        org.junit.Assert.assertNull(xContentBuilder58);
        org.junit.Assert.assertNull(xContentBuilder59);
        org.junit.Assert.assertNotNull(strPredicate60);
        org.junit.Assert.assertNotNull(settings61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean3 = settings0.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings0.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings7 = settings0.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean12 = settings9.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap14 = settings9.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings16 = settings9.getAsSettings("index.creation_date_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        org.elasticsearch.common.settings.Settings settings21 = settings18.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings21.getAsVersion("index.data_path", version24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean28 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings27);
        org.elasticsearch.common.settings.Settings settings30 = settings27.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings30);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params33 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = settings30.toXContent(xContentBuilder32, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = settings21.toXContent(xContentBuilder26, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder36 = settings9.toXContent(xContentBuilder17, params33);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = settings0.toXContent(xContentBuilder8, params33);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = settings0.getAsMap();
        org.elasticsearch.common.unit.SizeValue sizeValue40 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue41 = settings0.getAsSize("index.creation_date_string", sizeValue40);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(params33);
        org.junit.Assert.assertNull(xContentBuilder34);
        org.junit.Assert.assertNull(xContentBuilder35);
        org.junit.Assert.assertNull(xContentBuilder36);
        org.junit.Assert.assertNull(xContentBuilder37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(sizeValue41);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.auto_expand_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.auto_expand_replicas]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.version.upgraded");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        java.lang.String str25 = builder23.remove("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.putNull("index.blocks.read_only");
        java.lang.String str29 = builder23.remove("state-");
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder23.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder23.loadFromSource("");
        java.lang.String str34 = builder32.get("index.data_path");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("_na_", custom1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder2.index("archived.");
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder10.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.putCustom("index.", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.version((-1L));
        boolean boolean19 = indexMetaData0.equals((java.lang.Object) builder16);
        int int20 = indexMetaData0.getRoutingFactor();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.priority");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = settings0.getAsBytesSize("index.auto_expand_replicas", byteSizeValue2);
        java.util.Set<java.lang.String> strSet4 = settings0.names();
        java.lang.Boolean boolean7 = settings0.getAsBoolean("index.blocks.read_only", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings0.getGroups("index.version.created");
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNull(byteSizeValue3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int5 = indexMetaData0.getRoutingNumShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean10 = indexMetaData0.equals((java.lang.Object) "true");
        int int11 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.readDiffFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean8 = settings5.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings5.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings12 = settings5.getByPrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.index("_na_");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.setRoutingNumShards(10);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        boolean boolean6 = indexMetaData0.isSameUUID("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean8 = settings5.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings5.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings12 = settings5.getByPrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings5);
        int int14 = builder13.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.numberOfShards(10000);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder16.putAlias(builder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        java.lang.String str5 = builder0.get("index.version.created_string");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.priority");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (short) 10, 60000L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.version(60000L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.putCustom("index.priority", custom10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.creation_date_string");
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.setRoutingNumShards((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.creationDate((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.primaryTerm(100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder2.putCustom("index.", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder2.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.version((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.version((long) (short) 0);
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean14 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings13);
        org.elasticsearch.common.settings.Settings settings16 = settings13.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.lang.String[] strArray19 = settings17.getAsArray("state-");
        java.lang.String[] strArray21 = settings17.getAsArray("index.shadow_replicas");
        org.elasticsearch.common.unit.SizeValue sizeValue23 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue24 = settings17.getAsSize("index.version.created_string", sizeValue23);
        java.util.Set<java.lang.String> strSet25 = settings17.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder11.putActiveAllocationIds((int) (byte) 1, strSet25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder11.putMapping("index.blocks.read", "index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(sizeValue24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings3 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean6 = settings3.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap8 = settings3.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings10 = settings3.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings2.dryRun(settings10);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = null;
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean16 = settings13.getAsBoolean("index.", (java.lang.Boolean) true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        org.elasticsearch.common.settings.Settings settings21 = settings18.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params24 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings21.toXContent(xContentBuilder23, params24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = settings13.toXContent(xContentBuilder17, params24);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = settings10.toXContent(xContentBuilder12, params24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder1, params24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(params24);
        org.junit.Assert.assertNull(xContentBuilder25);
        org.junit.Assert.assertNull(xContentBuilder26);
        org.junit.Assert.assertNull(xContentBuilder27);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.readDiffFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.priority", true);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.lang.Boolean boolean9 = settings6.getAsBoolean("index.", (java.lang.Boolean) true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings6.getGroups("index.uuid");
        org.elasticsearch.common.settings.Settings settings13 = settings6.getByPrefix("index.version.upgraded");
        org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings5.dryRun(settings13);
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read_only", "index.blocks.read_only", "_na_", "index.data_path", "index.auto_expand_replicas" };
        java.lang.String[] strArray22 = settings14.getAsArray("index.blocks.read_only", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder0.extendArray("state-", strArray21);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.blocks.write", (float) 100L);
        java.lang.String[] strArray34 = new java.lang.String[] { "index.blocks.write", "hi!", "index.creation_date", "index.blocks.write", "index.creation_date" };
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder24.extendArray("index.version.created", strArray34);
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder24.put("", (double) 100);
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder42 = builder24.put("_na_", (long) (byte) -1, byteSizeUnit41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        boolean boolean8 = indexMetaData0.isSameUUID("index.shared_filesystem");
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
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("_all", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.removeAlias("index.blocks.write");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putMapping(mappingMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData1.mapping("archived.");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(aliasMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) ' ');
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.index("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder4.creationDate(0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder4.setRoutingNumShards((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder4.primaryTerm(0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        boolean boolean6 = indexMetaData0.isSameUUID("archived.");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        boolean boolean7 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings6);
        org.elasticsearch.common.settings.Settings settings9 = settings6.getAsSettings("index.");
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        java.lang.Boolean boolean13 = settings9.getAsBoolean("index.blocks.write", (java.lang.Boolean) false);
        boolean boolean14 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings9);
        org.elasticsearch.index.IndexSettings indexSettings15 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings9);
        org.apache.lucene.index.MergePolicy mergePolicy16 = indexSettings15.getMergePolicy();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mergePolicy16);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = builder5.getRoutingNumShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(mappingMetaData2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("index.version.minimum_compatible");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}
