import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray1 = bulkShardRequest0.indices();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest0.indices();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads((-1L), (long) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.auto_expand_replicas");
        int int8 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder7.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.removeAllAliases();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state2 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple3 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest0, state2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("current version [-1] is different than the one provided [10]", (long) (-1));
        boolean boolean5 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        bulkShardRequest0.setParentTask("current version [10] is different than the one provided [0]", (long) (short) 100);
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest0.indices();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue7);
        bulkShardRequest0.seqNo((long) 10);
        bulkShardRequest0.primaryTerm(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest0.toString();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder3.mapping("current version [-1] is different than the one provided [2]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (short) 0, (long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads(1L, (long) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.auto_expand_replicas");
        int int8 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder7.build();
        int int10 = builder7.numberOfReplicas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.removeAlias("update");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest8.index("current version [10] is higher than the one provided [10]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest11.toString();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.uuid");
        long long3 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest2.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("current version [100] is different than the one provided [97]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        bulkShardRequest8.primaryTerm((long) (byte) 0);
        bulkShardRequest8.seqNo(53L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray14 = bulkShardRequest8.indices();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType3 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType3.explainConflictForWrites((long) (short) 100, 2L, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long4 = builder3.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAllAliases();
        int int6 = builder3.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder3.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder3.build();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType3 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForWrites((long) 'a', (long) (byte) 1, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest0.indices();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder5.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.primaryTerm(0, (long) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.creationDate((long) (byte) 3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder9.version(33L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = builder13.build();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.auto_expand_replicas");
        int int8 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder7.build();
        int int10 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("active_allocations");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean15 = indexMetaData13.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData13.getInitialRecoveryFilters();
        long long19 = indexMetaData13.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state20 = indexMetaData13.getState();
        org.elasticsearch.common.settings.Settings settings21 = indexMetaData13.getSettings();
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder12.settings(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        int int26 = builder25.numberOfShards();
        long long27 = builder25.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean30 = indexMetaData28.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters32 = indexMetaData28.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap33 = indexMetaData28.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData34 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters35 = indexMetaData34.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff36 = indexMetaData28.diff(indexMetaData34);
        long long37 = indexMetaData34.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long39 = indexMetaData38.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = indexMetaData38.mappingOrDefault("index.blocks.read");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff42 = indexMetaData34.diff(indexMetaData38);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state43 = indexMetaData34.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder25.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData45 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean47 = indexMetaData45.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet49 = indexMetaData45.activeAllocationIds((int) '#');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap50 = indexMetaData45.getMappings();
        long long51 = indexMetaData45.getCreationDate();
        org.elasticsearch.common.settings.Settings settings52 = indexMetaData45.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder44.settings(settings52);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData54 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean56 = indexMetaData54.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData54);
        long long58 = builder57.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state59 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder57.state(state59);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder60.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = builder62.creationDate((long) (byte) 100);
        long long65 = builder62.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData66 = builder62.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData66);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest68 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state70 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple71 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest68, state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = builder67.state(state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder44.state(state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder74 = builder23.state(state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder75 = builder7.state(state70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder76 = builder7.removeAllAliases();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.removeAlias("current version [52] is different than the one provided [52]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.uuid");
        long long3 = bulkShardRequest0.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long3 = indexMetaData2.getVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff4 = indexMetaData0.diff(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.index("index.auto_expand_replicas");
        int int8 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder7.build();
        int int10 = builder7.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("active_allocations");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean15 = indexMetaData13.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData13);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData13.getInitialRecoveryFilters();
        long long19 = indexMetaData13.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state20 = indexMetaData13.getState();
        org.elasticsearch.common.settings.Settings settings21 = indexMetaData13.getSettings();
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder12.settings(settings22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        int int26 = builder25.numberOfShards();
        long long27 = builder25.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean30 = indexMetaData28.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters32 = indexMetaData28.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap33 = indexMetaData28.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData34 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters35 = indexMetaData34.getInitialRecoveryFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff36 = indexMetaData28.diff(indexMetaData34);
        long long37 = indexMetaData34.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long39 = indexMetaData38.getVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = indexMetaData38.mappingOrDefault("index.blocks.read");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff42 = indexMetaData34.diff(indexMetaData38);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state43 = indexMetaData34.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder25.state(state43);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData45 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean47 = indexMetaData45.equals((java.lang.Object) (short) -1);
        java.util.Set<java.lang.String> strSet49 = indexMetaData45.activeAllocationIds((int) '#');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap50 = indexMetaData45.getMappings();
        long long51 = indexMetaData45.getCreationDate();
        org.elasticsearch.common.settings.Settings settings52 = indexMetaData45.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder44.settings(settings52);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData54 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean56 = indexMetaData54.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData54);
        long long58 = builder57.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state59 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder57.state(state59);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder60.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = builder62.creationDate((long) (byte) 100);
        long long65 = builder62.version();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData66 = builder62.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData66);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest68 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state70 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple71 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest68, state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = builder67.state(state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder44.state(state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder74 = builder23.state(state70);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder75 = builder7.state(state70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData76 = builder7.build();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder13.removeAlias("current version [0] is higher or equal to the one provided [100]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest1.index("index.uuid");
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("current version [100] is different than the one provided [2]");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest8.index();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder3.creationDate((long) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder3.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean27 = indexMetaData25.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData25);
        long long29 = builder28.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state30 = org.elasticsearch.cluster.metadata.IndexMetaData.State.CLOSE;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder28.state(state30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder31.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state35 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder31.state(state35);
        byte byte37 = state35.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder3.state(state35);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData39 = builder38.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = builder38.mapping("");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder5.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.primaryTerm(0, (long) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.creationDate((long) (byte) 3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder9.primaryTerm(0, 33L);
        long long15 = builder9.version();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = builder9.mapping("current version [52] is higher than the one provided [2]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest0.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("current version [-1] is different than the one provided [32]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("current version [0] is higher than the one provided [0]");
        java.lang.String str10 = bulkShardRequest0.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest0.indices();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 101, 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForWrites((long) (byte) 100, 0L, false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest1.primaryTerm((long) (byte) 1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest4.index();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.version((long) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap14 = indexMetaData13.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap15 = indexMetaData13.getMappings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData13.mappingOrDefault("current version [-1] is different than the one provided [32]");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state18 = indexMetaData13.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder7.state(state18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.removeAlias("current version [2] is higher than the one provided [10]");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType2 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte3 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads(0L, (long) 2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder5.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.removeAlias("current version [101] is different than the one provided [36]");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue1 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = builder3.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData29 = builder3.mapping("index.auto_expand_replicas");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.uuid");
        long long3 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest2.getParentTask();
        java.lang.String str5 = bulkShardRequest2.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        bulkShardRequest0.setParentTask("current version [10] is different than the one provided [0]", (long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest10.primaryTerm((long) (byte) 1);
        long long13 = bulkShardRequest10.primaryTerm();
        bulkShardRequest10.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest10.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.timeout(timeValue17);
        org.elasticsearch.index.shard.ShardId shardId20 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest0.toString();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.primaryTerm(0, 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder3.build();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        boolean boolean4 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder5.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder5.index("current version [0] is different than the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.removeAlias("index.priority");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType2 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType2.explainConflictForReads((-1L), (long) (short) 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, org.elasticsearch.cluster.metadata.IndexMetaData.State> transportMessageTuple4 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.transport.TransportMessage) bulkShardRequest1, state3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest0.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("current version [-1] is different than the one provided [32]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("current version [0] is higher than the one provided [0]");
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest8.index("current version [10] is higher than the one provided [10]");
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest8.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = bulkShardRequest8.indices();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        boolean boolean2 = indexMetaData0.equals((java.lang.Object) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder5.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.primaryTerm(0, (long) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = builder5.mapping("current version [32] is higher than the one provided [32]");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) (byte) 1);
        long long3 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.created", 0L);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue7);
        bulkShardRequest0.seqNo((long) 10);
        bulkShardRequest0.primaryTerm(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = bulkShardRequest0.indices();
    }
}

