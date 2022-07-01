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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder7.setRoutingNumShards((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder7.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder7.putMapping(mappingMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest1.remoteAddress();
        boolean boolean9 = bulkShardRequest1.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.creationDate((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder9.creationDate(35L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder9.numberOfReplicas(32);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = builder16.primaryTerm((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int22 = builder21.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder21.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder21.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int28 = indexMetaData27.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings29 = indexMetaData27.getSettings();
        java.util.Set<java.lang.String> strSet31 = null; // flaky: indexMetaData27.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state32 = indexMetaData27.getState();
        byte byte33 = state32.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder26.state(state32);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData36 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int37 = indexMetaData36.getNumberOfShards();
        org.elasticsearch.index.Index index38 = indexMetaData36.getMergeSourceIndex();
        int int39 = indexMetaData36.getNumberOfShards();
        boolean boolean41 = indexMetaData36.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap42 = indexMetaData36.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData36);
        java.lang.String[] strArray56 = new java.lang.String[] { "index.number_of_shards", "index.number_of_replicas", "indices:data/write/bulk[s]", "current version [52] is different than the one provided [1]", "primary_terms", "index.version.created", "current version [1] is different than the one provided [35]", "current version [10] is higher than the one provided [-1]", "index.creation_date_string", "index.blocks.read", "index.auto_expand_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder43.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder34.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = builder18.putActiveAllocationIds((int) (byte) 10, (java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = builder61.index("current version [97] is different than the one provided [35]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = builder63.numberOfReplicas((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(indexMetaData27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state32.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(indexMetaData36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(index38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap42);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
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
        int int18 = indexMetaData0.getRoutingNumShards();
        int int19 = indexMetaData0.getRoutingFactor();
        boolean boolean21 = indexMetaData0.isSameUUID("delete");
        org.elasticsearch.common.io.stream.StreamInput streamInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData0.readDiffFrom(streamInput22);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData0.getSettings();
        int int11 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
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
        int int18 = indexMetaData0.getRoutingNumShards();
        int int19 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData0.includeFilters();
        org.elasticsearch.common.settings.Settings settings21 = indexMetaData0.getSettings();
        org.elasticsearch.transport.TransportService transportService22 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService23 = null;
        org.elasticsearch.indices.IndicesService indicesService24 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool25 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction26 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction27 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper28 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters29 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction31 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings21, transportService22, clusterService23, indicesService24, threadPool25, shardStateAction26, mappingUpdatedAction27, updateHelper28, actionFilters29, indexNameExpressionResolver30);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertNotNull(settings21);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
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
        java.util.Set<java.lang.String> strSet19 = indexMetaData7.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData7.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData7);
        org.elasticsearch.Version version22 = indexMetaData7.getUpgradedVersion();
        java.lang.Class<?> wildcardClass23 = version22.getClass();
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean28 = bulkShardRequest27.getShouldPersistResult();
        java.lang.Throwable throwable30 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, true, throwable30, writeResult31);
        org.elasticsearch.index.shard.ShardId shardId33 = bulkShardRequest27.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions34 = bulkShardRequest27.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions35 = bulkShardRequest27.indicesOptions();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, writeResult36);
        org.elasticsearch.action.update.UpdateHelper.Result result39 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result40 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean42 = bulkShardRequest41.getShouldPersistResult();
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult45 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult46 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result40, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, true, throwable44, writeResult45);
        org.elasticsearch.index.shard.ShardId shardId47 = bulkShardRequest41.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions48 = bulkShardRequest41.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest41.timeout(timeValue49);
        org.elasticsearch.index.shard.ShardId shardId51 = bulkShardRequest41.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result53 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean55 = bulkShardRequest54.getShouldPersistResult();
        java.lang.Throwable throwable57 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult58 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult59 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result53, (org.elasticsearch.action.ActionRequest) bulkShardRequest54, true, throwable57, writeResult58);
        org.elasticsearch.index.shard.ShardId shardId60 = bulkShardRequest54.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions61 = bulkShardRequest54.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel62 = bulkShardRequest54.consistencyLevel();
        bulkShardRequest54.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException65 = bulkShardRequest54.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult66 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult67 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result39, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, true, (java.lang.Throwable) actionRequestValidationException65, writeResult66);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult68 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult69 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, true, (java.lang.Throwable) actionRequestValidationException65, writeResult68);
        org.elasticsearch.action.update.UpdateHelper.Result result70 = updateResult69.result;
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.AnnotatedElement, org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult> annotatedElementTuple71 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.AnnotatedElement, org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult>((java.lang.reflect.AnnotatedElement) wildcardClass23, updateResult69);
        boolean boolean72 = updateResult69.success();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult73 = updateResult69.writeResult;
        boolean boolean74 = updateResult69.retry;
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(shardId33);
        org.junit.Assert.assertNotNull(indicesOptions34);
        org.junit.Assert.assertNotNull(indicesOptions35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(shardId47);
        org.junit.Assert.assertNotNull(indicesOptions48);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertNull(shardId51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(shardId60);
        org.junit.Assert.assertNotNull(indicesOptions61);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel62 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel62.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException65);
        org.junit.Assert.assertNull(result70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(writeResult73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
        long long9 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData0.requireFilters();
        java.lang.String str12 = indexMetaData0.getIndexUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_na_" + "'", str12, "_na_");
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData0.getState();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', actionRequest1);
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
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        byte byte5 = versionType0.getValue();
        java.lang.String str8 = versionType0.explainConflictForReads((long) 100, (long) (short) 1);
        boolean boolean10 = versionType0.validateVersionForReads((long) (short) -1);
        boolean boolean14 = versionType0.isVersionConflictForWrites((long) (short) 10, (long) (short) 0, false);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 2 + "'", byte5 == (byte) 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "current version [100] is different than the one provided [1]" + "'", str8, "current version [100] is different than the one provided [1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
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
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData7.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        long long20 = indexMetaData7.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData7.getMappings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData23 = indexMetaData7.mapping("current version [100] is different than the one provided [32]");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNull(mappingMetaData23);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder18.primaryTerm((int) (byte) 0, 1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int25 = builder24.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder24.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.removeAlias("index.priority");
        long long30 = builder29.version();
        long long31 = builder29.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder29.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int35 = builder34.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder34.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom39 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder34.putCustom("index.creation_date_string", custom39);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state41 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder34.state(state41);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData43 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int44 = indexMetaData43.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings45 = indexMetaData43.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder34.settings(settings45);
        boolean boolean47 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings45);
        boolean boolean48 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder32.settings(settings45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder32.version((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData53 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int54 = indexMetaData53.getNumberOfShards();
        org.elasticsearch.index.Index index55 = indexMetaData53.getMergeSourceIndex();
        int int56 = indexMetaData53.getNumberOfShards();
        int int57 = indexMetaData53.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData53);
        java.lang.String[] strArray71 = new java.lang.String[] { "index.priority", "_na_", "current version [1] is different than the one provided [35]", "index.blocks.read", "current version [100] is higher than the one provided [0]", "index.uuid", "current version [52] is higher than the one provided [10]", "index.blocks.read_only", "index.version.minimum_compatible", "index.number_of_shards", "primary_terms" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder74 = builder58.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder75 = builder32.putActiveAllocationIds(1, (java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder76 = builder21.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder78 = builder76.index("current version [3] is different than the one provided [35]");
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + state41 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state41.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(indexMetaData43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(indexMetaData53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(index55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        int int8 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [3] is different than the one provided [0]", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        boolean boolean7 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest2.remoteAddress(transportAddress8);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, true, throwable15, writeResult16);
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest12.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = bulkShardRequest12.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions20 = bulkShardRequest12.indicesOptions();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = bulkShardRequest12.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest2.setRefreshPolicy(refreshPolicy21);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = bulkShardRequest2.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(indicesOptions20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest22);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.Index index9 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData0.excludeFilters();
        org.apache.lucene.util.Version version14 = indexMetaData0.getMinimumCompatibleVersion();
        long long15 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int17 = indexMetaData16.getNumberOfShards();
        org.elasticsearch.index.Index index18 = indexMetaData16.getMergeSourceIndex();
        int int19 = indexMetaData16.getNumberOfShards();
        boolean boolean21 = indexMetaData16.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap22 = indexMetaData16.getCustoms();
        int int23 = indexMetaData16.getRoutingNumShards();
        java.lang.String str24 = indexMetaData16.getIndexUUID();
        int int25 = indexMetaData16.getRoutingNumShards();
        boolean boolean27 = indexMetaData16.isSameUUID("current version [0] is higher than the one provided [0]");
        boolean boolean28 = indexMetaData0.equals((java.lang.Object) indexMetaData16);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters12);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNull(version14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(index18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_na_" + "'", str24, "_na_");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting2 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple4 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting2, (java.lang.CharSequence) "index.version.upgraded_string");
        java.lang.CharSequence charSequence5 = toXContentToBytesTuple4.v2();
        java.lang.String str6 = toXContentToBytesTuple4.toString();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>> strImmutableOpenMapTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>>(strImmutableOpenMap1, toXContentToBytesTuple4);
        java.lang.CharSequence charSequence8 = toXContentToBytesTuple4.v2();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = builder10.mapping("index.shared_filesystem");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder10.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder33.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder35.creationDate(100L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder35.removeAllAliases();
        int int39 = builder38.getRoutingNumShards();
        boolean boolean40 = toXContentToBytesTuple4.equals((java.lang.Object) builder38);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(intSetting2);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple4);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "index.version.upgraded_string" + "'", charSequence5, "index.version.upgraded_string");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str6, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "index.version.upgraded_string" + "'", charSequence8, "index.version.upgraded_string");
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, writeResult12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy15 = bulkShardRequest10.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest1.setRefreshPolicy(refreshPolicy15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest16.validate();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest16.getParentTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy15 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy15.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(taskId18);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.numberOfShards((int) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.setRoutingNumShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.creationDate((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.primaryTerm(2, (long) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
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
        java.lang.String str12 = bulkShardRequest1.index();
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest1.shardId();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest1.setShardId(shardId14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest1.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = bulkShardRequest1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest2.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest2.setShardId(shardId11);
        long long13 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest12.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest12.setShardId(shardId15);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, writeResult17);
        boolean boolean19 = updateResult18.success();
        boolean boolean20 = updateResult18.retry;
        org.elasticsearch.action.update.UpdateHelper.Result result21 = updateResult18.result;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(result21);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting0, (java.lang.CharSequence) "index.version.upgraded_string");
        java.lang.CharSequence charSequence3 = toXContentToBytesTuple2.v2();
        org.elasticsearch.action.support.ToXContentToBytes toXContentToBytes4 = toXContentToBytesTuple2.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int6 = indexMetaData5.getNumberOfShards();
        org.elasticsearch.index.Index index7 = indexMetaData5.getMergeSourceIndex();
        int int8 = indexMetaData5.getNumberOfShards();
        boolean boolean10 = indexMetaData5.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData5.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.index.Index index14 = indexMetaData12.getMergeSourceIndex();
        int int15 = indexMetaData12.getNumberOfShards();
        boolean boolean17 = indexMetaData12.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap18 = indexMetaData12.getCustoms();
        org.elasticsearch.Version version19 = indexMetaData12.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData5.diff(indexMetaData12);
        java.lang.String str21 = indexMetaData12.getIndexUUID();
        org.elasticsearch.index.Index index22 = indexMetaData12.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters23 = indexMetaData12.includeFilters();
        boolean boolean24 = toXContentToBytesTuple2.equals((java.lang.Object) discoveryNodeFilters23);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int26 = indexMetaData25.getNumberOfShards();
        org.elasticsearch.index.Index index27 = indexMetaData25.getMergeSourceIndex();
        int int28 = indexMetaData25.getNumberOfShards();
        boolean boolean30 = indexMetaData25.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap31 = indexMetaData25.getCustoms();
        int int32 = indexMetaData25.getRoutingNumShards();
        boolean boolean33 = toXContentToBytesTuple2.equals((java.lang.Object) int32);
        java.lang.CharSequence charSequence34 = toXContentToBytesTuple2.v2();
        java.lang.String str35 = toXContentToBytesTuple2.toString();
        java.lang.String str36 = toXContentToBytesTuple2.toString();
        org.elasticsearch.action.support.ToXContentToBytes toXContentToBytes37 = toXContentToBytesTuple2.v1();
        org.junit.Assert.assertNotNull(intSetting0);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple2);
        org.junit.Assert.assertEquals("'" + charSequence3 + "' != '" + "index.version.upgraded_string" + "'", charSequence3, "index.version.upgraded_string");
        org.junit.Assert.assertNotNull(toXContentToBytes4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_na_" + "'", str21, "_na_");
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertNull(discoveryNodeFilters23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(index27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + charSequence34 + "' != '" + "index.version.upgraded_string" + "'", charSequence34, "index.version.upgraded_string");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str35, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str36, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
        org.junit.Assert.assertNotNull(toXContentToBytes37);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.index.Index index5 = indexMetaData0.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(index5);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) (byte) 1, 10L, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads(1L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        bulkShardRequest1.remoteAddress(transportAddress8);
        java.lang.String str10 = bulkShardRequest1.index();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setShardId(shardId7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest1.indicesOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(indicesOptions11);
        org.junit.Assert.assertNotNull(indicesOptions12);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
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
        int int11 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state13 = indexMetaData0.getState();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput14);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + state13 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state13.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
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
        org.elasticsearch.Version version11 = indexMetaData0.getUpgradedVersion();
        org.apache.lucene.util.Version version12 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int14 = indexMetaData13.getNumberOfShards();
        org.elasticsearch.index.Index index15 = indexMetaData13.getMergeSourceIndex();
        int int16 = indexMetaData13.getNumberOfShards();
        org.elasticsearch.Version version17 = indexMetaData13.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        int int19 = indexMetaData13.getNumberOfReplicas();
        org.elasticsearch.Version version20 = indexMetaData13.getUpgradedVersion();
        long long21 = indexMetaData13.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        boolean boolean23 = indexMetaData0.equals((java.lang.Object) indexMetaData13);
        org.elasticsearch.Version version24 = indexMetaData13.getUpgradedVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = indexMetaData13.primaryTerm((int) '4');
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(index15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(version24);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData0.getState();
        int int11 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int13 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData12.getSettings();
        org.elasticsearch.Version version15 = indexMetaData12.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData12.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData12);
        org.elasticsearch.Version version18 = indexMetaData12.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData0.diff(indexMetaData12);
        java.lang.String str20 = indexMetaData0.getIndexUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(indexMetaDataDiff19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_na_" + "'", str20, "_na_");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str3 = versionType0.explainConflictForReads(10L, (long) 0);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) (byte) 1, (long) '#');
        boolean boolean10 = versionType0.isVersionConflictForWrites((long) '4', (long) '4', false);
        boolean boolean12 = versionType0.validateVersionForWrites((long) (byte) 10);
        boolean boolean14 = versionType0.validateVersionForReads((long) (byte) 1);
        boolean boolean18 = versionType0.isVersionConflictForWrites((long) (short) -1, (long) 52, true);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [10] is different than the one provided [0]" + "'", str3, "current version [10] is different than the one provided [0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
        int int10 = indexMetaData0.getRoutingNumShards();
        long long11 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("current version [0] is different than the one provided [52]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
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
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.index("hi!");
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, true, throwable18, writeResult19);
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest15.timeout(timeValue21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy25 = bulkShardRequest24.getRefreshPolicy();
        long long26 = bulkShardRequest24.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest24.index("index.auto_expand_replicas");
        org.elasticsearch.action.update.UpdateHelper.Result result29 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean31 = bulkShardRequest30.getShouldPersistResult();
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result29, (org.elasticsearch.action.ActionRequest) bulkShardRequest30, true, throwable33, writeResult34);
        org.elasticsearch.index.shard.ShardId shardId36 = bulkShardRequest30.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions37 = bulkShardRequest30.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest30.timeout(timeValue38);
        long long40 = bulkShardRequest39.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest39.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result42 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean44 = bulkShardRequest43.getShouldPersistResult();
        java.lang.Throwable throwable46 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult47 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult48 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result42, (org.elasticsearch.action.ActionRequest) bulkShardRequest43, true, throwable46, writeResult47);
        org.elasticsearch.common.unit.TimeValue timeValue49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest43.timeout(timeValue49);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy51 = bulkShardRequest50.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest39.setRefreshPolicy(refreshPolicy51);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = bulkShardRequest24.setRefreshPolicy(refreshPolicy51);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException54 = bulkShardRequest24.validate();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy55 = bulkShardRequest24.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = bulkShardRequest13.setRefreshPolicy(refreshPolicy55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertTrue("'" + refreshPolicy25 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy25.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(bulkShardRequest28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shardId36);
        org.junit.Assert.assertNotNull(indicesOptions37);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertTrue("'" + refreshPolicy51 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy51.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest52);
        org.junit.Assert.assertNotNull(bulkShardRequest53);
        org.junit.Assert.assertNull(actionRequestValidationException54);
        org.junit.Assert.assertTrue("'" + refreshPolicy55 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy55.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest56);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
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
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest8.setShardId(shardId11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest12.index("");
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest12.timeout();
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest12.getParentTask();
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean19 = bulkShardRequest18.getShouldPersistResult();
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest18, true, throwable21, writeResult22);
        org.elasticsearch.common.unit.TimeValue timeValue24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest18.timeout(timeValue24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.common.unit.TimeValue timeValue28 = bulkShardRequest27.timeout();
        org.elasticsearch.action.update.UpdateHelper.Result result29 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean31 = bulkShardRequest30.getShouldPersistResult();
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result29, (org.elasticsearch.action.ActionRequest) bulkShardRequest30, true, throwable33, writeResult34);
        org.elasticsearch.index.shard.ShardId shardId36 = bulkShardRequest30.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean39 = bulkShardRequest38.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult40 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult41 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result37, (org.elasticsearch.action.ActionRequest) bulkShardRequest38, writeResult40);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel42 = bulkShardRequest38.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy43 = bulkShardRequest38.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest30.setRefreshPolicy(refreshPolicy43);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest44.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress47 = null;
        bulkShardRequest46.remoteAddress(transportAddress47);
        org.elasticsearch.action.update.UpdateHelper.Result result49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean51 = bulkShardRequest50.getShouldPersistResult();
        java.lang.Throwable throwable53 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult54 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult55 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result49, (org.elasticsearch.action.ActionRequest) bulkShardRequest50, true, throwable53, writeResult54);
        org.elasticsearch.index.shard.ShardId shardId56 = bulkShardRequest50.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions57 = bulkShardRequest50.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions58 = bulkShardRequest50.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId59 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = bulkShardRequest50.setShardId(shardId59);
        org.elasticsearch.action.update.UpdateHelper.Result result61 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean63 = bulkShardRequest62.getShouldPersistResult();
        java.lang.Throwable throwable65 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult66 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult67 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result61, (org.elasticsearch.action.ActionRequest) bulkShardRequest62, true, throwable65, writeResult66);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel68 = bulkShardRequest62.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest69 = bulkShardRequest60.consistencyLevel(writeConsistencyLevel68);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel70 = bulkShardRequest60.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest71 = bulkShardRequest46.consistencyLevel(writeConsistencyLevel70);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest72 = bulkShardRequest27.consistencyLevel(writeConsistencyLevel70);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel73 = bulkShardRequest27.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest74 = bulkShardRequest12.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput75 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest12.writeTo(streamOutput75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNull(timeValue15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNull(timeValue28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shardId36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel42 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel42.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy43 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy43.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest44);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(shardId56);
        org.junit.Assert.assertNotNull(indicesOptions57);
        org.junit.Assert.assertNotNull(indicesOptions58);
        org.junit.Assert.assertNotNull(bulkShardRequest60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel68 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel68.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest69);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel70 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel70.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest71);
        org.junit.Assert.assertNotNull(bulkShardRequest72);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel73 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel73.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest74);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created");
        int int2 = builder1.numberOfShards();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.requireFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest2.shardId();
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest2.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest2.index("hi!");
        org.elasticsearch.action.update.UpdateHelper.Result result12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result12, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, true, throwable16, writeResult17);
        org.elasticsearch.index.shard.ShardId shardId19 = bulkShardRequest13.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions20 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result21 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean24 = bulkShardRequest23.getShouldPersistResult();
        java.lang.Throwable throwable26 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, true, throwable26, writeResult27);
        org.elasticsearch.index.shard.ShardId shardId29 = bulkShardRequest23.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions30 = bulkShardRequest23.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest23.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest23.setShardId(shardId32);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result21, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, writeResult34);
        org.elasticsearch.action.ActionRequest actionRequest36 = updateResult35.actionRequest;
        org.elasticsearch.action.update.UpdateHelper.Result result37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean39 = bulkShardRequest38.getShouldPersistResult();
        java.lang.Throwable throwable41 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result37, (org.elasticsearch.action.ActionRequest) bulkShardRequest38, true, throwable41, writeResult42);
        org.elasticsearch.common.unit.TimeValue timeValue44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest38.timeout(timeValue44);
        org.elasticsearch.tasks.TaskId taskId46 = bulkShardRequest45.getParentTask();
        actionRequest36.setParentTask(taskId46);
        bulkShardRequest13.setParentTask(taskId46);
        bulkShardRequest2.setParentTask(taskId46);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.ActionRequest actionRequest51 = bulkItemRequest50.request();
        int int52 = bulkItemRequest50.id();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = bulkItemRequest50.index();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(shardId19);
        org.junit.Assert.assertNotNull(indicesOptions20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(shardId29);
        org.junit.Assert.assertNotNull(indicesOptions30);
        org.junit.Assert.assertNotNull(indicesOptions31);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(actionRequest36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(taskId46);
        org.junit.Assert.assertNotNull(actionRequest51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
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
        org.elasticsearch.index.shard.ShardId shardId16 = bulkShardRequest1.shardId();
        long long17 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest1.getParentTask();
        bulkShardRequest1.primaryTerm((long) (byte) 1);
        org.elasticsearch.index.shard.ShardId shardId21 = bulkShardRequest1.shardId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNull(shardId21);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.numberOfShards((int) (short) 1);
        long long11 = builder10.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData16 = builder14.mapping("index.shared_filesystem");
        java.lang.String[] strArray34 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder14.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet35);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder37.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData40 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int41 = indexMetaData40.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings42 = indexMetaData40.getSettings();
        boolean boolean43 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings42);
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings42);
        org.elasticsearch.common.settings.Settings settings45 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings42);
        boolean boolean46 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings42);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder37.settings(settings42);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData48 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int49 = indexMetaData48.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings50 = indexMetaData48.getSettings();
        boolean boolean51 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings50);
        boolean boolean52 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings50);
        org.elasticsearch.common.settings.Settings settings53 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings50);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = builder47.settings(settings50);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder12.settings(settings50);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = builder12.version((long) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder12.creationDate(35L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = builder59.version((long) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder61.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = builder62.removeAllAliases();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(mappingMetaData16);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(indexMetaData40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(indexMetaData48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
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
        int int18 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap20 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.index.Index index21 = indexMetaData0.getMergeSourceIndex();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap20);
        org.junit.Assert.assertNull(index21);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
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
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.index("current version [10] is higher than the one provided [-1]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest8.index("index.version.created");
        long long18 = bulkShardRequest17.primaryTerm();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = bulkShardRequest17.getRefreshPolicy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = bulkShardRequest17.indices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        boolean boolean3 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        boolean boolean4 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings2);
        boolean boolean6 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings2);
        boolean boolean7 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings2);
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
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction17 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings2, transportService8, clusterService9, indicesService10, threadPool11, shardStateAction12, mappingUpdatedAction13, updateHelper14, actionFilters15, indexNameExpressionResolver16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
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
        org.elasticsearch.index.shard.ShardId shardId14 = bulkShardRequest13.shardId();
        org.elasticsearch.index.shard.ShardId shardId15 = bulkShardRequest13.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest13.validate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
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
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId15 = bulkShardRequest13.shardId();
        boolean boolean16 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.index("current version [0] is different than the one provided [0]");
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        java.lang.Throwable throwable23 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, true, throwable23, writeResult24);
        org.elasticsearch.common.unit.TimeValue timeValue26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest20.timeout(timeValue26);
        bulkShardRequest27.setParentTask("hi!", (long) (short) 100);
        bulkShardRequest27.setParentTask("current version [10] is higher than the one provided [-1]", (long) (short) 10);
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest27.getParentTask();
        org.elasticsearch.action.update.UpdateHelper.Result result35 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean37 = bulkShardRequest36.getShouldPersistResult();
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult40 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult41 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result35, (org.elasticsearch.action.ActionRequest) bulkShardRequest36, true, throwable39, writeResult40);
        org.elasticsearch.index.shard.ShardId shardId42 = bulkShardRequest36.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions43 = bulkShardRequest36.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest36.timeout(timeValue44);
        org.elasticsearch.common.transport.TransportAddress transportAddress46 = null;
        bulkShardRequest36.remoteAddress(transportAddress46);
        org.elasticsearch.action.update.UpdateHelper.Result result48 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean51 = bulkShardRequest50.getShouldPersistResult();
        java.lang.Throwable throwable53 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult54 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult55 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result49, (org.elasticsearch.action.ActionRequest) bulkShardRequest50, true, throwable53, writeResult54);
        org.elasticsearch.index.shard.ShardId shardId56 = bulkShardRequest50.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions57 = bulkShardRequest50.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions58 = bulkShardRequest50.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId59 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = bulkShardRequest50.setShardId(shardId59);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult61 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult62 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result48, (org.elasticsearch.action.ActionRequest) bulkShardRequest60, writeResult61);
        org.elasticsearch.common.unit.TimeValue timeValue63 = bulkShardRequest60.timeout();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.unit.TimeValue> streamableTuple64 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest36, timeValue63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = bulkShardRequest27.timeout(timeValue63);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest18.timeout(timeValue63);
        org.elasticsearch.common.unit.TimeValue timeValue67 = bulkShardRequest18.timeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shardId42);
        org.junit.Assert.assertNotNull(indicesOptions43);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(shardId56);
        org.junit.Assert.assertNotNull(indicesOptions57);
        org.junit.Assert.assertNotNull(indicesOptions58);
        org.junit.Assert.assertNotNull(bulkShardRequest60);
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertNotNull(streamableTuple64);
        org.junit.Assert.assertNotNull(bulkShardRequest65);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNotNull(timeValue67);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.creationDate((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.state(state10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.numberOfShards((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.version((long) (byte) 0);
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.settings(settings16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        java.lang.Object obj9 = null;
        boolean boolean10 = indexMetaData0.equals(obj9);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap11 = indexMetaData0.getMappings();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.INTERNAL;
        java.lang.String str3 = versionType0.explainConflictForReads((long) (-1), 0L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType0.isVersionConflictForWrites(35L, (long) 1, false);
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        long long12 = versionType0.updateVersion(1L, (long) (byte) 0);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "current version [-1] is different than the one provided [0]" + "'", str3, "current version [-1] is different than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        long long7 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.index("index.auto_expand_replicas");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.setRoutingNumShards(97);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder4.index("current version [10] is different than the one provided [35]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
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
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest5.index("index.number_of_replicas");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest20.timeout("current version [2] is higher than the one provided [1]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [2] is higher than the one provided [1]] as a time value: unit is missing or unrecognized");
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
        org.junit.Assert.assertNotNull(bulkShardRequest20);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = indexMetaData0.mapping("hi!");
        long long6 = indexMetaData0.getVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int10 = indexMetaData9.getNumberOfShards();
        org.elasticsearch.index.Index index11 = indexMetaData9.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = indexMetaData9.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state14 = indexMetaData9.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder8.state(state14);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = builder15.mapping("current version [32] is higher than the one provided [53]");
        java.lang.String str18 = builder15.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.removeAllAliases();
        int int20 = builder15.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder15.removeAlias("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.putMapping(mappingMetaData23);
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
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNull(mappingMetaData13);
        org.junit.Assert.assertTrue("'" + state14 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state14.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(mappingMetaData17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.index.Index index3 = indexMetaData1.getMergeSourceIndex();
        int int4 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.Version version5 = indexMetaData1.getCreationVersion();
        int int6 = indexMetaData1.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData1.mappingOrDefault("current version [100] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int10 = indexMetaData9.getNumberOfShards();
        org.elasticsearch.index.Index index11 = indexMetaData9.getMergeSourceIndex();
        int int12 = indexMetaData9.getNumberOfShards();
        boolean boolean14 = indexMetaData9.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap15 = indexMetaData9.getCustoms();
        int int16 = indexMetaData9.getRoutingNumShards();
        java.lang.String str17 = indexMetaData9.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData9);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData1.diff(indexMetaData9);
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
        org.elasticsearch.index.Index index37 = indexMetaData27.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters38 = indexMetaData27.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters39 = indexMetaData27.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = indexMetaData27.mappingOrDefault("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff42 = indexMetaData9.diff(indexMetaData27);
        int int43 = indexMetaData27.getNumberOfShards();
        long long44 = indexMetaData27.getCreationDate();
        org.elasticsearch.common.settings.Settings settings45 = indexMetaData27.getSettings();
        int int46 = indexMetaData27.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap47 = indexMetaData27.getCustoms();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet49 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(52, indexMetaData27, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (-1) must be greater than the shard id: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(indexMetaDataDiff19);
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
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNull(discoveryNodeFilters38);
        org.junit.Assert.assertNull(discoveryNodeFilters39);
        org.junit.Assert.assertNull(mappingMetaData41);
        org.junit.Assert.assertNotNull(indexMetaDataDiff42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap47);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state6 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.getInitialRecoveryFilters();
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int11 = builder10.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder10.putCustom("index.creation_date_string", custom15);
        long long17 = builder16.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder16.numberOfShards((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom21 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder19.putCustom("index.", custom21);
        boolean boolean23 = indexMetaData0.equals((java.lang.Object) custom21);
        java.lang.String str24 = indexMetaData0.getIndexUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state6.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_na_" + "'", str24, "_na_");
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
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
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.includeFilters();
        java.lang.String str11 = indexMetaData0.getIndexUUID();
        boolean boolean13 = indexMetaData0.isSameUUID("current version [1] is different than the one provided [100]");
        org.elasticsearch.index.Index index14 = indexMetaData0.getMergeSourceIndex();
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
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(index14);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version7 = indexMetaData0.getCreationVersion();
        org.elasticsearch.index.Index index8 = indexMetaData0.getMergeSourceIndex();
        int int9 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mapping("current version [32] is different than the one provided [100]");
        int int12 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        long long9 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mapping("index.shared_filesystem.recover_on_any_node");
        org.apache.lucene.util.Version version12 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.Version version14 = indexMetaData0.getCreationVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(version14);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = updateResult2.writeResult;
        boolean boolean5 = updateResult2.success();
        java.lang.Throwable throwable6 = updateResult2.error;
        org.elasticsearch.action.update.UpdateResponse updateResponse7 = updateResult2.noopResult;
        java.lang.Throwable throwable8 = updateResult2.error;
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest9 = updateResult2.request();
        boolean boolean10 = updateResult2.failure();
        org.elasticsearch.action.ActionRequest actionRequest11 = updateResult2.actionRequest;
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertNull(writeResult4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertNull(updateResponse7);
        org.junit.Assert.assertNull(throwable8);
        org.junit.Assert.assertNull(bulkShardRequestReplicationRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(actionRequest11);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int7 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.requireFilters();
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData0.getCustoms();
        int int11 = indexMetaData0.getRoutingFactor();
        org.apache.lucene.util.Version version12 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap13 = indexMetaData0.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(index2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult5 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, writeResult4);
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest2.shardId();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
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
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "indices:data/write/bulk[s]", (java.lang.Throwable) actionRequestValidationException22, "index.number_of_replicas");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, (java.lang.Throwable) actionRequestValidationException22, writeResult25);
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = null;
        bulkShardRequest2.remoteAddress(transportAddress27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertNotNull(indicesOptions18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putCustom("index.version.upgraded_string", custom4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder5.mapping("update");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.creationDate((long) (short) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = builder5.mapping("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder5.index("current version [-1] is different than the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder5.index("current version [10] is different than the one provided [10]");
        long long16 = builder15.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData20 = builder18.mapping("index.shared_filesystem");
        java.lang.String[] strArray38 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder18.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder41.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData44 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int45 = indexMetaData44.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings46 = indexMetaData44.getSettings();
        boolean boolean47 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings46);
        org.elasticsearch.common.settings.Settings settings48 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings46);
        org.elasticsearch.common.settings.Settings settings49 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings46);
        boolean boolean50 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder41.settings(settings46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder41.removeAlias("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder53.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData56 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int57 = indexMetaData56.getNumberOfShards();
        org.elasticsearch.index.Index index58 = indexMetaData56.getMergeSourceIndex();
        int int59 = indexMetaData56.getNumberOfShards();
        boolean boolean61 = indexMetaData56.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap62 = indexMetaData56.getCustoms();
        int int63 = indexMetaData56.getRoutingNumShards();
        java.lang.String str64 = indexMetaData56.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData56);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData66 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int67 = indexMetaData66.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings68 = indexMetaData66.getSettings();
        boolean boolean69 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings68);
        boolean boolean70 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings68);
        boolean boolean71 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = builder65.settings(settings68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder53.settings(settings68);
        org.elasticsearch.common.settings.Settings settings74 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings68);
        org.elasticsearch.common.settings.Settings settings75 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder76 = builder15.settings(settings68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder78 = builder15.removeAlias("current version [1] is higher than the one provided [52]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNull(mappingMetaData20);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(indexMetaData44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(settings46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(indexMetaData56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(index58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "_na_" + "'", str64, "_na_");
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(indexMetaData66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(settings68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(settings74);
        org.junit.Assert.assertNotNull(settings75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
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
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData7.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData7);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int21 = indexMetaData20.getNumberOfShards();
        org.elasticsearch.index.Index index22 = indexMetaData20.getMergeSourceIndex();
        int int23 = indexMetaData20.getNumberOfShards();
        boolean boolean25 = indexMetaData20.isSameUUID("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData20);
        int int27 = indexMetaData20.getRoutingNumShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters28 = indexMetaData20.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int31 = builder30.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom33 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder30.putCustom("index.version.upgraded_string", custom33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder34.numberOfReplicas(1);
        boolean boolean37 = indexMetaData20.equals((java.lang.Object) builder34);
        int int38 = indexMetaData20.getRoutingNumShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff39 = indexMetaData7.diff(indexMetaData20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int44 = builder43.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder43.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom48 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder43.putCustom("index.creation_date_string", custom48);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state50 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder43.state(state50);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData52 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int53 = indexMetaData52.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings54 = indexMetaData52.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder43.settings(settings54);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData57 = builder55.mapping("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData62 = builder60.mapping("index.shared_filesystem");
        java.lang.String[] strArray80 = new java.lang.String[] { "index.shared_filesystem", "index.creation_date_string", "index.creation_date", "current version [2] is different than the one provided [35]", "", "current version [2] is different than the one provided [35]", "index.data_path", "index.number_of_shards", "index.blocks.write", "hi!", "index.blocks.write", "index.shadow_replicas", "current version [100] is higher than the one provided [0]", "index.number_of_replicas", "index.", "index.shared_filesystem" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder83 = builder60.putActiveAllocationIds((int) (short) 100, (java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder84 = builder55.putActiveAllocationIds((int) ' ', (java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder85 = builder40.putActiveAllocationIds(32, (java.util.Set<java.lang.String>) strSet81);
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + state50 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE + "'", state50.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE));
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(indexMetaData52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(mappingMetaData57);
        org.junit.Assert.assertNull(mappingMetaData62);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("Tuple [v1={\n  \"key\" : \"index.blocks.write\",\n  \"properties\" : [\n    \"Dynamic\",\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"false\"\n}, v2=current version [100] is different than the one provided [0]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [Tuple [v1={?  \"key\" : \"index.blocks.write\",?  \"properties\" : [?    \"Dynamic\",?    \"IndexScope\"?  ],?  \"is_group_setting\" : false,?  \"default\" : \"false\"?}, v2=current version [100] is different than the one provided [0]]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult4 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult3);
        boolean boolean5 = updateResult4.retry;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = updateResult4.writeResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse7 = updateResult4.noopResult;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = updateResult4.request();
        bulkShardRequest8.primaryTerm(35L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(writeResult6);
        org.junit.Assert.assertNull(updateResponse7);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
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
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest13.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = bulkShardRequest13.consistencyLevel();
        bulkShardRequest13.primaryTerm(100L);
        bulkShardRequest13.setParentTask("current version [3] is different than the one provided [35]", 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(transportAddress14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult4 = updateResult2.writeResult;
        boolean boolean5 = updateResult2.success();
        boolean boolean6 = updateResult2.retry;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult7 = updateResult2.writeResult;
        boolean boolean8 = updateResult2.success();
        java.lang.Throwable throwable9 = updateResult2.error;
        java.lang.Throwable throwable10 = updateResult2.error;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = updateResult2.writeResult;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = updateResult2.writeResult;
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertNull(writeResult4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(writeResult7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(throwable9);
        org.junit.Assert.assertNull(throwable10);
        org.junit.Assert.assertNull(writeResult11);
        org.junit.Assert.assertNull(writeResult12);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.creationDate((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate((long) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder4.build();
        org.elasticsearch.index.Index index8 = indexMetaData7.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertNull(index8);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_SHARDS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.ToXContentToBytes) intSetting0, (java.lang.CharSequence) "index.version.upgraded_string");
        java.lang.String str3 = toXContentToBytesTuple2.toString();
        org.elasticsearch.action.support.ToXContentToBytes toXContentToBytes4 = toXContentToBytesTuple2.v1();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>(toXContentToBytes4, (java.lang.CharSequence) "current version [-1] is different than the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int8 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = indexMetaData7.getSettings();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData7.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData7.excludeFilters();
        boolean boolean13 = toXContentToBytesTuple6.equals((java.lang.Object) discoveryNodeFilters12);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int15 = indexMetaData14.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings16 = indexMetaData14.getSettings();
        org.elasticsearch.Version version17 = indexMetaData14.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData14.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData14.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap20 = indexMetaData14.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData14);
        boolean boolean22 = toXContentToBytesTuple6.equals((java.lang.Object) indexMetaData14);
        int int23 = indexMetaData14.getNumberOfShards();
        int int24 = indexMetaData14.getRoutingFactor();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int26 = indexMetaData25.getNumberOfShards();
        org.elasticsearch.index.Index index27 = indexMetaData25.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData29 = indexMetaData25.mappingOrDefault("index.data_path");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters30 = indexMetaData25.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters31 = indexMetaData25.includeFilters();
        org.elasticsearch.index.Index index32 = indexMetaData25.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters33 = indexMetaData25.excludeFilters();
        int int34 = indexMetaData25.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int36 = indexMetaData35.getNumberOfShards();
        org.elasticsearch.index.Index index37 = indexMetaData35.getMergeSourceIndex();
        int int38 = indexMetaData35.getNumberOfShards();
        boolean boolean40 = indexMetaData35.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap41 = indexMetaData35.getCustoms();
        int int42 = indexMetaData35.getRoutingNumShards();
        java.lang.String str43 = indexMetaData35.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData35);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state45 = indexMetaData35.getState();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff46 = indexMetaData25.diff(indexMetaData35);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff47 = indexMetaData14.diff(indexMetaData25);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap48 = indexMetaData25.getActiveAllocationIds();
        org.junit.Assert.assertNotNull(intSetting0);
        org.junit.Assert.assertNotNull(toXContentToBytesTuple2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]" + "'", str3, "Tuple [v1={\n  \"key\" : \"index.number_of_shards\",\n  \"properties\" : [\n    \"IndexScope\"\n  ],\n  \"is_group_setting\" : false,\n  \"default\" : \"5\"\n}, v2=index.version.upgraded_string]");
        org.junit.Assert.assertNotNull(toXContentToBytes4);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNotNull(strImmutableOpenMap20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(index27);
        org.junit.Assert.assertNull(mappingMetaData29);
        org.junit.Assert.assertNull(discoveryNodeFilters30);
        org.junit.Assert.assertNull(discoveryNodeFilters31);
        org.junit.Assert.assertNull(index32);
        org.junit.Assert.assertNull(discoveryNodeFilters33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "_na_" + "'", str43, "_na_");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + state45 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state45.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaDataDiff46);
        org.junit.Assert.assertNotNull(indexMetaDataDiff47);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap48);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse4 = updateResult2.noopResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse5 = updateResult2.noopResult;
        boolean boolean6 = updateResult2.retry;
        org.elasticsearch.action.update.UpdateResponse updateResponse7 = updateResult2.noopResult;
        boolean boolean8 = updateResult2.retry;
        org.elasticsearch.action.ActionRequest actionRequest9 = updateResult2.actionRequest;
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest10 = updateResult2.request();
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertNull(updateResponse4);
        org.junit.Assert.assertNull(updateResponse5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(updateResponse7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(actionRequest9);
        org.junit.Assert.assertNull(bulkShardRequestReplicationRequest10);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        java.lang.Throwable throwable9 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, true, throwable9, writeResult10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest6.timeout(timeValue12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        java.lang.Throwable throwable22 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, true, throwable22, writeResult23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest19.setShardId(shardId25);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest26.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, false, (java.lang.Throwable) actionRequestValidationException27, writeResult28);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure31 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [-1] is different than the one provided [10]", (java.lang.Throwable) actionRequestValidationException27, "current version [2] is different than the one provided [35]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.blocks.write", (java.lang.Throwable) actionRequestValidationException27, "index.number_of_shards");
        java.lang.String str34 = shardFailure33.indexUUID;
        java.lang.Throwable throwable35 = shardFailure33.cause;
        java.lang.String str36 = shardFailure33.reason;
        java.lang.Throwable throwable37 = shardFailure33.cause;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "index.number_of_shards" + "'", str34, "index.number_of_shards");
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable35.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "index.blocks.write" + "'", str36, "index.blocks.write");
        org.junit.Assert.assertNotNull(throwable37);
        org.junit.Assert.assertEquals(throwable37.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable37.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable37.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateResponse updateResponse1 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult2 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, updateResponse1);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult3 = updateResult2.writeResult;
        boolean boolean4 = updateResult2.failure();
        boolean boolean5 = updateResult2.success();
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest6 = updateResult2.request();
        org.elasticsearch.action.update.UpdateResponse updateResponse7 = updateResult2.noopResult;
        org.elasticsearch.action.update.UpdateResponse updateResponse8 = updateResult2.noopResult;
        org.junit.Assert.assertNull(writeResult3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bulkShardRequestActionRequest6);
        org.junit.Assert.assertNull(updateResponse7);
        org.junit.Assert.assertNull(updateResponse8);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int4 = indexMetaData3.getNumberOfShards();
        org.elasticsearch.index.Index index5 = indexMetaData3.getMergeSourceIndex();
        int int6 = indexMetaData3.getNumberOfShards();
        boolean boolean8 = indexMetaData3.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData3.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.index.Index index12 = indexMetaData10.getMergeSourceIndex();
        int int13 = indexMetaData10.getNumberOfShards();
        boolean boolean15 = indexMetaData10.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData10.getCustoms();
        org.elasticsearch.Version version17 = indexMetaData10.getUpgradedVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff18 = indexMetaData3.diff(indexMetaData10);
        java.lang.String str19 = indexMetaData10.getIndexUUID();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.common.io.stream.Writeable> paramsTuple20 = org.elasticsearch.common.collect.Tuple.tuple(params2, (org.elasticsearch.common.io.stream.Writeable) indexMetaData10);
        org.elasticsearch.action.update.UpdateHelper.Result result21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        java.lang.Throwable throwable25 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result21, (org.elasticsearch.action.ActionRequest) bulkShardRequest22, true, throwable25, writeResult26);
        org.elasticsearch.index.shard.ShardId shardId28 = bulkShardRequest22.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest22.timeout(timeValue30);
        org.elasticsearch.index.shard.ShardId shardId32 = bulkShardRequest22.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue33 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest22.timeout(timeValue33);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> paramsTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.ToXContent.Params, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(params2, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        bulkShardRequest22.setParentTask("current version [100] is different than the one provided [1]", 0L);
        bulkShardRequest22.primaryTerm((-1L));
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest22, writeResult42);
        org.junit.Assert.assertNotNull(params2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(indexMetaDataDiff18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_na_" + "'", str19, "_na_");
        org.junit.Assert.assertNotNull(paramsTuple20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shardId28);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(shardId32);
        org.junit.Assert.assertNotNull(timeValue33);
        org.junit.Assert.assertNotNull(bulkShardRequest34);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest3.index("index.version.created_string");
        bulkShardRequest3.primaryTerm((long) (-1));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest3.getParentTask();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting13 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        java.lang.Throwable throwable20 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest17, true, throwable20, writeResult21);
        org.elasticsearch.common.unit.TimeValue timeValue23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest17.timeout(timeValue23);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel25);
        org.elasticsearch.action.support.IndicesOptions indicesOptions27 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result29 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean31 = bulkShardRequest30.getShouldPersistResult();
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result29, (org.elasticsearch.action.ActionRequest) bulkShardRequest30, true, throwable33, writeResult34);
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest30.setShardId(shardId36);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = bulkShardRequest37.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult39 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult40 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, false, (java.lang.Throwable) actionRequestValidationException38, writeResult39);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting13, "index.priority", (java.lang.Throwable) actionRequestValidationException38, "index.creation_date_string");
        java.lang.Throwable throwable43 = shardFailure42.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult44 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult45 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, throwable43, writeResult44);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure47 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is different than the one provided [100]", throwable43, "current version [1] is different than the one provided [10]");
        java.lang.String str48 = shardFailure47.indexUUID;
        java.lang.String str49 = shardFailure47.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting50 = shardFailure47.routing;
        org.junit.Assert.assertNotNull(bulkShardRequest5);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(bulkShardRequest26);
        org.junit.Assert.assertNotNull(indicesOptions27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest37);
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
        org.junit.Assert.assertNotNull(throwable43);
        org.junit.Assert.assertEquals(throwable43.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable43.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable43.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "current version [1] is different than the one provided [10]" + "'", str48, "current version [1] is different than the one provided [10]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "current version [1] is different than the one provided [100]" + "'", str49, "current version [1] is different than the one provided [100]");
        org.junit.Assert.assertNull(shardRouting50);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder1.setRoutingNumShards((int) 'a');
        int int39 = builder38.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData40 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int41 = indexMetaData40.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings42 = indexMetaData40.getSettings();
        boolean boolean43 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings42);
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings42);
        org.elasticsearch.common.settings.Settings settings45 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings42);
        boolean boolean46 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings45);
        boolean boolean47 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings45);
        boolean boolean48 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder38.settings(settings45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder38.primaryTerm((int) (short) 0, 97L);
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
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(indexMetaData40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable5, writeResult6);
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest2.getParentTask();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting11 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result13 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, true, throwable18, writeResult19);
        org.elasticsearch.common.unit.TimeValue timeValue21 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest15.timeout(timeValue21);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest22.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.support.IndicesOptions indicesOptions25 = bulkShardRequest24.indicesOptions();
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean29 = bulkShardRequest28.getShouldPersistResult();
        java.lang.Throwable throwable31 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, true, throwable31, writeResult32);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest28.setShardId(shardId34);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = bulkShardRequest35.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result13, (org.elasticsearch.action.ActionRequest) bulkShardRequest24, false, (java.lang.Throwable) actionRequestValidationException36, writeResult37);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting11, "index.priority", (java.lang.Throwable) actionRequestValidationException36, "index.creation_date_string");
        java.lang.Throwable throwable41 = shardFailure40.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable41, writeResult42);
        boolean boolean44 = updateResult43.failure();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = updateResult43.request();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId50 = bulkShardRequest49.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task51 = bulkShardRequest45.createTask((long) 3, "current version [33] is different than the one provided [10]", "current version [4] is higher than the one provided [35]", taskId50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest22);
        org.junit.Assert.assertNotNull(bulkShardRequest24);
        org.junit.Assert.assertNotNull(indicesOptions25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest35);
        org.junit.Assert.assertNotNull(actionRequestValidationException36);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable41.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(taskId50);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result12 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result12, (org.elasticsearch.action.ActionRequest) bulkShardRequest13, writeResult15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest13.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest1.setRefreshPolicy(refreshPolicy18);
        bulkShardRequest1.setParentTask("index.version.minimum_compatible", 1L);
        java.lang.String str23 = bulkShardRequest1.index();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.creationDate((long) '4');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.priority");
        long long7 = builder6.version();
        long long8 = builder6.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder6.putMapping(mappingMetaData12);
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 100, (long) 0, false);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType0.isVersionConflictForReads(10L, (long) 10);
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType10 = versionType9.versionTypeForReplicationAndRecovery();
        long long13 = versionType10.updateVersion((long) 100, 53L);
        java.lang.String str16 = versionType10.explainConflictForReads((long) (-1), 1L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [100] is higher than the one provided [0]" + "'", str4, "current version [100] is higher than the one provided [0]");
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "current version [-1] is different than the one provided [1]" + "'", str16, "current version [-1] is different than the one provided [1]");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.Version version3 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        long long8 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData0.getCustoms();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        long long2 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int4 = indexMetaData3.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData3.getSettings();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData3.activeAllocationIds((int) (byte) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = indexMetaData3.getState();
        byte byte9 = state8.id();
        byte byte10 = state8.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder1.state(state8);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder1.putMapping(mappingMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHRINK_SOURCE_UUID;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple2 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>((org.elasticsearch.action.support.ToXContentToBytes) strSetting0, (java.lang.CharSequence) "_na_");
        java.lang.String str3 = toXContentToBytesTuple2.toString();
        java.lang.String str4 = toXContentToBytesTuple2.toString();
        java.lang.CharSequence charSequence5 = toXContentToBytesTuple2.v2();
        org.elasticsearch.action.support.ToXContentToBytes toXContentToBytes6 = toXContentToBytesTuple2.v1();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>(toXContentToBytes6, (java.lang.CharSequence) "hi!");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>(toXContentToBytes6, (java.lang.CharSequence) "current version [0] is different than the one provided [100]");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence> toXContentToBytesTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, java.lang.CharSequence>(toXContentToBytes6, (java.lang.CharSequence) "current version [0] is different than the one provided [1]");
        org.junit.Assert.assertNotNull(strSetting0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.shrink.source.uuid\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : false,\n  \"default\" : \"\"\n}, v2=_na_]" + "'", str3, "Tuple [v1={\n  \"key\" : \"index.shrink.source.uuid\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : false,\n  \"default\" : \"\"\n}, v2=_na_]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tuple [v1={\n  \"key\" : \"index.shrink.source.uuid\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : false,\n  \"default\" : \"\"\n}, v2=_na_]" + "'", str4, "Tuple [v1={\n  \"key\" : \"index.shrink.source.uuid\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : false,\n  \"default\" : \"\"\n}, v2=_na_]");
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "_na_" + "'", charSequence5, "_na_");
        org.junit.Assert.assertNotNull(toXContentToBytes6);
    }
}
