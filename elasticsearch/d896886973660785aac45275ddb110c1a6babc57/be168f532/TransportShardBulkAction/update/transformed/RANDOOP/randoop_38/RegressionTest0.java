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
        java.lang.String str0 = org.elasticsearch.action.bulk.TransportShardBulkAction.ACTION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "indices:data/write/bulk[s]" + "'", str0, "indices:data/write/bulk[s]");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "indices:data/write/bulk[s]");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_MINIMUM_COMPATIBLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.minimum_compatible" + "'", str0, "index.version.minimum_compatible");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(1, indexMetaData1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FILESYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem" + "'", str0, "index.shared_filesystem");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_PRIORITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.priority" + "'", str0, "index.priority");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        java.lang.Class<?> wildcardClass2 = builder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_replicas" + "'", str0, "index.number_of_replicas");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_PRIORITY_SETTING;
        org.junit.Assert.assertNotNull(intSetting0);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_ACTIVE_ALLOCATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active_allocations" + "'", str0, "active_allocations");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet3 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 100, indexMetaData1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (1) must be greater than the shard id: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created_string" + "'", str0, "index.version.created_string");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [-1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [hi!]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_METADATA_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_READ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read" + "'", str0, "index.blocks.read");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_CREATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.created" + "'", str0, "index.version.created");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_INDEX_UUID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.uuid" + "'", str0, "index.uuid");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str0 = org.elasticsearch.action.bulk.TransportShardBulkAction.OP_TYPE_UPDATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "update" + "'", str0, "update");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task6 = bulkShardRequest0.createTask((long) '#', "active_allocations", "", taskId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_WRITE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.write" + "'", str0, "index.blocks.write");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.data_path" + "'", str0, "index.data_path");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.tasks.TaskId taskId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task9 = bulkShardRequest1.createTask(1L, "index.uuid", "", taskId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.ActionRequest actionRequest5 = updateResult4.actionRequest;
        boolean boolean6 = actionRequest5.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(actionRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet4 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 10, indexMetaData1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (10) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
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
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_EXCLUDE_GROUP_SETTING;
        org.junit.Assert.assertNotNull(settingsSetting0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state0 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte1 = state0.id();
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state0.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = indexMetaData0.toXContent(xContentBuilder1, params2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(params2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        java.lang.Throwable throwable12 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, true, throwable12, writeResult13);
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest9.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task16 = bulkShardRequest1.createTask((long) '4', "indices:data/write/bulk[s]", "index.uuid", taskId15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(taskId15);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
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
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        java.lang.Class<?> wildcardClass8 = bulkShardRequest1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.junit.Assert.assertNotNull(clusterBlock0);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date_string" + "'", str0, "index.creation_date_string");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.index.translog.Translog.Location location10 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult11 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, location10, respondingWriteResult11, eSLogger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [100]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded_string" + "'", str0, "index.version.upgraded_string");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SETTING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index." + "'", str0, "index.");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = builder1.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem");
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
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest10.setRefreshPolicy("update");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [update].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
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
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putMapping(mappingMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
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
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.number_of_replicas]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest10.timeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bulkShardRequest10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(timeValue11);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = indexMetaData0.primaryTerm((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
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
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_AUTO_EXPAND_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.auto_expand_replicas" + "'", str0, "index.auto_expand_replicas");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
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
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.io.stream.StreamInput streamInput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean5 = versionType1.isVersionConflictForWrites((long) (byte) 1, 10L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.fromString("", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.minimum_compatible]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        java.lang.Throwable throwable23 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, true, throwable23, writeResult24);
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest20.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task27 = bulkShardRequest1.createTask((long) (-1), "index.priority", "index.priority", taskId26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(taskId26);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
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
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData1.mappingOrDefault("index.data_path");
        org.elasticsearch.index.Index index6 = indexMetaData1.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (byte) 10, indexMetaData1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(index6);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_READ_ONLY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.read_only" + "'", str0, "index.blocks.read_only");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_NUMBER_OF_SHARDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.number_of_shards" + "'", str0, "index.number_of_shards");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shared_filesystem.recover_on_any_node" + "'", str0, "index.shared_filesystem.recover_on_any_node");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, true, throwable8, writeResult9);
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest5.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task12 = bulkShardRequest0.createTask((long) (byte) 10, "active_allocations", "index.shared_filesystem.recover_on_any_node", taskId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress1 = bulkShardRequest0.remoteAddress();
        org.junit.Assert.assertNull(transportAddress1);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [-1]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
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
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_SHADOW_REPLICAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.shadow_replicas" + "'", str0, "index.shadow_replicas");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
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
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, true, throwable14, writeResult15);
        org.elasticsearch.index.shard.ShardId shardId17 = bulkShardRequest11.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, writeResult21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = bulkShardRequest19.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest11.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean28 = bulkShardRequest27.getShouldPersistResult();
        java.lang.Throwable throwable30 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, true, throwable30, writeResult31);
        org.elasticsearch.tasks.TaskId taskId33 = bulkShardRequest27.getParentTask();
        bulkShardRequest25.setParentTask(taskId33);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task35 = bulkShardRequest1.createTask(10L, "update", "", taskId33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(taskId33);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest2.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.index.translog.Translog.Location location11 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult12 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, location11, respondingWriteResult12, eSLogger13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(params3);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.common.xcontent.XContentParser xContentParser17 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = indexMetaData7.fromXContent(xContentParser17, parseFieldMatcher18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
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
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FILESYSTEM_SETTING;
        org.junit.Assert.assertNotNull(booleanSetting0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putAlias(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest1.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest1.setRefreshPolicy("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.version.created_string].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_CREATION_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.creation_date" + "'", str0, "index.creation_date");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfShards();
        org.elasticsearch.index.Index index17 = indexMetaData15.getMergeSourceIndex();
        int int18 = indexMetaData15.getNumberOfShards();
        boolean boolean20 = indexMetaData15.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap21 = indexMetaData15.getCustoms();
        org.elasticsearch.Version version22 = indexMetaData15.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData8.diff(indexMetaData15);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff24 = indexMetaData0.diff(indexMetaData8);
        java.lang.Class<?> wildcardClass25 = indexMetaData8.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertNotNull(indexMetaDataDiff24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
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
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkShardRequest10.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout(timeValue9);
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, true, throwable18, writeResult19);
        org.elasticsearch.index.shard.ShardId shardId21 = bulkShardRequest15.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean24 = bulkShardRequest23.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult25);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = bulkShardRequest23.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy28 = bulkShardRequest23.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest15.setRefreshPolicy(refreshPolicy28);
        org.elasticsearch.action.update.UpdateHelper.Result result30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean32 = bulkShardRequest31.getShouldPersistResult();
        java.lang.Throwable throwable34 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result30, (org.elasticsearch.action.ActionRequest) bulkShardRequest31, true, throwable34, writeResult35);
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest31.getParentTask();
        bulkShardRequest29.setParentTask(taskId37);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task39 = bulkShardRequest1.createTask((long) (byte) 2, "index.priority", "index.version.created_string", taskId37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(shardId21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel27 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel27.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy28 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy28.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(taskId37);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest10.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest10.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest10.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(timeValue11);
        org.junit.Assert.assertNull(timeValue12);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.putMapping(mappingMetaData25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = builder24.primaryTerm((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        java.lang.Class<?> wildcardClass3 = settings2.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.translog.Translog.Location location2 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult3 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, location2, respondingWriteResult3, eSLogger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putAlias(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "index.data_path");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
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
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.String str0 = org.elasticsearch.action.bulk.TransportShardBulkAction.OP_TYPE_DELETE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "delete" + "'", str0, "delete");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        boolean boolean4 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction14 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings2, transportService5, clusterService6, indicesService7, threadPool8, shardStateAction9, mappingUpdatedAction10, updateHelper11, actionFilters12, indexNameExpressionResolver13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData10.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings12);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType3 = org.elasticsearch.index.VersionType.fromString("index.creation_date", versionType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("indices:data/write/bulk[s]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [indices:data/write/bulk[s]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "index.");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest2.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest2.timeout(timeValue10);
        org.elasticsearch.index.translog.Translog.Location location12 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult13 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, location12, respondingWriteResult13, eSLogger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest10.timeout();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest10.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(timeValue11);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.putMapping(mappingMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest1.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = builder7.primaryTerm((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("update");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [update]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_STATE_FILE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "state-" + "'", str0, "state-");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.index.Index index17 = indexMetaData7.getMergeSourceIndex();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params19 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int21 = indexMetaData20.getNumberOfShards();
        org.elasticsearch.index.Index index22 = indexMetaData20.getMergeSourceIndex();
        int int23 = indexMetaData20.getNumberOfShards();
        boolean boolean25 = indexMetaData20.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap26 = indexMetaData20.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int28 = indexMetaData27.getNumberOfShards();
        org.elasticsearch.index.Index index29 = indexMetaData27.getMergeSourceIndex();
        int int30 = indexMetaData27.getNumberOfShards();
        boolean boolean32 = indexMetaData27.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap33 = indexMetaData27.getCustoms();
        org.elasticsearch.Version version34 = indexMetaData27.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff35 = indexMetaData20.diff(indexMetaData27);
        java.lang.String str36 = indexMetaData27.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple37 = org.elasticsearch.common.collect.Tuple.tuple(params19, (org.elasticsearch.common.io.stream.Writeable) indexMetaData27);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder38 = index17.toXContent(xContentBuilder18, params19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNotNull(params19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap26);
        org.junit.Assert.assertNotNull(indexMetaData27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(index29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap33);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(indexMetaDataDiff35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_na_" + "'", str36, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple37);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexMetaData0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [100] is different than the one provided [1]", custom1);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setShardId(shardId7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [2] is different than the one provided [35]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [2] is different than the one provided [35]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putMapping("delete", "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_VERSION_UPGRADED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.version.upgraded" + "'", str0, "index.version.upgraded");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = builder5.primaryTerm((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder2 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params3 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getNumberOfShards();
        org.elasticsearch.index.Index index6 = indexMetaData4.getMergeSourceIndex();
        int int7 = indexMetaData4.getNumberOfShards();
        boolean boolean9 = indexMetaData4.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData4.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int12 = indexMetaData11.getNumberOfShards();
        org.elasticsearch.index.Index index13 = indexMetaData11.getMergeSourceIndex();
        int int14 = indexMetaData11.getNumberOfShards();
        boolean boolean16 = indexMetaData11.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap17 = indexMetaData11.getCustoms();
        org.elasticsearch.Version version18 = indexMetaData11.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData4.diff(indexMetaData11);
        java.lang.String str20 = indexMetaData11.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple21 = org.elasticsearch.common.collect.Tuple.tuple(params3, (org.elasticsearch.common.io.stream.Writeable) indexMetaData11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder2, params3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(params3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(indexMetaDataDiff19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_na_" + "'", str20, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple21);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings2);
        boolean boolean4 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params6 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int15 = indexMetaData14.getNumberOfShards();
        org.elasticsearch.index.Index index16 = indexMetaData14.getMergeSourceIndex();
        int int17 = indexMetaData14.getNumberOfShards();
        boolean boolean19 = indexMetaData14.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap20 = indexMetaData14.getCustoms();
        org.elasticsearch.Version version21 = indexMetaData14.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff22 = indexMetaData7.diff(indexMetaData14);
        java.lang.String str23 = indexMetaData14.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple24 = org.elasticsearch.common.collect.Tuple.tuple(params6, (org.elasticsearch.common.io.stream.Writeable) indexMetaData14);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = settings2.toXContent(xContentBuilder5, params6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(params6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(index16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap20);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(indexMetaDataDiff22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_na_" + "'", str23, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple24);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder19.primaryTerm((-1), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder1.primaryTerm(100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
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
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.common.settings.Settings.Builder builder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.settings(builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
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
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder1.putAlias(aliasMetaData25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
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
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) ' ', (long) 0);
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
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_UUID_NA_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_na_" + "'", str0, "_na_");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.version.created_string");
        bulkShardRequest0.primaryTerm((long) (-1));
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest2);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("_na_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [_na_]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.index.Index index5 = indexMetaData0.getIndex();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(index5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        int int5 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(actionRequest4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.settings(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = builder24.primaryTerm(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setShardId(shardId7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.data_path");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.data_path]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        int int7 = indexMetaData1.getNumberOfReplicas();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet9 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards((int) (short) 10, indexMetaData1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.KEY_PRIMARY_TERMS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "primary_terms" + "'", str0, "primary_terms");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putAlias(aliasMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        long long7 = indexMetaData0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.String str0 = org.elasticsearch.cluster.metadata.IndexMetaData.SETTING_BLOCKS_METADATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index.blocks.metadata" + "'", str0, "index.blocks.metadata");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.version.created_string");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest2.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest2.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setRefreshPolicy(refreshPolicy14);
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest15.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putAlias(aliasMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest1.consistencyLevel();
        java.lang.String str10 = bulkShardRequest1.index();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkShardRequest1.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        byte byte5 = versionType0.getValue();
        java.lang.String str8 = versionType0.explainConflictForReads((long) 100, (long) (short) 1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 2 + "'", byte5 == (byte) 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [100] is different than the one provided [1]" + "'", str8, "current version [100] is different than the one provided [1]");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        int int4 = 0; // flaky: bulkItemRequest2.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_ONLY_SETTING;
        java.lang.Class<?> wildcardClass1 = booleanSetting0.getClass();
        org.junit.Assert.assertNotNull(booleanSetting0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest1.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(taskId6);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) ' ', (long) 0);
        boolean boolean7 = versionType1.isVersionConflictForReads((long) (byte) 0, (long) 'a');
        boolean boolean11 = versionType1.isVersionConflictForWrites((long) (-1), (long) (short) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType12 = org.elasticsearch.index.VersionType.fromString("index.creation_date_string", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.creation_date_string]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = bulkShardRequest1.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_shards", throwable2, "index.version.upgraded_string");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = shardFailure4.routing;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.number_of_shards" + "'", str5, "index.number_of_shards");
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertNull(shardRouting7);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder1.primaryTerm((int) (byte) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        boolean boolean4 = updateResult2.failure();
        org.elasticsearch.action.ActionRequest actionRequest5 = updateResult2.actionRequest;
        boolean boolean6 = updateResult2.retry;
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(actionRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params18 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int27 = indexMetaData26.getNumberOfShards();
        org.elasticsearch.index.Index index28 = indexMetaData26.getMergeSourceIndex();
        int int29 = indexMetaData26.getNumberOfShards();
        boolean boolean31 = indexMetaData26.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap32 = indexMetaData26.getCustoms();
        org.elasticsearch.Version version33 = indexMetaData26.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff34 = indexMetaData19.diff(indexMetaData26);
        java.lang.String str35 = indexMetaData26.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple36 = org.elasticsearch.common.collect.Tuple.tuple(params18, (org.elasticsearch.common.io.stream.Writeable) indexMetaData26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = indexMetaData7.toXContent(xContentBuilder17, params18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
        org.junit.Assert.assertNotNull(params18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(indexMetaDataDiff34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_na_" + "'", str35, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple36);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.metadata");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.metadata]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        bulkShardRequest11.remoteAddress(transportAddress14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.setShardId(shardId8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = bulkShardRequest2.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.readDiffFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.version.created_string");
        bulkShardRequest0.primaryTerm((long) (-1));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest2);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setShardId(shardId7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bulkShardRequest8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.index.Index index12 = indexMetaData10.getMergeSourceIndex();
        int int13 = indexMetaData10.getNumberOfShards();
        boolean boolean15 = indexMetaData10.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData10.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int18 = indexMetaData17.getNumberOfShards();
        org.elasticsearch.index.Index index19 = indexMetaData17.getMergeSourceIndex();
        int int20 = indexMetaData17.getNumberOfShards();
        boolean boolean22 = indexMetaData17.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap23 = indexMetaData17.getCustoms();
        org.elasticsearch.Version version24 = indexMetaData17.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff25 = indexMetaData10.diff(indexMetaData17);
        java.lang.String str26 = indexMetaData17.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple27 = org.elasticsearch.common.collect.Tuple.tuple(params9, (org.elasticsearch.common.io.stream.Writeable) indexMetaData17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(params9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(indexMetaDataDiff25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_na_" + "'", str26, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple27);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData8.getSettings();
        boolean boolean11 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings10);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder6.settings(settings10);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.putAlias(builder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putMapping(mappingMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.putMapping(mappingMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings7);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [100] is higher than the one provided [0]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("current version [-1] is different than the one provided [10]");
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout(timeValue9);
        org.elasticsearch.index.shard.ShardId shardId11 = bulkShardRequest1.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.setRefreshPolicy("active_allocations");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [active_allocations].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(shardId11);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = builder6.mapping("current version [1] is higher than the one provided [-1]");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder6.putAlias(aliasMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(mappingMetaData10);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params20 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData8, xContentBuilder19, params20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
        org.junit.Assert.assertNotNull(params20);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest10.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest10.timeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bulkShardRequest10.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(timeValue11);
        org.junit.Assert.assertNull(timeValue12);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.index.Index index5 = indexMetaData0.getIndex();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(index5);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData10.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings12);
        long long14 = builder13.version();
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.settings(builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        boolean boolean4 = updateResult2.failure();
        org.elasticsearch.action.update.UpdateHelper.Result result5 = updateResult2.result;
        boolean boolean6 = updateResult2.retry;
        java.lang.Throwable throwable7 = updateResult2.error;
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(result5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(throwable7);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        java.lang.String str3 = versionType0.explainConflictForReads((long) (-1), 0L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str3, "current version [-1] is different than the one provided [0]");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.setShardId(shardId8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest10.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.settings(builder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest10.setRefreshPolicy("index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.number_of_shards].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        boolean boolean6 = bulkShardRequest1.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bulkShardRequest1.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        boolean boolean5 = updateResult4.retry;
        boolean boolean6 = updateResult4.success();
        org.elasticsearch.action.ActionRequest actionRequest7 = updateResult4.actionRequest;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = updateResult4.writeResult;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(actionRequest7);
        org.junit.Assert.assertNull(writeResult8);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest13.request();
        org.elasticsearch.action.ActionRequest actionRequest15 = bulkItemRequest13.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bulkItemRequest13.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(actionRequest14);
        org.junit.Assert.assertNotNull(actionRequest15);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder1.putMapping(mappingMetaData25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.index.Index index12 = indexMetaData10.getMergeSourceIndex();
        int int13 = indexMetaData10.getNumberOfShards();
        boolean boolean15 = indexMetaData10.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData10.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int18 = indexMetaData17.getNumberOfShards();
        org.elasticsearch.index.Index index19 = indexMetaData17.getMergeSourceIndex();
        int int20 = indexMetaData17.getNumberOfShards();
        boolean boolean22 = indexMetaData17.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap23 = indexMetaData17.getCustoms();
        org.elasticsearch.Version version24 = indexMetaData17.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff25 = indexMetaData10.diff(indexMetaData17);
        java.lang.String str26 = indexMetaData17.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple27 = org.elasticsearch.common.collect.Tuple.tuple(params9, (org.elasticsearch.common.io.stream.Writeable) indexMetaData17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder28 = indexMetaData0.toXContent(xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(params9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(indexMetaDataDiff25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_na_" + "'", str26, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple27);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.requireFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.index.Index index14 = indexMetaData12.getMergeSourceIndex();
        int int15 = indexMetaData12.getNumberOfShards();
        boolean boolean17 = indexMetaData12.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData12.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.Version version26 = indexMetaData19.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData12.diff(indexMetaData19);
        java.lang.String str28 = indexMetaData19.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple29 = org.elasticsearch.common.collect.Tuple.tuple(params11, (org.elasticsearch.common.io.stream.Writeable) indexMetaData19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = indexMetaData0.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_na_" + "'", str28, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple29);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
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
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest1.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str3 = versionType0.explainConflictForReads(10L, (long) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [10] is different than the one provided [0]" + "'", str3, "current version [10] is different than the one provided [0]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [100] is higher than the one provided [0]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.index("current version [-1] is different than the one provided [10]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.blocks.write");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.write]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.index.Index index17 = indexMetaData7.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData7.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData7.requireFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = indexMetaData7.toXContent(xContentBuilder20, params21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNull(discoveryNodeFilters19);
        org.junit.Assert.assertNotNull(params21);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        java.lang.String str8 = versionType5.explainConflictForReads((long) (byte) 2, (long) '#');
        java.lang.String str12 = versionType5.explainConflictForWrites((long) (byte) 1, (long) (byte) -1, true);
        boolean boolean14 = versionType5.validateVersionForReads((long) (short) 0);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [2] is different than the one provided [35]" + "'", str8, "current version [2] is different than the one provided [35]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "current version [1] is higher than the one provided [-1]" + "'", str12, "current version [1] is higher than the one provided [-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder26.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData29 = builder27.mapping("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder27.putMapping(mappingMetaData30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(mappingMetaData29);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = bulkShardRequest8.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting0, (java.lang.CharSequence) "index.version.upgraded_string");
        java.lang.CharSequence charSequence3 = toXContentToBytesTuple2.v2();
        java.lang.String str4 = toXContentToBytesTuple2.toString();
        java.lang.String str5 = toXContentToBytesTuple2.toString();
        org.junit.Assert.assertNotNull(intSetting0);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple2);
        org.junit.Assert.assertEquals("'" + charSequence3 + "' != '" + "index.version.upgraded_string" + "'", charSequence3, "index.version.upgraded_string");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str4, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str5, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [10]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.primaryTerm(10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap2 = indexMetaData1.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap3 = indexMetaData1.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet5 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(100, indexMetaData1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest13.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bulkItemRequest13.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(actionRequest14);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) (byte) 1, 10L, false);
        boolean boolean6 = versionType0.validateVersionForReads(1L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.creationDate((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder7.removeAlias("indices:data/write/bulk[s]");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.putAlias(aliasMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.creationDate((long) (short) 0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.transport.TransportService transportService3 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService4 = null;
        org.elasticsearch.indices.IndicesService indicesService5 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool6 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction7 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction8 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper9 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters10 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction12 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings2, transportService3, clusterService4, indicesService5, threadPool6, shardStateAction7, mappingUpdatedAction8, updateHelper9, actionFilters10, indexNameExpressionResolver11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest8.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest8.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest8.setRefreshPolicy("current version [2] is different than the one provided [35]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [2] is different than the one provided [35]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(shardId10);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.removeAlias("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.numberOfShards(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_shards", throwable2, "index.version.upgraded_string");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.String str6 = shardFailure4.indexUUID;
        java.lang.String str7 = shardFailure4.indexUUID;
        java.lang.Throwable throwable8 = shardFailure4.cause;
        java.lang.Throwable throwable9 = shardFailure4.cause;
        java.lang.String str10 = shardFailure4.reason;
        java.lang.String str11 = shardFailure4.reason;
        java.lang.Throwable throwable12 = shardFailure4.cause;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.number_of_shards" + "'", str5, "index.number_of_shards");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index.version.upgraded_string" + "'", str6, "index.version.upgraded_string");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index.version.upgraded_string" + "'", str7, "index.version.upgraded_string");
        org.junit.Assert.assertNull(throwable8);
        org.junit.Assert.assertNull(throwable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.number_of_shards" + "'", str10, "index.number_of_shards");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index.number_of_shards" + "'", str11, "index.number_of_shards");
        org.junit.Assert.assertNull(throwable12);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout(timeValue9);
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, true, throwable18, writeResult19);
        org.elasticsearch.tasks.TaskId taskId21 = bulkShardRequest15.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task22 = bulkShardRequest10.createTask((long) (short) 100, "index.shadow_replicas", "index.version.created_string", taskId21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(taskId21);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        java.lang.Object obj3 = null;
        boolean boolean4 = indexMetaData0.equals(obj3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData36 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int37 = indexMetaData36.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings38 = indexMetaData36.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder35.settings(settings38);
        org.elasticsearch.transport.TransportService transportService40 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService41 = null;
        org.elasticsearch.indices.IndicesService indicesService42 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool43 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction44 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction45 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper46 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters47 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction49 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings38, transportService40, clusterService41, indicesService42, threadPool43, shardStateAction44, mappingUpdatedAction45, updateHelper46, actionFilters47, indexNameExpressionResolver48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(indexMetaData36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = indexMetaData0.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings2);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder4 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params5 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = settings2.toXContent(xContentBuilder4, params5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData36 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int37 = indexMetaData36.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings38 = indexMetaData36.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder35.settings(settings38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder39.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder39.putAlias(aliasMetaData41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(indexMetaData36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest1.setShardId(shardId10);
        long long12 = bulkShardRequest11.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bulkShardRequest11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.version((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfShards((int) (short) 100);
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
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom37 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder35.putCustom("hi!", custom37);
        int int39 = builder35.numberOfShards();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder35.putAlias(aliasMetaData40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(aliasMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfShards();
        org.elasticsearch.index.Index index17 = indexMetaData15.getMergeSourceIndex();
        int int18 = indexMetaData15.getNumberOfShards();
        boolean boolean20 = indexMetaData15.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap21 = indexMetaData15.getCustoms();
        org.elasticsearch.Version version22 = indexMetaData15.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData8.diff(indexMetaData15);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff24 = indexMetaData0.diff(indexMetaData8);
        org.elasticsearch.Version version25 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params27 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder28 = indexMetaData0.toXContent(xContentBuilder26, params27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertNotNull(indexMetaDataDiff24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(params27);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.number_of_shards", custom1);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.version.upgraded");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.primaryTerm(0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm((long) (byte) 10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.timeout(timeValue12);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.putAlias(aliasMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.creationDate((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.numberOfReplicas((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = builder7.primaryTerm((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.index("index.version.upgraded_string");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            refreshPolicy11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("current version [-1] is different than the one provided [0]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = bulkShardRequest17.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm((int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        boolean boolean4 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings2);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction14 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings2, transportService5, clusterService6, indicesService7, threadPool8, shardStateAction9, mappingUpdatedAction10, updateHelper11, actionFilters12, indexNameExpressionResolver13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.removeAlias("");
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
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
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNotNull(params4);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting0, (java.lang.CharSequence) "index.version.upgraded_string");
        org.elasticsearch.action.support.ToXContentToBytes toXContentToBytes3 = toXContentToBytesTuple2.v1();
        java.lang.CharSequence charSequence4 = toXContentToBytesTuple2.v2();
        org.junit.Assert.assertNotNull(intSetting0);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple2);
        org.junit.Assert.assertNotNull(toXContentToBytes3);
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "index.version.upgraded_string" + "'", charSequence4, "index.version.upgraded_string");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("index.blocks.write");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder11, params12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(params12);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("primary_terms");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [primary_terms]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData7.getSettings();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData7.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = indexMetaData7.getState();
        byte byte13 = state12.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder6.state(state12);
        byte byte15 = state12.id();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        int int8 = builder6.getRoutingNumShards();
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.settings(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.Index index9 = indexMetaData0.getMergeSourceIndex();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNull(index9);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str3 = versionType0.explainConflictForReads(10L, (long) 0);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) (byte) 1, (long) '#');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [10] is different than the one provided [0]" + "'", str3, "current version [10] is different than the one provided [0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest1.indicesOptions();
        bulkShardRequest1.primaryTerm(10L);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions7);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [100] is higher than the one provided [0]", custom1);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest1.setShardId(shardId10);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = bulkShardRequest11.validate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = bulkShardRequest11.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str5 = versionType1.explainConflictForWrites((long) 100, (long) 0, false);
        java.lang.String str8 = versionType1.explainConflictForReads((long) (byte) -1, 10L);
        boolean boolean12 = versionType1.isVersionConflictForWrites((long) (short) 0, (long) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType13 = org.elasticsearch.index.VersionType.fromString("current version [-1] is different than the one provided [0]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [-1] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str5, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [-1] is different than the one provided [10]" + "'", str8, "current version [-1] is different than the one provided [10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData7.getSettings();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData7.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = indexMetaData7.getState();
        byte byte13 = state12.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder6.state(state12);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = builder6.primaryTerm((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable6, writeResult7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest3.timeout(timeValue9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequest12.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean17 = bulkShardRequest16.getShouldPersistResult();
        java.lang.Throwable throwable19 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, true, throwable19, writeResult20);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest16.setShardId(shardId22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest23.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, false, (java.lang.Throwable) actionRequestValidationException24, writeResult25);
        org.elasticsearch.index.translog.Translog.Location location27 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult28 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12, location27, respondingWriteResult28, eSLogger29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(indicesOptions13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for id [2]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "current version [52] is different than the one provided [1]");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int8 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int12 = indexMetaData11.getNumberOfShards();
        org.elasticsearch.index.Index index13 = indexMetaData11.getMergeSourceIndex();
        int int14 = indexMetaData11.getNumberOfShards();
        boolean boolean16 = indexMetaData11.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap17 = indexMetaData11.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int19 = indexMetaData18.getNumberOfShards();
        org.elasticsearch.index.Index index20 = indexMetaData18.getMergeSourceIndex();
        int int21 = indexMetaData18.getNumberOfShards();
        boolean boolean23 = indexMetaData18.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap24 = indexMetaData18.getCustoms();
        org.elasticsearch.Version version25 = indexMetaData18.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff26 = indexMetaData11.diff(indexMetaData18);
        java.lang.String str27 = indexMetaData18.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple28 = org.elasticsearch.common.collect.Tuple.tuple(params10, (org.elasticsearch.common.io.stream.Writeable) indexMetaData18);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder29 = indexMetaData0.toXContent(xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(params10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(index20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(indexMetaDataDiff26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_na_" + "'", str27, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple28);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.requireFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = indexMetaData0.primaryTerm((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 2);
        org.junit.Assert.assertNotNull(versionType1);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(params5);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.index.Index index14 = indexMetaData12.getMergeSourceIndex();
        int int15 = indexMetaData12.getNumberOfShards();
        boolean boolean17 = indexMetaData12.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData12.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.Version version26 = indexMetaData19.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData12.diff(indexMetaData19);
        java.lang.String str28 = indexMetaData19.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple29 = org.elasticsearch.common.collect.Tuple.tuple(params11, (org.elasticsearch.common.io.stream.Writeable) indexMetaData19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = indexMetaData0.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_na_" + "'", str28, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple29);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder19.putMapping("current version [10] is different than the one provided [0]", "_na_");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        long long9 = indexMetaData0.getVersion();
        int int10 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.readDiffFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.version.minimum_compatible", custom3);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.primaryTerm((int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        bulkShardRequest0.remoteAddress(transportAddress2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + refreshPolicy1 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy1.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfShards();
        org.elasticsearch.index.Index index17 = indexMetaData15.getMergeSourceIndex();
        int int18 = indexMetaData15.getNumberOfShards();
        boolean boolean20 = indexMetaData15.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap21 = indexMetaData15.getCustoms();
        org.elasticsearch.Version version22 = indexMetaData15.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData8.diff(indexMetaData15);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff24 = indexMetaData0.diff(indexMetaData8);
        org.elasticsearch.common.io.stream.StreamInput streamInput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = indexMetaData8.readFrom(streamInput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertNotNull(indexMetaDataDiff24);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest13.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest13.readFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(actionRequest14);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest8.setParentTask("", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(writeConsistencyLevel11);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("active_allocations", custom1);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("current version [100] is different than the one provided [1]");
        // The following exception was thrown during execution in test generation
        try {
            long long9 = indexMetaData0.primaryTerm((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData10.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings12);
        long long14 = builder13.version();
        int int15 = builder13.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder13.setRoutingNumShards((int) (byte) 2);
        java.lang.Class<?> wildcardClass18 = builder13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest1.indicesOptions();
        bulkShardRequest1.primaryTerm(10L);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest1.setShardId(shardId11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest12.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType1.explainConflictForReads(10L, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType5 = org.elasticsearch.index.VersionType.fromString("index.blocks.write", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.blocks.write]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [10] is different than the one provided [0]" + "'", str4, "current version [10] is different than the one provided [0]");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.number_of_shards");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.number_of_shards]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
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
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(actionRequest4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData7.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        long long8 = builder7.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.index("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.settings(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = builder11.mapping("index.shared_filesystem");
        java.lang.String[] strArray31 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder11.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int37 = builder36.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder36.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom41 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder36.putCustom("index.creation_date_string", custom41);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state43 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder36.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder11.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder9.state(state43);
        org.elasticsearch.common.settings.Settings.Builder builder47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder46.settings(builder47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mappingMetaData13);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + state43 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state43.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        bulkShardRequest8.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("current version [2] is different than the one provided [35]");
        bulkShardRequest13.setParentTask("current version [1] is different than the one provided [35]", (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.setRefreshPolicy("current version [0] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [0] is different than the one provided [0]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequest3);
        org.junit.Assert.assertNull(actionRequest4);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout(timeValue9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest1.timeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bulkShardRequest1.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(timeValue11);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.numberOfReplicas((int) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.settings(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfShards();
        org.elasticsearch.index.Index index17 = indexMetaData15.getMergeSourceIndex();
        int int18 = indexMetaData15.getNumberOfShards();
        boolean boolean20 = indexMetaData15.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap21 = indexMetaData15.getCustoms();
        org.elasticsearch.Version version22 = indexMetaData15.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData8.diff(indexMetaData15);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff24 = indexMetaData0.diff(indexMetaData8);
        org.elasticsearch.Version version25 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData29 = builder27.mapping("index.shared_filesystem");
        java.lang.String[] strArray47 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder27.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder50.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder52.removeAllAliases();
        boolean boolean54 = indexMetaData0.equals((java.lang.Object) builder53);
        org.elasticsearch.common.xcontent.XContentParser xContentParser55 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData57 = indexMetaData0.fromXContent(xContentParser55, parseFieldMatcher56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertNotNull(indexMetaDataDiff24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNull(mappingMetaData29);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNotNull(params4);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str3 = versionType0.explainConflictForReads(10L, (long) 0);
        byte byte4 = versionType0.getValue();
        boolean boolean7 = versionType0.isVersionConflictForReads(100L, (long) (-1));
        java.lang.String str10 = versionType0.explainConflictForReads((-1L), (long) (byte) 1);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [10] is different than the one provided [0]" + "'", str3, "current version [10] is different than the one provided [0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [-1] is different than the one provided [1]" + "'", str10, "current version [-1] is different than the one provided [1]");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("delete");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [delete]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
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
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(actionRequest4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        int int8 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = indexMetaData0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray7 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet9 = java.util.EnumSet.noneOf(org.elasticsearch.index.shard.IndexShardState.class);
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet9, indexShardStateArray7);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, writeResult14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.WriteConsistencyLevel> indexShardStateSetTuple17 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.WriteConsistencyLevel>(indexShardStateSet9, writeConsistencyLevel16);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indexShardStateArray7);
        org.junit.Assert.assertNotNull(indexShardStateSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest18);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putMapping("index.number_of_replicas", "current version [52] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        int int4 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version8);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        java.lang.String str3 = versionType0.explainConflictForReads((long) (-1), 0L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType4.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str3, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType4);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting0, (java.lang.CharSequence) "index.version.upgraded_string");
        java.lang.String str3 = toXContentToBytesTuple2.toString();
        org.elasticsearch.action.support.ToXContentToBytes toXContentToBytes4 = toXContentToBytesTuple2.v1();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params6 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = toXContentToBytes4.toXContent(xContentBuilder5, params6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intSetting0);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str3, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
        org.junit.Assert.assertNotNull(toXContentToBytes4);
        org.junit.Assert.assertNotNull(params6);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("_na_", custom1);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.setShardId(shardId1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest2.indicesOptions();
        boolean boolean4 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest2.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest13.request();
        org.elasticsearch.action.ActionRequest actionRequest15 = bulkItemRequest13.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest13.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(actionRequest14);
        org.junit.Assert.assertNotNull(actionRequest15);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        long long25 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder1.numberOfShards((int) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder27.putMapping("index.blocks.read_only", "index.blocks.write");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.creation_date");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.creation_date]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId7 = bulkShardRequest2.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest2.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.index.translog.Translog.Location location11 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult12 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, location11, respondingWriteResult12, eSLogger13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "index.blocks.read_only");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        bulkShardRequest1.remoteAddress(transportAddress10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.setShardId(shardId12);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.primaryTerm(0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.creationDate((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.settings(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest1.getRefreshPolicy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params13 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int15 = indexMetaData14.getNumberOfShards();
        org.elasticsearch.index.Index index16 = indexMetaData14.getMergeSourceIndex();
        int int17 = indexMetaData14.getNumberOfShards();
        boolean boolean19 = indexMetaData14.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap20 = indexMetaData14.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int22 = indexMetaData21.getNumberOfShards();
        org.elasticsearch.index.Index index23 = indexMetaData21.getMergeSourceIndex();
        int int24 = indexMetaData21.getNumberOfShards();
        boolean boolean26 = indexMetaData21.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap27 = indexMetaData21.getCustoms();
        org.elasticsearch.Version version28 = indexMetaData21.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff29 = indexMetaData14.diff(indexMetaData21);
        java.lang.String str30 = indexMetaData21.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple31 = org.elasticsearch.common.collect.Tuple.tuple(params13, (org.elasticsearch.common.io.stream.Writeable) indexMetaData21);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = indexMetaData0.toXContent(xContentBuilder12, params13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(params13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(index16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap20);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(index23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(indexMetaDataDiff29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_na_" + "'", str30, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple31);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.removeAlias("index.blocks.read_only");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.putMapping("index.creation_date", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int6 = indexMetaData5.getNumberOfShards();
        org.elasticsearch.index.Index index7 = indexMetaData5.getMergeSourceIndex();
        int int8 = indexMetaData5.getNumberOfShards();
        boolean boolean9 = indexMetaData0.equals((java.lang.Object) int8);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet12 = indexMetaData0.activeAllocationIds((int) (byte) 0);
        long long13 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [-1] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [-1] is different than the one provided [1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest1.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest1.remoteAddress(transportAddress7);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, writeResult13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = bulkShardRequest11.getRefreshPolicy();
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray17 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet19 = java.util.EnumSet.noneOf(org.elasticsearch.index.shard.IndexShardState.class);
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet19, indexShardStateArray17);
        org.elasticsearch.action.update.UpdateHelper.Result result21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result21, (org.elasticsearch.action.ActionRequest) bulkShardRequest22, writeResult24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest22.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.WriteConsistencyLevel> indexShardStateSetTuple27 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.WriteConsistencyLevel>(indexShardStateSet19, writeConsistencyLevel26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest29.setRefreshPolicy("current version [0] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [0] is different than the one provided [0]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indexShardStateArray17);
        org.junit.Assert.assertNotNull(indexShardStateSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        java.lang.Throwable throwable20 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest17, true, throwable20, writeResult21);
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest17.getParentTask();
        bulkShardRequest15.setParentTask(taskId23);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int26 = indexMetaData25.getNumberOfShards();
        org.elasticsearch.index.Index index27 = indexMetaData25.getMergeSourceIndex();
        int int28 = indexMetaData25.getNumberOfShards();
        org.elasticsearch.Version version29 = indexMetaData25.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData25);
        int int31 = indexMetaData25.getNumberOfReplicas();
        long long32 = indexMetaData25.getVersion();
        java.lang.Class<?> wildcardClass33 = indexMetaData25.getClass();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.reflect.AnnotatedElement> taskIdTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, java.lang.reflect.AnnotatedElement>(taskId23, (java.lang.reflect.AnnotatedElement) wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(index27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
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
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.includeFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        long long8 = builder7.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.putCustom("index.priority", custom10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder7.putMapping("index.shadow_replicas", "current version [100] is higher than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData36 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int37 = indexMetaData36.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings38 = indexMetaData36.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder35.settings(settings38);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData40 = builder39.build();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap41 = indexMetaData40.getCustoms();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData40.writeTo(streamOutput42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(indexMetaData36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(indexMetaData40);
        org.junit.Assert.assertNotNull(strImmutableOpenMap41);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType5.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.index.Index index5 = indexMetaData0.getIndex();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNotNull(index5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = builder1.mapping("index.creation_date");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putMapping("current version [1] is higher than the one provided [-1]", "current version [1] is higher than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(mappingMetaData4);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.index("index.version.upgraded_string");
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, true, throwable15, writeResult16);
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest12.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = bulkShardRequest12.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest12.consistencyLevel();
        bulkShardRequest12.primaryTerm((long) (byte) 10);
        org.elasticsearch.common.unit.TimeValue timeValue23 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest12.timeout(timeValue23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest1.timeout(timeValue23);
        org.elasticsearch.common.io.stream.StreamInput streamInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest1.readFrom(streamInput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        int int5 = indexMetaData0.getNumberOfShards();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = indexMetaData0.getState();
        int int6 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest1.setShardId(shardId10);
        long long12 = bulkShardRequest1.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = bulkShardRequest1.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        long long8 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean11 = indexMetaData0.isSameUUID("current version [10] is different than the one provided [0]");
        int int12 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str3 = versionType0.explainConflictForReads(10L, (long) 0);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [10] is different than the one provided [0]" + "'", str3, "current version [10] is different than the one provided [0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        java.lang.String str8 = versionType5.explainConflictForReads((long) (byte) 2, (long) '#');
        java.lang.String str12 = versionType5.explainConflictForWrites((long) (byte) 1, (long) (byte) -1, true);
        byte byte13 = versionType5.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType5.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [2] is different than the one provided [35]" + "'", str8, "current version [2] is different than the one provided [35]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "current version [1] is higher than the one provided [-1]" + "'", str12, "current version [1] is higher than the one provided [-1]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 2 + "'", byte13 == (byte) 2);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [100] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [100] is different than the one provided [1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.Index index7 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData0.readDiffFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(index7);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        java.lang.String str4 = versionType1.explainConflictForReads((long) (-1), 0L);
        org.elasticsearch.index.VersionType versionType5 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType1.validateVersionForWrites((long) 10);
        boolean boolean9 = versionType1.validateVersionForWrites((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType10 = org.elasticsearch.index.VersionType.fromString("active_allocations", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [active_allocations]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str4, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest2.indicesOptions();
        bulkShardRequest2.primaryTerm(10L);
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest2.setShardId(shardId12);
        org.elasticsearch.index.translog.Translog.Location location14 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult15 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13, location14, respondingWriteResult15, eSLogger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = builder11.mapping("index.shared_filesystem");
        java.lang.String[] strArray31 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder11.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int37 = builder36.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder36.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom41 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder36.putCustom("index.creation_date_string", custom41);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state43 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder36.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder11.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder9.state(state43);
        int int47 = builder9.numberOfReplicas();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder9.putAlias(builder48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mappingMetaData13);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + state43 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state43.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.putAlias(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType0.isVersionConflictForReads(10L, (long) 10);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        java.lang.Throwable throwable13 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, true, throwable13, writeResult14);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest10.setShardId(shardId16);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest17.getRefreshPolicy();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, org.elasticsearch.action.IndicesRequest> versionTypeTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, org.elasticsearch.action.IndicesRequest>(versionType0, (org.elasticsearch.action.IndicesRequest) bulkShardRequest17);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("primary_terms");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [primary_terms]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = updateResult2.writeResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse5 = updateResult2.noopResult;
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertNull(writeResult4);
        org.junit.Assert.assertNull(updateResponse5);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("index.version.minimum_compatible", custom3);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = builder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.blocks.read]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData37 = builder1.mapping("current version [100] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder1.numberOfShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder1.numberOfShards((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = builder41.primaryTerm((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(mappingMetaData37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings2);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings2);
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings2);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction15 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings5, transportService6, clusterService7, indicesService8, threadPool9, shardStateAction10, mappingUpdatedAction11, updateHelper12, actionFilters13, indexNameExpressionResolver14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings5);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        int int9 = indexMetaData0.getNumberOfReplicas();
        long long10 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap11 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap12 = indexMetaData0.getMappings();
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.readDiffFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "index.number_of_shards");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.fromString("current version [1] is higher than the one provided [-1]", versionType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [1] is higher than the one provided [-1]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(versionType3);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        java.lang.String str20 = indexMetaData8.getIndexUUID();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData8.requireFilters();
        org.elasticsearch.common.xcontent.XContentParser xContentParser22 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = indexMetaData8.fromXContent(xContentParser22, parseFieldMatcher23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_na_" + "'", str20, "_na_");
        org.junit.Assert.assertNull(discoveryNodeFilters21);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest13.request();
        org.elasticsearch.action.ActionRequest actionRequest15 = bulkItemRequest13.request();
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest13.request();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest13.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNotNull(actionRequest14);
        org.junit.Assert.assertNotNull(actionRequest15);
        org.junit.Assert.assertNotNull(actionRequest16);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("indices:data/write/bulk[s]");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = builder1.primaryTerm((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder26.creationDate(100L);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder28.putMapping(mappingMetaData29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.blocks.read]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "index.creation_date_string");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "current version [2] is different than the one provided [35]");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.index("index.version.upgraded_string");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest10.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.settings(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int11 = builder10.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder10.putCustom("index.version.upgraded_string", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.numberOfReplicas(1);
        boolean boolean17 = indexMetaData0.equals((java.lang.Object) builder14);
        org.elasticsearch.common.io.stream.StreamInput streamInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData0.readDiffFrom(streamInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest13.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet12 = indexMetaData0.activeAllocationIds((int) (byte) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest11.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [index.version.upgraded_string]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.index.Index index17 = indexMetaData7.getMergeSourceIndex();
        org.elasticsearch.common.xcontent.XContentParser xContentParser18 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = indexMetaData7.fromXContent(xContentParser18, parseFieldMatcher19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
        org.junit.Assert.assertNull(index17);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest2.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(actionRequest4);
        org.junit.Assert.assertNull(actionRequest5);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout(timeValue9);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, true, throwable15, writeResult16);
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest12.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, writeResult22);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest20.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy25 = bulkShardRequest20.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest12.setRefreshPolicy(refreshPolicy25);
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean29 = bulkShardRequest28.getShouldPersistResult();
        java.lang.Throwable throwable31 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, true, throwable31, writeResult32);
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest28.getParentTask();
        bulkShardRequest26.setParentTask(taskId34);
        bulkShardRequest1.setParentTask(taskId34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray37 = bulkShardRequest1.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy25 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy25.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(taskId34);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bulkShardRequest10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        boolean boolean3 = updateResult2.failure();
        org.elasticsearch.action.update.UpdateResponse updateResponse4 = updateResult2.noopResult;
        boolean boolean5 = updateResult2.success();
        org.elasticsearch.action.update.UpdateResponse updateResponse6 = updateResult2.noopResult;
        java.lang.Throwable throwable7 = updateResult2.error;
        org.elasticsearch.action.update.UpdateResponse updateResponse8 = updateResult2.noopResult;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(updateResponse4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(updateResponse6);
        org.junit.Assert.assertNull(throwable7);
        org.junit.Assert.assertNull(updateResponse8);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(params7);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int12 = builder11.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder11.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder11.putCustom("index.creation_date_string", custom16);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state18 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder11.state(state18);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int21 = indexMetaData20.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings22 = indexMetaData20.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder11.settings(settings22);
        boolean boolean24 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings22);
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder9.settings(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder9.version((long) (short) 1);
        int int29 = builder28.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder28.putAlias(aliasMetaData30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + state18 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state18.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, true, throwable18, writeResult19);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest15.setShardId(shardId21);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = bulkShardRequest22.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, (java.lang.Throwable) actionRequestValidationException23, writeResult24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest11.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest11.setRefreshPolicy("current version [100] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [100] is different than the one provided [1]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNull(writeConsistencyLevel26);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
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
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.index.Index index14 = indexMetaData12.getMergeSourceIndex();
        int int15 = indexMetaData12.getNumberOfShards();
        boolean boolean17 = indexMetaData12.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData12.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.Version version26 = indexMetaData19.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData12.diff(indexMetaData19);
        java.lang.String str28 = indexMetaData19.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple29 = org.elasticsearch.common.collect.Tuple.tuple(params11, (org.elasticsearch.common.io.stream.Writeable) indexMetaData19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_na_" + "'", str28, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple29);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData37 = builder1.mapping("current version [100] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder1.numberOfShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder1.numberOfShards((int) (short) 1);
        long long42 = builder41.version();
        int int43 = builder41.getRoutingNumShards();
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(mappingMetaData37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.numberOfReplicas((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.primaryTerm((int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int8 = indexMetaData0.getRoutingNumShards();
        int int9 = indexMetaData0.getRoutingNumShards();
        long long10 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version11 = indexMetaData0.getMinimumCompatibleVersion();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(params13);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest1.indicesOptions();
        bulkShardRequest1.primaryTerm(10L);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest1.setShardId(shardId11);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest12.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest12.setRefreshPolicy("current version [100] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [100] is different than the one provided [0]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setShardId(shardId7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bulkShardRequest1.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String[] strArray20 = new java.lang.String[] { "index.number_of_shards", "index.number_of_replicas", "indices:data/write/bulk[s]", "current version [52] is different than the one provided [1]", "primary_terms", "index.version.created", "current version [1] is different than the one provided [35]", "current version [10] is higher than the one provided [-1]", "index.creation_date_string", "index.blocks.read", "index.auto_expand_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder7.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet21);
        int int24 = builder7.numberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("index.number_of_replicas");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.number_of_replicas]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.index.Index index17 = indexMetaData7.getMergeSourceIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
        org.junit.Assert.assertNull(index17);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
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
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        int int9 = indexMetaData0.getNumberOfReplicas();
        long long10 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest2.index("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest2.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest10);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromString("current version [100] is higher than the one provided [-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No state match for [current version [100] is higher than the one provided [-1]]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [-1] is different than the one provided [0]");
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
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [10] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [10] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        boolean boolean7 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings6);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
        org.apache.lucene.util.Version version9 = indexMetaData0.getMinimumCompatibleVersion();
        org.apache.lucene.util.Version version10 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int14 = indexMetaData13.getNumberOfShards();
        org.elasticsearch.index.Index index15 = indexMetaData13.getMergeSourceIndex();
        int int16 = indexMetaData13.getNumberOfShards();
        boolean boolean18 = indexMetaData13.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap19 = indexMetaData13.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int21 = indexMetaData20.getNumberOfShards();
        org.elasticsearch.index.Index index22 = indexMetaData20.getMergeSourceIndex();
        int int23 = indexMetaData20.getNumberOfShards();
        boolean boolean25 = indexMetaData20.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap26 = indexMetaData20.getCustoms();
        org.elasticsearch.Version version27 = indexMetaData20.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff28 = indexMetaData13.diff(indexMetaData20);
        java.lang.String str29 = indexMetaData20.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple30 = org.elasticsearch.common.collect.Tuple.tuple(params12, (org.elasticsearch.common.io.stream.Writeable) indexMetaData20);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder11, params12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertNull(version10);
        org.junit.Assert.assertNotNull(params12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(index15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap26);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(indexMetaDataDiff28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_na_" + "'", str29, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple30);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.setShardId(shardId8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest2.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest2.setRefreshPolicy("current version [-1] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [-1] is different than the one provided [1]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(indicesOptions11);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [52] is different than the one provided [1]", custom1);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        long long8 = builder7.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.index("index.blocks.read");
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.putAlias(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) ' ', (long) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) '#');
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(params9);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        boolean boolean3 = updateResult2.failure();
        org.elasticsearch.action.update.UpdateResponse updateResponse4 = updateResult2.noopResult;
        boolean boolean5 = updateResult2.success();
        org.elasticsearch.action.update.UpdateResponse updateResponse6 = updateResult2.noopResult;
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, true, throwable11, writeResult12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.timeout(timeValue14);
        org.elasticsearch.common.unit.TimeValue timeValue16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest8.timeout(timeValue16);
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        java.lang.Throwable throwable22 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, true, throwable22, writeResult23);
        org.elasticsearch.index.shard.ShardId shardId25 = bulkShardRequest19.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean28 = bulkShardRequest27.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, writeResult29);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = bulkShardRequest27.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy32 = bulkShardRequest27.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest19.setRefreshPolicy(refreshPolicy32);
        org.elasticsearch.action.update.UpdateHelper.Result result34 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean36 = bulkShardRequest35.getShouldPersistResult();
        java.lang.Throwable throwable38 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult39 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult40 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result34, (org.elasticsearch.action.ActionRequest) bulkShardRequest35, true, throwable38, writeResult39);
        org.elasticsearch.tasks.TaskId taskId41 = bulkShardRequest35.getParentTask();
        bulkShardRequest33.setParentTask(taskId41);
        bulkShardRequest8.setParentTask(taskId41);
        org.elasticsearch.index.shard.ShardId shardId44 = bulkShardRequest8.shardId();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult, org.elasticsearch.action.IndicesRequest> updateResultTuple45 = org.elasticsearch.common.collect.Tuple.tuple(updateResult2, (org.elasticsearch.action.IndicesRequest) bulkShardRequest8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray46 = bulkShardRequest8.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(updateResponse4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(updateResponse6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shardId25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy32 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy32.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertNull(shardId44);
        org.junit.Assert.assertNotNull(updateResultTuple45);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings2);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction13 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings2, transportService4, clusterService5, indicesService6, threadPool7, shardStateAction8, mappingUpdatedAction9, updateHelper10, actionFilters11, indexNameExpressionResolver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap0;
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.index.translog.Translog.Location location13 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult14 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11, location13, respondingWriteResult14, eSLogger15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        long long2 = builder1.version();
        org.elasticsearch.common.settings.Settings.Builder builder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.settings(builder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.setRoutingNumShards((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = builder6.numberOfReplicas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("current version [10] is higher than the one provided [-1]", custom8);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.putAlias(aliasMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.timeout(timeValue9);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, writeResult14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest12.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest10.setRefreshPolicy(refreshPolicy17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = bulkShardRequest10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest18);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = bulkShardRequest1.validate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest1.index("state-");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest1.setRefreshPolicy("index.version.minimum_compatible");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [index.version.minimum_compatible].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap19 = indexMetaData8.getMappings();
        int int20 = indexMetaData8.getTotalNumberOfShards();
        org.elasticsearch.common.xcontent.XContentParser xContentParser21 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = indexMetaData8.fromXContent(xContentParser21, parseFieldMatcher22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        long long8 = builder7.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.putCustom("index.priority", custom10);
        java.lang.String str12 = builder7.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder7.index("index.version.created_string");
        int int15 = builder7.numberOfShards();
        long long16 = builder7.version();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        bulkShardRequest8.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("current version [2] is different than the one provided [35]");
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest8.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest8.timeout("index.shadow_replicas");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse [index.shadow_replicas]");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(indicesOptions14);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str5 = versionType1.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        java.lang.String str9 = versionType6.explainConflictForReads((long) (byte) 2, (long) '#');
        java.lang.String str13 = versionType6.explainConflictForWrites((long) (byte) 1, (long) (byte) -1, true);
        boolean boolean15 = versionType6.validateVersionForReads((long) (-1));
        boolean boolean19 = versionType6.isVersionConflictForWrites((long) (byte) 1, 1L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType20 = org.elasticsearch.index.VersionType.fromString("index.version.upgraded", versionType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [index.version.upgraded]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str5, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [2] is different than the one provided [35]" + "'", str9, "current version [2] is different than the one provided [35]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "current version [1] is higher than the one provided [-1]" + "'", str13, "current version [1] is higher than the one provided [-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) ' ', (long) 0);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) 'a');
        long long9 = versionType0.updateVersion((long) (short) 0, 0L);
        java.lang.String str13 = versionType0.explainConflictForWrites(10L, (long) (short) -1, true);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "current version [10] is higher than the one provided [-1]" + "'", str13, "current version [10] is higher than the one provided [-1]");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = indexMetaData0.primaryTerm((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version8);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.excludeFilters();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas(1);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest1.timeout("current version [-1] is different than the one provided [10]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [-1] is different than the one provided [10]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.util.Set<java.lang.String> strSet17 = null; // flaky: indexMetaData7.activeAllocationIds((int) 'a');
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params19 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData7, xContentBuilder18, params19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNotNull(params19);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom28 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder24.putCustom("update", custom28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.removeAlias("current version [100] is different than the one provided [0]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData32 = builder29.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest1.setShardId(shardId16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.readDiffFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest2.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = indexMetaData0.toXContent(xContentBuilder11, params12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNotNull(params12);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.numberOfReplicas(1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder5.putMapping("index.priority", "current version [52] is different than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest18.index("index.version.created_string");
        org.elasticsearch.tasks.TaskId taskId21 = bulkShardRequest20.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task22 = bulkShardRequest11.createTask((long) 0, "current version [52] is different than the one provided [1]", "index.priority", taskId21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNull(timeValue12);
        org.junit.Assert.assertNull(timeValue14);
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertNotNull(taskId21);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.index.Index index12 = indexMetaData10.getMergeSourceIndex();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.diff(indexMetaData10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData10.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder4.mapping("index.shared_filesystem");
        java.lang.String[] strArray24 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder4.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int30 = builder29.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder29.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom34 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder29.putCustom("index.creation_date_string", custom34);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder29.state(state36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder4.state(state36);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData39 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int40 = indexMetaData39.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings41 = indexMetaData39.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder38.settings(settings41);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder1.settings(settings41);
        boolean boolean44 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings41);
        boolean boolean45 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(indexMetaData39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int4 = indexMetaData3.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData3.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData3.excludeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.diff(indexMetaData3);
        int int8 = indexMetaData3.getNumberOfShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int12 = indexMetaData11.getNumberOfShards();
        org.elasticsearch.index.Index index13 = indexMetaData11.getMergeSourceIndex();
        int int14 = indexMetaData11.getNumberOfShards();
        boolean boolean16 = indexMetaData11.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap17 = indexMetaData11.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int19 = indexMetaData18.getNumberOfShards();
        org.elasticsearch.index.Index index20 = indexMetaData18.getMergeSourceIndex();
        int int21 = indexMetaData18.getNumberOfShards();
        boolean boolean23 = indexMetaData18.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap24 = indexMetaData18.getCustoms();
        org.elasticsearch.Version version25 = indexMetaData18.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff26 = indexMetaData11.diff(indexMetaData18);
        java.lang.String str27 = indexMetaData18.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple28 = org.elasticsearch.common.collect.Tuple.tuple(params10, (org.elasticsearch.common.io.stream.Writeable) indexMetaData18);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData3, xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(indexMetaDataDiff7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(params10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(index20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap24);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(indexMetaDataDiff26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_na_" + "'", str27, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple28);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [100] is higher than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("current version [-1] is different than the one provided [10]");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [current version [-1] is different than the one provided [10]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData7.getSettings();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData7.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = indexMetaData7.getState();
        byte byte13 = state12.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder6.state(state12);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int17 = indexMetaData16.getNumberOfShards();
        org.elasticsearch.index.Index index18 = indexMetaData16.getMergeSourceIndex();
        int int19 = indexMetaData16.getNumberOfShards();
        boolean boolean21 = indexMetaData16.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap22 = indexMetaData16.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData16);
        java.lang.String[] strArray36 = new java.lang.String[] { "index.number_of_shards", "index.number_of_replicas", "indices:data/write/bulk[s]", "current version [52] is different than the one provided [1]", "primary_terms", "index.version.created", "current version [1] is different than the one provided [35]", "current version [10] is higher than the one provided [-1]", "index.creation_date_string", "index.blocks.read", "index.auto_expand_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder23.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder14.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder14.putMapping(mappingMetaData41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(index18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap22);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = builder6.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.setShardId(shardId1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest2.index("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, true, throwable10, writeResult11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest7.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest7.index("index.version.upgraded_string");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest5.setRefreshPolicy(refreshPolicy17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest18.setRefreshPolicy("current version [10] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [10] is different than the one provided [0]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest18);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = bulkShardRequest8.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest8.shardId();
        bulkShardRequest8.setParentTask("index.data_path", (long) (short) 0);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest8.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(shardId10);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "_na_");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData37 = builder1.mapping("current version [100] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder1.numberOfShards(10);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder1.putAlias(builder40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(mappingMetaData37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.putCustom("state-", custom7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.numberOfReplicas(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params7 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfShards();
        org.elasticsearch.index.Index index17 = indexMetaData15.getMergeSourceIndex();
        int int18 = indexMetaData15.getNumberOfShards();
        boolean boolean20 = indexMetaData15.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap21 = indexMetaData15.getCustoms();
        org.elasticsearch.Version version22 = indexMetaData15.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData8.diff(indexMetaData15);
        java.lang.String str24 = indexMetaData15.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple25 = org.elasticsearch.common.collect.Tuple.tuple(params7, (org.elasticsearch.common.io.stream.Writeable) indexMetaData15);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = indexMetaData0.toXContent(xContentBuilder6, params7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNotNull(params7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_na_" + "'", str24, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple25);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) ' ', (long) 0);
        boolean boolean7 = versionType1.isVersionConflictForReads((long) (byte) 0, (long) 'a');
        long long10 = versionType1.updateVersion((long) (short) 0, 0L);
        boolean boolean13 = versionType1.isVersionConflictForReads((long) 1, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType14 = org.elasticsearch.index.VersionType.fromString("current version [0] is different than the one provided [0]", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [0] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData10.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings12);
        boolean boolean14 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings12);
        boolean boolean15 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings12);
        boolean boolean16 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings12);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params18 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int27 = indexMetaData26.getNumberOfShards();
        org.elasticsearch.index.Index index28 = indexMetaData26.getMergeSourceIndex();
        int int29 = indexMetaData26.getNumberOfShards();
        boolean boolean31 = indexMetaData26.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap32 = indexMetaData26.getCustoms();
        org.elasticsearch.Version version33 = indexMetaData26.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff34 = indexMetaData19.diff(indexMetaData26);
        java.lang.String str35 = indexMetaData26.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple36 = org.elasticsearch.common.collect.Tuple.tuple(params18, (org.elasticsearch.common.io.stream.Writeable) indexMetaData26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = settings12.toXContent(xContentBuilder17, params18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(params18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(indexMetaDataDiff34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_na_" + "'", str35, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple36);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.setShardId(shardId8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest2.setRefreshPolicy("current version [-1] is different than the one provided [10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [current version [-1] is different than the one provided [10]].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType0.isVersionConflictForReads(10L, (long) 10);
        long long11 = versionType0.updateVersion((long) '4', (long) (byte) 100);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
        java.lang.String str9 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.index.Index index14 = indexMetaData12.getMergeSourceIndex();
        int int15 = indexMetaData12.getNumberOfShards();
        boolean boolean17 = indexMetaData12.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData12.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.Version version26 = indexMetaData19.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData12.diff(indexMetaData19);
        java.lang.String str28 = indexMetaData19.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple29 = org.elasticsearch.common.collect.Tuple.tuple(params11, (org.elasticsearch.common.io.stream.Writeable) indexMetaData19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_na_" + "'", str9, "_na_");
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_na_" + "'", str28, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple29);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        boolean boolean6 = indexMetaData1.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int9 = indexMetaData8.getNumberOfShards();
        org.elasticsearch.index.Index index10 = indexMetaData8.getMergeSourceIndex();
        int int11 = indexMetaData8.getNumberOfShards();
        boolean boolean13 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap14 = indexMetaData8.getCustoms();
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData1.diff(indexMetaData8);
        java.lang.String str17 = indexMetaData8.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(params0, (org.elasticsearch.common.io.stream.Writeable) indexMetaData8);
        org.apache.lucene.util.Version version19 = indexMetaData8.getMinimumCompatibleVersion();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int23 = indexMetaData22.getNumberOfShards();
        org.elasticsearch.index.Index index24 = indexMetaData22.getMergeSourceIndex();
        int int25 = indexMetaData22.getNumberOfShards();
        boolean boolean27 = indexMetaData22.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap28 = indexMetaData22.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int30 = indexMetaData29.getNumberOfShards();
        org.elasticsearch.index.Index index31 = indexMetaData29.getMergeSourceIndex();
        int int32 = indexMetaData29.getNumberOfShards();
        boolean boolean34 = indexMetaData29.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap35 = indexMetaData29.getCustoms();
        org.elasticsearch.Version version36 = indexMetaData29.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff37 = indexMetaData22.diff(indexMetaData29);
        java.lang.String str38 = indexMetaData29.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple39 = org.elasticsearch.common.collect.Tuple.tuple(params21, (org.elasticsearch.common.io.stream.Writeable) indexMetaData29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder40 = indexMetaData8.toXContent(xContentBuilder20, params21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple18);
        org.junit.Assert.assertNull(version19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(index24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap28);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(index31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap35);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(indexMetaDataDiff37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_na_" + "'", str38, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple39);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "active_allocations");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.putCustom("index.creation_date_string", custom6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData10.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings12);
        int int14 = builder13.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.putAlias(aliasMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        int int9 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = indexMetaData0.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData7.getSettings();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData7.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = indexMetaData7.getState();
        byte byte13 = state12.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder6.state(state12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder6.putCustom("index.creation_date_string", custom16);
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder6.settings(builder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        int int36 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int38 = indexMetaData37.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings39 = indexMetaData37.getSettings();
        boolean boolean40 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings39);
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings39);
        org.elasticsearch.common.settings.Settings settings42 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder1.settings(settings42);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData44 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder1.putMapping("index.blocks.read_only", "hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(indexMetaData44);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.readDiffFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = updateResult2.writeResult;
        org.elasticsearch.action.ActionRequest actionRequest5 = updateResult2.actionRequest;
        java.lang.Throwable throwable6 = updateResult2.error;
        boolean boolean7 = updateResult2.failure();
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertNull(writeResult4);
        org.junit.Assert.assertNull(actionRequest5);
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        java.lang.Class<?> wildcardClass5 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting0, (java.lang.CharSequence) "index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder4.mapping("index.shared_filesystem");
        boolean boolean7 = toXContentToBytesTuple2.equals((java.lang.Object) mappingMetaData6);
        java.lang.String str8 = toXContentToBytesTuple2.toString();
        org.junit.Assert.assertNotNull(intSetting0);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple2);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str8, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = indexMetaData7.primaryTerm((int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.setShardId(shardId1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest2.index("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, true, throwable10, writeResult11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest7.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest7.index("index.version.upgraded_string");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest5.setRefreshPolicy(refreshPolicy17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest18.timeout("index.version.upgraded_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.upgraded_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest18);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        org.elasticsearch.index.Index index6 = indexMetaData0.getMergeSourceIndex();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((-1));
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData0.readDiffFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder26.removeAllAliases();
        org.elasticsearch.common.settings.Settings.Builder builder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.settings(builder28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        byte byte37 = state36.id();
        byte byte38 = state36.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder1.state(state36);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder39.primaryTerm((int) 'a', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = bulkShardRequest10.getRefreshPolicy();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest10.index("current version [100] is higher than the one provided [-1]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bulkShardRequest14.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        boolean boolean7 = indexMetaData0.isSameUUID("hi!");
        boolean boolean9 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, true, throwable14, writeResult15);
        org.elasticsearch.index.shard.ShardId shardId17 = bulkShardRequest11.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest11.setShardId(shardId20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest21.validate();
        boolean boolean23 = indexMetaData0.equals((java.lang.Object) actionRequestValidationException22);
        java.util.Set<java.lang.String> strSet25 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 10);
        org.elasticsearch.common.io.stream.StreamInput streamInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = indexMetaData0.readFrom(streamInput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertNotNull(indicesOptions18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strSet25);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        int int9 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.index.Index index14 = indexMetaData12.getMergeSourceIndex();
        int int15 = indexMetaData12.getNumberOfShards();
        boolean boolean17 = indexMetaData12.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData12.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int20 = indexMetaData19.getNumberOfShards();
        org.elasticsearch.index.Index index21 = indexMetaData19.getMergeSourceIndex();
        int int22 = indexMetaData19.getNumberOfShards();
        boolean boolean24 = indexMetaData19.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData19.getCustoms();
        org.elasticsearch.Version version26 = indexMetaData19.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData12.diff(indexMetaData19);
        java.lang.String str28 = indexMetaData19.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple29 = org.elasticsearch.common.collect.Tuple.tuple(params11, (org.elasticsearch.common.io.stream.Writeable) indexMetaData19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = indexMetaData0.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_na_" + "'", str28, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple29);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        int int9 = indexMetaData0.getRoutingNumShards();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        int int7 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params9 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.index.Index index12 = indexMetaData10.getMergeSourceIndex();
        int int13 = indexMetaData10.getNumberOfShards();
        boolean boolean15 = indexMetaData10.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData10.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int18 = indexMetaData17.getNumberOfShards();
        org.elasticsearch.index.Index index19 = indexMetaData17.getMergeSourceIndex();
        int int20 = indexMetaData17.getNumberOfShards();
        boolean boolean22 = indexMetaData17.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap23 = indexMetaData17.getCustoms();
        org.elasticsearch.Version version24 = indexMetaData17.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff25 = indexMetaData10.diff(indexMetaData17);
        java.lang.String str26 = indexMetaData17.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple27 = org.elasticsearch.common.collect.Tuple.tuple(params9, (org.elasticsearch.common.io.stream.Writeable) indexMetaData17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder28 = indexMetaData0.toXContent(xContentBuilder8, params9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(params9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(indexMetaDataDiff25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_na_" + "'", str26, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple27);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.Index index7 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexMetaData0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(index7);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [100] is different than the one provided [0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [100] is different than the one provided [0]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.timeout("index.version.created_string");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [index.version.created_string] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(writeConsistencyLevel11);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result12, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, true, throwable16, writeResult17);
        org.elasticsearch.index.shard.ShardId shardId19 = bulkShardRequest13.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions20 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest13.timeout(timeValue21);
        org.elasticsearch.index.shard.ShardId shardId23 = bulkShardRequest13.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, true, throwable29, writeResult30);
        org.elasticsearch.index.shard.ShardId shardId32 = bulkShardRequest26.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = bulkShardRequest26.consistencyLevel();
        bulkShardRequest26.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException37 = bulkShardRequest26.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult38 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult39 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, true, (java.lang.Throwable) actionRequestValidationException37, writeResult38);
        org.elasticsearch.action.update.UpdateHelper.Result result40 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean42 = bulkShardRequest41.getShouldPersistResult();
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult45 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult46 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result40, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, true, throwable44, writeResult45);
        org.elasticsearch.index.shard.ShardId shardId47 = bulkShardRequest41.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions48 = bulkShardRequest41.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest41.index("index.version.upgraded_string");
        org.elasticsearch.action.update.UpdateHelper.Result result51 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean53 = bulkShardRequest52.getShouldPersistResult();
        java.lang.Throwable throwable55 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult56 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult57 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result51, (org.elasticsearch.action.ActionRequest) bulkShardRequest52, true, throwable55, writeResult56);
        org.elasticsearch.index.shard.ShardId shardId58 = bulkShardRequest52.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions59 = bulkShardRequest52.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel60 = bulkShardRequest52.consistencyLevel();
        bulkShardRequest52.primaryTerm((long) (byte) 10);
        org.elasticsearch.common.unit.TimeValue timeValue63 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest64 = bulkShardRequest52.timeout(timeValue63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = bulkShardRequest41.timeout(timeValue63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest13.timeout(timeValue63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest67 = bulkShardRequest10.timeout(timeValue63);
        org.elasticsearch.common.io.stream.StreamInput streamInput68 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest67.readFrom(streamInput68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(shardId19);
        org.junit.Assert.assertNotNull(indicesOptions20);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNull(shardId23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shardId32);
        org.junit.Assert.assertNotNull(indicesOptions33);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(shardId47);
        org.junit.Assert.assertNotNull(indicesOptions48);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(shardId58);
        org.junit.Assert.assertNotNull(indicesOptions59);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel60 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel60.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertNotNull(bulkShardRequest64);
        org.junit.Assert.assertNotNull(bulkShardRequest65);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNotNull(bulkShardRequest67);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.index.Index index9 = indexMetaData7.getMergeSourceIndex();
        int int10 = indexMetaData7.getNumberOfShards();
        boolean boolean12 = indexMetaData7.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData7.getCustoms();
        org.elasticsearch.Version version14 = indexMetaData7.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str16 = indexMetaData7.getIndexUUID();
        org.elasticsearch.index.Index index17 = indexMetaData7.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData7.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData7.requireFilters();
        int int20 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int24 = indexMetaData23.getNumberOfShards();
        org.elasticsearch.index.Index index25 = indexMetaData23.getMergeSourceIndex();
        int int26 = indexMetaData23.getNumberOfShards();
        boolean boolean28 = indexMetaData23.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap29 = indexMetaData23.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int31 = indexMetaData30.getNumberOfShards();
        org.elasticsearch.index.Index index32 = indexMetaData30.getMergeSourceIndex();
        int int33 = indexMetaData30.getNumberOfShards();
        boolean boolean35 = indexMetaData30.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap36 = indexMetaData30.getCustoms();
        org.elasticsearch.Version version37 = indexMetaData30.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff38 = indexMetaData23.diff(indexMetaData30);
        java.lang.String str39 = indexMetaData30.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple40 = org.elasticsearch.common.collect.Tuple.tuple(params22, (org.elasticsearch.common.io.stream.Writeable) indexMetaData30);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder41 = indexMetaData7.toXContent(xContentBuilder21, params22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNull(discoveryNodeFilters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNotNull(indexMetaData23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(index25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap29);
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(index32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap36);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(indexMetaDataDiff38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "_na_" + "'", str39, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple40);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state28 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder24.state(state28);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = builder29.primaryTerm((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + state28 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state28.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        int int9 = bulkItemRequest8.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest8.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(params8);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        long long25 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder1.numberOfShards((int) (byte) 2);
        long long28 = builder27.version();
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData1.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData1.excludeFilters();
        long long5 = indexMetaData1.getVersion();
        int int6 = indexMetaData1.getTotalNumberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet8 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(0, indexMetaData1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long5 = indexMetaData0.getVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.auto_expand_replicas");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(1, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        org.elasticsearch.action.ActionRequest actionRequest4 = null; // flaky: bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = null; // flaky: bulkItemRequest2.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(actionRequest4);
        org.junit.Assert.assertNull(actionRequest5);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap9 = indexMetaData0.getAliases();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.shared_filesystem");
        java.lang.String[] strArray21 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int27 = builder26.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder26.putCustom("index.creation_date_string", custom31);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.state(state33);
        int int36 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int38 = indexMetaData37.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings39 = indexMetaData37.getSettings();
        boolean boolean40 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings39);
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings39);
        org.elasticsearch.common.settings.Settings settings42 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder1.settings(settings42);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData44 = builder1.build();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder1.putMapping(mappingMetaData45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(indexMetaData44);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest1.timeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = bulkShardRequest1.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue10);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.Version version5 = indexMetaData1.getCreationVersion();
        int int6 = indexMetaData1.getNumberOfShards();
        boolean boolean8 = indexMetaData1.isSameUUID("current version [100] is different than the one provided [1]");
        java.lang.String str9 = indexMetaData1.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap10 = indexMetaData1.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet13 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(10, indexMetaData1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (1) must be greater than the shard id: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_na_" + "'", str9, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + refreshPolicy1 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy1.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(transportAddress4);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
        org.apache.lucene.util.Version version9 = indexMetaData0.getMinimumCompatibleVersion();
        org.apache.lucene.util.Version version10 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.readDiffFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertNull(version10);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.putCustom("state-", custom7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.primaryTerm(10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int10 = indexMetaData0.getNumberOfShards();
        int int11 = indexMetaData0.getNumberOfShards();
        int int12 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.diff(indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest1.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = bulkShardRequest1.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }
}
