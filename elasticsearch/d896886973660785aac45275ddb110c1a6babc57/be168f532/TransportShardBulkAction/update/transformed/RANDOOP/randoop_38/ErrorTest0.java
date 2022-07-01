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
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = bulkShardRequest0.toString();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) '#', (long) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads((long) '4', (long) (byte) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads((long) 1, (long) (byte) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) '#', (long) (byte) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForWrites(10L, (long) (byte) -1, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        boolean boolean10 = versionType0.validateVersionForWrites((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForReads(10L, (long) (byte) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForWrites((-1L), (long) 0, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForWrites(101L, (long) 'a', true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads((long) (short) 1, (long) '#');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.version.created_string");
        bulkShardRequest0.primaryTerm((long) (-1));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest0.indices();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        boolean boolean5 = indexMetaData0.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap6 = indexMetaData0.getCustoms();
        int int7 = indexMetaData0.getRoutingNumShards();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData10.getSettings();
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings12);
        boolean boolean14 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings12);
        boolean boolean15 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder9.settings(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.removeAlias("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = builder18.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.removeAllAliases();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        boolean boolean10 = versionType0.validateVersionForWrites((long) (byte) 0);
        boolean boolean12 = versionType0.validateVersionForWrites(35L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites((long) (byte) 2, (long) (short) 0, false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.version.created_string");
        org.elasticsearch.tasks.TaskId taskId3 = bulkShardRequest2.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest2.toString();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        boolean boolean17 = versionType0.isVersionConflictForReads(100L, (long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType0.explainConflictForWrites((long) 'a', 1L, true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        long long6 = versionType0.updateVersion(0L, 100L);
        boolean boolean9 = versionType0.isVersionConflictForReads((long) ' ', (long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForReads((long) 100, (long) (byte) 3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        byte byte4 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) (-1), (long) (short) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        boolean boolean17 = versionType0.isVersionConflictForReads((long) (short) 0, (long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType0.explainConflictForWrites(53L, 97L, false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads((long) '#', 0L);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings2 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int4 = indexMetaData3.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData3.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData3.excludeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff7 = indexMetaData0.diff(indexMetaData3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = builder8.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder8.version((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder8.removeAlias("current version [1] is different than the one provided [100]");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads(10L, 32L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(1L, (long) (short) 10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForWrites(1L, 0L, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType15.explainConflictForReads((long) 0, (long) 3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        boolean boolean7 = versionType0.isVersionConflictForWrites((long) (byte) -1, (long) 1, false);
        org.elasticsearch.index.VersionType versionType8 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType9 = versionType8.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType9.explainConflictForReads(0L, 2L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForWrites(11L, (long) (short) 1, true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index2 = indexMetaData0.getMergeSourceIndex();
        int int3 = indexMetaData0.getNumberOfShards();
        int int4 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.priority", "_na_", "current version [1] is different than the one provided [35]", "index.blocks.read", "current version [100] is higher than the one provided [0]", "index.uuid", "current version [52] is higher than the one provided [10]", "index.blocks.read_only", "index.version.minimum_compatible", "index.number_of_shards", "primary_terms" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder5.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet19);
        java.lang.String str22 = builder21.index();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int25 = indexMetaData24.getNumberOfShards();
        org.elasticsearch.index.Index index26 = indexMetaData24.getMergeSourceIndex();
        int int27 = indexMetaData24.getNumberOfShards();
        boolean boolean29 = indexMetaData24.isSameUUID("index.shared_filesystem");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap30 = indexMetaData24.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData24);
        java.lang.String[] strArray44 = new java.lang.String[] { "index.number_of_shards", "index.number_of_replicas", "indices:data/write/bulk[s]", "current version [52] is different than the one provided [1]", "primary_terms", "index.version.created", "current version [1] is different than the one provided [35]", "current version [10] is higher than the one provided [-1]", "index.creation_date_string", "index.blocks.read", "index.auto_expand_replicas" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder31.putActiveAllocationIds((int) (byte) 1, (java.util.Set<java.lang.String>) strSet45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder21.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet45);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData49 = builder48.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData51 = builder48.mapping("current version [1] is higher than the one provided [1]");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        boolean boolean10 = versionType0.validateVersionForWrites((long) (byte) 0);
        boolean boolean13 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) (short) 0);
        boolean boolean15 = versionType0.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites(0L, (long) (-1), true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        boolean boolean5 = versionType0.validateVersionForWrites((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForReads(1L, 97L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(1L, (long) (short) 10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads(1L, (long) (byte) 2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        boolean boolean17 = versionType0.isVersionConflictForReads((long) (short) 0, (long) 'a');
        boolean boolean19 = versionType0.validateVersionForReads(32L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType0.explainConflictForWrites(10L, (long) (byte) 10, false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        long long6 = versionType0.updateVersion(97L, (long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites((long) '4', 101L, true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        boolean boolean7 = versionType0.isVersionConflictForWrites((long) (short) 10, 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForWrites((-1L), (long) 0, true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.removeAlias("current version [100] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder23.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.setRoutingNumShards((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = builder26.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder26.removeAllAliases();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        boolean boolean15 = versionType0.isVersionConflictForReads((long) (short) 0, (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites(98L, (long) (byte) 0, true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        boolean boolean7 = versionType0.isVersionConflictForWrites((long) (byte) -1, (long) 1, false);
        org.elasticsearch.index.VersionType versionType8 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType8.explainConflictForWrites(97L, (long) (byte) 0, false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean18 = versionType15.isVersionConflictForReads((-1L), (long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType15.explainConflictForReads(0L, 11L);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.setShardId(shardId7);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        org.elasticsearch.index.VersionType versionType10 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean14 = versionType10.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean18 = versionType10.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean22 = versionType10.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.Enum<org.elasticsearch.index.VersionType>> bulkShardRequestReplicatedWriteRequestTuple23 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType10.explainConflictForReads(11L, 35L);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads(3L, (long) 3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((-1L), (long) (byte) -1, true);
        boolean boolean14 = versionType0.validateVersionForReads((long) 10);
        boolean boolean17 = versionType0.isVersionConflictForReads((long) (short) 0, (long) 'a');
        byte byte18 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType0.explainConflictForReads(32L, 4L);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        boolean boolean10 = versionType0.validateVersionForWrites((long) (byte) 0);
        boolean boolean13 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) (short) 0);
        boolean boolean17 = versionType0.isVersionConflictForWrites((long) 100, (long) (short) 0, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str20 = versionType0.explainConflictForReads((long) (byte) 10, 97L);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads(10L, (long) 100);
        long long6 = versionType0.updateVersion(97L, (long) '#');
        boolean boolean9 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForReads(100L, 97L);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        boolean boolean14 = versionType0.validateVersionForReads((long) 52);
        byte byte15 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads(0L, 97L);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = bulkShardRequest0.index("index.version.created_string");
        org.elasticsearch.index.shard.ShardId shardId3 = bulkShardRequest0.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.toString();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean11 = versionType0.isVersionConflictForReads((long) (byte) 100, (long) 52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites(2L, (long) 32, false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) (byte) -1, (long) (byte) -1);
        boolean boolean7 = versionType0.isVersionConflictForWrites((long) (byte) -1, (long) 1, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForReads((long) 'a', 0L);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 10, (long) (short) -1, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites(3L, (long) 10, true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) '4', (long) ' ', false);
        boolean boolean10 = versionType0.validateVersionForWrites((long) (byte) 0);
        boolean boolean13 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) (short) 0);
        boolean boolean15 = versionType0.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads((long) 2, (long) (byte) -1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        boolean boolean14 = versionType0.validateVersionForReads((long) 52);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType16 = versionType15.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType16.explainConflictForReads((long) (short) -1, (long) '#');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) 3, (long) (byte) 100);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType0.explainConflictForWrites((long) (byte) 1, (long) (short) 0, false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        boolean boolean14 = versionType0.validateVersionForReads((long) 52);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads(4L, (long) (short) 10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) (-1), 0L, false);
        boolean boolean15 = versionType0.isVersionConflictForReads((long) (short) 0, (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites((long) (byte) 100, (-1L), false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) 10, (-1L), false);
        boolean boolean8 = versionType0.isVersionConflictForWrites((long) 'a', 0L, false);
        long long11 = versionType0.updateVersion((long) 1, (long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) ' ', (long) (byte) 100);
    }
}

