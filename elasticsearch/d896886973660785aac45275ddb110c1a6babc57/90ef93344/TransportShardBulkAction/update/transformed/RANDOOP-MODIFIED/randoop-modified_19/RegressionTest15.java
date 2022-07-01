import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure6 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", throwable4, "");
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure6, (org.elasticsearch.transport.TransportMessage) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.index("hi!");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str18 = bulkShardRequest17.index();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest16, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = bulkItemRequestTuple19.v1();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, false, throwable29, writeResult30);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest23, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.action.ActionRequest actionRequest34 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest34);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest35, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest36);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest23, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest36);
        int int39 = bulkItemRequest23.id();
        org.elasticsearch.action.update.UpdateHelper.Result result40 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest43 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.update.UpdateHelper.Result result44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest46);
        java.lang.Throwable throwable49 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult50 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult51 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result44, (org.elasticsearch.action.ActionRequest) bulkShardRequest46, false, throwable49, writeResult50);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple52 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest43, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest46);
        java.lang.Throwable throwable54 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult55 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult56 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result40, (org.elasticsearch.action.ActionRequest) bulkShardRequest46, true, throwable54, writeResult55);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest57 = updateResult56.request();
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest58 = updateResult56.request();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple59 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest23, bulkShardRequestReplicationRequest58);
        boolean boolean60 = bulkItemRequestTuple19.equals((java.lang.Object) bulkItemRequestTuple59);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest61 = bulkItemRequestTuple19.v2();
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest62 = bulkItemRequestTuple19.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest63 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicationRequest62);
        bulkShardRequestReplicationRequest62.setParentTask("primary_terms", (long) (byte) 3);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(bulkItemRequest20);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest57);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest61);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest62);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int9 = builder8.numberOfShards();
        java.lang.String[] strArray13 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder8.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder3.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple18 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (java.lang.Iterable<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData0.getAliases();
        int int20 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData0.excludeFilters();
        org.elasticsearch.Version version22 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData23);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap25 = indexMetaData23.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet26 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData23, indexShardStateSet26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData23);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData29);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap31 = indexMetaData29.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet32 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple33 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData29, indexShardStateSet32);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters34 = indexMetaData29.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData29);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff36 = indexMetaData23.diff(indexMetaData29);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder39.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder40.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int46 = builder45.numberOfShards();
        java.lang.String[] strArray50 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder45.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = builder40.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple55 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData37, (java.lang.Iterable<java.lang.String>) strSet51);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap56 = indexMetaData37.getAliases();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff57 = indexMetaData23.diff(indexMetaData37);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>> indexMetaDataTuple58 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>>(indexMetaData0, indexMetaDataDiff57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData61 = indexMetaData0.mappingOrDefault("current version [10] is higher than the one provided [98]");
        org.elasticsearch.common.io.stream.StreamInput streamInput62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData63 = indexMetaData0.readFrom(streamInput62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(indexMetaData23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap25);
        org.junit.Assert.assertNotNull(indexShardStateSet26);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap31);
        org.junit.Assert.assertNotNull(indexShardStateSet32);
        org.junit.Assert.assertNull(discoveryNodeFilters34);
        org.junit.Assert.assertNotNull(indexMetaDataDiff36);
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple55);
        org.junit.Assert.assertNotNull(strImmutableOpenMap56);
        org.junit.Assert.assertNotNull(indexMetaDataDiff57);
        org.junit.Assert.assertNull(mappingMetaData61);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.tasks.TaskId taskId18 = null;
        bulkShardRequest11.setParentTask(taskId18);
        org.elasticsearch.index.shard.ShardId shardId20 = bulkShardRequest11.shardId();
        bulkShardRequest11.seqNo((long) 0);
        java.lang.Throwable throwable24 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable24, writeResult25);
        long long27 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, writeResult28);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, writeResult30);
        boolean boolean32 = updateResult31.failure();
        org.elasticsearch.action.ActionRequest actionRequest33 = updateResult31.actionRequest;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, actionRequest33, writeResult34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, actionRequest33);
        actionRequest33.setParentTask("delete", (long) (byte) 100);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', actionRequest33);
        org.junit.Assert.assertNull(shardId20);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(actionRequest33);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean22 = versionType18.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest8, versionType18);
        boolean boolean27 = versionType18.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) boolean27);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters29 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean31 = indexMetaData0.isSameUUID("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings33 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings34 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings33);
        org.elasticsearch.transport.TransportService transportService35 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService36 = null;
        org.elasticsearch.indices.IndicesService indicesService37 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool38 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction39 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction40 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper41 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters42 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction44 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings34, transportService35, clusterService36, indicesService37, threadPool38, shardStateAction39, mappingUpdatedAction40, updateHelper41, actionFilters42, indexNameExpressionResolver43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(settings34);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getCreationDate();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest3, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        boolean boolean6 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting9, "", throwable11, "");
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable17 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, false, throwable17, writeResult18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure13, (org.elasticsearch.transport.TransportMessage) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest15.index("hi!");
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.update.UpdateHelper.Result result29 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        java.lang.Throwable throwable34 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result29, (org.elasticsearch.action.ActionRequest) bulkShardRequest31, false, throwable34, writeResult35);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest28, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.ActionRequest actionRequest39 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest40, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest28, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult44 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult45 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, writeResult44);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest24, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.index.shard.ShardId shardId47 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest41.setShardId(shardId47);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple49 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
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
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        java.lang.Throwable throwable31 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, false, throwable31, writeResult32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest25, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.tasks.TaskId taskId35 = null;
        bulkShardRequest28.setParentTask(taskId35);
        org.elasticsearch.index.shard.ShardId shardId37 = bulkShardRequest28.shardId();
        bulkShardRequest28.seqNo((long) 0);
        java.lang.Throwable throwable41 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, false, throwable41, writeResult42);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException44 = bulkShardRequest28.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting20, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException44, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting18, "update", (java.lang.Throwable) actionRequestValidationException44, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting16, "_na_", (java.lang.Throwable) actionRequestValidationException44, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure52 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "primary_terms", (java.lang.Throwable) actionRequestValidationException44, "delete");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "index.blocks.read_only", (java.lang.Throwable) actionRequestValidationException44, "delete");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure56 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "index.blocks.read", (java.lang.Throwable) actionRequestValidationException44, "index.auto_expand_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure58 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "index.blocks.metadata", (java.lang.Throwable) actionRequestValidationException44, "index.version.upgraded");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure60 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "primary_terms", (java.lang.Throwable) actionRequestValidationException44, "current version [2] is higher than the one provided [-1]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure62 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.shared_filesystem", (java.lang.Throwable) actionRequestValidationException44, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure64 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "primary_terms", (java.lang.Throwable) actionRequestValidationException44, "_na_");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure66 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [0] is different than the one provided [97]", (java.lang.Throwable) actionRequestValidationException44, "index.shared_filesystem");
        org.junit.Assert.assertNull(shardId37);
        org.junit.Assert.assertNotNull(actionRequestValidationException44);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure6 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", throwable4, "");
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure6, (org.elasticsearch.transport.TransportMessage) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.index("hi!");
        bulkShardRequest8.primaryTerm(100L);
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest8.shardId();
        boolean boolean19 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest8.setShardId(shardId20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.update.UpdateHelper.Result result23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result23, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, writeResult29);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = updateResult30.request();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        boolean boolean7 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest5.setShardId(shardId8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult11);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        byte byte1 = versionType0.getValue();
        byte byte2 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType3 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = null;
        java.lang.Throwable throwable7 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure9 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting5, "", throwable7, "");
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable13 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable13, writeResult14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure9, (org.elasticsearch.transport.TransportMessage) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest11.index("hi!");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str21 = bulkShardRequest20.index();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest19, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.action.update.UpdateHelper.Result result23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        java.lang.Throwable throwable32 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult33 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult34 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest29, false, throwable32, writeResult33);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest26, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest29);
        org.elasticsearch.tasks.TaskId taskId36 = null;
        bulkShardRequest29.setParentTask(taskId36);
        org.elasticsearch.index.shard.ShardId shardId38 = bulkShardRequest29.shardId();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult39 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult40 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result23, (org.elasticsearch.action.ActionRequest) bulkShardRequest29, writeResult39);
        long long41 = bulkShardRequest29.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest19, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest29);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>> versionTypeEnumTuple43 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType0, bulkItemRequestTuple42);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(shardId38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        java.lang.Throwable throwable17 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result12, (org.elasticsearch.action.ActionRequest) bulkShardRequest14, false, throwable17, writeResult18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest14, writeResult21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = updateResult22.request();
        java.lang.String str24 = bulkShardRequest23.index();
        long long25 = bulkShardRequest23.seqNo();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult26);
        org.elasticsearch.action.update.UpdateHelper.Result result29 = null;
        org.elasticsearch.action.ActionRequest actionRequest33 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest34, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest35);
        org.elasticsearch.action.ActionRequest actionRequest39 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest40, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest43 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest34, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting48 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting50 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting52 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting54 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result56 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest59 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest58);
        org.elasticsearch.action.update.UpdateHelper.Result result60 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest63 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest62);
        java.lang.Throwable throwable65 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult66 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult67 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result60, (org.elasticsearch.action.ActionRequest) bulkShardRequest62, false, throwable65, writeResult66);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple68 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest59, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest62);
        org.elasticsearch.tasks.TaskId taskId69 = null;
        bulkShardRequest62.setParentTask(taskId69);
        org.elasticsearch.index.shard.ShardId shardId71 = bulkShardRequest62.shardId();
        bulkShardRequest62.seqNo((long) 0);
        java.lang.Throwable throwable75 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult76 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult77 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result56, (org.elasticsearch.action.ActionRequest) bulkShardRequest62, false, throwable75, writeResult76);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException78 = bulkShardRequest62.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure80 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting54, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException78, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure82 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting52, "update", (java.lang.Throwable) actionRequestValidationException78, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure84 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting50, "_na_", (java.lang.Throwable) actionRequestValidationException78, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure86 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting48, "index.blocks.metadata", (java.lang.Throwable) actionRequestValidationException78, "index.priority");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult87 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult88 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result29, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, true, (java.lang.Throwable) actionRequestValidationException78, writeResult87);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult89 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult90 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, true, (java.lang.Throwable) actionRequestValidationException78, writeResult89);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure92 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "current version [-1] is higher than the one provided [52]", (java.lang.Throwable) actionRequestValidationException78, "current version [52] is different than the one provided [1]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure94 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "current version [1] is different than the one provided [0]", (java.lang.Throwable) actionRequestValidationException78, "current version [97] is different than the one provided [97]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure96 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [97] is different than the one provided [32]", (java.lang.Throwable) actionRequestValidationException78, "current version [10] is different than the one provided [52]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure98 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is different than the one provided [0]", (java.lang.Throwable) actionRequestValidationException78, "hi!");
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(shardId71);
        org.junit.Assert.assertNotNull(actionRequestValidationException78);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, false, throwable16, writeResult17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest10, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.ActionRequest actionRequest21 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest10, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest28.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, writeResult32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest10, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, throwable5, writeResult6);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, writeResult8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel10);
        long long12 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequest actionRequest17 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest18, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.ActionRequest actionRequest23 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest24, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest21, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        java.lang.String str29 = bulkShardRequest25.index();
        bulkShardRequest25.setParentTask("index.auto_expand_replicas", 0L);
        long long33 = bulkShardRequest25.primaryTerm();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest13, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.update.UpdateHelper.Result result35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        java.lang.Throwable throwable40 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result35, (org.elasticsearch.action.ActionRequest) bulkShardRequest37, false, throwable40, writeResult41);
        org.elasticsearch.action.update.UpdateHelper.Result result43 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.update.UpdateHelper.Result result47 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest49);
        java.lang.Throwable throwable52 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult53 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult54 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result47, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, false, throwable52, writeResult53);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest46, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest49);
        java.lang.Throwable throwable57 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult58 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult59 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result43, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, true, throwable57, writeResult58);
        org.elasticsearch.index.shard.ShardId shardId60 = bulkShardRequest49.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue61 = bulkShardRequest49.timeout();
        org.elasticsearch.tasks.TaskId taskId62 = bulkShardRequest49.getParentTask();
        bulkShardRequest37.setParentTask(taskId62);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple64 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest13, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest37);
        org.elasticsearch.common.io.stream.StreamInput streamInput65 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest37.readFrom(streamInput65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(shardId60);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertNotNull(taskId62);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        java.lang.Throwable throwable13 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, false, throwable13, writeResult14);
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue19 = bulkShardRequest18.timeout();
        java.lang.String str20 = bulkShardRequest18.index();
        org.elasticsearch.common.unit.TimeValue timeValue21 = bulkShardRequest18.timeout();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting23 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting25 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        java.lang.Throwable throwable36 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, false, throwable36, writeResult37);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple39 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest30, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest33);
        org.elasticsearch.tasks.TaskId taskId40 = null;
        bulkShardRequest33.setParentTask(taskId40);
        org.elasticsearch.index.shard.ShardId shardId42 = bulkShardRequest33.shardId();
        bulkShardRequest33.seqNo((long) 0);
        java.lang.Throwable throwable46 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult47 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult48 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, false, throwable46, writeResult47);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException49 = bulkShardRequest33.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure51 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting25, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException49, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure53 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting23, "update", (java.lang.Throwable) actionRequestValidationException49, "index.version.created_string");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult54 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult55 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest18, false, (java.lang.Throwable) actionRequestValidationException49, writeResult54);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult56 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult57 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, false, (java.lang.Throwable) actionRequestValidationException49, writeResult56);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple58 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        long long59 = bulkShardRequest10.primaryTerm();
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNull(shardId42);
        org.junit.Assert.assertNotNull(actionRequestValidationException49);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getCreationDate();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData7.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet10 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData7, indexShardStateSet10);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData7.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest18, false, throwable21, writeResult22);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest15, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.index.VersionType versionType25 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean29 = versionType25.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest15, versionType25);
        boolean boolean34 = versionType25.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean35 = indexMetaData7.equals((java.lang.Object) boolean34);
        int int36 = indexMetaData7.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = indexMetaData7.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder40.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder41.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int47 = builder46.numberOfShards();
        java.lang.String[] strArray51 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = builder46.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder41.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple56 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData38, (java.lang.Iterable<java.lang.String>) strSet52);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap57 = indexMetaData38.getAliases();
        int int58 = indexMetaData38.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters59 = indexMetaData38.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap60 = indexMetaData38.getAliases();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff61 = indexMetaData7.diff(indexMetaData38);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff62 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters63 = indexMetaData7.getInitialRecoveryFilters();
        long long65 = indexMetaData7.primaryTerm(0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertNotNull(indexShardStateSet10);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple56);
        org.junit.Assert.assertNotNull(strImmutableOpenMap57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters59);
        org.junit.Assert.assertNotNull(strImmutableOpenMap60);
        org.junit.Assert.assertNotNull(indexMetaDataDiff61);
        org.junit.Assert.assertNotNull(indexMetaDataDiff62);
        org.junit.Assert.assertNull(discoveryNodeFilters63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting1 = null;
        java.lang.Throwable throwable3 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure5 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting1, "", throwable3, "");
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable9 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure5, (org.elasticsearch.transport.TransportMessage) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest7.index("hi!");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str17 = bulkShardRequest16.index();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple18 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest15, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.update.UpdateHelper.Result result23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        java.lang.Throwable throwable28 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result23, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, false, throwable28, writeResult29);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple31 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.tasks.TaskId taskId32 = null;
        bulkShardRequest25.setParentTask(taskId32);
        org.elasticsearch.index.shard.ShardId shardId34 = bulkShardRequest25.shardId();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, writeResult35);
        long long37 = bulkShardRequest25.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest15, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        bulkShardRequest25.primaryTerm((long) '#');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest25.index("current version [52] is different than the one provided [32]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel43 = bulkShardRequest25.consistencyLevel();
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(shardId34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel43 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel43.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        java.util.LinkedHashSet<java.lang.String> strSet1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, false, throwable6, writeResult7);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, writeResult9);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest4.setShardId(shardId11);
        org.elasticsearch.common.collect.Tuple<java.util.LinkedHashSet<java.lang.String>, org.elasticsearch.action.IndicesRequest> strSetTuple13 = new org.elasticsearch.common.collect.Tuple<java.util.LinkedHashSet<java.lang.String>, org.elasticsearch.action.IndicesRequest>(strSet1, (org.elasticsearch.action.IndicesRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequest actionRequest15 = bulkItemRequest14.request();
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.action.ActionRequest actionRequest19 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest20, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        bulkShardRequest21.remoteAddress(transportAddress23);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = bulkShardRequest21.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(35, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting28 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.update.UpdateHelper.Result result35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        java.lang.Throwable throwable40 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result35, (org.elasticsearch.action.ActionRequest) bulkShardRequest37, false, throwable40, writeResult41);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest34, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest37);
        org.elasticsearch.tasks.TaskId taskId44 = null;
        bulkShardRequest37.setParentTask(taskId44);
        java.lang.Throwable throwable47 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult48 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult49 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest37, true, throwable47, writeResult48);
        org.elasticsearch.action.support.IndicesOptions indicesOptions50 = bulkShardRequest37.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest51 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException52 = bulkShardRequest37.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting28, "index.version.upgraded_string", (java.lang.Throwable) actionRequestValidationException52, "_na_");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult55 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult56 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest21, true, (java.lang.Throwable) actionRequestValidationException52, writeResult55);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple57 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest14, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest58 = bulkItemRequestTuple57.v1();
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(actionRequest15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions50);
        org.junit.Assert.assertNotNull(actionRequestValidationException52);
        org.junit.Assert.assertNotNull(bulkItemRequest58);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean22 = versionType18.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest8, versionType18);
        boolean boolean27 = versionType18.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) boolean27);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters29 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters30 = indexMetaData0.requireFilters();
        long long31 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData33 = indexMetaData0.mapping("current version [-1] is higher than the one provided [11]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters29);
        org.junit.Assert.assertNull(discoveryNodeFilters30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNull(mappingMetaData33);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable11, writeResult12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, true, throwable16, writeResult17);
        org.elasticsearch.index.shard.ShardId shardId19 = bulkShardRequest8.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue20 = bulkShardRequest8.timeout();
        long long21 = bulkShardRequest8.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = null;
        java.lang.Throwable throwable28 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting26, "", throwable28, "");
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable34 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest32, false, throwable34, writeResult35);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure30, (org.elasticsearch.transport.TransportMessage) bulkShardRequest32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest32.index("hi!");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str42 = bulkShardRequest41.index();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest40, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest46);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel48 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = bulkShardRequest46.consistencyLevel(writeConsistencyLevel48);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest49);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple51 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest40, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest49);
        org.elasticsearch.action.ActionRequest actionRequest54 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest55 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest54);
        org.elasticsearch.action.ActionRequest actionRequest58 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest59 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest58);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest59, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest62 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest60);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple63 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest55, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.common.transport.TransportAddress transportAddress64 = null;
        bulkShardRequest60.remoteAddress(transportAddress64);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest66 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest60);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>, org.elasticsearch.action.IndicesRequest> bulkItemRequestTupleTuple67 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>, org.elasticsearch.action.IndicesRequest>(bulkItemRequestTuple51, (org.elasticsearch.action.IndicesRequest) bulkShardRequest60);
        org.elasticsearch.common.transport.TransportAddress transportAddress68 = null;
        bulkShardRequest60.remoteAddress(transportAddress68);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple70 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest24, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData71 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData71);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap73 = indexMetaData71.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet74 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple75 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData71, indexShardStateSet74);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters76 = indexMetaData71.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder77 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData71);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters78 = indexMetaData71.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder79 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData71);
        boolean boolean80 = bulkItemRequestTuple70.equals((java.lang.Object) indexMetaData71);
        org.elasticsearch.common.settings.Settings settings81 = indexMetaData71.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters82 = indexMetaData71.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder83 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData71);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder85 = builder83.removeAlias("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom87 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder88 = builder83.putCustom("index.creation_date_string", custom87);
        // The following exception was thrown during execution in test generation
        try {
            long long90 = builder83.primaryTerm((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId19);
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(bulkShardRequest49);
        org.junit.Assert.assertNotNull(indexMetaData71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap73);
        org.junit.Assert.assertNotNull(indexShardStateSet74);
        org.junit.Assert.assertNull(discoveryNodeFilters76);
        org.junit.Assert.assertNull(discoveryNodeFilters78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(settings81);
        org.junit.Assert.assertNull(discoveryNodeFilters82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean22 = versionType18.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest8, versionType18);
        boolean boolean27 = versionType18.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) boolean27);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters29 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean31 = indexMetaData0.isSameUUID("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version33 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap34 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap35 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(version33);
        org.junit.Assert.assertNotNull(strImmutableOpenMap34);
        org.junit.Assert.assertNotNull(strImmutableOpenMap35);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure6 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", throwable4, "");
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure6, (org.elasticsearch.transport.TransportMessage) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.index("index.version.created");
        long long16 = bulkShardRequest8.seqNo();
        long long17 = bulkShardRequest8.primaryTerm();
        long long18 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.update.UpdateHelper.Result result23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        java.lang.Throwable throwable28 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result23, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, false, throwable28, writeResult29);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple31 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting33 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_REPLICAS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.xcontent.ToXContent> streamableTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.xcontent.ToXContent>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest25, (org.elasticsearch.common.xcontent.ToXContent) intSetting33);
        org.elasticsearch.common.unit.TimeValue timeValue35 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = bulkShardRequest25.timeout(timeValue35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest8.timeout(timeValue35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest(35, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        long long40 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.ActionRequest actionRequest43 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest43);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest44, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        java.lang.String str48 = bulkShardRequest45.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel49 = bulkShardRequest45.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel49);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(intSetting33);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(bulkShardRequest36);
        org.junit.Assert.assertNotNull(bulkShardRequest37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel49 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel49.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest50);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, false, throwable16, writeResult17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest10, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.ActionRequest actionRequest21 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest10, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting27 = null;
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure31 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting27, "", throwable29, "");
        org.elasticsearch.action.update.UpdateHelper.Result result32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable35 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result32, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, false, throwable35, writeResult36);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure31, (org.elasticsearch.transport.TransportMessage) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest33.index("index.version.created");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest40);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest40, writeResult42);
        boolean boolean44 = updateResult43.failure();
        boolean boolean45 = updateResult43.failure();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult46 = updateResult43.writeResult;
        java.lang.Throwable throwable47 = updateResult43.error;
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(writeResult46);
        org.junit.Assert.assertNull(throwable47);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean22 = versionType18.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest8, versionType18);
        boolean boolean27 = versionType18.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) boolean27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long30 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap31 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state32 = indexMetaData0.getState();
        int int33 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.index.VersionType versionType34 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean36 = versionType34.validateVersionForWrites((long) (byte) 100);
        java.lang.Class<?> wildcardClass37 = versionType34.getClass();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent, java.lang.reflect.GenericDeclaration> toXContentTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent, java.lang.reflect.GenericDeclaration>((org.elasticsearch.common.xcontent.ToXContent) indexMetaData0, (java.lang.reflect.GenericDeclaration) wildcardClass37);
        java.util.Set<java.lang.String> strSet40 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 2);
        org.elasticsearch.common.settings.Settings settings41 = indexMetaData0.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap31);
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state32.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(versionType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(strSet40);
        org.junit.Assert.assertNotNull(settings41);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "");
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, false, throwable8, writeResult9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure4, (org.elasticsearch.transport.TransportMessage) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest6.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest13.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest13.timeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bulkShardRequest13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(timeValue15);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest5.timeout();
        java.lang.String str7 = bulkShardRequest5.index();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest5.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.seqNo((long) 32);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest5.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException14, "current version [10] is higher or equal to the one provided [1]");
        java.lang.String str17 = shardFailure16.reason;
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData6.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet9 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData6, indexShardStateSet9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData6.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.diff(indexMetaData6);
        long long14 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.settings.Settings settings15 = indexMetaData0.getSettings();
        long long16 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertNotNull(indexShardStateSet9);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int9 = builder8.numberOfShards();
        java.lang.String[] strArray13 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder8.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder3.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple18 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (java.lang.Iterable<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData23 = indexMetaData0.mappingOrDefault("current version [35] is different than the one provided [35]");
        org.elasticsearch.Version version24 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamInput streamInput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff26 = indexMetaData0.readDiffFrom(streamInput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(mappingMetaData23);
        org.junit.Assert.assertNotNull(version24);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [3] is higher than the one provided [0]", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        java.lang.Throwable throwable12 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, throwable12, writeResult13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        java.lang.Throwable throwable17 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, true, throwable17, writeResult18);
        org.elasticsearch.index.shard.ShardId shardId20 = bulkShardRequest9.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue21 = bulkShardRequest9.timeout();
        long long22 = bulkShardRequest9.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue28 = bulkShardRequest27.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = bulkShardRequest27.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException30 = bulkShardRequest27.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, (java.lang.Throwable) actionRequestValidationException30, writeResult31);
        org.elasticsearch.common.unit.TimeValue timeValue33 = bulkShardRequest9.timeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = bulkShardRequest9.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions24);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertNotNull(actionRequestValidationException30);
        org.junit.Assert.assertNotNull(timeValue33);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest10 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest11, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, writeResult18);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest12.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("current version [1] is different than the one provided [0]");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData3);
        org.elasticsearch.Version version5 = indexMetaData3.getCreationVersion();
        long long6 = indexMetaData3.getCreationDate();
        long long7 = indexMetaData3.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData3.getActiveAllocationIds();
        boolean boolean9 = indexMetaData0.equals((java.lang.Object) indexMetaData3);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.excludeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest1);
        org.elasticsearch.action.ActionRequest actionRequest5 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest2, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest11 = bulkItemRequestTuple10.v2();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting16 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting18 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, false, throwable29, writeResult30);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest23, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId33 = null;
        bulkShardRequest26.setParentTask(taskId33);
        org.elasticsearch.index.shard.ShardId shardId35 = bulkShardRequest26.shardId();
        bulkShardRequest26.seqNo((long) 0);
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult40 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult41 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result20, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, false, throwable39, writeResult40);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = bulkShardRequest26.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting18, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException42, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting16, "update", (java.lang.Throwable) actionRequestValidationException42, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "index.shared_filesystem", (java.lang.Throwable) actionRequestValidationException42, "index.version.minimum_compatible");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "current version [97] is different than the one provided [35]", (java.lang.Throwable) actionRequestValidationException42, "index.");
        boolean boolean51 = bulkItemRequestTuple10.equals((java.lang.Object) shardFailure50);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest52 = bulkItemRequestTuple10.v1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = bulkItemRequestTuple10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest11);
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertNotNull(bulkItemRequest52);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int4 = builder3.numberOfShards();
        java.lang.String[] strArray8 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder3.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet9);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.state(state12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.removeAlias("hi!");
        long long16 = builder11.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state17 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        byte byte18 = state17.id();
        byte byte19 = state17.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder11.state(state17);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData21);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap23 = indexMetaData21.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet24 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData21, indexShardStateSet24);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters26 = indexMetaData21.includeFilters();
        org.elasticsearch.common.settings.Settings settings27 = indexMetaData21.getSettings();
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder11.settings(settings28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder1.settings(settings28);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData31 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData31);
        org.elasticsearch.Version version33 = indexMetaData31.getCreationVersion();
        long long34 = indexMetaData31.getCreationDate();
        int int35 = indexMetaData31.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = indexMetaData31.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder1.state(state36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder37.index("current version [10] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder39.removeAllAliases();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + state17 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state17.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap23);
        org.junit.Assert.assertNotNull(indexShardStateSet24);
        org.junit.Assert.assertNull(discoveryNodeFilters26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(indexMetaData31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable11, writeResult12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.tasks.TaskId taskId15 = null;
        bulkShardRequest8.setParentTask(taskId15);
        org.elasticsearch.index.shard.ShardId shardId17 = bulkShardRequest8.shardId();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult18);
        org.elasticsearch.common.unit.TimeValue timeValue20 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.io.stream.StreamInput streamInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest22.readFrom(streamInput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertNotNull(timeValue20);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable16, writeResult17);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest19 = updateResult18.request();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult20 = updateResult18.writeResult;
        boolean boolean21 = updateResult18.failure();
        boolean boolean22 = updateResult18.success();
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest23 = updateResult18.request();
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        java.lang.Throwable throwable36 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, false, throwable36, writeResult37);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple39 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest30, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest33);
        org.elasticsearch.tasks.TaskId taskId40 = null;
        bulkShardRequest33.setParentTask(taskId40);
        java.lang.Throwable throwable43 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult44 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult45 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, true, throwable43, writeResult44);
        org.elasticsearch.action.support.IndicesOptions indicesOptions46 = bulkShardRequest33.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        java.lang.Throwable throwable49 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult50 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult51 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, true, throwable49, writeResult50);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest52 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel53 = bulkShardRequest33.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest56 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest55);
        org.elasticsearch.action.update.UpdateHelper.Result result57 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest59 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest60 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest59);
        java.lang.Throwable throwable62 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult63 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult64 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result57, (org.elasticsearch.action.ActionRequest) bulkShardRequest59, false, throwable62, writeResult63);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple65 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest56, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest59);
        org.elasticsearch.action.ActionRequest actionRequest67 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest68 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest67);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest69 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple70 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest68, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest69);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple71 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest56, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest69);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest72 = bulkItemRequestTuple71.v1();
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest73 = bulkItemRequestTuple71.v2();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel74 = bulkShardRequestReplicationRequest73.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest75 = bulkShardRequest33.consistencyLevel(writeConsistencyLevel74);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest76 = bulkShardRequestReplicationRequest23.consistencyLevel(writeConsistencyLevel74);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest19);
        org.junit.Assert.assertNull(writeResult20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest23);
        org.junit.Assert.assertNotNull(indicesOptions46);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel53 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel53.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkItemRequest72);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest73);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel74 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel74.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest75);
        org.junit.Assert.assertNotNull(bulkShardRequest76);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData3);
        org.elasticsearch.Version version5 = indexMetaData3.getCreationVersion();
        long long6 = indexMetaData3.getCreationDate();
        long long7 = indexMetaData3.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData3.getActiveAllocationIds();
        boolean boolean9 = indexMetaData0.equals((java.lang.Object) indexMetaData3);
        org.apache.lucene.util.Version version10 = indexMetaData3.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData3.excludeFilters();
        int int12 = indexMetaData3.getNumberOfShards();
        boolean boolean14 = indexMetaData3.isSameUUID("index.auto_expand_replicas");
        org.apache.lucene.util.Version version15 = indexMetaData3.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(version10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(version15);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean22 = versionType18.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest8, versionType18);
        boolean boolean27 = versionType18.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) boolean27);
        org.apache.lucene.util.Version version29 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state30 = indexMetaData0.getState();
        boolean boolean32 = indexMetaData0.isSameUUID("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings34 = indexMetaData0.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(version29);
        org.junit.Assert.assertTrue("'" + state30 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state30.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(settings34);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [97] is different than the one provided [-1]");
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure6 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", throwable4, "");
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure6, (org.elasticsearch.transport.TransportMessage) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.index("hi!");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str18 = bulkShardRequest17.index();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest16, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17);
        org.elasticsearch.action.update.UpdateHelper.Result result20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, false, throwable29, writeResult30);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest23, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId33 = null;
        bulkShardRequest26.setParentTask(taskId33);
        org.elasticsearch.index.shard.ShardId shardId35 = bulkShardRequest26.shardId();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result20, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, writeResult36);
        long long38 = bulkShardRequest26.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple39 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest16, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting41 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting43 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting45 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting47 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting49 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result51 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest54 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest53);
        org.elasticsearch.action.update.UpdateHelper.Result result55 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest58 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        java.lang.Throwable throwable60 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult61 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult62 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result55, (org.elasticsearch.action.ActionRequest) bulkShardRequest57, false, throwable60, writeResult61);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple63 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest54, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.tasks.TaskId taskId64 = null;
        bulkShardRequest57.setParentTask(taskId64);
        org.elasticsearch.index.shard.ShardId shardId66 = bulkShardRequest57.shardId();
        bulkShardRequest57.seqNo((long) 0);
        java.lang.Throwable throwable70 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult71 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult72 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result51, (org.elasticsearch.action.ActionRequest) bulkShardRequest57, false, throwable70, writeResult71);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException73 = bulkShardRequest57.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure75 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting49, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException73, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure77 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting47, "update", (java.lang.Throwable) actionRequestValidationException73, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure79 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting45, "_na_", (java.lang.Throwable) actionRequestValidationException73, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure81 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting43, "_na_", (java.lang.Throwable) actionRequestValidationException73, "index.version.upgraded");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure83 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting41, "", (java.lang.Throwable) actionRequestValidationException73, "");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult84 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult85 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, false, (java.lang.Throwable) actionRequestValidationException73, writeResult84);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNull(shardId66);
        org.junit.Assert.assertNotNull(actionRequestValidationException73);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest2.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest2.index("current version [32] is different than the one provided [32]");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction19 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings8, transportService10, clusterService11, indicesService12, threadPool13, shardStateAction14, mappingUpdatedAction15, updateHelper16, actionFilters17, indexNameExpressionResolver18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings9);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.Version version9 = indexMetaData7.getCreationVersion();
        long long10 = indexMetaData7.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData7.mappingOrDefault("index.");
        long long13 = indexMetaData7.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.common.settings.Settings settings15 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData16);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap18 = indexMetaData16.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet19 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData16, indexShardStateSet19);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple21 = org.elasticsearch.common.collect.Tuple.tuple(indexMetaData0, indexShardStateSet19);
        org.apache.lucene.util.Version version22 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap18);
        org.junit.Assert.assertNotNull(indexShardStateSet19);
        org.junit.Assert.assertNotNull(indexMetaDataTuple21);
        org.junit.Assert.assertNull(version22);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting1 = null;
        java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strMap4 = org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap4;
        org.elasticsearch.cluster.metadata.IndexMetaData.customPrototypes = strMap4;
        org.elasticsearch.common.collect.Tuple<java.lang.Comparable<java.lang.String>, java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom>> strComparableTuple7 = new org.elasticsearch.common.collect.Tuple<java.lang.Comparable<java.lang.String>, java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom>>((java.lang.Comparable<java.lang.String>) "hi!", strMap4);
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet8 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.action.ActionRequest actionRequest10 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest11, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        boolean boolean14 = bulkShardRequest12.getShouldPersistResult();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int17 = builder16.numberOfShards();
        java.lang.String[] strArray21 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder16.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>> streamableTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest12, strSet22);
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, java.lang.Iterable<java.lang.String>> indexShardStateSetTuple26 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, java.lang.Iterable<java.lang.String>>(indexShardStateSet8, (java.lang.Iterable<java.lang.String>) strSet22);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.update.UpdateHelper.Result result30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest32);
        java.lang.Throwable throwable35 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result30, (org.elasticsearch.action.ActionRequest) bulkShardRequest32, false, throwable35, writeResult36);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest29, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest32);
        org.elasticsearch.index.VersionType versionType39 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean43 = versionType39.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest29, versionType39);
        boolean boolean48 = versionType39.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.common.io.stream.Writeable> strCollectionTuple49 = new org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.common.io.stream.Writeable>((java.util.AbstractCollection<java.lang.String>) strSet22, (org.elasticsearch.common.io.stream.Writeable) versionType39);
        org.elasticsearch.common.collect.Tuple<java.util.Map<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom>, java.util.Set<java.lang.String>> strMapTuple50 = org.elasticsearch.common.collect.Tuple.tuple(strMap4, (java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting51 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting53 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting55 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting57 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting59 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result61 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest63 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest64 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.update.UpdateHelper.Result result65 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest67 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest68 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest67);
        java.lang.Throwable throwable70 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult71 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult72 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result65, (org.elasticsearch.action.ActionRequest) bulkShardRequest67, false, throwable70, writeResult71);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple73 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest64, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest67);
        org.elasticsearch.tasks.TaskId taskId74 = null;
        bulkShardRequest67.setParentTask(taskId74);
        org.elasticsearch.index.shard.ShardId shardId76 = bulkShardRequest67.shardId();
        bulkShardRequest67.seqNo((long) 0);
        java.lang.Throwable throwable80 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult81 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult82 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result61, (org.elasticsearch.action.ActionRequest) bulkShardRequest67, false, throwable80, writeResult81);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException83 = bulkShardRequest67.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure85 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting59, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException83, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure87 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting57, "update", (java.lang.Throwable) actionRequestValidationException83, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure89 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting55, "_na_", (java.lang.Throwable) actionRequestValidationException83, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure91 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting53, "_na_", (java.lang.Throwable) actionRequestValidationException83, "index.version.upgraded");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure93 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting51, "index.blocks.metadata", (java.lang.Throwable) actionRequestValidationException83, "update");
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.action.ActionRequestValidationException> strCollectionTuple94 = org.elasticsearch.common.collect.Tuple.tuple((java.util.AbstractCollection<java.lang.String>) strSet22, actionRequestValidationException83);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure96 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting1, "current version [97] is different than the one provided [97]", (java.lang.Throwable) actionRequestValidationException83, "index.version.upgraded_string");
        org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.index.shard.IndexShard.ShardFailure> charSequenceTuple97 = new org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.index.shard.IndexShard.ShardFailure>((java.lang.CharSequence) "current version [1] is different than the one provided [0]", shardFailure96);
