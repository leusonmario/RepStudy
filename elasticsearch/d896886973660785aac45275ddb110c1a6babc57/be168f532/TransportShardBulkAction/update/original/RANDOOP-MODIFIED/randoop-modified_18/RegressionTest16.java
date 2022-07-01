import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = bulkShardRequest6.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest2.indicesOptions();
        org.junit.Assert.assertNotNull(bulkShardRequest4);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(indicesOptions12);
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version7 = indexMetaData6.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData6.includeFilters();
        long long9 = indexMetaData6.getVersion();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData6.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest18 = builderTuple17.v2();
        boolean boolean19 = bulkShardRequestReplicatedWriteRequest18.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest21.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple25 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest18, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest24);
        boolean boolean26 = indexMetaData11.equals((java.lang.Object) bulkShardRequestWriteRequestTuple25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData11);
        java.lang.String str28 = indexMetaData11.getIndexUUID();
        int int29 = indexMetaData11.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff30 = indexMetaData6.diff(indexMetaData11);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff31 = indexMetaData0.diff(indexMetaData11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters33 = indexMetaData0.excludeFilters();
        int int34 = indexMetaData0.getRoutingNumShards();
        int int35 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_na_" + "'", str28, "_na_");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff30);
        org.junit.Assert.assertNotNull(indexMetaDataDiff31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(discoveryNodeFilters33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        int int6 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("primary_terms");
        int int9 = builder8.numberOfShards();
        java.lang.String str10 = builder8.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest18 = builderTuple17.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, bulkShardRequestReplicatedWriteRequest18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        boolean boolean24 = builderTuple20.equals((java.lang.Object) bulkItemRequest23);
        org.elasticsearch.common.xcontent.ToXContent.Params params25 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.common.xcontent.ToXContent.Params> bulkItemRequestTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.common.xcontent.ToXContent.Params>(bulkItemRequest23, params25);
        boolean boolean27 = indexMetaData0.equals((java.lang.Object) bulkItemRequest23);
        org.elasticsearch.Version version28 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap29 = indexMetaData0.getCustoms();
        org.elasticsearch.common.settings.Settings settings30 = indexMetaData0.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "primary_terms" + "'", str10, "primary_terms");
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(params25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(strImmutableOpenMap29);
        org.junit.Assert.assertNotNull(settings30);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.includeFilters();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str10 = versionType6.explainConflictForWrites(32L, (long) '4', false);
        org.elasticsearch.index.VersionType versionType11 = versionType6.versionTypeForReplicationAndRecovery();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version13 = indexMetaData12.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData12.includeFilters();
        long long15 = indexMetaData12.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap16 = indexMetaData12.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version18 = indexMetaData17.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData17.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData17.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData17);
        boolean boolean22 = indexMetaData12.equals((java.lang.Object) builder21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder30, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple33 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder29, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy34 = bulkShardRequest31.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest27.setRefreshPolicy(refreshPolicy34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest35.getParentTask();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version39 = indexMetaData38.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters40 = indexMetaData38.includeFilters();
        long long41 = indexMetaData38.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData43 = indexMetaData38.mappingOrDefault("_na_");
        org.elasticsearch.Version version44 = indexMetaData38.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state45 = indexMetaData38.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData46 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData46);
        java.lang.Class<?> wildcardClass48 = indexMetaData46.getClass();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData49 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple54 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder52, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest53);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder51, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest53);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest56 = builderTuple55.v2();
        boolean boolean57 = bulkShardRequestReplicatedWriteRequest56.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest59 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest60 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest59);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = bulkShardRequest59.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple63 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest56, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest62);
        boolean boolean64 = indexMetaData49.equals((java.lang.Object) bulkShardRequestWriteRequestTuple63);
        int int65 = indexMetaData49.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap66 = indexMetaData49.getAliases();
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData>> genericDeclarationTuple67 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData>>((java.lang.reflect.GenericDeclaration) wildcardClass48, strImmutableOpenMap66);
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet68 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.common.collect.Tuple<java.lang.Iterable<com.carrotsearch.hppc.cursors.ObjectObjectCursor<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData>>, java.util.Collection<org.elasticsearch.index.shard.IndexShardState>> strObjectObjectCursorIterableTuple69 = new org.elasticsearch.common.collect.Tuple<java.lang.Iterable<com.carrotsearch.hppc.cursors.ObjectObjectCursor<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData>>, java.util.Collection<org.elasticsearch.index.shard.IndexShardState>>((java.lang.Iterable<com.carrotsearch.hppc.cursors.ObjectObjectCursor<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData>>) strImmutableOpenMap66, (java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet68);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData70 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData70);
        org.elasticsearch.Version version73 = indexMetaData70.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters74 = indexMetaData70.excludeFilters();
        org.elasticsearch.Version version75 = indexMetaData70.getUpgradedVersion();
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.Version> indexShardStateCollectionTuple76 = new org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.Version>((java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet68, version75);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.cluster.metadata.IndexMetaData.State>, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> stateEnumTuple77 = org.elasticsearch.common.collect.Tuple.tuple((java.lang.Enum<org.elasticsearch.cluster.metadata.IndexMetaData.State>) state45, indexShardStateSet68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder78 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder80 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder81 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest82 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple83 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder81, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest82);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple84 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder80, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest82);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest85 = builderTuple84.v2();
        boolean boolean86 = bulkShardRequestReplicatedWriteRequest85.getShouldPersistResult();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple87 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder78, bulkShardRequestReplicatedWriteRequest85);
        org.elasticsearch.action.support.IndicesOptions indicesOptions88 = bulkShardRequestReplicatedWriteRequest85.indicesOptions();
        org.elasticsearch.common.collect.Tuple<java.util.Set<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.support.IndicesOptions> indexShardStateSetTuple89 = new org.elasticsearch.common.collect.Tuple<java.util.Set<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.support.IndicesOptions>((java.util.Set<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet68, indicesOptions88);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>> bulkShardRequestReplicatedWriteRequestTuple90 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>>((org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest35, (java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet68);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>> indexMetaDataFromXContentBuilderTuple91 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>>((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData12, (java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet68);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> versionTypeTuple92 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(versionType11, indexShardStateSet68);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> versionTuple93 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(version5, indexShardStateSet68);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "current version [32] is higher than the one provided [52]" + "'", str10, "current version [32] is higher than the one provided [52]");
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(version13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertNull(version18);
        org.junit.Assert.assertNull(discoveryNodeFilters19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertTrue("'" + refreshPolicy34 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy34.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest35);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertNotNull(indexMetaData38);
        org.junit.Assert.assertNull(version39);
        org.junit.Assert.assertNull(discoveryNodeFilters40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNull(mappingMetaData43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertTrue("'" + state45 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state45.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(indexMetaData49);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest62);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap66);
        org.junit.Assert.assertNotNull(indexShardStateSet68);
        org.junit.Assert.assertNotNull(indexMetaData70);
        org.junit.Assert.assertNotNull(version73);
        org.junit.Assert.assertNull(discoveryNodeFilters74);
        org.junit.Assert.assertNotNull(version75);
        org.junit.Assert.assertNotNull(stateEnumTuple77);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(indicesOptions88);
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = bulkShardRequest8.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.priority", (java.lang.Throwable) actionRequestValidationException12, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException12, "index.blocks.metadata");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder18, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state23 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder18.state(state23);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state25 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder18.state(state25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder18.version(0L);
        org.elasticsearch.common.collect.Tuple<java.lang.Exception, java.lang.Object> exceptionTuple29 = new org.elasticsearch.common.collect.Tuple<java.lang.Exception, java.lang.Object>((java.lang.Exception) actionRequestValidationException12, (java.lang.Object) 0L);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure31 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.creation_date", (java.lang.Throwable) actionRequestValidationException12, "index.auto_expand_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is higher or equal to the one provided [97]", (java.lang.Throwable) actionRequestValidationException12, "index.version.upgraded");
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNull(writeConsistencyLevel11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + state25 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state25.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder2.state(state7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest10.timeout();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder8.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder17, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder16, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest21 = builderTuple20.v2();
        boolean boolean22 = bulkShardRequestReplicatedWriteRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple28 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest21, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, bulkShardRequestReplicatedWriteRequest21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder14.setRoutingNumShards((int) (byte) 100);
        java.lang.String str32 = builder14.index();
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest33 = null;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, bulkShardRequestReplicatedWriteRequest33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = bulkShardRequest36.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest36.setShardId(shardId38);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest39.index("index.data_path");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest42 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        bulkShardRequest39.primaryTerm((long) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple45 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple49 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder47, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest48);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest48);
        org.elasticsearch.tasks.TaskId taskId51 = bulkShardRequest48.getParentTask();
        bulkShardRequest39.setParentTask(taskId51);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest53 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest39);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel37 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel37.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNotNull(bulkShardRequest41);
        org.junit.Assert.assertNotNull(taskId51);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder17, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder16, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest21 = builderTuple20.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest21);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = bulkShardRequestReplicatedWriteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException23, "index.number_of_shards");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure27 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "index.shared_filesystem.recover_on_any_node", (java.lang.Throwable) actionRequestValidationException23, "index.version.upgraded");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure29 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException23, "_na_");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure31 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "index.version.created_string", (java.lang.Throwable) actionRequestValidationException23, "current version [10] is different than the one provided [0]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "current version [100] is different than the one provided [52]", (java.lang.Throwable) actionRequestValidationException23, "index.blocks.metadata");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [1] is different than the one provided [1]", (java.lang.Throwable) actionRequestValidationException23, "current version [100] is higher or equal to the one provided [3]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure37 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "active_allocations", (java.lang.Throwable) actionRequestValidationException23, "indices:data/write/bulk[s]");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting38 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData39 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData39);
        int int41 = indexMetaData39.getNumberOfShards();
        int int42 = indexMetaData39.getRoutingFactor();
        org.elasticsearch.Version version43 = indexMetaData39.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData39);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData46 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version47 = indexMetaData46.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters48 = indexMetaData46.includeFilters();
        long long49 = indexMetaData46.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData51 = indexMetaData46.mappingOrDefault("_na_");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap52 = indexMetaData46.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap53 = indexMetaData46.getCustoms();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff54 = indexMetaData39.diff(indexMetaData46);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>> toXContentToBytesTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>>((org.elasticsearch.action.support.ToXContentToBytes) intSetting38, indexMetaDataDiff54);
        org.elasticsearch.common.collect.Tuple<java.lang.Throwable, org.elasticsearch.action.support.ToXContentToBytes> throwableTuple56 = new org.elasticsearch.common.collect.Tuple<java.lang.Throwable, org.elasticsearch.action.support.ToXContentToBytes>((java.lang.Throwable) actionRequestValidationException23, (org.elasticsearch.action.support.ToXContentToBytes) intSetting38);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(intSetting38);
        org.junit.Assert.assertNotNull(indexMetaData39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertNotNull(indexMetaData46);
        org.junit.Assert.assertNull(version47);
        org.junit.Assert.assertNull(discoveryNodeFilters48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNull(mappingMetaData51);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap52);
        org.junit.Assert.assertNotNull(strImmutableOpenMap53);
        org.junit.Assert.assertNotNull(indexMetaDataDiff54);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest6.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "indices:data/write/bulk[s]", (java.lang.Throwable) actionRequestValidationException10, "index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [32] is different than the one provided [1]", (java.lang.Throwable) actionRequestValidationException10, "index.creation_date_string");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [-1] is higher or equal to the one provided [1]", (java.lang.Throwable) actionRequestValidationException10, "");
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(writeConsistencyLevel9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest10 = builderTuple9.v2();
        boolean boolean11 = bulkShardRequestReplicatedWriteRequest10.getShouldPersistResult();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, bulkShardRequestReplicatedWriteRequest10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequestReplicatedWriteRequest10.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest10);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = bulkShardRequestReplicatedWriteRequest10.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indicesOptions13);
        org.junit.Assert.assertNull(transportAddress16);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.state(state6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder1.putCustom("primary_terms", custom11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest14.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest14.index("index.");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings22 = indexMetaData21.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder12.settings(settings22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings22);
        org.elasticsearch.transport.TransportService transportService25 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService26 = null;
        org.elasticsearch.indices.IndicesService indicesService27 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool28 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction29 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction30 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper31 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters32 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction34 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings22, transportService25, clusterService26, indicesService27, threadPool28, shardStateAction29, mappingUpdatedAction30, updateHelper31, actionFilters32, indexNameExpressionResolver33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        boolean boolean4 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.excludeFilters();
        org.elasticsearch.index.Index index9 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        int int13 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest7 = builderTuple6.v2();
        boolean boolean8 = bulkShardRequestReplicatedWriteRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple14 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) bulkShardRequestWriteRequestTuple14);
        int int16 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData18 = indexMetaData0.mapping("current version [100] is different than the one provided [52]");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap19 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state21 = indexMetaData0.getState();
        org.elasticsearch.common.settings.Settings settings22 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state23 = indexMetaData0.getState();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(mappingMetaData18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertTrue("'" + state21 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state21.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertTrue("'" + state23 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state23.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.state(state5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.version((long) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAlias("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.removeAlias("current version [100] is different than the one provided [52]");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.state(state13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.removeAllAliases();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = builder12.primaryTerm(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest4.timeout(timeValue11);
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest12.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest12.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel20);
        bulkShardRequest21.primaryTerm((-1L));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder27, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy31 = bulkShardRequest28.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest28.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.WriteConsistencyLevel> objTuple33 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.WriteConsistencyLevel>((java.lang.Object) 0, writeConsistencyLevel32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException35 = bulkShardRequest12.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder41, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest42);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder40, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest42);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest45 = builderTuple44.v2();
        boolean boolean46 = bulkShardRequestReplicatedWriteRequest45.getShouldPersistResult();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple47 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder38, bulkShardRequestReplicatedWriteRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest49 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest45);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = bulkShardRequestReplicatedWriteRequest45.index("index.auto_expand_replicas");
        org.elasticsearch.common.unit.TimeValue timeValue52 = bulkShardRequestReplicatedWriteRequest45.timeout();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException53 = bulkShardRequestReplicatedWriteRequest45.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple58 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder56, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple59 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder55, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest64 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple65 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder63, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest64);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple66 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder62, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest64);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest67 = builderTuple66.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest68 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest67);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple69 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder55, bulkShardRequestReplicatedWriteRequest67);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData70 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData70);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap72 = indexMetaData70.getAliases();
        boolean boolean74 = indexMetaData70.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData76 = indexMetaData70.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest78 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest79 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest78);
        org.elasticsearch.common.unit.TimeValue timeValue80 = bulkShardRequest78.timeout();
        boolean boolean81 = indexMetaData70.equals((java.lang.Object) bulkShardRequest78);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest83 = bulkShardRequest78.index("state-");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple84 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder55, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest78);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel85 = bulkShardRequest78.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest86 = bulkShardRequestReplicatedWriteRequest45.consistencyLevel(writeConsistencyLevel85);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest87 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel85);
        org.junit.Assert.assertNotNull(bulkShardRequest7);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertTrue("'" + refreshPolicy31 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy31.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNotNull(actionRequestValidationException35);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest51);
        org.junit.Assert.assertNotNull(timeValue52);
        org.junit.Assert.assertNull(actionRequestValidationException53);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest67);
        org.junit.Assert.assertNotNull(indexMetaData70);
        org.junit.Assert.assertNotNull(strImmutableOpenMap72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(mappingMetaData76);
        org.junit.Assert.assertNotNull(timeValue80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest83);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel85 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel85.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest86);
        org.junit.Assert.assertNotNull(bulkShardRequest87);
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder9, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest13 = builderTuple12.v2();
        boolean boolean14 = bulkShardRequestReplicatedWriteRequest13.getShouldPersistResult();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, bulkShardRequestReplicatedWriteRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest13);
        java.lang.String str18 = bulkShardRequestReplicatedWriteRequest13.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, bulkShardRequestReplicatedWriteRequest13);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = bulkShardRequestReplicatedWriteRequest13.getRefreshPolicy();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequestReplicatedWriteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mappingOrDefault("_na_");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 1);
        java.lang.String str10 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version12 = indexMetaData11.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData11.includeFilters();
        long long14 = indexMetaData11.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData16 = indexMetaData11.mappingOrDefault("_na_");
        org.elasticsearch.Version version17 = indexMetaData11.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state18 = indexMetaData11.getState();
        org.elasticsearch.common.settings.Settings settings19 = indexMetaData11.getSettings();
        org.elasticsearch.Version version20 = indexMetaData11.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData11.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff22 = indexMetaData0.diff(indexMetaData11);
        org.elasticsearch.common.xcontent.XContentParser xContentParser23 = null;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = indexMetaData0.fromXContent(xContentParser23, parseFieldMatcher24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_na_" + "'", str10, "_na_");
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNull(mappingMetaData16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertTrue("'" + state18 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state18.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
        org.junit.Assert.assertNotNull(indexMetaDataDiff22);
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest7 = builderTuple6.v2();
        boolean boolean8 = bulkShardRequestReplicatedWriteRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple14 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) bulkShardRequestWriteRequestTuple14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData18 = builder16.mapping("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder16.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.index("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder25, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder24, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state29 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder24.state(state29);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state31 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder24.state(state31);
        byte byte33 = state31.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder22.state(state31);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder38, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder37, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest42 = builderTuple41.v2();
        boolean boolean43 = bulkShardRequestReplicatedWriteRequest42.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel47 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest45.consistencyLevel(writeConsistencyLevel47);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple49 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest42, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest48);
        boolean boolean50 = indexMetaData35.equals((java.lang.Object) bulkShardRequestWriteRequestTuple49);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData35);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData53 = builder51.mapping("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple58 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder56, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple59 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder55, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest60 = builderTuple59.v2();
        boolean boolean61 = bulkShardRequestReplicatedWriteRequest60.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest63 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest64 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel65 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest63.consistencyLevel(writeConsistencyLevel65);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple67 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest60, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest66);
        org.elasticsearch.index.VersionType versionType68 = org.elasticsearch.index.VersionType.EXTERNAL;
        java.lang.String str71 = versionType68.explainConflictForReads((long) (short) 100, (long) '4');
        org.elasticsearch.index.VersionType versionType72 = versionType68.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.index.VersionType> bulkShardRequestWriteRequestTuple73 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest60, versionType72);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple74 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder51, bulkShardRequestReplicatedWriteRequest60);
        org.elasticsearch.common.unit.TimeValue timeValue75 = bulkShardRequestReplicatedWriteRequest60.timeout();
        org.elasticsearch.tasks.TaskId taskId76 = bulkShardRequestReplicatedWriteRequest60.getParentTask();
        org.elasticsearch.tasks.TaskId taskId77 = bulkShardRequestReplicatedWriteRequest60.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple78 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder34, bulkShardRequestReplicatedWriteRequest60);
        org.elasticsearch.common.transport.TransportAddress transportAddress79 = null;
        bulkShardRequestReplicatedWriteRequest60.remoteAddress(transportAddress79);
        org.elasticsearch.common.unit.TimeValue timeValue81 = bulkShardRequestReplicatedWriteRequest60.timeout();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(mappingMetaData18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + state31 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state31.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(mappingMetaData53);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple67);
        org.junit.Assert.assertNotNull(versionType68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "current version [100] is different than the one provided [52]" + "'", str71, "current version [100] is different than the one provided [52]");
        org.junit.Assert.assertNotNull(versionType72);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple73);
        org.junit.Assert.assertNotNull(timeValue75);
        org.junit.Assert.assertNotNull(taskId76);
        org.junit.Assert.assertNotNull(taskId77);
        org.junit.Assert.assertNotNull(timeValue81);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        int int6 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("primary_terms");
        int int9 = builder8.numberOfShards();
        java.lang.String str10 = builder8.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest18 = builderTuple17.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, bulkShardRequestReplicatedWriteRequest18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        boolean boolean24 = builderTuple20.equals((java.lang.Object) bulkItemRequest23);
        org.elasticsearch.common.xcontent.ToXContent.Params params25 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.common.xcontent.ToXContent.Params> bulkItemRequestTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.common.xcontent.ToXContent.Params>(bulkItemRequest23, params25);
        boolean boolean27 = indexMetaData0.equals((java.lang.Object) bulkItemRequest23);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap28 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData31 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData31);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap33 = indexMetaData31.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap34 = indexMetaData31.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version36 = indexMetaData35.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters37 = indexMetaData35.includeFilters();
        long long38 = indexMetaData35.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff39 = indexMetaData31.diff(indexMetaData35);
        boolean boolean40 = indexMetaData0.equals((java.lang.Object) indexMetaData35);
        org.elasticsearch.common.settings.Settings settings41 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings42 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters43 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "primary_terms" + "'", str10, "primary_terms");
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(params25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(indexMetaData31);
        org.junit.Assert.assertNotNull(strImmutableOpenMap33);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap34);
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertNull(version36);
        org.junit.Assert.assertNull(discoveryNodeFilters37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(indexMetaDataDiff39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNull(discoveryNodeFilters43);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.Version version1 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(version5);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest7 = builderTuple6.v2();
        boolean boolean8 = bulkShardRequestReplicatedWriteRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple14 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) bulkShardRequestWriteRequestTuple14);
        int int16 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap17 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData19 = indexMetaData0.mappingOrDefault("index.version.minimum_compatible");
        int int20 = indexMetaData0.getRoutingFactor();
        int int21 = indexMetaData0.getRoutingNumShards();
        int int22 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters23 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int25 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings26 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings26);
        boolean boolean28 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings27);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNull(mappingMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("primary_terms");
        int int2 = builder1.numberOfShards();
        java.lang.String str3 = builder1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.setRoutingNumShards((int) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder5.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("current version [10] is different than the one provided [2]", custom8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) (short) 100);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "primary_terms" + "'", str3, "primary_terms");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        boolean boolean4 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.Version version7 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("current version [100] is higher or equal to the one provided [10]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest3.timeout(timeValue10);
        org.elasticsearch.tasks.TaskId taskId12 = bulkShardRequest11.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder1.creationDate(0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder1.numberOfReplicas((int) (short) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.version(35L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.creationDate(32L);
        int int24 = builder21.numberOfReplicas();
        org.junit.Assert.assertNotNull(bulkShardRequest6);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest7 = builderTuple6.v2();
        boolean boolean8 = bulkShardRequestReplicatedWriteRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple14 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) bulkShardRequestWriteRequestTuple14);
        int int16 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap17 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet20 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) -1);
        int int21 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int23 = indexMetaData0.getNumberOfShards();
        boolean boolean25 = indexMetaData0.isSameUUID("current version [97] is higher or equal to the one provided [10]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version6 = indexMetaData5.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData5.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData5.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData5);
        boolean boolean10 = indexMetaData0.equals((java.lang.Object) builder9);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version13 = indexMetaData12.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData12.includeFilters();
        java.util.Set<java.lang.String> strSet16 = null; // flaky: indexMetaData12.activeAllocationIds(1);
        java.lang.String str17 = indexMetaData12.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        java.lang.String[] strArray45 = new java.lang.String[] { "index.version.created_string", "primary_terms", "index.creation_date_string", "hi!", "index.blocks.read", "index.priority", "index.number_of_replicas", "index.blocks.read_only", "active_allocations", "state-", "index.", "index.auto_expand_replicas", "index.number_of_replicas", "index.uuid", "state-", "hi!", "index.version.created", "primary_terms", "index.version.upgraded", "primary_terms" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder23.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder20.putActiveAllocationIds((int) (byte) 3, (java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder9.putActiveAllocationIds(1, (java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest56 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest55);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = bulkShardRequest55.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest61 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest60);
        org.elasticsearch.common.unit.TimeValue timeValue62 = bulkShardRequest60.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest63 = bulkShardRequest55.timeout(timeValue62);
        org.elasticsearch.tasks.TaskId taskId64 = bulkShardRequest63.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest63.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple67 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder53, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest63);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest68 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest70 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel71 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest72 = bulkShardRequest70.consistencyLevel(writeConsistencyLevel71);
        bulkShardRequest72.primaryTerm((-1L));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest75 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest72);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder77 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder78 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest79 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple80 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder78, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest79);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple81 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder77, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest79);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy82 = bulkShardRequest79.getRefreshPolicy();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel83 = bulkShardRequest79.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.WriteConsistencyLevel> objTuple84 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.WriteConsistencyLevel>((java.lang.Object) 0, writeConsistencyLevel83);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest85 = bulkShardRequest63.consistencyLevel(writeConsistencyLevel83);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple86 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder9, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest63);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest87 = builderTuple86.v2();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertNull(version13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(bulkShardRequest58);
        org.junit.Assert.assertNotNull(timeValue62);
        org.junit.Assert.assertNotNull(bulkShardRequest63);
        org.junit.Assert.assertNotNull(taskId64);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNotNull(bulkShardRequest72);
        org.junit.Assert.assertTrue("'" + refreshPolicy82 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy82.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel83 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel83.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest85);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest87);
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        long long14 = versionType0.updateVersion(32L, (long) 100);
        boolean boolean16 = versionType0.validateVersionForWrites((long) 10);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        boolean boolean4 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        boolean boolean8 = indexMetaData0.equals((java.lang.Object) 100.0d);
        org.elasticsearch.index.Index index9 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData0.getSettings();
        boolean boolean11 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings10);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.setShardId(shardId2);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest3.remoteAddress();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNull(transportAddress5);
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        org.apache.lucene.util.Version version3 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version6 = indexMetaData5.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData5.includeFilters();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData5.activeAllocationIds(1);
        java.lang.String str10 = indexMetaData5.getIndexUUID();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData5.excludeFilters();
        org.elasticsearch.Version version12 = indexMetaData5.getCreationVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData5.mappingOrDefault("");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.index("current version [-1] is different than the one provided [32]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNull(version6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_na_" + "'", str10, "_na_");
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mappingOrDefault("_na_");
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder11, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest16 = builderTuple15.v2();
        boolean boolean17 = bulkShardRequestReplicatedWriteRequest16.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestWriteRequestTuple23 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequestReplicatedWriteRequest16, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        boolean boolean24 = indexMetaData9.equals((java.lang.Object) bulkShardRequestWriteRequestTuple23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        java.lang.String str26 = indexMetaData9.getIndexUUID();
        boolean boolean28 = indexMetaData9.equals((java.lang.Object) 0.0f);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        boolean boolean30 = indexMetaData0.equals((java.lang.Object) indexMetaData9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters31 = indexMetaData9.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap32 = indexMetaData9.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequestWriteRequestTuple23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_na_" + "'", str26, "_na_");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters31);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version1 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.includeFilters();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        long long5 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.minimum_compatible");
        int int8 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.Version version9 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData0.mapping("index.");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards must be less that the number of source shards");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(version1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNull(mappingMetaData12);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.excludeFilters();
        org.elasticsearch.Version version5 = indexMetaData0.getUpgradedVersion();
        int int6 = indexMetaData0.getRoutingFactor();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [35] is higher or equal to the one provided [35]");
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.setRoutingNumShards(100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.putCustom("current version [1] is different than the one provided [1]", custom11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder7.numberOfReplicas((int) (byte) 0);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest16.index("index.");
        org.elasticsearch.common.unit.TimeValue timeValue22 = bulkShardRequest16.timeout();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder7, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest24 = builderTuple23.v2();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest26.consistencyLevel(writeConsistencyLevel27);
        bulkShardRequest28.primaryTerm((-1L));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest32.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder38, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder37, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy42 = bulkShardRequest39.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest32.setRefreshPolicy(refreshPolicy42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest28.setRefreshPolicy(refreshPolicy42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest44.index("index.creation_date");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy47 = bulkShardRequest46.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequestReplicatedWriteRequest24.setRefreshPolicy(refreshPolicy47);
        org.elasticsearch.index.shard.ShardId shardId49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest48.setShardId(shardId49);
        org.elasticsearch.tasks.TaskId taskId51 = bulkShardRequest50.getParentTask();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNull(writeConsistencyLevel35);
        org.junit.Assert.assertTrue("'" + refreshPolicy42 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy42.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest43);
        org.junit.Assert.assertNotNull(bulkShardRequest44);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
        org.junit.Assert.assertTrue("'" + refreshPolicy47 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy47.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest48);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertNotNull(taskId51);
    }
}
