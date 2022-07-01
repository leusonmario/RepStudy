import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest4.remoteAddress();
        boolean boolean6 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, writeResult7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = updateResult8.result;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(result9);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout(timeValue2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId6 = null;
        bulkShardRequest0.setParentTask(taskId6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.setShardId(shardId8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest10.primaryTerm((long) (byte) 1);
        long long13 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel14);
        bulkShardRequest15.primaryTerm(0L);
        org.elasticsearch.common.unit.TimeValue timeValue18 = bulkShardRequest15.timeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(timeValue18);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        long long7 = indexMetaData0.getVersion();
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mapping("current version [-1] is different than the one provided [52]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        java.util.Set<java.lang.String> strSet7 = indexMetaData2.activeAllocationIds(0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData2.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData9.diff(indexMetaData11);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData11.mappingOrDefault("index.version.created_string");
        boolean boolean17 = indexMetaData11.equals((java.lang.Object) (byte) -1);
        int int18 = indexMetaData11.getNumberOfReplicas();
        long long19 = indexMetaData11.getCreationDate();
        int int20 = indexMetaData11.getTotalNumberOfShards();
        org.apache.lucene.util.Version version21 = indexMetaData11.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = indexMetaData11.getState();
        long long23 = indexMetaData11.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap24 = indexMetaData11.getActiveAllocationIds();
        boolean boolean25 = indexMetaData2.equals((java.lang.Object) indexMetaData11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData11);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertNull(mappingMetaData15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(version21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap1 = indexMetaData0.getAliases();
        long long2 = indexMetaData0.getCreationDate();
        org.elasticsearch.index.Index index3 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAllAliases();
        int int6 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean9 = indexMetaData7.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData7.getInitialRecoveryFilters();
        long long13 = indexMetaData7.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state14 = indexMetaData7.getState();
        org.elasticsearch.common.settings.Settings settings15 = indexMetaData7.getSettings();
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings15);
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock17 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_READ_ONLY_BLOCK;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Settings, org.elasticsearch.cluster.block.ClusterBlock> settingsTuple18 = org.elasticsearch.common.collect.Tuple.tuple(settings16, clusterBlock17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder3.settings(settings16);
        boolean boolean20 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings16);
        org.elasticsearch.transport.TransportService transportService21 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService22 = null;
        org.elasticsearch.indices.IndicesService indicesService23 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool24 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction25 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction26 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper27 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters28 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction30 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings16, transportService21, clusterService22, indicesService23, threadPool24, shardStateAction25, mappingUpdatedAction26, updateHelper27, actionFilters28, indexNameExpressionResolver29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + state14 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state14.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(clusterBlock17);
        org.junit.Assert.assertNotNull(settingsTuple18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [100] is higher than the one provided [-1]");
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.removeAlias("current version [-1] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder5.build();
        boolean boolean10 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.Version version11 = indexMetaData8.getCreationVersion();
        int int12 = indexMetaData8.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData8.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData8.excludeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.apache.lucene.util.Version version3 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.index("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version(100L);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("current version [1] is higher or equal to the one provided [-1]");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap11 = indexMetaData6.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData12.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData6.diff(indexMetaData12);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) indexMetaData12);
        int int16 = indexMetaData0.getTotalNumberOfShards();
        int int17 = indexMetaData0.getTotalNumberOfShards();
        java.lang.String str18 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean22 = indexMetaData20.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData20);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters24 = indexMetaData20.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap25 = indexMetaData20.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters27 = indexMetaData26.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff28 = indexMetaData20.diff(indexMetaData26);
        long long29 = indexMetaData20.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap30 = indexMetaData20.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData32 = indexMetaData20.mapping("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean35 = indexMetaData33.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData33);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters37 = indexMetaData33.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder38.removeAlias("current version [-1] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData41 = builder38.build();
        boolean boolean43 = indexMetaData41.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData41);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData46 = indexMetaData41.mapping("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters47 = indexMetaData41.requireFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff48 = indexMetaData20.diff(indexMetaData41);
        long long49 = indexMetaData20.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData20);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff51 = indexMetaData0.diff(indexMetaData20);
        boolean boolean53 = indexMetaData0.isSameUUID("current version [0] is different than the one provided [107]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_na_" + "'", str18, "_na_");
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(discoveryNodeFilters24);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertNull(discoveryNodeFilters27);
        org.junit.Assert.assertNotNull(indexMetaDataDiff28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap30);
        org.junit.Assert.assertNull(mappingMetaData32);
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(discoveryNodeFilters37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(indexMetaData41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(mappingMetaData46);
        org.junit.Assert.assertNull(discoveryNodeFilters47);
        org.junit.Assert.assertNotNull(indexMetaDataDiff48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(indexMetaDataDiff51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        java.lang.Throwable throwable3 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, actionRequest1, true, throwable3, writeResult4);
        boolean boolean6 = updateResult5.success();
        boolean boolean7 = updateResult5.success();
        boolean boolean8 = updateResult5.retry;
        boolean boolean9 = updateResult5.failure();
        org.elasticsearch.action.update.UpdateResponse updateResponse10 = updateResult5.noopResult;
        org.elasticsearch.action.update.UpdateHelper.Result result11 = updateResult5.result;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = updateResult5.writeResult;
        org.elasticsearch.action.update.UpdateHelper.Result result13 = updateResult5.result;
        org.elasticsearch.action.update.UpdateHelper.Result result14 = updateResult5.result;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(updateResponse10);
        org.junit.Assert.assertNull(result11);
        org.junit.Assert.assertNull(writeResult12);
        org.junit.Assert.assertNull(result13);
        org.junit.Assert.assertNull(result14);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.index.Index index7 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mappingOrDefault("index.creation_date_string");
        int int10 = indexMetaData0.getNumberOfReplicas();
        boolean boolean12 = indexMetaData0.isSameUUID("current version [10] is different than the one provided [52]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version14 = indexMetaData13.getMinimumCompatibleVersion();
        int int15 = indexMetaData13.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData13.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData13);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff18 = indexMetaData0.diff(indexMetaData13);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData13.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertNull(version14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertNotNull(indexMetaDataDiff18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.timeout(timeValue3);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, writeResult5);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest7 = updateResult6.request();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequestReplicationRequest7.getParentTask();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest7);
        org.junit.Assert.assertNotNull(taskId8);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long6 = bulkShardRequest5.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest8.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        bulkShardRequest8.remoteAddress(transportAddress11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest15.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long20 = bulkShardRequest19.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest19.timeout(timeValue21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = bulkShardRequest22.indicesOptions();
        bulkShardRequest22.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest22.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest15.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long31 = bulkShardRequest30.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest30.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = bulkShardRequest33.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId35 = bulkShardRequest33.getParentTask();
        long long36 = bulkShardRequest33.seqNo();
        boolean boolean37 = bulkShardRequest33.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId38 = bulkShardRequest33.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException39 = bulkShardRequest33.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult40 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult41 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, false, (java.lang.Throwable) actionRequestValidationException39, writeResult40);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure43 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [-1] is different than the one provided [1]", (java.lang.Throwable) actionRequestValidationException39, "index.data_path");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure45 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException39, "index.uuid");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long47 = bulkShardRequest46.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel48 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = bulkShardRequest46.consistencyLevel(writeConsistencyLevel48);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue51 = bulkShardRequest50.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest46.timeout(timeValue51);
        boolean boolean53 = bulkShardRequest46.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions54 = bulkShardRequest46.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException55 = bulkShardRequest46.validate();
        bulkShardRequest46.setParentTask("index.version.created_string", 101L);
        java.lang.String str59 = bulkShardRequest46.index();
        org.elasticsearch.index.shard.ShardId shardId60 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest61 = bulkShardRequest46.setShardId(shardId60);
        bulkShardRequest61.seqNo((long) 'a');
        boolean boolean64 = bulkShardRequest61.getShouldPersistResult();
        bulkShardRequest61.seqNo((long) ' ');
        org.elasticsearch.common.collect.Tuple<java.lang.Throwable, org.elasticsearch.transport.TransportRequest> throwableTuple67 = new org.elasticsearch.common.collect.Tuple<java.lang.Throwable, org.elasticsearch.transport.TransportRequest>((java.lang.Throwable) actionRequestValidationException39, (org.elasticsearch.transport.TransportRequest) bulkShardRequest61);
        long long68 = bulkShardRequest61.primaryTerm();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNull(transportAddress34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(actionRequestValidationException39);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest49);
        org.junit.Assert.assertNotNull(timeValue51);
        org.junit.Assert.assertNotNull(bulkShardRequest52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(indicesOptions54);
        org.junit.Assert.assertNotNull(actionRequestValidationException55);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(bulkShardRequest61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads((long) 0);
        java.lang.String str7 = versionType0.explainConflictForWrites((-1L), (long) (byte) 10, true);
        boolean boolean11 = versionType0.isVersionConflictForWrites(0L, (long) ' ', false);
        long long14 = versionType0.updateVersion((long) '#', 104L);
        boolean boolean18 = versionType0.isVersionConflictForWrites((-1L), 99L, true);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [-1] is higher than the one provided [10]" + "'", str7, "current version [-1] is higher than the one provided [10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 104L + "'", long14 == 104L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("current version [52] is different than the one provided [52]");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.Version version5 = indexMetaData2.getUpgradedVersion();
        long long6 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData2.requireFilters();
        long long8 = indexMetaData2.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData2.includeFilters();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData2.getSettings();
        boolean boolean11 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings10);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings10);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue8 = bulkShardRequest7.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.timeout(timeValue8);
        boolean boolean10 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = bulkShardRequest3.validate();
        bulkShardRequest3.setParentTask("index.version.created_string", 101L);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest3.setShardId(shardId16);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long22 = bulkShardRequest21.primaryTerm();
        boolean boolean23 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting19, "current version [1] is different than the one provided [-1]", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, (java.lang.Throwable) actionRequestValidationException24, writeResult27);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [101] is different than the one provided [34]", (java.lang.Throwable) actionRequestValidationException24, "current version [99] is higher or equal to the one provided [36]");
        java.lang.String str31 = shardFailure30.reason;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indicesOptions11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "current version [101] is different than the one provided [34]" + "'", str31, "current version [101] is different than the one provided [34]");
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.removeAlias("current version [-1] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder5.build();
        boolean boolean10 = indexMetaData8.isSameUUID("index.shared_filesystem");
        org.elasticsearch.Version version11 = indexMetaData8.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean14 = indexMetaData12.equals((java.lang.Object) (short) -1);
        org.elasticsearch.index.Index index15 = indexMetaData12.getMergeSourceIndex();
        java.util.Set<java.lang.String> strSet17 = null; // flaky: indexMetaData12.activeAllocationIds(1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData12.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = indexMetaData12.getState();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData8.diff(indexMetaData12);
        java.lang.String str21 = indexMetaData12.getIndexUUID();
        org.apache.lucene.util.Version version22 = indexMetaData12.getMinimumCompatibleVersion();
        long long23 = indexMetaData12.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters24 = indexMetaData12.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap25 = indexMetaData12.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(index15);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_na_" + "'", str21, "_na_");
        org.junit.Assert.assertNull(version22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters24);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest9.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        bulkShardRequest9.remoteAddress(transportAddress12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("hi!");
        bulkShardRequest17.seqNo((long) (byte) -1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap5, (org.elasticsearch.transport.TransportMessage) bulkShardRequest17);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap21 = strSetImmutableOpenIntMapTuple20.v1();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest22.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue27 = bulkShardRequest26.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest22.timeout(timeValue27);
        boolean boolean29 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions30 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = bulkShardRequest22.validate();
        bulkShardRequest22.setParentTask("index.version.created_string", 101L);
        java.lang.String str35 = bulkShardRequest22.index();
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest22.setShardId(shardId36);
        boolean boolean38 = strSetImmutableOpenIntMapTuple20.equals((java.lang.Object) bulkShardRequest37);
        org.elasticsearch.action.update.UpdateHelper.Result result39 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result40 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long42 = bulkShardRequest41.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel43 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest41.consistencyLevel(writeConsistencyLevel43);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue46 = bulkShardRequest45.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = bulkShardRequest41.timeout(timeValue46);
        boolean boolean48 = bulkShardRequest41.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue49 = bulkShardRequest41.timeout();
        java.lang.Throwable throwable51 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult52 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult53 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result40, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, false, throwable51, writeResult52);
        java.lang.Throwable throwable55 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult56 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult57 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result39, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, true, throwable55, writeResult56);
        org.elasticsearch.tasks.TaskId taskId58 = bulkShardRequest41.getParentTask();
        boolean boolean59 = strSetImmutableOpenIntMapTuple20.equals((java.lang.Object) bulkShardRequest41);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap60 = strSetImmutableOpenIntMapTuple20.v1();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(indicesOptions30);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(bulkShardRequest37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest44);
        org.junit.Assert.assertNotNull(timeValue46);
        org.junit.Assert.assertNotNull(bulkShardRequest47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeValue49);
        org.junit.Assert.assertNotNull(taskId58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap60);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest3.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest3.remoteAddress(transportAddress6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest9.index("hi!");
        long long12 = bulkShardRequest11.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest11.shardId();
        org.elasticsearch.index.shard.ShardId shardId14 = bulkShardRequest11.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest11.timeout();
        long long17 = bulkShardRequest11.primaryTerm();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        long long10 = builder9.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.state(state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder3.state(state16);
        int int19 = builder3.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder3.creationDate((long) 100);
        long long22 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder3.version(0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder3.version(101L);
        int int27 = builder26.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean31 = indexMetaData29.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder32.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean37 = indexMetaData35.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData35);
        long long39 = builder38.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state40 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder38.state(state40);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder41.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state45 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder41.state(state45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder32.state(state45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder32.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData49 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean51 = indexMetaData49.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData49);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters53 = indexMetaData49.getInitialRecoveryFilters();
        long long55 = indexMetaData49.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state56 = indexMetaData49.getState();
        org.elasticsearch.common.settings.Settings settings57 = indexMetaData49.getSettings();
        org.elasticsearch.common.settings.Settings settings58 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder32.settings(settings57);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap62 = indexMetaData61.getAliases();
        org.elasticsearch.Version version63 = indexMetaData61.getUpgradedVersion();
        org.apache.lucene.util.Version version64 = indexMetaData61.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData61);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap66 = indexMetaData61.getCustoms();
        java.util.Set<java.lang.String> strSet68 = indexMetaData61.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = builder32.putActiveAllocationIds(2, strSet68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder70 = builder26.putActiveAllocationIds((int) (byte) 1, strSet68);
        long long71 = builder26.version();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + state40 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state40.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + state45 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state45.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(indexMetaData49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(discoveryNodeFilters53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + state56 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state56.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings57);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(strImmutableOpenMap62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNull(version64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(strImmutableOpenMap66);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 101L + "'", long71 == 101L);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        long long10 = builder9.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.state(state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder3.state(state16);
        int int19 = builder3.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder3.creationDate((long) 100);
        long long22 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder3.version(0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder3.version(101L);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean30 = indexMetaData28.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap32 = indexMetaData28.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        int int34 = indexMetaData28.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder35.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder35.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder35.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        int int44 = builder43.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData46 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean48 = indexMetaData46.equals((java.lang.Object) (short) -1);
        org.elasticsearch.index.Index index49 = indexMetaData46.getMergeSourceIndex();
        java.util.Set<java.lang.String> strSet51 = indexMetaData46.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder43.putActiveAllocationIds(0, strSet51);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder35.putActiveAllocationIds((int) (byte) 0, strSet51);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = builder3.putActiveAllocationIds(100, strSet51);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData55 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state56 = indexMetaData55.getState();
        org.elasticsearch.index.Index index57 = indexMetaData55.getMergeSourceIndex();
        int int58 = indexMetaData55.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters59 = indexMetaData55.requireFilters();
        int int60 = indexMetaData55.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean63 = indexMetaData61.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData61);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData65 = builder64.build();
        org.apache.lucene.util.Version version66 = indexMetaData65.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData67 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        java.util.Set<java.lang.String> strSet69 = null; // flaky: indexMetaData67.activeAllocationIds((int) (short) -1);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff70 = indexMetaData65.diff(indexMetaData67);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters71 = indexMetaData65.requireFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff72 = indexMetaData55.diff(indexMetaData65);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest74 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long75 = bulkShardRequest74.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel76 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest77 = bulkShardRequest74.consistencyLevel(writeConsistencyLevel76);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest78 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue79 = bulkShardRequest78.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest80 = bulkShardRequest74.timeout(timeValue79);
        boolean boolean81 = bulkShardRequest74.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions82 = bulkShardRequest74.indicesOptions();
        org.elasticsearch.common.collect.Tuple<java.lang.Comparable<java.lang.String>, org.elasticsearch.action.IndicesRequest> strComparableTuple83 = new org.elasticsearch.common.collect.Tuple<java.lang.Comparable<java.lang.String>, org.elasticsearch.action.IndicesRequest>((java.lang.Comparable<java.lang.String>) "update", (org.elasticsearch.action.IndicesRequest) bulkShardRequest74);
        boolean boolean84 = indexMetaData55.equals((java.lang.Object) "update");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap85 = indexMetaData55.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap86 = indexMetaData55.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state87 = indexMetaData55.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder88 = builder3.state(state87);
        java.lang.String str89 = builder88.index();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(indexMetaData28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(indexMetaData46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(index49);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(indexMetaData55);
        org.junit.Assert.assertTrue("'" + state56 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state56.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(indexMetaData65);
        org.junit.Assert.assertNull(version66);
        org.junit.Assert.assertNotNull(indexMetaData67);
        org.junit.Assert.assertNull(strSet69);
        org.junit.Assert.assertNotNull(indexMetaDataDiff70);
        org.junit.Assert.assertNull(discoveryNodeFilters71);
        org.junit.Assert.assertNotNull(indexMetaDataDiff72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest77);
        org.junit.Assert.assertNotNull(timeValue79);
        org.junit.Assert.assertNotNull(bulkShardRequest80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(indicesOptions82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap85);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap86);
        org.junit.Assert.assertTrue("'" + state87 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state87.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = indexMetaData0.getState();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        boolean boolean9 = indexMetaData0.isSameUUID("current version [2] is higher or equal to the one provided [52]");
        org.elasticsearch.Version version10 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings11 = indexMetaData0.getSettings();
        org.elasticsearch.Version version12 = indexMetaData0.getUpgradedVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + state1 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state1.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(version12);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) '#');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("active_allocations");
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version9 = indexMetaData0.getCreationVersion();
        boolean boolean11 = indexMetaData0.isSameUUID("current version [10] is higher than the one provided [10]");
        boolean boolean13 = indexMetaData0.isSameUUID("current version [10] is different than the one provided [-1]");
        boolean boolean15 = indexMetaData0.isSameUUID("current version [53] is different than the one provided [1]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion(10L, (long) 101);
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType6.validateVersionForReads((long) '#');
        boolean boolean12 = versionType6.isVersionConflictForWrites((long) 52, (long) (short) 100, true);
        boolean boolean14 = versionType6.validateVersionForReads((long) 1);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        long long6 = indexMetaData0.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        java.lang.Throwable throwable3 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, actionRequest1, true, throwable3, writeResult4);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult6 = updateResult5.writeResult;
        java.lang.Throwable throwable7 = updateResult5.error;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult8 = updateResult5.writeResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse9 = updateResult5.noopResult;
        org.junit.Assert.assertNull(writeResult6);
        org.junit.Assert.assertNull(throwable7);
        org.junit.Assert.assertNull(writeResult8);
        org.junit.Assert.assertNull(updateResponse9);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        long long4 = versionType1.updateVersion((-1L), (long) 'a');
        boolean boolean8 = versionType1.isVersionConflictForWrites(0L, (long) (short) 10, true);
        byte byte9 = versionType1.getValue();
        boolean boolean12 = versionType1.isVersionConflictForReads((long) (byte) 100, 0L);
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        byte byte14 = versionType1.getValue();
        java.lang.String str18 = versionType1.explainConflictForWrites(36L, 0L, false);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "current version [36] is different than the one provided [0]" + "'", str18, "current version [36] is different than the one provided [0]");
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long6 = bulkShardRequest5.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest8.getParentTask();
        long long11 = bulkShardRequest8.seqNo();
        boolean boolean12 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest8.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest8.validate();
        org.elasticsearch.common.collect.Tuple<java.lang.String, java.lang.Exception> strTuple15 = org.elasticsearch.common.collect.Tuple.tuple("indices:data/write/bulk[s]", (java.lang.Exception) actionRequestValidationException14);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [100] is different than the one provided [97]", (java.lang.Throwable) actionRequestValidationException14, "current version [10] is different than the one provided [0]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "indices:data/write/bulk[s]", (java.lang.Throwable) actionRequestValidationException14, "index.shadow_replicas");
        java.lang.String str20 = shardFailure19.indexUUID;
        java.lang.Throwable throwable21 = shardFailure19.cause;
        java.lang.String str22 = shardFailure19.reason;
        java.lang.String str23 = shardFailure19.reason;
        java.lang.String str24 = shardFailure19.reason;
        java.lang.String str25 = shardFailure19.reason;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(strTuple15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "index.shadow_replicas" + "'", str20, "index.shadow_replicas");
        org.junit.Assert.assertNotNull(throwable21);
        org.junit.Assert.assertEquals(throwable21.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable21.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable21.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "indices:data/write/bulk[s]" + "'", str22, "indices:data/write/bulk[s]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "indices:data/write/bulk[s]" + "'", str23, "indices:data/write/bulk[s]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "indices:data/write/bulk[s]" + "'", str24, "indices:data/write/bulk[s]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "indices:data/write/bulk[s]" + "'", str25, "indices:data/write/bulk[s]");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap3 = indexMetaData0.getAliases();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds(101);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        bulkShardRequest8.primaryTerm((long) (byte) 0);
        bulkShardRequest8.setParentTask("current version [0] is different than the one provided [100]", 103L);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest8.setShardId(shardId15);
        org.elasticsearch.index.shard.ShardId shardId17 = bulkShardRequest8.shardId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNull(shardId17);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest3.getParentTask();
        long long6 = bulkShardRequest3.seqNo();
        boolean boolean7 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest3.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest3.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest10.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest3.timeout(timeValue11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = bulkShardRequest16.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest16.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = null;
        bulkShardRequest16.remoteAddress(transportAddress19);
        bulkShardRequest16.primaryTerm((long) (byte) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest23.primaryTerm((long) (byte) 1);
        long long26 = bulkShardRequest23.primaryTerm();
        bulkShardRequest23.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest23.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest16.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long34 = bulkShardRequest33.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest33.timeout(timeValue35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long38 = bulkShardRequest37.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest37.timeout(timeValue39);
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest40.indicesOptions();
        bulkShardRequest40.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = bulkShardRequest40.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest33.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest16.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long48 = bulkShardRequest47.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest47.timeout(timeValue49);
        org.elasticsearch.index.shard.ShardId shardId51 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest47.setShardId(shardId51);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long54 = bulkShardRequest53.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel55 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = bulkShardRequest53.consistencyLevel(writeConsistencyLevel55);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue58 = bulkShardRequest57.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest59 = bulkShardRequest53.timeout(timeValue58);
        boolean boolean60 = bulkShardRequest53.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue61 = bulkShardRequest53.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = bulkShardRequest52.timeout(timeValue61);
        org.elasticsearch.tasks.TaskId taskId63 = bulkShardRequest52.getParentTask();
        bulkShardRequest46.setParentTask(taskId63);
        bulkShardRequest12.setParentTask(taskId63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray66 = bulkShardRequest12.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertNotNull(indicesOptions41);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertNotNull(bulkShardRequest52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest56);
        org.junit.Assert.assertNotNull(timeValue58);
        org.junit.Assert.assertNotNull(bulkShardRequest59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertNotNull(bulkShardRequest62);
        org.junit.Assert.assertNotNull(taskId63);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [100] is different than the one provided [52]", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData2.mappingOrDefault("index.version.created_string");
        boolean boolean8 = indexMetaData2.equals((java.lang.Object) (byte) -1);
        int int9 = indexMetaData2.getNumberOfReplicas();
        long long10 = indexMetaData2.getCreationDate();
        int int11 = indexMetaData2.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap12 = indexMetaData2.getMappings();
        long long13 = indexMetaData2.getCreationDate();
        boolean boolean15 = indexMetaData2.isSameUUID("current version [99] is higher or equal to the one provided [36]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData2.mapping("current version [-1] is different than the one provided [1]");
        org.elasticsearch.Version version18 = indexMetaData2.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData2.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(mappingMetaData17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        int int2 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAllAliases();
        int int4 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        int int7 = builder6.numberOfShards();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean11 = indexMetaData9.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData9.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap14 = indexMetaData9.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData15.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff17 = indexMetaData9.diff(indexMetaData15);
        long long18 = indexMetaData15.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long20 = indexMetaData19.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData22 = indexMetaData19.mappingOrDefault("index.blocks.read");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData15.diff(indexMetaData19);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state24 = indexMetaData15.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder6.state(state24);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean28 = indexMetaData26.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet30 = null; // flaky: indexMetaData26.activeAllocationIds((int) '#');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap31 = indexMetaData26.getMappings();
        long long32 = indexMetaData26.getCreationDate();
        org.elasticsearch.common.settings.Settings settings33 = indexMetaData26.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder25.settings(settings33);
        boolean boolean35 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder1.settings(settings33);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean40 = indexMetaData38.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData38);
        long long42 = builder41.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state43 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder41.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder44.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder46.creationDate((long) (byte) 100);
        long long49 = builder46.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData50 = builder46.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData50);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state54 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple55 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest52, state54);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder51.state(state54);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData58 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap59 = indexMetaData58.getAliases();
        org.elasticsearch.Version version60 = indexMetaData58.getUpgradedVersion();
        org.apache.lucene.util.Version version61 = indexMetaData58.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData58);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap63 = indexMetaData58.getCustoms();
        java.util.Set<java.lang.String> strSet65 = indexMetaData58.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder66 = builder56.putActiveAllocationIds(0, strSet65);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder1.putActiveAllocationIds((int) ' ', strSet65);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData69 = builder1.mapping("current version [0] is different than the one provided [10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertNotNull(indexMetaDataDiff17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNull(mappingMetaData22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertTrue("'" + state24 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state24.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertNotNull(strImmutableOpenMap31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(indexMetaData38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + state43 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state43.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + state54 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state54.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(transportMessageTuple55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(indexMetaData58);
        org.junit.Assert.assertNotNull(strImmutableOpenMap59);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNull(version61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strImmutableOpenMap63);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(mappingMetaData69);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long5 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest7.remoteAddress();
        boolean boolean9 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest7.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest7.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.version.upgraded", (java.lang.Throwable) actionRequestValidationException11, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException11, "current version [4] is different than the one provided [0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest1.primaryTerm((long) (byte) 1);
        long long4 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest1.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest9.remoteAddress();
        bulkShardRequest9.primaryTerm((long) (byte) 0);
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest9.timeout(timeValue14);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting17 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting19 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest22.timeout(timeValue24);
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest22.setShardId(shardId26);
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = null;
        bulkShardRequest27.remoteAddress(transportAddress28);
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long33 = bulkShardRequest32.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest32.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.common.transport.TransportAddress transportAddress36 = bulkShardRequest35.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest35.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress38 = null;
        bulkShardRequest35.remoteAddress(transportAddress38);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long43 = bulkShardRequest42.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest42.timeout(timeValue44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long47 = bulkShardRequest46.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue48 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = bulkShardRequest46.timeout(timeValue48);
        org.elasticsearch.action.support.IndicesOptions indicesOptions50 = bulkShardRequest49.indicesOptions();
        bulkShardRequest49.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel53 = bulkShardRequest49.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = bulkShardRequest42.consistencyLevel(writeConsistencyLevel53);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel53);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long58 = bulkShardRequest57.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel59 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = bulkShardRequest57.consistencyLevel(writeConsistencyLevel59);
        org.elasticsearch.common.transport.TransportAddress transportAddress61 = bulkShardRequest60.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId62 = bulkShardRequest60.getParentTask();
        long long63 = bulkShardRequest60.seqNo();
        boolean boolean64 = bulkShardRequest60.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId65 = bulkShardRequest60.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException66 = bulkShardRequest60.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult67 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult68 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest55, false, (java.lang.Throwable) actionRequestValidationException66, writeResult67);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult69 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult70 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result21, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, true, (java.lang.Throwable) actionRequestValidationException66, writeResult69);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure72 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting19, "current version [98] is different than the one provided [1]", (java.lang.Throwable) actionRequestValidationException66, "current version [32] is different than the one provided [97]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure74 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting17, "current version [0] is different than the one provided [-1]", (java.lang.Throwable) actionRequestValidationException66, "current version [52] is higher than the one provided [2]");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult75 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult76 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, true, (java.lang.Throwable) actionRequestValidationException66, writeResult75);
        org.elasticsearch.action.update.UpdateResponse updateResponse77 = updateResult76.noopResult;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest35);
        org.junit.Assert.assertNull(transportAddress36);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertNotNull(bulkShardRequest41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest49);
        org.junit.Assert.assertNotNull(indicesOptions50);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel53 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel53.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest54);
        org.junit.Assert.assertNotNull(bulkShardRequest55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest60);
        org.junit.Assert.assertNull(transportAddress61);
        org.junit.Assert.assertNotNull(taskId62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(taskId65);
        org.junit.Assert.assertNotNull(actionRequestValidationException66);
        org.junit.Assert.assertNull(updateResponse77);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        long long4 = versionType1.updateVersion((-1L), (long) 'a');
        long long7 = versionType1.updateVersion((long) (byte) -1, (long) '4');
        boolean boolean9 = versionType1.validateVersionForWrites(11L);
        java.lang.String str12 = versionType1.explainConflictForReads((long) (byte) -1, (long) ' ');
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        java.lang.String str16 = versionType13.explainConflictForReads(99L, 0L);
        boolean boolean19 = versionType13.isVersionConflictForReads((long) 'a', (long) 32);
        org.elasticsearch.index.VersionType versionType20 = versionType13.versionTypeForReplicationAndRecovery();
        boolean boolean22 = versionType13.validateVersionForReads((long) (byte) 2);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "current version [-1] is different than the one provided [32]" + "'", str12, "current version [-1] is different than the one provided [32]");
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "current version [99] is different than the one provided [0]" + "'", str16, "current version [99] is different than the one provided [0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [32] is higher or equal to the one provided [11]", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.primaryTerm((int) (short) 0);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        long long9 = indexMetaData0.getVersion();
        long long11 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap12 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData0.excludeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap12);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest4.getParentTask();
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, false, throwable8, writeResult9);
        bulkShardRequest4.setParentTask("current version [100] is different than the one provided [100]", (long) (byte) 1);
        long long14 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest4.setShardId(shardId15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest4.validate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long19 = bulkShardRequest18.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest18.timeout(timeValue20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest18.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId24 = null;
        bulkShardRequest18.setParentTask(taskId24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str27 = bulkShardRequest26.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long29 = bulkShardRequest28.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest28.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.common.transport.TransportAddress transportAddress32 = bulkShardRequest31.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId33 = bulkShardRequest31.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = null;
        bulkShardRequest31.remoteAddress(transportAddress34);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel36 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest31.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long39 = bulkShardRequest38.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue40 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest38.timeout(timeValue40);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long43 = bulkShardRequest42.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest42.timeout(timeValue44);
        org.elasticsearch.action.support.IndicesOptions indicesOptions46 = bulkShardRequest45.indicesOptions();
        bulkShardRequest45.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel49 = bulkShardRequest45.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest38.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = bulkShardRequest31.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest26.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = bulkShardRequest18.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long56 = bulkShardRequest55.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = bulkShardRequest55.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.common.transport.TransportAddress transportAddress59 = bulkShardRequest58.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId60 = bulkShardRequest58.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress61 = null;
        bulkShardRequest58.remoteAddress(transportAddress61);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel63 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest64 = bulkShardRequest58.consistencyLevel(writeConsistencyLevel63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest58.index("index.blocks.read");
        bulkShardRequest58.seqNo(0L);
        org.elasticsearch.tasks.TaskId taskId69 = bulkShardRequest58.getParentTask();
        bulkShardRequest54.setParentTask(taskId69);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(transportAddress32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(bulkShardRequest37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(indicesOptions46);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel49 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel49.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertNotNull(bulkShardRequest51);
        org.junit.Assert.assertNotNull(bulkShardRequest52);
        org.junit.Assert.assertNotNull(bulkShardRequest53);
        org.junit.Assert.assertNotNull(bulkShardRequest54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest58);
        org.junit.Assert.assertNull(transportAddress59);
        org.junit.Assert.assertNotNull(taskId60);
        org.junit.Assert.assertNotNull(bulkShardRequest64);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNotNull(taskId69);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        long long6 = indexMetaData0.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData0.getActiveAllocationIds();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertNotNull(params10);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(10, actionRequest1);
        int int3 = 0; // flaky: bulkItemRequest2.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bulkItemRequest2.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        bulkShardRequest7.setParentTask(taskId13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest7.setShardId(shardId15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap6, (org.elasticsearch.transport.TransportMessage) bulkShardRequest16);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap18 = strSetImmutableOpenIntMapTuple17.v1();
        org.elasticsearch.index.VersionType versionType20 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean22 = versionType20.validateVersionForWrites((long) (short) 100);
        boolean boolean24 = versionType20.validateVersionForWrites((long) (byte) 10);
        byte byte25 = versionType20.getValue();
        boolean boolean26 = strSetImmutableOpenIntMapTuple17.equals((java.lang.Object) byte25);
        org.elasticsearch.transport.TransportMessage transportMessage27 = strSetImmutableOpenIntMapTuple17.v2();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap28 = strSetImmutableOpenIntMapTuple17.v1();
        org.elasticsearch.transport.TransportMessage transportMessage29 = strSetImmutableOpenIntMapTuple17.v2();
        org.elasticsearch.transport.TransportMessage transportMessage30 = strSetImmutableOpenIntMapTuple17.v2();
        org.elasticsearch.transport.TransportMessage transportMessage31 = strSetImmutableOpenIntMapTuple17.v2();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap32 = strSetImmutableOpenIntMapTuple17.v1();
        org.elasticsearch.transport.TransportMessage transportMessage33 = strSetImmutableOpenIntMapTuple17.v2();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long36 = bulkShardRequest35.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue40 = bulkShardRequest39.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest35.timeout(timeValue40);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long43 = bulkShardRequest42.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest42.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue47 = bulkShardRequest46.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest42.timeout(timeValue47);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = bulkShardRequest41.timeout(timeValue47);
        boolean boolean50 = bulkShardRequest49.getShouldPersistResult();
        boolean boolean51 = bulkShardRequest49.getShouldPersistResult();
        long long52 = bulkShardRequest49.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue53 = bulkShardRequest49.timeout();
        org.elasticsearch.action.update.UpdateHelper.Result result54 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result55 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long57 = bulkShardRequest56.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel58 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest59 = bulkShardRequest56.consistencyLevel(writeConsistencyLevel58);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue61 = bulkShardRequest60.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = bulkShardRequest56.timeout(timeValue61);
        boolean boolean63 = bulkShardRequest56.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue64 = bulkShardRequest56.timeout();
        java.lang.Throwable throwable66 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult67 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult68 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result55, (org.elasticsearch.action.ActionRequest) bulkShardRequest56, false, throwable66, writeResult67);
        java.lang.Throwable throwable70 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult71 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult72 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result54, (org.elasticsearch.action.ActionRequest) bulkShardRequest56, true, throwable70, writeResult71);
        org.elasticsearch.common.unit.TimeValue timeValue73 = bulkShardRequest56.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest74 = bulkShardRequest49.timeout(timeValue73);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest75 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest49);
        boolean boolean76 = strSetImmutableOpenIntMapTuple17.equals((java.lang.Object) bulkItemRequest75);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap77 = strSetImmutableOpenIntMapTuple17.v1();
        org.elasticsearch.transport.TransportMessage transportMessage78 = strSetImmutableOpenIntMapTuple17.v2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = strSetImmutableOpenIntMapTuple17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap18);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(transportMessage27);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap28);
        org.junit.Assert.assertNotNull(transportMessage29);
        org.junit.Assert.assertNotNull(transportMessage30);
        org.junit.Assert.assertNotNull(transportMessage31);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap32);
        org.junit.Assert.assertNotNull(transportMessage33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertNotNull(timeValue40);
        org.junit.Assert.assertNotNull(bulkShardRequest41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
        org.junit.Assert.assertNotNull(bulkShardRequest49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(timeValue53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest59);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertNotNull(bulkShardRequest62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertNotNull(timeValue73);
        org.junit.Assert.assertNotNull(bulkShardRequest74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap77);
        org.junit.Assert.assertNotNull(transportMessage78);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData2.mappingOrDefault("index.version.created_string");
        boolean boolean8 = indexMetaData2.equals((java.lang.Object) (byte) -1);
        int int9 = indexMetaData2.getNumberOfReplicas();
        long long10 = indexMetaData2.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean13 = indexMetaData11.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData11);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData11.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap16 = indexMetaData11.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData17.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData11.diff(indexMetaData17);
        java.lang.String str20 = indexMetaData17.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap21 = indexMetaData17.getAliases();
        boolean boolean22 = indexMetaData2.equals((java.lang.Object) indexMetaData17);
        int int23 = indexMetaData2.getNumberOfReplicas();
        java.util.Set<java.lang.String> strSet25 = null; // flaky: indexMetaData2.activeAllocationIds(2);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(discoveryNodeFilters15);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(indexMetaDataDiff19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_na_" + "'", str20, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strSet25);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.auto_expand_replicas");
        int int8 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder7.build();
        java.lang.String str10 = builder7.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.numberOfReplicas((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.putMapping("current version [1] is higher than the one provided [100]", "");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index.auto_expand_replicas" + "'", str10, "index.auto_expand_replicas");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest4.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest4.remoteAddress(transportAddress7);
        bulkShardRequest4.primaryTerm((long) (byte) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest11.primaryTerm((long) (byte) 1);
        long long14 = bulkShardRequest11.primaryTerm();
        bulkShardRequest11.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue18 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest11.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest4.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long22 = bulkShardRequest21.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest21.timeout(timeValue23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long26 = bulkShardRequest25.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest25.timeout(timeValue27);
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = bulkShardRequest28.indicesOptions();
        bulkShardRequest28.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest28.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest21.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException35 = bulkShardRequest4.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, writeResult36);
        org.elasticsearch.action.update.UpdateHelper.Result result38 = updateResult37.result;
        boolean boolean39 = updateResult37.retry;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNotNull(actionRequestValidationException35);
        org.junit.Assert.assertNull(result38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest4.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest4.remoteAddress(transportAddress7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest4.index("index.blocks.read");
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting15 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.ActionRequest actionRequest18 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting20 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long26 = bulkShardRequest25.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.common.transport.TransportAddress transportAddress29 = bulkShardRequest28.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest28.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress31 = null;
        bulkShardRequest28.remoteAddress(transportAddress31);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest28.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long36 = bulkShardRequest35.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest35.timeout(timeValue37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long40 = bulkShardRequest39.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue41 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest39.timeout(timeValue41);
        org.elasticsearch.action.support.IndicesOptions indicesOptions43 = bulkShardRequest42.indicesOptions();
        bulkShardRequest42.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = bulkShardRequest42.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest28.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long51 = bulkShardRequest50.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel52 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = bulkShardRequest50.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.common.transport.TransportAddress transportAddress54 = bulkShardRequest53.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId55 = bulkShardRequest53.getParentTask();
        long long56 = bulkShardRequest53.seqNo();
        boolean boolean57 = bulkShardRequest53.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId58 = bulkShardRequest53.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException59 = bulkShardRequest53.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult60 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult61 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest48, false, (java.lang.Throwable) actionRequestValidationException59, writeResult60);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure63 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting22, "current version [-1] is different than the one provided [1]", (java.lang.Throwable) actionRequestValidationException59, "index.data_path");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure65 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting20, "", (java.lang.Throwable) actionRequestValidationException59, "index.uuid");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult66 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult67 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, actionRequest18, true, (java.lang.Throwable) actionRequestValidationException59, writeResult66);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure69 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting15, "current version [10] is higher or equal to the one provided [10]", (java.lang.Throwable) actionRequestValidationException59, "current version [100] is different than the one provided [10]");
        java.lang.String str70 = shardFailure69.indexUUID;
        java.lang.String str71 = shardFailure69.indexUUID;
        java.lang.Throwable throwable72 = shardFailure69.cause;
        java.lang.Throwable throwable73 = shardFailure69.cause;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult74 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult75 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, false, throwable73, writeResult74);
        bulkShardRequest12.seqNo(11L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException78 = bulkShardRequest12.validate();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNull(transportAddress29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertNotNull(indicesOptions43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel46 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel46.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest47);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest53);
        org.junit.Assert.assertNull(transportAddress54);
        org.junit.Assert.assertNotNull(taskId55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(taskId58);
        org.junit.Assert.assertNotNull(actionRequestValidationException59);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "current version [100] is different than the one provided [10]" + "'", str70, "current version [100] is different than the one provided [10]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "current version [100] is different than the one provided [10]" + "'", str71, "current version [100] is different than the one provided [10]");
        org.junit.Assert.assertNotNull(throwable72);
        org.junit.Assert.assertEquals(throwable72.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable72.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable72.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNotNull(throwable73);
        org.junit.Assert.assertEquals(throwable73.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable73.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable73.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNull(actionRequestValidationException78);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap11 = indexMetaData6.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData12.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData6.diff(indexMetaData12);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) indexMetaData12);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap17 = indexMetaData0.getMappings();
        java.lang.String str18 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean21 = indexMetaData19.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData19);
        long long23 = builder22.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state24 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder22.state(state24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder25.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.creationDate((long) (byte) 100);
        long long30 = builder27.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData31 = builder27.build();
        org.elasticsearch.Version version32 = indexMetaData31.getUpgradedVersion();
        int int33 = indexMetaData31.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData34 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap35 = indexMetaData34.getAliases();
        int int36 = indexMetaData34.getNumberOfReplicas();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff37 = indexMetaData31.diff(indexMetaData34);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state38 = indexMetaData31.getState();
        boolean boolean39 = indexMetaData0.equals((java.lang.Object) state38);
        int int40 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_na_" + "'", str18, "_na_");
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + state24 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state24.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
        org.junit.Assert.assertNotNull(indexMetaData34);
        org.junit.Assert.assertNotNull(strImmutableOpenMap35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(indexMetaDataDiff37);
        org.junit.Assert.assertTrue("'" + state38 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state38.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData0.requireFilters();
        long long12 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap13 = indexMetaData0.getMappings();
        long long15 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap16 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [10] is higher or equal to the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) (short) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("index.blocks.write");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest1.primaryTerm((long) (byte) 1);
        long long4 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.setParentTask("index.version.created", 0L);
        bulkShardRequest1.setParentTask("current version [10] is different than the one provided [0]", (long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest11.primaryTerm((long) (byte) 1);
        long long14 = bulkShardRequest11.primaryTerm();
        bulkShardRequest11.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue18 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest11.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest1.timeout(timeValue18);
        org.elasticsearch.common.unit.TimeValue timeValue21 = bulkShardRequest20.timeout();
        org.elasticsearch.action.update.UpdateHelper.Result result23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long26 = bulkShardRequest25.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest25.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = bulkShardRequest25.index("active_allocations");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest25.index("primary_terms");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long34 = bulkShardRequest33.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest33.timeout(timeValue35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long38 = bulkShardRequest37.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest37.timeout(timeValue39);
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest40.indicesOptions();
        bulkShardRequest40.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = bulkShardRequest40.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest33.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest32.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest32);
        org.elasticsearch.common.unit.TimeValue timeValue48 = bulkShardRequest32.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions49 = bulkShardRequest32.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting52 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long55 = bulkShardRequest54.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel56 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = bulkShardRequest54.consistencyLevel(writeConsistencyLevel56);
        org.elasticsearch.common.transport.TransportAddress transportAddress58 = bulkShardRequest57.remoteAddress();
        boolean boolean59 = bulkShardRequest57.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress60 = bulkShardRequest57.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException61 = bulkShardRequest57.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure63 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting52, "index.version.upgraded", (java.lang.Throwable) actionRequestValidationException61, "active_allocations");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult64 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult65 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result23, (org.elasticsearch.action.ActionRequest) bulkShardRequest32, true, (java.lang.Throwable) actionRequestValidationException61, writeResult64);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult66 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult67 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, false, (java.lang.Throwable) actionRequestValidationException61, writeResult66);
        bulkShardRequest20.seqNo(98L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException70 = bulkShardRequest20.validate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest30);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertNotNull(indicesOptions41);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
        org.junit.Assert.assertNull(timeValue48);
        org.junit.Assert.assertNotNull(indicesOptions49);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel50 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel50.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest57);
        org.junit.Assert.assertNull(transportAddress58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(transportAddress60);
        org.junit.Assert.assertNotNull(actionRequestValidationException61);
        org.junit.Assert.assertNotNull(actionRequestValidationException70);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        long long7 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap8 = indexMetaData0.getMappings();
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("current version [53] is different than the one provided [2]");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.excludeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.timeout(timeValue3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        bulkShardRequest1.setParentTask(taskId7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.setShardId(shardId9);
        bulkShardRequest10.setParentTask("index.shared_filesystem", (long) 100);
        org.elasticsearch.tasks.TaskId taskId14 = null;
        bulkShardRequest10.setParentTask(taskId14);
        org.elasticsearch.index.shard.ShardId shardId16 = bulkShardRequest10.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        bulkShardRequest10.remoteAddress(transportAddress17);
        java.lang.Throwable throwable20 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, true, throwable20, writeResult21);
        org.elasticsearch.action.update.UpdateResponse updateResponse23 = updateResult22.noopResult;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNull(updateResponse23);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        long long10 = builder9.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.state(state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder3.state(state16);
        int int19 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = builder3.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder3.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long24 = indexMetaData23.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long26 = indexMetaData25.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData23.diff(indexMetaData25);
        org.elasticsearch.Version version28 = indexMetaData25.getUpgradedVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap29 = indexMetaData25.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state31 = indexMetaData30.getState();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff32 = indexMetaData25.diff(indexMetaData30);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean35 = indexMetaData33.equals((java.lang.Object) (short) -1);
        org.apache.lucene.util.Version version36 = indexMetaData33.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = indexMetaData33.getState();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>, java.io.Serializable> indexMetaDataDiffTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>, java.io.Serializable>(indexMetaDataDiff32, (java.io.Serializable) state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder3.state(state37);
        java.lang.Class<?> wildcardClass40 = builder3.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(indexMetaData23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap29);
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + state31 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state31.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaDataDiff32);
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(version36);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.timeout(timeValue12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest6.timeout(timeValue12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest15.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue20 = bulkShardRequest19.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest15.timeout(timeValue20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest22.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue27 = bulkShardRequest26.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest22.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest21.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = bulkShardRequest6.timeout(timeValue27);
        bulkShardRequest30.primaryTerm((long) 101);
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest30.setShardId(shardId33);
        org.elasticsearch.common.unit.TimeValue timeValue35 = bulkShardRequest30.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress36 = null;
        bulkShardRequest30.remoteAddress(transportAddress36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest30.index("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest30);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("current version [1] is different than the one provided [-1]");
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.includeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mappingOrDefault("active_allocations");
        java.lang.String str10 = indexMetaData0.getIndexUUID();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = indexMetaData0.primaryTerm((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_na_" + "'", str10, "_na_");
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.timeout(timeValue5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.setShardId(shardId7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        bulkShardRequest8.remoteAddress(transportAddress9);
        bulkShardRequest8.seqNo((long) '4');
        boolean boolean13 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest14.index("index.uuid");
        long long17 = bulkShardRequest14.primaryTerm();
        boolean boolean18 = bulkShardRequest14.getShouldPersistResult();
        long long19 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long21 = bulkShardRequest20.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest20.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = bulkShardRequest23.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest23.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        bulkShardRequest23.remoteAddress(transportAddress26);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest23.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest23.index("index.blocks.read");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest31.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId33 = bulkShardRequest31.getParentTask();
        bulkShardRequest14.setParentTask(taskId33);
        bulkShardRequest8.setParentTask(taskId33);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNull(transportAddress24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(writeConsistencyLevel32);
        org.junit.Assert.assertNotNull(taskId33);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout(timeValue2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest3.indicesOptions();
        java.lang.String str5 = bulkShardRequest3.index();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
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
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        long long4 = versionType1.updateVersion((-1L), (long) 'a');
        boolean boolean8 = versionType1.isVersionConflictForWrites(0L, (long) (short) 10, true);
        boolean boolean10 = versionType1.validateVersionForWrites((long) (byte) 10);
        long long13 = versionType1.updateVersion(102L, (long) 1);
        org.elasticsearch.index.VersionType versionType14 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean16 = versionType14.validateVersionForReads(34L);
        boolean boolean18 = versionType14.validateVersionForReads(99L);
        long long21 = versionType14.updateVersion((long) (byte) 1, 104L);
        boolean boolean25 = versionType14.isVersionConflictForWrites((long) (byte) -1, (long) 101, true);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 103L + "'", long13 == 103L);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 104L + "'", long21 == 104L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.removeAlias("current version [-1] is different than the one provided [1]");
        int int8 = builder5.numberOfReplicas();
        long long9 = builder5.version();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean14 = indexMetaData12.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData12.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder17.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder17.numberOfShards((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.index("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean26 = indexMetaData24.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData24);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters28 = indexMetaData24.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.removeAlias("current version [-1] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder29.removeAllAliases();
        long long33 = builder32.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean37 = indexMetaData35.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData35);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder38.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state41 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder39.state(state41);
        java.lang.String[] strArray69 = new java.lang.String[] { "index.uuid", "index.auto_expand_replicas", "current version [-1] is different than the one provided [1]", "current version [10] is higher or equal to the one provided [10]", "state-", "current version [-1] is different than the one provided [1]", "_na_", "index.blocks.read_only", "index.priority", "_na_", "index.version.created_string", "index.blocks.read_only", "index.version.created_string", "index.version.upgraded_string", "index.version.created", "index.version.created_string", "", "index.creation_date", "current version [-1] is different than the one provided [10]", "index.number_of_shards", "index.shared_filesystem", "index.shared_filesystem", "primary_terms", "index.", "index.version.minimum_compatible" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = builder42.putActiveAllocationIds((int) '#', (java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder32.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder74 = builder20.putActiveAllocationIds((int) ' ', (java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<java.lang.Integer>, java.util.HashSet<java.lang.String>> intSettingTuple75 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<java.lang.Integer>, java.util.HashSet<java.lang.String>>(intSetting11, (java.util.HashSet<java.lang.String>) strSet70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder76 = builder5.putActiveAllocationIds(97, (java.util.Set<java.lang.String>) strSet70);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(indexMetaData24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(discoveryNodeFilters28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + state41 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state41.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.readDiffFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean3 = versionType1.validateVersionForWrites((long) (short) 100);
        boolean boolean6 = versionType1.isVersionConflictForReads((long) 100, (long) 'a');
        boolean boolean10 = versionType1.isVersionConflictForWrites((long) (byte) 1, (long) (short) 0, true);
        boolean boolean12 = versionType1.validateVersionForWrites((long) 1);
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        byte byte14 = versionType13.getValue();
        long long17 = versionType13.updateVersion((-1L), 105L);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 105L + "'", long17 == 105L);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        java.lang.Throwable throwable3 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, actionRequest1, true, throwable3, writeResult4);
        boolean boolean6 = updateResult5.success();
        org.elasticsearch.action.update.UpdateResponse updateResponse7 = updateResult5.noopResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse8 = updateResult5.noopResult;
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest9 = updateResult5.request();
        boolean boolean10 = updateResult5.retry;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(updateResponse7);
        org.junit.Assert.assertNull(updateResponse8);
        org.junit.Assert.assertNull(bulkShardRequestReplicationRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.state(state5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.creationDate((long) (byte) 100);
        long long11 = builder8.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder8.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple17 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest14, state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder13.state(state16);
        long long19 = builder13.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean22 = indexMetaData20.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData20);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters24 = indexMetaData20.getInitialRecoveryFilters();
        long long26 = indexMetaData20.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state27 = indexMetaData20.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder13.state(state27);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = builder13.build();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean32 = indexMetaData30.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData30);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap34 = indexMetaData30.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData30);
        int int36 = indexMetaData30.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters37 = indexMetaData30.excludeFilters();
        int int38 = indexMetaData30.getNumberOfShards();
        boolean boolean39 = indexMetaData29.equals((java.lang.Object) indexMetaData30);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData30.writeTo(streamOutput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(transportMessageTuple17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(discoveryNodeFilters24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + state27 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state27.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strImmutableOpenMap34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        java.lang.Throwable throwable3 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, actionRequest1, true, throwable3, writeResult4);
        boolean boolean6 = updateResult5.success();
        boolean boolean7 = updateResult5.success();
        boolean boolean8 = updateResult5.success();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult9 = updateResult5.writeResult;
        java.lang.Throwable throwable10 = updateResult5.error;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = updateResult5.writeResult;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = updateResult5.writeResult;
        org.elasticsearch.action.ActionRequest actionRequest13 = updateResult5.actionRequest;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(writeResult9);
        org.junit.Assert.assertNull(throwable10);
        org.junit.Assert.assertNull(writeResult11);
        org.junit.Assert.assertNull(writeResult12);
        org.junit.Assert.assertNull(actionRequest13);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [0] is higher or equal to the one provided [3]");
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
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) '#');
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mappingOrDefault("current version [2] is different than the one provided [3]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.state(state5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.creationDate((long) (byte) 100);
        long long11 = builder8.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder8.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        int int14 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData12.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData12.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData12.excludeFilters();
        long long19 = indexMetaData12.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap20 = indexMetaData12.getCustoms();
        org.elasticsearch.common.io.stream.StreamInput streamInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = indexMetaData12.readFrom(streamInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters15);
        org.junit.Assert.assertNull(mappingMetaData17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap20);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte2 = versionType1.getValue();
        boolean boolean4 = versionType1.validateVersionForWrites((long) ' ');
        boolean boolean7 = versionType1.isVersionConflictForReads(32L, (long) (byte) 3);
        org.elasticsearch.index.VersionType versionType8 = versionType1.versionTypeForReplicationAndRecovery();
        java.lang.String str11 = versionType1.explainConflictForReads(0L, (long) (-1));
        byte byte12 = versionType1.getValue();
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [0] is different than the one provided [-1]" + "'", str11, "current version [0] is different than the one provided [-1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 2 + "'", byte12 == (byte) 2);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout(timeValue2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.setShardId(shardId4);
        long long6 = bulkShardRequest0.primaryTerm();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.settings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.putCustom("", custom9);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.putMapping(mappingMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder3.removeAllAliases();
        int int5 = builder4.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [35] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.putCustom("current version [0] is different than the one provided [1]", custom9);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long14 = indexMetaData13.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData11.diff(indexMetaData13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.common.settings.Settings settings17 = indexMetaData13.getSettings();
        boolean boolean18 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings17);
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings17);
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings17);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder10.settings(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder4.settings(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.version((long) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean31 = indexMetaData29.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData29);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters33 = indexMetaData29.getInitialRecoveryFilters();
        long long35 = indexMetaData29.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = indexMetaData29.getState();
        org.elasticsearch.common.settings.Settings settings37 = indexMetaData29.getSettings();
        boolean boolean38 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings37);
        boolean boolean39 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder28.settings(settings37);
        java.lang.String[] strArray80 = new java.lang.String[] { "index.blocks.metadata", "current version [-1] is different than the one provided [32]", "index.shadow_replicas", "index.shared_filesystem", "index.creation_date_string", "index.shadow_replicas", "index.number_of_replicas", "current version [-1] is different than the one provided [1]", "index.shared_filesystem", "index.shared_filesystem", "index.blocks.read_only", "index.blocks.read", "active_allocations", "index.blocks.metadata", "", "index.version.created", "index.shadow_replicas", "index.auto_expand_replicas", "index.auto_expand_replicas", "current version [0] is different than the one provided [-1]", "indices:data/write/bulk[s]", "index.creation_date", "current version [100] is different than the one provided [10]", "current version [1] is different than the one provided [10]", "current version [-1] is different than the one provided [-1]", "current version [1] is different than the one provided [-1]", "index.blocks.metadata", "index.shared_filesystem", "index.blocks.read", "current version [100] is different than the one provided [100]", "index.blocks.read_only", "current version [0] is different than the one provided [-1]", "current version [100] is different than the one provided [2]", "index.blocks.read_only", "index.shared_filesystem.recover_on_any_node", "primary_terms", "current version [0] is different than the one provided [-1]", "current version [1] is different than the one provided [10]" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder83 = builder40.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder84 = builder25.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder86 = builder25.creationDate(10L);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(discoveryNodeFilters33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean3 = versionType1.validateVersionForWrites((long) (short) 100);
        boolean boolean5 = versionType1.validateVersionForWrites((long) (byte) 10);
        boolean boolean7 = versionType1.validateVersionForReads((long) (byte) 2);
        java.lang.String str10 = versionType1.explainConflictForReads((long) (byte) 100, (long) 'a');
        org.elasticsearch.index.VersionType versionType11 = versionType1.versionTypeForReplicationAndRecovery();
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [100] is different than the one provided [97]" + "'", str10, "current version [100] is different than the one provided [97]");
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) 1, (long) (short) 1);
        byte byte5 = versionType1.getValue();
        boolean boolean7 = versionType1.validateVersionForReads((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.fromString("update", versionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [update]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout(timeValue2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId6 = null;
        bulkShardRequest0.setParentTask(taskId6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.setShardId(shardId8);
        bulkShardRequest9.setParentTask("index.shared_filesystem", (long) 100);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel13);
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest14.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        long long10 = builder9.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.state(state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder3.state(state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.numberOfShards(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder18.creationDate((long) 10);
        int int23 = builder18.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder18.version((long) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean28 = indexMetaData26.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData26);
        long long30 = builder29.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData31 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean33 = indexMetaData31.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder34.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder35.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder29.state(state37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder25.state(state37);
        java.lang.String str41 = builder25.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder25.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder43.numberOfReplicas((int) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder45.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder47.version((long) (byte) 10);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.created_string", throwable2, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        long long6 = indexMetaData0.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings8);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings8);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings8);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings8);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout(timeValue6);
        boolean boolean8 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable10, writeResult11);
        java.lang.Throwable throwable13 = updateResult12.error;
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest14 = updateResult12.request();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(throwable13);
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest14);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        int int6 = indexMetaData2.getNumberOfReplicas();
        int int7 = indexMetaData2.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData2.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData2.getMappings();
        org.elasticsearch.index.Index index10 = indexMetaData2.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData2.requireFilters();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = indexMetaData2.primaryTerm(101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap1 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        long long3 = indexMetaData0.getCreationDate();
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        java.util.Set<java.lang.String> strSet6 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean9 = indexMetaData7.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData7.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap12 = indexMetaData7.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData13.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData7.diff(indexMetaData13);
        long long16 = indexMetaData7.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean19 = indexMetaData17.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet21 = null; // flaky: indexMetaData17.activeAllocationIds((int) '#');
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters22 = indexMetaData17.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData7.diff(indexMetaData17);
        boolean boolean25 = indexMetaData7.isSameUUID("delete");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap26 = indexMetaData7.getActiveAllocationIds();
        int int27 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean30 = indexMetaData28.equals((java.lang.Object) (short) -1);
        org.apache.lucene.util.Version version31 = indexMetaData28.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state32 = indexMetaData28.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap33 = indexMetaData28.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        boolean boolean35 = indexMetaData7.equals((java.lang.Object) builder34);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff36 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.Version version37 = indexMetaData7.getCreationVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(discoveryNodeFilters22);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(indexMetaData28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(version31);
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state32.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(indexMetaDataDiff36);
        org.junit.Assert.assertNotNull(version37);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.primaryTerm((int) (short) 0);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        long long9 = indexMetaData0.getVersion();
        long long11 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap12 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version13 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData0.mapping("active_allocations");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap16 = indexMetaData0.getActiveAllocationIds();
        int int17 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData0.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(mappingMetaData15);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest9.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        bulkShardRequest9.remoteAddress(transportAddress12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("hi!");
        bulkShardRequest17.seqNo((long) (byte) -1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap5, (org.elasticsearch.transport.TransportMessage) bulkShardRequest17);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean23 = indexMetaData21.equals((java.lang.Object) (short) -1);
        org.elasticsearch.index.Index index24 = indexMetaData21.getMergeSourceIndex();
        java.util.Set<java.lang.String> strSet26 = null; // flaky: indexMetaData21.activeAllocationIds(1);
        boolean boolean27 = strSetImmutableOpenIntMapTuple20.equals((java.lang.Object) strSet26);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap28 = strSetImmutableOpenIntMapTuple20.v1();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long30 = bulkShardRequest29.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest29.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.common.transport.TransportAddress transportAddress33 = bulkShardRequest32.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest32.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long36 = bulkShardRequest35.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest35.timeout(timeValue37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long40 = bulkShardRequest39.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue41 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest39.timeout(timeValue41);
        org.elasticsearch.action.support.IndicesOptions indicesOptions43 = bulkShardRequest42.indicesOptions();
        bulkShardRequest42.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = bulkShardRequest42.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest32.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple49 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap28, (org.elasticsearch.transport.TransportMessage) bulkShardRequest32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str51 = bulkShardRequest50.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long53 = bulkShardRequest52.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel54 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = bulkShardRequest52.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.common.transport.TransportAddress transportAddress56 = bulkShardRequest55.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId57 = bulkShardRequest55.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress58 = null;
        bulkShardRequest55.remoteAddress(transportAddress58);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel60 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest61 = bulkShardRequest55.consistencyLevel(writeConsistencyLevel60);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long63 = bulkShardRequest62.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue64 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = bulkShardRequest62.timeout(timeValue64);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long67 = bulkShardRequest66.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue68 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest69 = bulkShardRequest66.timeout(timeValue68);
        org.elasticsearch.action.support.IndicesOptions indicesOptions70 = bulkShardRequest69.indicesOptions();
        bulkShardRequest69.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel73 = bulkShardRequest69.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest74 = bulkShardRequest62.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest75 = bulkShardRequest55.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest76 = bulkShardRequest50.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel77 = bulkShardRequest76.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple78 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap28, (org.elasticsearch.transport.TransportMessage) bulkShardRequest76);
        org.elasticsearch.transport.TransportMessage transportMessage79 = strSetImmutableOpenIntMapTuple78.v2();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(index24);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNull(transportAddress33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertNotNull(indicesOptions43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel46 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel46.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest47);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest55);
        org.junit.Assert.assertNull(transportAddress56);
        org.junit.Assert.assertNotNull(taskId57);
        org.junit.Assert.assertNotNull(bulkShardRequest61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest69);
        org.junit.Assert.assertNotNull(indicesOptions70);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel73 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel73.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest74);
        org.junit.Assert.assertNotNull(bulkShardRequest75);
        org.junit.Assert.assertNotNull(bulkShardRequest76);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel77 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel77.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(transportMessage79);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.timeout(timeValue2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.timeout("current version [34] is different than the one provided [100]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [34] is different than the one provided [100]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.apache.lucene.util.Version version3 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.index.Index index8 = indexMetaData0.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(index8);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest6.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest6.getParentTask();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, false, throwable10, writeResult11);
        long long13 = bulkShardRequest6.seqNo();
        long long14 = bulkShardRequest6.seqNo();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, writeResult15);
        long long17 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, writeResult18);
        org.elasticsearch.index.shard.ShardId shardId20 = bulkShardRequest6.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = bulkShardRequest6.validate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(shardId20);
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.excludeFilters();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData9.diff(indexMetaData11);
        org.elasticsearch.Version version14 = indexMetaData11.getUpgradedVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap15 = indexMetaData11.getActiveAllocationIds();
        org.elasticsearch.index.Index index16 = indexMetaData11.getMergeSourceIndex();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long19 = bulkShardRequest18.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest18.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = bulkShardRequest21.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest21.getParentTask();
        long long24 = bulkShardRequest21.seqNo();
        boolean boolean25 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest21.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest21.validate();
        org.elasticsearch.common.collect.Tuple<java.lang.String, java.lang.Exception> strTuple28 = org.elasticsearch.common.collect.Tuple.tuple("indices:data/write/bulk[s]", (java.lang.Exception) actionRequestValidationException27);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Exception> indexMetaDataFromXContentBuilderTuple29 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData11, (java.lang.Exception) actionRequestValidationException27);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff30 = indexMetaData0.diff(indexMetaData11);
        org.elasticsearch.common.settings.Settings settings31 = indexMetaData11.getSettings();
        org.apache.lucene.util.Version version32 = indexMetaData11.getMinimumCompatibleVersion();
        org.elasticsearch.common.settings.Settings settings33 = indexMetaData11.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap15);
        org.junit.Assert.assertNull(index16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNull(transportAddress22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertNotNull(strTuple28);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple29);
        org.junit.Assert.assertNotNull(indexMetaDataDiff30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNull(version32);
        org.junit.Assert.assertNotNull(settings33);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean4 = indexMetaData2.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData2.getInitialRecoveryFilters();
        long long8 = indexMetaData2.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = indexMetaData2.getState();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData2.getSettings();
        boolean boolean11 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings10);
        boolean boolean12 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.settings(settings10);
        java.lang.String[] strArray53 = new java.lang.String[] { "index.blocks.metadata", "current version [-1] is different than the one provided [32]", "index.shadow_replicas", "index.shared_filesystem", "index.creation_date_string", "index.shadow_replicas", "index.number_of_replicas", "current version [-1] is different than the one provided [1]", "index.shared_filesystem", "index.shared_filesystem", "index.blocks.read_only", "index.blocks.read", "active_allocations", "index.blocks.metadata", "", "index.version.created", "index.shadow_replicas", "index.auto_expand_replicas", "index.auto_expand_replicas", "current version [0] is different than the one provided [-1]", "indices:data/write/bulk[s]", "index.creation_date", "current version [100] is different than the one provided [10]", "current version [1] is different than the one provided [10]", "current version [-1] is different than the one provided [-1]", "current version [1] is different than the one provided [-1]", "index.blocks.metadata", "index.shared_filesystem", "index.blocks.read", "current version [100] is different than the one provided [100]", "index.blocks.read_only", "current version [0] is different than the one provided [-1]", "current version [100] is different than the one provided [2]", "index.blocks.read_only", "index.shared_filesystem.recover_on_any_node", "primary_terms", "current version [0] is different than the one provided [-1]", "current version [1] is different than the one provided [10]" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder13.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet54);
        int int57 = builder13.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom59 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder13.putCustom("current version [98] is different than the one provided [0]", custom59);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = builder60.build();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap62 = indexMetaData61.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap63 = indexMetaData61.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData64 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean66 = indexMetaData64.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData64);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters68 = indexMetaData64.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap69 = indexMetaData64.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest70 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long71 = bulkShardRequest70.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel72 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest73 = bulkShardRequest70.consistencyLevel(writeConsistencyLevel72);
        org.elasticsearch.common.transport.TransportAddress transportAddress74 = bulkShardRequest73.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId75 = bulkShardRequest73.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress76 = null;
        bulkShardRequest73.remoteAddress(transportAddress76);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel78 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest79 = bulkShardRequest73.consistencyLevel(writeConsistencyLevel78);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest81 = bulkShardRequest79.index("hi!");
        bulkShardRequest81.seqNo((long) (byte) -1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple84 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap69, (org.elasticsearch.transport.TransportMessage) bulkShardRequest81);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData85 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean87 = indexMetaData85.equals((java.lang.Object) (short) -1);
        org.elasticsearch.index.Index index88 = indexMetaData85.getMergeSourceIndex();
        java.util.Set<java.lang.String> strSet90 = null; // flaky: indexMetaData85.activeAllocationIds(1);
        boolean boolean91 = strSetImmutableOpenIntMapTuple84.equals((java.lang.Object) strSet90);
        org.elasticsearch.transport.TransportMessage transportMessage92 = strSetImmutableOpenIntMapTuple84.v2();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap93 = strSetImmutableOpenIntMapTuple84.v1();
        org.elasticsearch.transport.TransportMessage transportMessage94 = strSetImmutableOpenIntMapTuple84.v2();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>> indexMetaDataFromXContentBuilderTuple95 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData61, strSetImmutableOpenIntMapTuple84);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(strImmutableOpenMap62);
        org.junit.Assert.assertNotNull(strImmutableOpenMap63);
        org.junit.Assert.assertNotNull(indexMetaData64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(discoveryNodeFilters68);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest73);
        org.junit.Assert.assertNull(transportAddress74);
        org.junit.Assert.assertNotNull(taskId75);
        org.junit.Assert.assertNotNull(bulkShardRequest79);
        org.junit.Assert.assertNotNull(bulkShardRequest81);
        org.junit.Assert.assertNotNull(indexMetaData85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(index88);
        org.junit.Assert.assertNull(strSet90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(transportMessage92);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap93);
        org.junit.Assert.assertNotNull(transportMessage94);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple95);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData6.getState();
        org.elasticsearch.index.Index index8 = indexMetaData6.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData9.getInitialRecoveryFilters();
        boolean boolean12 = indexMetaData9.isSameUUID("index.shared_filesystem");
        org.elasticsearch.Version version13 = indexMetaData9.getCreationVersion();
        boolean boolean14 = indexMetaData6.equals((java.lang.Object) version13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean18 = indexMetaData16.equals((java.lang.Object) (short) -1);
        org.apache.lucene.util.Version version19 = indexMetaData16.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state20 = indexMetaData16.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap21 = indexMetaData16.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long23 = indexMetaData22.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long25 = indexMetaData24.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff26 = indexMetaData22.diff(indexMetaData24);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData28 = indexMetaData24.mappingOrDefault("index.version.created_string");
        boolean boolean30 = indexMetaData24.equals((java.lang.Object) (byte) -1);
        int int31 = indexMetaData24.getNumberOfReplicas();
        long long32 = indexMetaData24.getCreationDate();
        int int33 = indexMetaData24.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap34 = indexMetaData24.getMappings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff35 = indexMetaData16.diff(indexMetaData24);
        java.util.Set<java.lang.String> strSet37 = indexMetaData16.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state38 = indexMetaData16.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder15.state(state38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder5.state(state38);
        byte byte41 = state38.id();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(version19);
        org.junit.Assert.assertTrue("'" + state20 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state20.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff26);
        org.junit.Assert.assertNull(mappingMetaData28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap34);
        org.junit.Assert.assertNotNull(indexMetaDataDiff35);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + state38 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state38.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version2 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long7 = indexMetaData6.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData4.diff(indexMetaData6);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData6.mappingOrDefault("index.version.created_string");
        boolean boolean12 = indexMetaData6.equals((java.lang.Object) (byte) -1);
        int int13 = indexMetaData6.getNumberOfReplicas();
        long long14 = indexMetaData6.getCreationDate();
        int int15 = indexMetaData6.getTotalNumberOfShards();
        org.apache.lucene.util.Version version16 = indexMetaData6.getMinimumCompatibleVersion();
        org.elasticsearch.common.settings.Settings settings17 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings18 = indexMetaData6.getSettings();
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder3.settings(settings19);
        boolean boolean21 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings19);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(version16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.index.Index index3 = indexMetaData0.getMergeSourceIndex();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean3 = versionType1.validateVersionForWrites((long) (short) 100);
        boolean boolean5 = versionType1.validateVersionForWrites((long) (byte) 10);
        boolean boolean7 = versionType1.validateVersionForWrites(1L);
        boolean boolean9 = versionType1.validateVersionForWrites(1L);
        long long12 = versionType1.updateVersion((long) '#', (long) 0);
        boolean boolean14 = versionType1.validateVersionForWrites((long) 'a');
        boolean boolean16 = versionType1.validateVersionForWrites((long) 101);
        boolean boolean20 = versionType1.isVersionConflictForWrites((long) (byte) 0, (long) 32, true);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = indexMetaData0.getState();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.apache.lucene.util.Version version6 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mappingOrDefault("current version [0] is different than the one provided [52]");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingMetaData10.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + state1 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state1.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNull(mappingMetaData10);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        bulkShardRequest0.remoteAddress(transportAddress5);
        bulkShardRequest0.setParentTask("index.shared_filesystem", 101L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest0.index("index.blocks.read_only");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue17 = bulkShardRequest16.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest12.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long20 = bulkShardRequest19.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue24 = bulkShardRequest23.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest19.timeout(timeValue24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest18.timeout(timeValue24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long28 = bulkShardRequest27.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue29 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = bulkShardRequest27.timeout(timeValue29);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest27.index("active_allocations");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest27.index("primary_terms");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long36 = bulkShardRequest35.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest35.timeout(timeValue37);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long40 = bulkShardRequest39.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue41 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest39.timeout(timeValue41);
        org.elasticsearch.action.support.IndicesOptions indicesOptions43 = bulkShardRequest42.indicesOptions();
        bulkShardRequest42.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = bulkShardRequest42.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest34.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = bulkShardRequest26.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput51 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest50.writeTo(streamOutput51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest30);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertNotNull(indicesOptions43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel46 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel46.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest47);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
        org.junit.Assert.assertNotNull(bulkShardRequest49);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest5.setShardId(shardId6);
        long long8 = bulkShardRequest5.seqNo();
        long long9 = bulkShardRequest5.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.index("update");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest12.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.timeout(timeValue18);
        org.elasticsearch.action.support.IndicesOptions indicesOptions20 = bulkShardRequest19.indicesOptions();
        bulkShardRequest19.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel23);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(indicesOptions20);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout(timeValue6);
        boolean boolean8 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable10, writeResult11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = updateResult12.request();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bulkShardRequest13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate(102L);
        java.lang.String str4 = builder1.index();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index.version.minimum_compatible" + "'", str4, "index.version.minimum_compatible");
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData6);
        int int9 = indexMetaData6.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.creationDate(103L);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean15 = indexMetaData13.equals((java.lang.Object) (short) -1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap16 = indexMetaData13.getAliases();
        java.util.Set<java.lang.String> strSet18 = null; // flaky: indexMetaData13.activeAllocationIds(101);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = indexMetaData13.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData13.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state21 = indexMetaData13.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder12.state(state21);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder22.putMapping("current version [98] is different than the one provided [101]", "current version [3] is higher or equal to the one provided [35]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertTrue("'" + state21 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state21.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = indexMetaData0.getState();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        int int6 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + state1 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state1.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest3.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        bulkShardRequest3.remoteAddress(transportAddress6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest3.index("index.blocks.read");
        bulkShardRequest3.seqNo(0L);
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest3.getParentTask();
        long long15 = bulkShardRequest3.primaryTerm();
        long long16 = bulkShardRequest3.seqNo();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        org.elasticsearch.index.VersionType versionType2 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        long long5 = versionType2.updateVersion((-1L), (long) 'a');
        long long8 = versionType2.updateVersion((long) (byte) -1, (long) '4');
        boolean boolean10 = versionType2.validateVersionForWrites(11L);
        byte byte11 = versionType2.getValue();
        org.elasticsearch.index.VersionType versionType12 = versionType2.versionTypeForReplicationAndRecovery();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType13 = org.elasticsearch.index.VersionType.fromString("current version [-1] is higher than the one provided [10]", versionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [-1] is higher than the one provided [10]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(versionType12);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData6);
        long long9 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData0.mapping("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean15 = indexMetaData13.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData13.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.removeAlias("current version [-1] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = builder18.build();
        boolean boolean23 = indexMetaData21.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData21);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData26 = indexMetaData21.mapping("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters27 = indexMetaData21.requireFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff28 = indexMetaData0.diff(indexMetaData21);
        long long29 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long31 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(indexMetaDataDiff8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(discoveryNodeFilters17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(mappingMetaData26);
        org.junit.Assert.assertNull(discoveryNodeFilters27);
        org.junit.Assert.assertNotNull(indexMetaDataDiff28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.Version version5 = indexMetaData2.getUpgradedVersion();
        long long6 = indexMetaData2.getVersion();
        org.apache.lucene.util.Version version7 = indexMetaData2.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData2.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.timeout(timeValue11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest9.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId15 = null;
        bulkShardRequest9.setParentTask(taskId15);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest9.setShardId(shardId17);
        bulkShardRequest18.setParentTask("index.shared_filesystem", (long) 100);
        org.elasticsearch.index.shard.ShardId shardId22 = bulkShardRequest18.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest18.consistencyLevel();
        java.lang.String str24 = bulkShardRequest18.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress25 = null;
        bulkShardRequest18.remoteAddress(transportAddress25);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap8, (org.elasticsearch.transport.TransportMessage) bulkShardRequest18);
        org.elasticsearch.transport.TransportMessage transportMessage28 = strSetImmutableOpenIntMapTuple27.v2();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap29 = strSetImmutableOpenIntMapTuple27.v1();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap30 = strSetImmutableOpenIntMapTuple27.v1();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "active_allocations" + "'", str24, "active_allocations");
        org.junit.Assert.assertNotNull(transportMessage28);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap29);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap30);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.state(state5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.state(state10);
        java.lang.String str12 = builder6.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean16 = indexMetaData14.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData14);
        long long18 = builder17.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder17.state(state19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state24 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder20.state(state24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder13.state(state24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom28 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder13.putCustom("current version [0] is higher than the one provided [98]", custom28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder13.version(0L);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + state24 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state24.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest8.timeout(timeValue13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest7.timeout(timeValue13);
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.ActionRequest actionRequest18 = bulkItemRequest17.request();
        boolean boolean19 = actionRequest18.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(actionRequest18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.apache.lucene.util.Version version3 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean9 = indexMetaData7.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData7.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean15 = indexMetaData13.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData13.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap18 = indexMetaData13.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData19.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff21 = indexMetaData13.diff(indexMetaData19);
        boolean boolean22 = indexMetaData7.equals((java.lang.Object) indexMetaData19);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters23 = indexMetaData7.getInitialRecoveryFilters();
        org.elasticsearch.Version version24 = indexMetaData7.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state25 = indexMetaData7.getState();
        boolean boolean26 = indexMetaData0.equals((java.lang.Object) indexMetaData7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean31 = indexMetaData29.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData29);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters33 = indexMetaData29.getInitialRecoveryFilters();
        long long35 = indexMetaData29.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = indexMetaData29.getState();
        org.elasticsearch.common.settings.Settings settings37 = indexMetaData29.getSettings();
        boolean boolean38 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings37);
        boolean boolean39 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder28.settings(settings37);
        java.lang.String[] strArray80 = new java.lang.String[] { "index.blocks.metadata", "current version [-1] is different than the one provided [32]", "index.shadow_replicas", "index.shared_filesystem", "index.creation_date_string", "index.shadow_replicas", "index.number_of_replicas", "current version [-1] is different than the one provided [1]", "index.shared_filesystem", "index.shared_filesystem", "index.blocks.read_only", "index.blocks.read", "active_allocations", "index.blocks.metadata", "", "index.version.created", "index.shadow_replicas", "index.auto_expand_replicas", "index.auto_expand_replicas", "current version [0] is different than the one provided [-1]", "indices:data/write/bulk[s]", "index.creation_date", "current version [100] is different than the one provided [10]", "current version [1] is different than the one provided [10]", "current version [-1] is different than the one provided [-1]", "current version [1] is different than the one provided [-1]", "index.blocks.metadata", "index.shared_filesystem", "index.blocks.read", "current version [100] is different than the one provided [100]", "index.blocks.read_only", "current version [0] is different than the one provided [-1]", "current version [100] is different than the one provided [2]", "index.blocks.read_only", "index.shared_filesystem.recover_on_any_node", "primary_terms", "current version [0] is different than the one provided [-1]", "current version [1] is different than the one provided [10]" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder83 = builder40.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet81);
        int int84 = builder40.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom86 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder87 = builder40.putCustom("current version [98] is different than the one provided [0]", custom86);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData88 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean90 = indexMetaData88.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet92 = null; // flaky: indexMetaData88.activeAllocationIds((int) '#');
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters93 = indexMetaData88.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap94 = indexMetaData88.getCustoms();
        org.elasticsearch.common.settings.Settings settings95 = indexMetaData88.getSettings();
        org.elasticsearch.common.settings.Settings settings96 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings95);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder97 = builder87.settings(settings96);
        boolean boolean98 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings96);
        boolean boolean99 = indexMetaData7.equals((java.lang.Object) boolean98);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(discoveryNodeFilters17);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertNotNull(indexMetaDataDiff21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertTrue("'" + state25 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state25.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(discoveryNodeFilters33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(indexMetaData88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(strSet92);
        org.junit.Assert.assertNull(discoveryNodeFilters93);
        org.junit.Assert.assertNotNull(strImmutableOpenMap94);
        org.junit.Assert.assertNotNull(settings95);
        org.junit.Assert.assertNotNull(settings96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData0.getCustoms();
        long long12 = indexMetaData0.primaryTerm((int) (byte) 0);
        long long14 = indexMetaData0.primaryTerm(0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest6.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest2.timeout(timeValue7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest9.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest8.timeout(timeValue14);
        boolean boolean17 = bulkShardRequest16.getShouldPersistResult();
        java.lang.String str18 = bulkShardRequest16.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long21 = bulkShardRequest20.primaryTerm();
        boolean boolean22 = bulkShardRequest20.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = bulkShardRequest20.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, true, (java.lang.Throwable) actionRequestValidationException23, writeResult24);
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, false, throwable27, writeResult28);
        boolean boolean30 = updateResult29.success();
        org.elasticsearch.action.update.UpdateResponse updateResponse31 = updateResult29.noopResult;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(updateResponse31);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap10 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        long long6 = indexMetaData0.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        java.lang.Class<?> wildcardClass8 = indexMetaData0.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout(timeValue6);
        boolean boolean8 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable10, writeResult11);
        long long13 = bulkShardRequest1.seqNo();
        long long14 = bulkShardRequest1.seqNo();
        long long15 = bulkShardRequest1.primaryTerm();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 0);
        boolean boolean3 = versionType1.validateVersionForWrites((long) (short) 100);
        boolean boolean6 = versionType1.isVersionConflictForReads((long) 1, 11L);
        boolean boolean8 = versionType1.validateVersionForWrites(11L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType1.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.removeAlias("current version [-1] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.removeAllAliases();
        long long9 = builder8.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean13 = indexMetaData11.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder14.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state17 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder15.state(state17);
        java.lang.String[] strArray45 = new java.lang.String[] { "index.uuid", "index.auto_expand_replicas", "current version [-1] is different than the one provided [1]", "current version [10] is higher or equal to the one provided [10]", "state-", "current version [-1] is different than the one provided [1]", "_na_", "index.blocks.read_only", "index.priority", "_na_", "index.version.created_string", "index.blocks.read_only", "index.version.created_string", "index.version.upgraded_string", "index.version.created", "index.version.created_string", "", "index.creation_date", "current version [-1] is different than the one provided [10]", "index.number_of_shards", "index.shared_filesystem", "index.shared_filesystem", "primary_terms", "index.", "index.version.minimum_compatible" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder18.putActiveAllocationIds((int) '#', (java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder8.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData50 = builder49.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData50);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + state17 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state17.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(indexMetaData50);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout(timeValue6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest1.setShardId(shardId8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        bulkShardRequest1.remoteAddress(transportAddress10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest1.index("current version [52] is higher than the one provided [10]");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        int int15 = bulkItemRequest14.id();
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest14.request();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest14.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(actionRequest16);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest13.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest13.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        bulkShardRequest13.remoteAddress(transportAddress16);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long21 = bulkShardRequest20.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest20.timeout(timeValue22);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long25 = bulkShardRequest24.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest24.timeout(timeValue26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions28 = bulkShardRequest27.indicesOptions();
        bulkShardRequest27.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = bulkShardRequest27.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest20.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long36 = bulkShardRequest35.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = bulkShardRequest38.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId40 = bulkShardRequest38.getParentTask();
        long long41 = bulkShardRequest38.seqNo();
        boolean boolean42 = bulkShardRequest38.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId43 = bulkShardRequest38.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException44 = bulkShardRequest38.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult45 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult46 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, false, (java.lang.Throwable) actionRequestValidationException44, writeResult45);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting7, "current version [-1] is different than the one provided [1]", (java.lang.Throwable) actionRequestValidationException44, "index.data_path");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting5, "", (java.lang.Throwable) actionRequestValidationException44, "index.uuid");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult51 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult52 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, actionRequest3, true, (java.lang.Throwable) actionRequestValidationException44, writeResult51);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [10] is higher or equal to the one provided [10]", (java.lang.Throwable) actionRequestValidationException44, "current version [100] is different than the one provided [10]");
        java.lang.Throwable throwable55 = shardFailure54.cause;
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(transportAddress14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNotNull(indicesOptions28);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest38);
        org.junit.Assert.assertNull(transportAddress39);
        org.junit.Assert.assertNotNull(taskId40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertNotNull(actionRequestValidationException44);
        org.junit.Assert.assertNotNull(throwable55);
        org.junit.Assert.assertEquals(throwable55.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable55.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable55.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        int int6 = indexMetaData0.getTotalNumberOfShards();
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("current version [98] is different than the one provided [-1]");
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff11 = indexMetaData0.readDiffFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        long long5 = indexMetaData0.getCreationDate();
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = indexMetaData0.getState();
        long long8 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state7.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        bulkShardRequest7.setParentTask(taskId13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest7.setShardId(shardId15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage> strSetImmutableOpenIntMapTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.transport.TransportMessage>(strSetImmutableOpenIntMap6, (org.elasticsearch.transport.TransportMessage) bulkShardRequest16);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap18 = strSetImmutableOpenIntMapTuple17.v1();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = strSetImmutableOpenIntMapTuple17.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean22 = indexMetaData20.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData20);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters24 = indexMetaData20.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData20);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean28 = indexMetaData26.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData26);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters30 = indexMetaData26.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap31 = indexMetaData26.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData32 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters33 = indexMetaData32.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff34 = indexMetaData26.diff(indexMetaData32);
        boolean boolean35 = indexMetaData20.equals((java.lang.Object) indexMetaData32);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters36 = indexMetaData20.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap37 = indexMetaData20.getMappings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData39 = indexMetaData20.mapping("index.blocks.read");
        org.elasticsearch.common.settings.Settings settings40 = indexMetaData20.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters41 = indexMetaData20.requireFilters();
        org.elasticsearch.common.settings.Settings settings42 = indexMetaData20.getSettings();
        boolean boolean43 = strSetImmutableOpenIntMapTuple17.equals((java.lang.Object) indexMetaData20);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters44 = indexMetaData20.requireFilters();
        org.elasticsearch.Version version45 = indexMetaData20.getUpgradedVersion();
        org.apache.lucene.util.Version version46 = indexMetaData20.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap18);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(discoveryNodeFilters24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(discoveryNodeFilters30);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap31);
        org.junit.Assert.assertNotNull(indexMetaData32);
        org.junit.Assert.assertNull(discoveryNodeFilters33);
        org.junit.Assert.assertNotNull(indexMetaDataDiff34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters36);
        org.junit.Assert.assertNotNull(strImmutableOpenMap37);
        org.junit.Assert.assertNull(mappingMetaData39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertNull(discoveryNodeFilters41);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters44);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertNull(version46);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.timeout(timeValue3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("active_allocations");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        bulkShardRequest1.setParentTask(taskId7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.setShardId(shardId9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = bulkShardRequest16.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest16.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long20 = bulkShardRequest19.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest19.timeout(timeValue21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long24 = bulkShardRequest23.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest23.timeout(timeValue25);
        org.elasticsearch.action.support.IndicesOptions indicesOptions27 = bulkShardRequest26.indicesOptions();
        bulkShardRequest26.primaryTerm((long) (-1));
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = bulkShardRequest26.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest16.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest(101, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.ActionRequest actionRequest35 = bulkItemRequest34.request();
        boolean boolean36 = actionRequest35.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNotNull(indicesOptions27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(actionRequest35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.includeFilters();
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int11 = indexMetaData0.getTotalNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.timeout(timeValue6);
        boolean boolean8 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest1.timeout();
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, false, throwable11, writeResult12);
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest1.remoteAddress();
        bulkShardRequest1.setParentTask("current version [52] is higher than the one provided [10]", (long) (short) 10);
        java.lang.String str18 = bulkShardRequest1.index();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting19 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.action.update.UpdateHelper.Result result20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest21.primaryTerm((long) (byte) 1);
        long long24 = bulkShardRequest21.primaryTerm();
        bulkShardRequest21.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue28 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest21.timeout(timeValue28);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result20, (org.elasticsearch.action.ActionRequest) bulkShardRequest29, writeResult30);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.action.bulk.BulkShardRequest> toXContentToBytesTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.action.bulk.BulkShardRequest>((org.elasticsearch.action.support.ToXContentToBytes) intSetting19, bulkShardRequest29);
        long long33 = bulkShardRequest29.primaryTerm();
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = bulkShardRequest29.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress35 = null;
        bulkShardRequest29.remoteAddress(transportAddress35);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.transport.TransportMessage> streamableTuple37 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest1, (org.elasticsearch.transport.TransportMessage) bulkShardRequest29);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest1.index("current version [100] is higher or equal to the one provided [1]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNull(transportAddress14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intSetting19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNull(transportAddress34);
        org.junit.Assert.assertNotNull(streamableTuple37);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int6 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap8 = indexMetaData0.getMappings();
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = indexMetaData10.getState();
        org.elasticsearch.index.Index index12 = indexMetaData10.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData10.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData10.excludeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData10);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData0.requireFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData2.requireFilters();
        long long7 = indexMetaData2.getVersion();
        org.apache.lucene.util.Version version8 = indexMetaData2.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData2.getActiveAllocationIds();
        org.elasticsearch.Version version10 = indexMetaData2.getCreationVersion();
        org.apache.lucene.util.Version version11 = indexMetaData2.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNull(version11);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.settings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean9 = indexMetaData7.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        long long11 = builder10.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.state(state12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder6.state(state12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder14.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder15.primaryTerm(0, (long) 'a');
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder15.putAlias(aliasMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean8 = indexMetaData6.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap11 = indexMetaData6.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData12.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData6.diff(indexMetaData12);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) indexMetaData12);
        org.apache.lucene.util.Version version16 = indexMetaData12.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData12.excludeFilters();
        org.elasticsearch.common.settings.Settings settings18 = indexMetaData12.getSettings();
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean24 = indexMetaData22.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData22);
        long long26 = builder25.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state27 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder25.state(state27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder28.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder30.creationDate((long) (byte) 100);
        long long33 = builder30.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData34 = builder30.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData34);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state38 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple39 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest36, state38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder35.state(state38);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData42 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap43 = indexMetaData42.getAliases();
        org.elasticsearch.Version version44 = indexMetaData42.getUpgradedVersion();
        org.apache.lucene.util.Version version45 = indexMetaData42.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData42);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap47 = indexMetaData42.getCustoms();
        java.util.Set<java.lang.String> strSet49 = indexMetaData42.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder40.putActiveAllocationIds(0, strSet49);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData51 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean53 = indexMetaData51.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData51);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap55 = indexMetaData51.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData51);
        int int57 = indexMetaData51.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData51);
        org.elasticsearch.common.settings.Settings settings59 = indexMetaData51.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder50.settings(settings59);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.settings.Settings> paramsTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.settings.Settings>(params21, settings59);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData62 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean64 = indexMetaData62.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData62);
        org.elasticsearch.Version version66 = indexMetaData62.getUpgradedVersion();
        long long67 = indexMetaData62.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters68 = indexMetaData62.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData62);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings settings72 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder71.settings(settings72);
        java.lang.String str74 = builder73.index();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData75 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean77 = indexMetaData75.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet79 = null; // flaky: indexMetaData75.activeAllocationIds((int) '#');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData81 = indexMetaData75.mapping("active_allocations");
        org.elasticsearch.common.settings.Settings settings82 = indexMetaData75.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder83 = builder73.settings(settings82);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder84 = builder69.settings(settings82);
        java.lang.Class<?> wildcardClass85 = builder69.getClass();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, java.lang.reflect.AnnotatedElement> paramsTuple86 = org.elasticsearch.common.collect.Tuple.tuple(params21, (java.lang.reflect.AnnotatedElement) wildcardClass85);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder87 = settings19.toXContent(xContentBuilder20, params21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(version16);
        org.junit.Assert.assertNull(discoveryNodeFilters17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + state27 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state27.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + state38 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state38.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(transportMessageTuple39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(indexMetaData42);
        org.junit.Assert.assertNotNull(strImmutableOpenMap43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNull(version45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strImmutableOpenMap47);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(indexMetaData51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strImmutableOpenMap55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(indexMetaData62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "index.shadow_replicas" + "'", str74, "index.shadow_replicas");
        org.junit.Assert.assertNotNull(indexMetaData75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(strSet79);
        org.junit.Assert.assertNull(mappingMetaData81);
        org.junit.Assert.assertNotNull(settings82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(paramsTuple86);
    }
}