// flaky:         org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(indexShardStateSet8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(versionType39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMapTuple50);
        org.junit.Assert.assertNull(shardId76);
        org.junit.Assert.assertNotNull(actionRequestValidationException83);
        org.junit.Assert.assertNotNull(strCollectionTuple94);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, false, throwable16, writeResult17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest10, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.tasks.TaskId taskId20 = null;
        bulkShardRequest13.setParentTask(taskId20);
        org.elasticsearch.index.shard.ShardId shardId22 = bulkShardRequest13.shardId();
        bulkShardRequest13.seqNo((long) 0);
        java.lang.Throwable throwable26 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, false, throwable26, writeResult27);
        org.elasticsearch.action.ActionRequest actionRequest29 = updateResult28.actionRequest;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, actionRequest29, writeResult30);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, actionRequest29, writeResult32);
        org.elasticsearch.action.update.UpdateHelper.Result result35 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        java.lang.Throwable throwable42 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult43 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult44 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result37, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, false, throwable42, writeResult43);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult46 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult47 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result35, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult46);
        org.elasticsearch.common.transport.TransportAddress transportAddress48 = bulkShardRequest39.remoteAddress();
        org.elasticsearch.common.unit.TimeValue timeValue49 = bulkShardRequest39.timeout();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException50 = bulkShardRequest39.validate();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult51 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult52 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, actionRequest29, false, (java.lang.Throwable) actionRequestValidationException50, writeResult51);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.shared_filesystem.recover_on_any_node", (java.lang.Throwable) actionRequestValidationException50, "current version [97] is different than the one provided [32]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure56 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [3] is higher than the one provided [0]", (java.lang.Throwable) actionRequestValidationException50, "_na_");
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertNotNull(actionRequest29);
        org.junit.Assert.assertNull(transportAddress48);
        org.junit.Assert.assertNotNull(timeValue49);
        org.junit.Assert.assertNotNull(actionRequestValidationException50);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = bulkShardRequest7.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.junit.Assert.assertNull(transportAddress15);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mappingOrDefault("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData11);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap13 = indexMetaData11.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet14 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData11, indexShardStateSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataDiffableTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>((org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, indexShardStateSet14);
        int int17 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap18 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap13);
        org.junit.Assert.assertNotNull(indexShardStateSet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, throwable5, writeResult6);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, writeResult8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest3.setShardId(shardId10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(3, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap15 = indexMetaData13.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet16 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData13, indexShardStateSet16);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData13.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest24, false, throwable27, writeResult28);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest21, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest24);
        org.elasticsearch.index.VersionType versionType31 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean35 = versionType31.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest21, versionType31);
        boolean boolean40 = versionType31.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean41 = indexMetaData13.equals((java.lang.Object) boolean40);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData13);
        long long43 = indexMetaData13.getCreationDate();
        org.elasticsearch.Version version44 = indexMetaData13.getCreationVersion();
        boolean boolean46 = indexMetaData13.equals((java.lang.Object) "_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData47 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData47);
        org.elasticsearch.Version version49 = indexMetaData47.getCreationVersion();
        long long50 = indexMetaData47.getCreationDate();
        long long51 = indexMetaData47.getCreationDate();
        java.util.Set<java.lang.String> strSet53 = null; // flaky: indexMetaData47.activeAllocationIds((int) (byte) 3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters54 = indexMetaData47.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff55 = indexMetaData13.diff(indexMetaData47);
        org.elasticsearch.action.ActionRequest actionRequest58 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest59 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest58);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest59, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest62 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest60);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting63 = null;
        java.lang.Throwable throwable65 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure67 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting63, "", throwable65, "");
        org.elasticsearch.action.update.UpdateHelper.Result result68 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest69 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable71 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult72 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult73 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result68, (org.elasticsearch.action.ActionRequest) bulkShardRequest69, false, throwable71, writeResult72);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple74 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure67, (org.elasticsearch.transport.TransportMessage) bulkShardRequest69);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest76 = bulkShardRequest69.index("hi!");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple77 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest62, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest69);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest78 = bulkItemRequestTuple77.v2();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> indexMetaDataDiffTuple79 = org.elasticsearch.common.collect.Tuple.tuple(indexMetaDataDiff55, bulkShardRequestReplicationRequest78);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple80 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest12, bulkShardRequestReplicationRequest78);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap15);
        org.junit.Assert.assertNotNull(indexShardStateSet16);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(versionType31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(indexMetaData47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(version49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertNull(discoveryNodeFilters54);
        org.junit.Assert.assertNotNull(indexMetaDataDiff55);
        org.junit.Assert.assertNotNull(bulkShardRequest76);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest78);
        org.junit.Assert.assertNotNull(indexMetaDataDiffTuple79);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.update.UpdateHelper.Result result20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        java.lang.Throwable throwable25 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result20, (org.elasticsearch.action.ActionRequest) bulkShardRequest22, false, throwable25, writeResult26);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest19, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.tasks.TaskId taskId29 = null;
        bulkShardRequest22.setParentTask(taskId29);
        org.elasticsearch.index.shard.ShardId shardId31 = bulkShardRequest22.shardId();
        bulkShardRequest22.seqNo((long) 0);
        java.lang.Throwable throwable35 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest22, false, throwable35, writeResult36);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = bulkShardRequest22.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException38, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "update", (java.lang.Throwable) actionRequestValidationException38, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "_na_", (java.lang.Throwable) actionRequestValidationException38, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "_na_", (java.lang.Throwable) actionRequestValidationException38, "index.version.upgraded");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.version.minimum_compatible", (java.lang.Throwable) actionRequestValidationException38, "index.uuid");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.version.upgraded", (java.lang.Throwable) actionRequestValidationException38, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure52 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [35] is different than the one provided [35]", (java.lang.Throwable) actionRequestValidationException38, "index.version.upgraded");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "indices:data/write/bulk[s]", (java.lang.Throwable) actionRequestValidationException38, "current version [0] is different than the one provided [97]");
        org.junit.Assert.assertNull(shardId31);
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData3);
        org.elasticsearch.Version version5 = indexMetaData3.getCreationVersion();
        long long6 = indexMetaData3.getCreationDate();
        long long7 = indexMetaData3.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData3.getActiveAllocationIds();
        boolean boolean9 = indexMetaData0.equals((java.lang.Object) indexMetaData3);
        org.apache.lucene.util.Version version10 = indexMetaData3.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData3.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap12 = indexMetaData3.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap13 = indexMetaData3.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData3.excludeFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData3.readDiffFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(version10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable16, writeResult17);
        boolean boolean19 = updateResult18.success();
        boolean boolean20 = updateResult18.success();
        boolean boolean21 = updateResult18.failure();
        boolean boolean22 = updateResult18.success();
        org.elasticsearch.action.ActionRequest actionRequest23 = updateResult18.actionRequest;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = updateResult18.request();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(actionRequest23);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        org.elasticsearch.transport.TransportRequest transportRequest2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.primaryTerm((long) (-1));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> transportRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(transportRequest2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = null;
        bulkShardRequest6.remoteAddress(transportAddress15);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "");
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, false, throwable8, writeResult9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure4, (org.elasticsearch.transport.TransportMessage) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest6.index("index.version.created");
        long long14 = bulkShardRequest6.seqNo();
        bulkShardRequest6.setParentTask("index.creation_date", (long) '#');
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest6.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = bulkShardRequest6.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = bulkShardRequest6.validate();
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertNull(actionRequestValidationException20);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap3 = indexMetaData1.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData1.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData1.requireFilters();
        org.elasticsearch.Version version7 = indexMetaData1.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData1.getSettings();
        java.lang.String str9 = indexMetaData1.getIndexUUID();
        int int10 = indexMetaData1.getTotalNumberOfShards();
        org.elasticsearch.index.Index index11 = indexMetaData1.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = indexMetaData1.mappingOrDefault("current version [100] is different than the one provided [1]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_na_" + "'", str9, "_na_");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNull(mappingMetaData13);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.Version version8 = indexMetaData6.getCreationVersion();
        long long9 = indexMetaData6.getCreationDate();
        long long10 = indexMetaData6.getCreationDate();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData6.activeAllocationIds((int) (byte) 3);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData6.mapping("hi!");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData6);
        int int16 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.index.Index index17 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData20 = indexMetaData0.mappingOrDefault("index.blocks.metadata");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNull(mappingMetaData20);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int9 = builder8.numberOfShards();
        java.lang.String[] strArray13 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder8.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder3.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple18 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (java.lang.Iterable<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData23 = indexMetaData0.mappingOrDefault("current version [35] is different than the one provided [35]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(mappingMetaData23);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        bulkShardRequest5.remoteAddress(transportAddress7);
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, false, throwable10, writeResult11);
        org.elasticsearch.action.update.UpdateResponse updateResponse13 = updateResult12.noopResult;
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest14 = updateResult12.request();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequestActionRequest14);
        org.elasticsearch.common.io.stream.StreamInput streamInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest15.readFrom(streamInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(updateResponse13);
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest14);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        java.lang.Throwable throwable12 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, throwable12, writeResult13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.tasks.TaskId taskId16 = null;
        bulkShardRequest9.setParentTask(taskId16);
        java.lang.Throwable throwable19 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, true, throwable19, writeResult20);
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.upgraded", (java.lang.Throwable) actionRequestValidationException24, "index.auto_expand_replicas");
        java.lang.String str27 = shardFailure26.reason;
        org.junit.Assert.assertNotNull(indicesOptions22);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "index.version.upgraded" + "'", str27, "index.version.upgraded");
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, throwable10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, true, throwable15, writeResult16);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest18 = updateResult17.request();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicationRequest18);
        org.elasticsearch.tasks.TaskId taskId20 = bulkShardRequestReplicationRequest18.getParentTask();
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.ActionRequest actionRequest26 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest27, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.ActionRequest actionRequest32 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest33, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest30, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue38 = bulkShardRequest37.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest34.timeout(timeValue38);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult41);
        org.elasticsearch.action.update.UpdateHelper.Result result43 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.update.UpdateHelper.Result result47 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest49);
        java.lang.Throwable throwable52 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult53 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult54 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result47, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, false, throwable52, writeResult53);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest46, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest49);
        java.lang.Throwable throwable57 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult58 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult59 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result43, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, true, throwable57, writeResult58);
        org.elasticsearch.index.shard.ShardId shardId60 = bulkShardRequest49.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue61 = bulkShardRequest49.timeout();
        org.elasticsearch.tasks.TaskId taskId62 = bulkShardRequest49.getParentTask();
        bulkShardRequest39.setParentTask(taskId62);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest64 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        org.elasticsearch.action.ActionRequest actionRequest66 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest67 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest66);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest68 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple69 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest67, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest68);
        org.elasticsearch.common.transport.TransportAddress transportAddress70 = null;
        bulkShardRequest68.remoteAddress(transportAddress70);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel72 = bulkShardRequest68.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest73 = bulkShardRequest39.consistencyLevel(writeConsistencyLevel72);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest74 = bulkShardRequestReplicationRequest18.consistencyLevel(writeConsistencyLevel72);
        org.elasticsearch.common.unit.TimeValue timeValue75 = bulkShardRequestReplicationRequest18.timeout();
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest18);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNull(shardId60);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertNotNull(taskId62);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel72 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel72.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest73);
        org.junit.Assert.assertNotNull(bulkShardRequest74);
        org.junit.Assert.assertNotNull(timeValue75);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version2 = indexMetaData0.getUpgradedVersion();
        java.lang.String str3 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("current version [1] is different than the one provided [52]");
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_na_" + "'", str3, "_na_");
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_na_" + "'", str6, "_na_");
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, false, throwable8, writeResult9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest2, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.index.VersionType versionType12 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean16 = versionType12.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest2, versionType12);
        boolean boolean21 = versionType12.isVersionConflictForWrites(10L, (long) (byte) 0, false);
        boolean boolean23 = versionType12.validateVersionForReads(10L);
        boolean boolean26 = versionType12.isVersionConflictForReads(100L, (long) 'a');
        long long29 = versionType12.updateVersion((long) (byte) 1, (long) (byte) 10);
        long long32 = versionType12.updateVersion((long) '#', (long) 52);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType12.writeTo(streamOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int4 = builder3.numberOfShards();
        java.lang.String[] strArray8 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder3.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet9);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.state(state12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.removeAlias("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData16);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap18 = indexMetaData16.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet19 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData16, indexShardStateSet19);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData16.includeFilters();
        org.elasticsearch.common.settings.Settings settings22 = indexMetaData16.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder11.settings(settings22);
        boolean boolean24 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings22);
        boolean boolean25 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings22);
        boolean boolean26 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder1.settings(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom29 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder1.putCustom("current version [0] is higher or equal to the one provided [35]", custom29);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap18);
        org.junit.Assert.assertNotNull(indexShardStateSet19);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        long long3 = indexMetaData0.getCreationDate();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.index.Index index8 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.index.Index index9 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        java.lang.Throwable throwable20 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest17, false, throwable20, writeResult21);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest14, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17);
        org.elasticsearch.index.VersionType versionType24 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean28 = versionType24.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest14, versionType24);
        boolean boolean33 = versionType24.isVersionConflictForWrites(10L, (long) (byte) 0, false);
        long long36 = versionType24.updateVersion((long) 1, (long) (short) 10);
        boolean boolean38 = versionType24.validateVersionForWrites((long) '#');
        boolean boolean39 = indexMetaData0.equals((java.lang.Object) boolean38);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap40 = indexMetaData0.getCustoms();
        int int41 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters42 = indexMetaData0.excludeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters42);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) 10, (long) (byte) -1);
        boolean boolean7 = versionType0.isVersionConflictForWrites((long) (short) 10, (long) 10, false);
        boolean boolean9 = versionType0.validateVersionForReads(0L);
        boolean boolean12 = versionType0.isVersionConflictForReads((long) (short) 10, (long) (byte) 10);
        boolean boolean16 = versionType0.isVersionConflictForWrites((long) (short) 100, 2L, true);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.version.created", throwable2, "index.uuid");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index.uuid" + "'", str5, "index.uuid");
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest2.timeout();
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        java.lang.Throwable throwable19 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, true, throwable19, writeResult20);
        org.elasticsearch.index.shard.ShardId shardId22 = bulkShardRequest11.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.common.unit.TimeValue timeValue24 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest2.timeout(timeValue24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.unit.TimeValue timeValue27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest2.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.ActionRequest actionRequest30 = bulkItemRequest29.request();
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(actionRequest30);
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        org.elasticsearch.action.ActionRequest actionRequest3 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest4, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest8.timeout();
        java.lang.String str10 = bulkShardRequest8.index();
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest5.timeout(timeValue11);
        long long13 = bulkShardRequest12.primaryTerm();
        long long14 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest15.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap3 = indexMetaData1.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData1.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData1.requireFilters();
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData1.getSettings();
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings7);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings7);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction19 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings7, transportService10, clusterService11, indicesService12, threadPool13, shardStateAction14, mappingUpdatedAction15, updateHelper16, actionFilters17, indexNameExpressionResolver18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, throwable14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.index.VersionType versionType18 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean22 = versionType18.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest8, versionType18);
        boolean boolean27 = versionType18.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) boolean27);
        int int29 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state30 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData31 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder33.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder34.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int40 = builder39.numberOfShards();
        java.lang.String[] strArray44 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder39.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder34.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet45);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple49 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData31, (java.lang.Iterable<java.lang.String>) strSet45);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap50 = indexMetaData31.getAliases();
        int int51 = indexMetaData31.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters52 = indexMetaData31.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap53 = indexMetaData31.getAliases();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff54 = indexMetaData0.diff(indexMetaData31);
        org.elasticsearch.Version version55 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData57 = indexMetaData0.mappingOrDefault("index.");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + state30 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state30.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple49);
        org.junit.Assert.assertNotNull(strImmutableOpenMap50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters52);
        org.junit.Assert.assertNotNull(strImmutableOpenMap53);
        org.junit.Assert.assertNotNull(indexMetaDataDiff54);
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertNull(mappingMetaData57);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        java.lang.Throwable throwable12 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, throwable12, writeResult13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, throwable18, writeResult19);
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(35, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting24 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting28 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting32 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting34 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting36 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest41 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest40);
        org.elasticsearch.action.update.UpdateHelper.Result result42 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest44);
        java.lang.Throwable throwable47 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult48 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult49 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result42, (org.elasticsearch.action.ActionRequest) bulkShardRequest44, false, throwable47, writeResult48);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple50 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest41, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest44);
        org.elasticsearch.tasks.TaskId taskId51 = null;
        bulkShardRequest44.setParentTask(taskId51);
        org.elasticsearch.index.shard.ShardId shardId53 = bulkShardRequest44.shardId();
        bulkShardRequest44.seqNo((long) 0);
        java.lang.Throwable throwable57 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult58 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult59 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result38, (org.elasticsearch.action.ActionRequest) bulkShardRequest44, false, throwable57, writeResult58);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException60 = bulkShardRequest44.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure62 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting36, "index.auto_expand_replicas", (java.lang.Throwable) actionRequestValidationException60, "active_allocations");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure64 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting34, "update", (java.lang.Throwable) actionRequestValidationException60, "index.version.created_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure66 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting32, "_na_", (java.lang.Throwable) actionRequestValidationException60, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure68 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting30, "primary_terms", (java.lang.Throwable) actionRequestValidationException60, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure70 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting28, "current version [2] is higher than the one provided [-1]", (java.lang.Throwable) actionRequestValidationException60, "index.creation_date");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure72 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting26, "current version [10] is higher than the one provided [98]", (java.lang.Throwable) actionRequestValidationException60, "current version [1] is different than the one provided [0]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure74 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting24, "", (java.lang.Throwable) actionRequestValidationException60, "current version [32] is different than the one provided [2]");
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult75 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult76 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, (java.lang.Throwable) actionRequestValidationException60, writeResult75);
        boolean boolean77 = updateResult76.success();
        org.junit.Assert.assertNull(transportAddress21);
        org.junit.Assert.assertNull(shardId53);
        org.junit.Assert.assertNotNull(actionRequestValidationException60);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        byte byte1 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType2 = versionType0.versionTypeForReplicationAndRecovery();
        java.lang.String str6 = versionType2.explainConflictForWrites((long) 32, (long) 1, true);
        java.lang.String str9 = versionType2.explainConflictForReads(10L, 100L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "current version [32] is higher or equal to the one provided [1]" + "'", str6, "current version [32] is higher or equal to the one provided [1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [10] is different than the one provided [100]" + "'", str9, "current version [10] is different than the one provided [100]");
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder2.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int9 = builder8.numberOfShards();
        java.lang.String[] strArray13 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder8.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder3.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple18 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (java.lang.Iterable<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData23 = indexMetaData0.mappingOrDefault("current version [35] is different than the one provided [35]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int25 = indexMetaData0.getNumberOfShards();
        int int26 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(mappingMetaData23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting3 = null;
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting3, "", throwable5, "");
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, throwable11, writeResult12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure7, (org.elasticsearch.transport.TransportMessage) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest9.index("index.version.created");
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = bulkShardRequest9.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.tasks.TaskId taskId20 = bulkShardRequest9.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.ActionRequest actionRequest24 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest25, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting29 = null;
        java.lang.Throwable throwable31 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting29, "", throwable31, "");
        org.elasticsearch.action.update.UpdateHelper.Result result34 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable37 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult38 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult39 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result34, (org.elasticsearch.action.ActionRequest) bulkShardRequest35, false, throwable37, writeResult38);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure33, (org.elasticsearch.transport.TransportMessage) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest35.index("hi!");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest28, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest35);
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest44 = bulkItemRequestTuple43.v2();
        org.elasticsearch.action.update.UpdateHelper.Result result45 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest47);
        org.elasticsearch.action.update.UpdateHelper.Result result49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest52 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest51);
        java.lang.Throwable throwable54 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult55 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult56 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result49, (org.elasticsearch.action.ActionRequest) bulkShardRequest51, false, throwable54, writeResult55);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple57 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest48, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest51);
        org.elasticsearch.tasks.TaskId taskId58 = null;
        bulkShardRequest51.setParentTask(taskId58);
        org.elasticsearch.index.shard.ShardId shardId60 = bulkShardRequest51.shardId();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult61 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult62 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result45, (org.elasticsearch.action.ActionRequest) bulkShardRequest51, writeResult61);
        org.elasticsearch.common.unit.TimeValue timeValue63 = bulkShardRequest51.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel64 = bulkShardRequest51.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = bulkShardRequestReplicationRequest44.consistencyLevel(writeConsistencyLevel64);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel64);
        org.elasticsearch.tasks.TaskId taskId67 = bulkShardRequest9.getParentTask();
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest44);
        org.junit.Assert.assertNull(shardId60);
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel64 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel64.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest65);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNotNull(taskId67);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.Version version8 = indexMetaData6.getCreationVersion();
        long long9 = indexMetaData6.getCreationDate();
        long long10 = indexMetaData6.getCreationDate();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData6.activeAllocationIds((int) (byte) 3);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData6.mapping("hi!");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData6);
        long long16 = indexMetaData0.getCreationDate();
        java.lang.String str17 = indexMetaData0.getIndexUUID();
        int int18 = indexMetaData0.getTotalNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet3 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData0, indexShardStateSet3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap8 = indexMetaData6.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet9 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData6, indexShardStateSet9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData6.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.diff(indexMetaData6);
        int int14 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long17 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting19 = null;
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting19, "", throwable21, "");
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, false, throwable27, writeResult28);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage> shardFailureTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.shard.IndexShard.ShardFailure, org.elasticsearch.transport.TransportMessage>(shardFailure23, (org.elasticsearch.transport.TransportMessage) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest25.index("index.version.created");
        org.elasticsearch.common.transport.TransportAddress transportAddress33 = bulkShardRequest25.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.update.UpdateHelper.Result result35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.update.UpdateHelper.Result result39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest42 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult45 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult46 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result39, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, false, throwable44, writeResult45);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple47 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest38, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.tasks.TaskId taskId48 = null;
        bulkShardRequest41.setParentTask(taskId48);
        org.elasticsearch.index.shard.ShardId shardId50 = bulkShardRequest41.shardId();
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult51 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult52 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result35, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, writeResult51);
        org.elasticsearch.common.unit.TimeValue timeValue53 = bulkShardRequest41.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = bulkShardRequest25.timeout(timeValue53);
        java.lang.Class<?> wildcardClass55 = timeValue53.getClass();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData56 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder58.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = builder59.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int65 = builder64.numberOfShards();
        java.lang.String[] strArray69 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = builder64.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder59.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple74 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData56, (java.lang.Iterable<java.lang.String>) strSet70);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap75 = indexMetaData56.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder76 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData56);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap77 = indexMetaData56.getAliases();
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, org.elasticsearch.cluster.metadata.IndexMetaData> genericDeclarationTuple78 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, org.elasticsearch.cluster.metadata.IndexMetaData>((java.lang.reflect.GenericDeclaration) wildcardClass55, indexMetaData56);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent, java.lang.reflect.GenericDeclaration> toXContentTuple79 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent, java.lang.reflect.GenericDeclaration>((org.elasticsearch.common.xcontent.ToXContent) indexMetaData0, (java.lang.reflect.GenericDeclaration) wildcardClass55);
        java.util.Set<java.lang.String> strSet81 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNotNull(indexShardStateSet3);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap8);
        org.junit.Assert.assertNotNull(indexShardStateSet9);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNull(transportAddress33);
        org.junit.Assert.assertNull(shardId50);
        org.junit.Assert.assertNotNull(timeValue53);
        org.junit.Assert.assertNotNull(bulkShardRequest54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(indexMetaData56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(indexMetaDataFromXContentBuilderTuple74);
        org.junit.Assert.assertNotNull(strImmutableOpenMap75);
        org.junit.Assert.assertNotNull(strImmutableOpenMap77);
        org.junit.Assert.assertNull(strSet81);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable11, writeResult12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        java.lang.Throwable throwable17 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable17, writeResult18);
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = bulkShardRequest8.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(35, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.index.VersionType versionType23 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, java.lang.Enum<org.elasticsearch.index.VersionType>> bulkItemRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, java.lang.Enum<org.elasticsearch.index.VersionType>>(bulkItemRequest21, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType23);
        org.elasticsearch.index.VersionType versionType25 = versionType23.versionTypeForReplicationAndRecovery();
        byte byte26 = versionType23.getValue();
        long long29 = versionType23.updateVersion(97L, (long) (-1));
        org.junit.Assert.assertNull(transportAddress20);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 3 + "'", byte26 == (byte) 3);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        org.elasticsearch.action.ActionRequest actionRequest4 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest9.timeout();
        java.lang.String str11 = bulkShardRequest9.index();
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest6.timeout(timeValue12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData15);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap17 = indexMetaData15.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet18 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData15, indexShardStateSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData15);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData21);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap23 = indexMetaData21.getActiveAllocationIds();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet24 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(indexMetaData21, indexShardStateSet24);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters26 = indexMetaData21.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData21);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff28 = indexMetaData15.diff(indexMetaData21);
        int int29 = indexMetaData15.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap30 = indexMetaData15.getCustoms();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.xcontent.ToXContent> streamableTuple31 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.xcontent.ToXContent>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest13, (org.elasticsearch.common.xcontent.ToXContent) indexMetaData15);
        org.elasticsearch.action.ActionRequest actionRequest33 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest34, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest35);
        boolean boolean37 = bulkShardRequest35.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest35.setShardId(shardId38);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest39.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest42 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap17);
        org.junit.Assert.assertNotNull(indexShardStateSet18);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap23);
        org.junit.Assert.assertNotNull(indexShardStateSet24);
        org.junit.Assert.assertNull(discoveryNodeFilters26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel40 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel40.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest41);
    }
}
