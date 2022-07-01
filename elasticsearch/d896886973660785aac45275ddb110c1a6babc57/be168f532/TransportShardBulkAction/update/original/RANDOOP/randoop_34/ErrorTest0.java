import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads(0L, (long) (byte) -1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads((long) 100, (long) (byte) 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads((long) 100, (long) '#');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((-1L), 10L, true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType1.explainConflictForWrites((long) (-1), (-1L), false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.toString();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) (short) 100, (long) '#');
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest1.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest1.toString();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (short) 1, 0L, false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkItemRequest2.index();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForReads((long) 'a', (long) (short) 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray1 = bulkShardRequest0.indices();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType1.explainConflictForReads((long) (short) 0, (long) (short) -1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) 'a', 1L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte4 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads(1L, (long) (byte) 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads((long) '4', 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType0.explainConflictForWrites(100L, (-1L), true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        byte byte6 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites((long) (byte) 1, (long) (short) -1, true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest0.indicesOptions();
        boolean boolean7 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest0.indices();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean8 = versionType1.validateVersionForReads((long) (byte) -1);
        boolean boolean11 = versionType1.isVersionConflictForReads((long) (short) -1, (long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType1.explainConflictForWrites((long) (short) 0, 52L, false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest4.index();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str7 = bulkShardRequest6.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy8 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest6.index("index.");
        long long11 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = bulkShardRequest12.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest6.setRefreshPolicy(refreshPolicy13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest0.setRefreshPolicy(refreshPolicy13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest15.toString();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        long long8 = versionType1.updateVersion((long) (byte) 10, 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType1.explainConflictForWrites((long) (short) 10, (long) 1, false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest1.toString();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        long long5 = bulkShardRequest0.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.toString();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(35L, (long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites(3L, (long) (short) 100, true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (byte) 10, (long) (byte) -1, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForReads((long) (byte) 0, (long) (short) 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.toString();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder7.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.removeAlias("current version [35] is higher or equal to the one provided [100]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest6.index();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest1.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest1.indices();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest8.getDescription();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(10L, (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites((long) (short) 10, (long) 1, true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest1.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest1.indicesOptions();
        boolean boolean8 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest1.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest11.index();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion((long) 35, (long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) 97, (long) (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) (byte) 10, (long) (byte) 1);
        org.elasticsearch.index.VersionType versionType9 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType1.explainConflictForWrites((long) 35, (long) '#', false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (short) -1, (long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType4.explainConflictForReads((long) (short) 10, 100L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (byte) 10, (long) (byte) -1, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForReads(32L, (long) (short) 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte4 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType5.explainConflictForReads((long) '4', (long) 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (-1), (long) (byte) 3, false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        byte byte6 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads(10L, 1L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException2 = bulkShardRequest0.validate();
        java.lang.String str3 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType1.explainConflictForWrites((long) (byte) 10, 0L, true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean10 = versionType6.isVersionConflictForWrites((long) ' ', 3L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType6.explainConflictForReads((long) (byte) 3, 0L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.setParentTask("index.", 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest5.getDescription();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) -1, 35L);
        boolean boolean12 = versionType4.isVersionConflictForWrites((long) (-1), (long) 10, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType4.explainConflictForWrites((long) (byte) 0, (long) (short) 100, true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 3, 10L);
        boolean boolean6 = versionType0.isVersionConflictForReads(35L, (long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites((long) (byte) 0, (long) (short) -1, false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType1.explainConflictForWrites((long) (short) 1, (long) (byte) 10, true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType1.explainConflictForReads((long) (byte) 3, (-1L));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(10L, (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites((-1L), 100L, true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest4 = bulkItemRequest2.request();
        int int5 = bulkItemRequest2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest2.index();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest0.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = bulkItemRequest2.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkItemRequest2.index();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType0.explainConflictForWrites(0L, (long) (short) -1, false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("hi!");
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType12 = versionType11.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType12.validateVersionForWrites((long) (byte) 3);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) versionType12);
        boolean boolean17 = versionType12.validateVersionForWrites((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str20 = versionType12.explainConflictForReads(0L, 1L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType1.explainConflictForWrites((long) (byte) 3, 2L, false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy8 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest5.setRefreshPolicy(refreshPolicy8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest9.indices();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest0.indices();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean8 = versionType1.validateVersionForReads((long) (byte) -1);
        boolean boolean11 = versionType1.isVersionConflictForReads((long) (short) -1, (long) (byte) 0);
        byte byte12 = versionType1.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType1.explainConflictForReads((long) (short) 10, 11L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (short) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForReads((long) (byte) 100, (long) 35);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte4 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType0.isVersionConflictForReads((long) 32, 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForWrites((long) (short) 1, 1L, true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForReads((long) (byte) 0, 10L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (short) 10, 10L);
        boolean boolean9 = versionType0.validateVersionForWrites((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForWrites((long) 0, (long) '4', false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(10L, (-1L));
        byte byte12 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites(52L, (long) 52, true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte5 = versionType4.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType4.explainConflictForReads((long) 35, (-1L));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException2 = bulkShardRequest0.validate();
        java.lang.String str3 = bulkShardRequest0.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads((long) (byte) -1, (long) 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.toString();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        boolean boolean7 = versionType1.validateVersionForWrites(0L);
        boolean boolean9 = versionType1.validateVersionForWrites(11L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType1.explainConflictForWrites((long) ' ', 52L, true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 3, 10L);
        boolean boolean6 = versionType0.isVersionConflictForReads(35L, (long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites(11L, (long) (byte) 3, true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForWrites((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites((long) 97, (long) (short) 100, false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean9 = versionType0.validateVersionForWrites(10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForWrites((long) 100, (long) (byte) 3, true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_METADATA_BLOCK;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple2 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock0, (java.lang.Comparable<java.lang.String>) "index.version.created");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock0, (java.lang.Comparable<java.lang.String>) "index.number_of_replicas");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>> clusterBlockTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Comparable<java.lang.String>>(clusterBlock0, (java.lang.Comparable<java.lang.String>) "current version [35] is higher or equal to the one provided [100]");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock7 = clusterBlockTuple6.v1();
        org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean11 = versionType8.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte12 = versionType8.getValue();
        org.elasticsearch.index.VersionType versionType13 = versionType8.versionTypeForReplicationAndRecovery();
        boolean boolean14 = clusterBlockTuple6.equals((java.lang.Object) versionType8);
        boolean boolean16 = versionType8.validateVersionForWrites(52L);
        boolean boolean20 = versionType8.isVersionConflictForWrites(3L, (long) (short) 1, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str24 = versionType8.explainConflictForWrites((long) 32, (long) (byte) 10, true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest1.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest1.indices();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) 100, 32L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType4.explainConflictForWrites((long) 32, (long) 52, true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType4.isVersionConflictForReads(0L, (long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType4.explainConflictForReads((long) (short) 0, 10L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        org.elasticsearch.index.VersionType versionType11 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType11.explainConflictForReads((long) '4', 3L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean10 = versionType0.isVersionConflictForWrites((long) (byte) 2, 10L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForWrites(2L, 1L, true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType2.explainConflictForWrites(0L, (long) (byte) 100, false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType5.explainConflictForReads((long) (byte) -1, 2L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str7 = bulkShardRequest6.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy8 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest6.index("index.");
        long long11 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = bulkShardRequest12.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest6.setRefreshPolicy(refreshPolicy13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest0.setRefreshPolicy(refreshPolicy13);
        bulkShardRequest15.primaryTerm((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest15.getDescription();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest0.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest0.indices();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForWrites((long) 35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForWrites(10L, 97L, false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        boolean boolean8 = versionType1.isVersionConflictForReads(100L, (long) (byte) 3);
        boolean boolean10 = versionType1.validateVersionForWrites((long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType1.explainConflictForWrites((long) 100, 100L, true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads((long) 32, (long) '#');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType3 = versionType2.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType2.explainConflictForReads(98L, 32L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = bulkShardRequest0.indicesOptions();
        boolean boolean7 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest0.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str11 = bulkShardRequest10.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = bulkShardRequest10.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest10.getParentTask();
        bulkShardRequest0.setParentTask(taskId14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest0.toString();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest1.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion((long) 35, (long) ' ');
        long long14 = versionType0.updateVersion((long) 32, 35L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForReads((long) (byte) 100, (long) (byte) 2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        boolean boolean8 = versionType1.isVersionConflictForReads(100L, (long) (byte) 3);
        boolean boolean10 = versionType1.validateVersionForWrites((long) 0);
        org.elasticsearch.index.VersionType versionType11 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType11.explainConflictForWrites(2L, (long) '#', false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads((long) (short) 10, (long) (byte) 10);
        long long13 = versionType0.updateVersion(0L, (long) 0);
        org.elasticsearch.index.VersionType versionType14 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte15 = versionType14.getValue();
        boolean boolean19 = versionType14.isVersionConflictForWrites((long) (byte) 1, (long) (byte) -1, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType14.explainConflictForWrites(100L, (long) 0, true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion((long) 35, (long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads(2L, 3L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType3 = versionType2.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType2.explainConflictForWrites((long) 52, (long) 52, false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        boolean boolean8 = versionType0.isVersionConflictForReads((long) (short) 10, (long) ' ');
        boolean boolean10 = versionType0.validateVersionForReads((long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForReads(98L, (long) (short) 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("current version [0] is different than the one provided [100]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.toString();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder7.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.removeAllAliases();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType1.explainConflictForWrites(0L, (long) ' ', true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest0.toString();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequest actionRequest3 = bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest4 = bulkItemRequest2.request();
        org.elasticsearch.action.ActionRequest actionRequest5 = bulkItemRequest2.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest2.index();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean6 = versionType1.isVersionConflictForReads(52L, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType1.explainConflictForReads(97L, (long) (short) 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(35L, (long) (byte) -1);
        boolean boolean14 = versionType0.isVersionConflictForReads((long) '4', 3L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForReads(1L, (long) (byte) -1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads(11L);
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForWrites((long) (byte) 3, 10L, true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest1.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest1.toString();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest4.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest4.indices();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType1.explainConflictForWrites((long) 0, (long) (short) -1, false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType4.isVersionConflictForReads(0L, (long) (short) 0);
        boolean boolean12 = versionType4.isVersionConflictForReads((long) 100, (long) '4');
        boolean boolean14 = versionType4.validateVersionForWrites((long) ' ');
        byte byte15 = versionType4.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType4.explainConflictForWrites((long) (byte) -1, 0L, true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("hi!");
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType12 = versionType11.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType12.validateVersionForWrites((long) (byte) 3);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) versionType12);
        boolean boolean17 = versionType12.validateVersionForWrites((long) (short) -1);
        boolean boolean19 = versionType12.validateVersionForReads((long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType12.explainConflictForWrites(35L, (long) (short) 10, false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = bulkShardRequest0.toString();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForWrites((long) (short) 100);
        boolean boolean8 = versionType0.validateVersionForWrites((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads((long) 35, 100L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("hi!");
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType12 = versionType11.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType12.validateVersionForWrites((long) (byte) 3);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) versionType12);
        boolean boolean17 = versionType12.validateVersionForWrites((long) (short) -1);
        boolean boolean19 = versionType12.validateVersionForWrites((long) (short) 10);
        boolean boolean22 = versionType12.isVersionConflictForReads((long) (short) -1, 2L);
        boolean boolean25 = versionType12.isVersionConflictForReads((long) 35, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType12.explainConflictForReads((long) (short) 10, (long) (short) 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        boolean boolean8 = versionType0.isVersionConflictForReads((long) (short) 10, (long) ' ');
        boolean boolean10 = versionType0.validateVersionForReads((long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForWrites(12L, (-1L), false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        boolean boolean5 = versionType0.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (byte) 2, 32L, false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str7 = bulkShardRequest6.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy8 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest6.getParentTask();
        bulkShardRequest0.setParentTask(taskId10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) -1, 35L);
        boolean boolean12 = versionType4.isVersionConflictForWrites((long) (-1), (long) 10, true);
        byte byte13 = versionType4.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType4.explainConflictForReads(3L, 98L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str3 = bulkShardRequest2.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy4 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.setParentTask("index.", 0L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest6.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        byte byte4 = versionType0.getValue();
        byte byte5 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType0.versionTypeForReplicationAndRecovery();
        long long9 = versionType6.updateVersion((long) (byte) 10, (long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType6.explainConflictForReads((long) 100, 0L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 3, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForWrites((long) (byte) 10, 3L, false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType4.isVersionConflictForReads(0L, (long) (short) 0);
        boolean boolean12 = versionType4.isVersionConflictForReads((long) 35, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType4.explainConflictForReads((long) (short) -1, 100L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("hi!");
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType12 = versionType11.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType12.validateVersionForWrites((long) (byte) 3);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) versionType12);
        boolean boolean17 = versionType12.validateVersionForWrites((long) (short) -1);
        boolean boolean19 = versionType12.validateVersionForWrites((long) (short) 10);
        boolean boolean22 = versionType12.isVersionConflictForReads((long) (short) -1, 2L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType12.explainConflictForWrites((long) (short) 10, (long) (byte) 0, false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) 100, 32L);
        byte byte9 = versionType4.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType4.explainConflictForReads((long) ' ', (long) (byte) 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray5 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState> indexShardStateList6 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexShardState>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList6, indexShardStateArray5);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte9 = state8.id();
        byte byte10 = state8.id();
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.cluster.metadata.IndexMetaData.State> indexShardStateCollectionTuple11 = org.elasticsearch.common.collect.Tuple.tuple((java.util.AbstractCollection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList6, state8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.List<org.elasticsearch.index.shard.IndexShardState>> streamableTuple12 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest0, (java.util.List<org.elasticsearch.index.shard.IndexShardState>) indexShardStateList6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str17 = bulkShardRequest16.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = bulkShardRequest16.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest16.index("index.");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = bulkShardRequest16.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest16.indicesOptions();
        boolean boolean23 = bulkShardRequest16.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId24 = bulkShardRequest16.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str27 = bulkShardRequest26.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy28 = bulkShardRequest26.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest26.getParentTask();
        bulkShardRequest16.setParentTask(taskId30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task32 = bulkShardRequest0.createTask((-1L), "current version [3] is different than the one provided [-1]", "index.auto_expand_replicas", taskId30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType6.isVersionConflictForReads((long) 1, (long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType6.explainConflictForReads((long) (byte) 10, (long) (byte) 3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean10 = versionType0.isVersionConflictForWrites((long) (byte) 2, 10L, true);
        byte byte11 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites((long) 1, 32L, false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean10 = versionType6.isVersionConflictForWrites((long) ' ', 3L, true);
        long long13 = versionType6.updateVersion((long) 10, (long) 35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType6.explainConflictForReads((long) (short) 100, (long) (byte) -1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType2.explainConflictForReads((long) (byte) -1, (long) 97);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites(98L, 35L, false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean8 = versionType1.validateVersionForReads((long) (byte) -1);
        boolean boolean11 = versionType1.isVersionConflictForReads((long) (short) -1, (long) (byte) 0);
        byte byte12 = versionType1.getValue();
        boolean boolean15 = versionType1.isVersionConflictForReads((long) 'a', (long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType1.explainConflictForWrites(0L, (long) (short) 10, true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType5.explainConflictForWrites((long) (short) 100, (long) (byte) 1, false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("current version [0] is different than the one provided [100]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str9 = bulkShardRequest8.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = bulkShardRequest8.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest8.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest12.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest0.setRefreshPolicy(refreshPolicy14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("hi!");
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType12 = versionType11.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType12.validateVersionForWrites((long) (byte) 3);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) versionType12);
        boolean boolean17 = versionType12.validateVersionForWrites((long) (short) -1);
        boolean boolean19 = versionType12.validateVersionForWrites((long) (short) 10);
        byte byte20 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType12.explainConflictForReads((long) 35, 3L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForReads((long) 10, (long) (byte) 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType6.validateVersionForReads((long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType6.explainConflictForWrites(52L, (long) '4', true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads((long) (short) 10, (long) (byte) 10);
        long long13 = versionType0.updateVersion(0L, (long) 0);
        org.elasticsearch.index.VersionType versionType14 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForReads((long) (short) 100, (long) (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        java.lang.String str6 = indexMetaData0.getIndexUUID();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean10 = indexMetaData0.isSameUUID("hi!");
        org.elasticsearch.index.VersionType versionType11 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType12 = versionType11.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType12.validateVersionForWrites((long) (byte) 3);
        boolean boolean15 = indexMetaData0.equals((java.lang.Object) versionType12);
        boolean boolean17 = versionType12.validateVersionForWrites((long) (short) -1);
        boolean boolean19 = versionType12.validateVersionForReads((long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType12.explainConflictForWrites((long) 'a', 0L, true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest0.getParentTask();
        java.lang.String str6 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest0.remoteAddress();
        long long8 = bulkShardRequest0.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest0.toString();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads((long) (short) 10, (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForWrites(0L, 52L, true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) (byte) 10, (long) (byte) 1);
        org.elasticsearch.index.VersionType versionType9 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean11 = versionType9.validateVersionForReads((long) 52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType9.explainConflictForWrites(11L, 12L, true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion((long) 35, (long) ' ');
        boolean boolean14 = versionType0.isVersionConflictForReads((long) 32, (long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForWrites(0L, 0L, false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.setRefreshPolicy(refreshPolicy7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.setParentTask("Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=index.version.created]", 10L);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = bulkShardRequest0.getRefreshPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest0.indices();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        byte byte4 = versionType0.getValue();
        byte byte5 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads((long) (short) 1, (long) (short) 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte4 = versionType0.getValue();
        boolean boolean8 = versionType0.isVersionConflictForWrites(11L, (long) '4', false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForWrites((long) (-1), (long) (-1), false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        org.elasticsearch.index.VersionType versionType11 = versionType0.versionTypeForReplicationAndRecovery();
        long long14 = versionType11.updateVersion((long) (byte) 3, (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType11.explainConflictForWrites((long) 3, (long) (byte) 3, false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 3, 10L);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) (byte) 2, (long) 35);
        boolean boolean8 = versionType0.validateVersionForWrites((long) 52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads((long) 0, 100L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 3, 10L);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) (byte) 2, (long) 35);
        boolean boolean8 = versionType0.validateVersionForReads((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads(32L, (-1L));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads(52L);
        byte byte6 = versionType1.getValue();
        boolean boolean9 = versionType1.isVersionConflictForReads((long) (short) 0, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType1.explainConflictForReads((long) (byte) 3, (long) 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType3 = versionType2.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType3.explainConflictForWrites(100L, (long) (byte) 0, true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        int int5 = bulkItemRequest4.id();
        int int6 = bulkItemRequest4.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest4.index();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads(11L);
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        long long9 = versionType6.updateVersion((long) (short) -1, (long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType6.explainConflictForReads((long) '#', (long) (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        boolean boolean8 = versionType0.isVersionConflictForReads((long) (short) 10, (long) ' ');
        boolean boolean10 = versionType0.validateVersionForReads((long) '4');
        boolean boolean12 = versionType0.validateVersionForWrites((long) 35);
        boolean boolean16 = versionType0.isVersionConflictForWrites((long) '#', (long) (byte) 10, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str20 = versionType0.explainConflictForWrites((long) (byte) 2, 0L, true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.setRefreshPolicy(refreshPolicy7);
        bulkShardRequest0.primaryTerm((long) ' ');
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        long long8 = versionType1.updateVersion((long) (byte) 10, 1L);
        long long11 = versionType1.updateVersion((long) 52, (long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType1.explainConflictForWrites((long) (short) 0, 10L, false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        byte byte3 = versionType1.getValue();
        long long6 = versionType1.updateVersion((long) (short) 0, (long) (byte) 3);
        boolean boolean10 = versionType1.isVersionConflictForWrites(97L, 0L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType1.explainConflictForWrites(52L, (long) (byte) 3, true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest0.toString();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForWrites((long) (short) 0, (long) 100, false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str3 = bulkShardRequest2.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy4 = bulkShardRequest2.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.setParentTask("index.", 0L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest6.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        org.elasticsearch.index.VersionType versionType11 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) 10, (long) 10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType6.isVersionConflictForReads((long) 1, (long) (short) 1);
        boolean boolean11 = versionType6.validateVersionForWrites(3L);
        boolean boolean15 = versionType6.isVersionConflictForWrites((long) 0, (-1L), true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType6.explainConflictForReads((long) ' ', 0L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (byte) 10, (long) (byte) -1, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (byte) 0, (long) '#', true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion((long) 35, (long) ' ');
        long long14 = versionType0.updateVersion((long) 32, 35L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForReads(11L, (long) ' ');
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        byte byte4 = versionType0.getValue();
        byte byte5 = versionType0.getValue();
        boolean boolean7 = versionType0.validateVersionForReads(0L);
        boolean boolean11 = versionType0.isVersionConflictForWrites(12L, 2L, false);
        byte byte12 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) 3, (long) (byte) 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType6.isVersionConflictForReads((long) (-1), (long) 'a');
        boolean boolean13 = versionType6.isVersionConflictForWrites(32L, (long) 0, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType6.explainConflictForReads(0L, 1L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType5.explainConflictForWrites(10L, (long) 10, false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (short) 10, 10L);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 0);
        boolean boolean13 = versionType0.isVersionConflictForWrites(100L, (long) 2, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForWrites((long) (byte) 10, 11L, false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.index("Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=index.priority]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData13 = builder11.mapping("Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=index.version.created]]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        boolean boolean8 = versionType0.isVersionConflictForReads((long) (short) 10, (long) ' ');
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean11 = versionType9.validateVersionForWrites((long) (byte) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType9.explainConflictForReads((long) (short) 0, (long) 'a');
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (short) 10, 10L);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 0);
        boolean boolean13 = versionType0.isVersionConflictForWrites(100L, (long) 2, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForReads((long) (short) -1, (long) (short) 100);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads(52L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType1.explainConflictForReads((long) (byte) 0, 0L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads(52L);
        byte byte6 = versionType1.getValue();
        boolean boolean9 = versionType1.isVersionConflictForReads((long) (short) 0, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType1.explainConflictForWrites((long) '4', (long) (short) 1, true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest8.toString();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(35L, (long) (byte) -1);
        byte byte12 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType13 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean15 = versionType0.validateVersionForWrites((long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites((long) 0, 0L, true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType6.isVersionConflictForReads((long) 1, (long) (short) 1);
        boolean boolean11 = versionType6.validateVersionForWrites(3L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType6.explainConflictForWrites(3L, 35L, true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("index.blocks.read_only");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForWrites((long) (short) 100);
        boolean boolean8 = versionType0.validateVersionForWrites((long) (byte) 0);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 100, (long) 52, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) (short) 10, (long) 97);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte5 = versionType4.getValue();
        long long8 = versionType4.updateVersion(98L, (long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType4.explainConflictForReads((long) 97, (long) (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType1.explainConflictForReads((long) (short) 1, 36L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        org.elasticsearch.index.VersionType versionType11 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean15 = versionType0.isVersionConflictForWrites((long) 100, (long) 10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites(11L, (long) (-1), true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        byte byte4 = versionType0.getValue();
        byte byte5 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType0.versionTypeForReplicationAndRecovery();
        long long9 = versionType6.updateVersion((long) (byte) 10, (long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType6.explainConflictForWrites(10L, (long) 1, true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        long long8 = versionType4.updateVersion((long) (short) 0, (long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType4.explainConflictForWrites(2L, 11L, true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        boolean boolean8 = versionType0.isVersionConflictForReads((long) (short) 10, (long) ' ');
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean11 = versionType9.validateVersionForReads((long) (short) 100);
        boolean boolean14 = versionType9.isVersionConflictForReads((long) (byte) 0, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType9.explainConflictForReads((long) (short) 1, (long) '#');
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(35L, (long) (byte) -1);
        byte byte12 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType13 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType13.explainConflictForReads((long) (byte) 1, (long) '#');
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) (byte) -1, 10L, false);
        boolean boolean8 = versionType0.isVersionConflictForWrites(3L, 11L, false);
        byte byte9 = versionType0.getValue();
        boolean boolean11 = versionType0.validateVersionForWrites(11L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads(0L, (long) (short) 1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest8.indices();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType1.validateVersionForWrites((long) (byte) 3);
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) 1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) (byte) 10, (long) (byte) 1);
        boolean boolean10 = versionType1.validateVersionForReads(32L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType1.explainConflictForWrites((long) (byte) 2, 100L, false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType1.explainConflictForReads((long) 2, 100L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        byte byte6 = versionType0.getValue();
        boolean boolean8 = versionType0.validateVersionForReads(35L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads((long) 'a', (long) 32);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean8 = versionType4.isVersionConflictForReads((long) (byte) 100, 32L);
        byte byte9 = versionType4.getValue();
        boolean boolean11 = versionType4.validateVersionForReads((long) (short) 0);
        org.elasticsearch.index.VersionType versionType12 = versionType4.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType12.explainConflictForReads((long) 0, (long) (byte) 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        byte byte3 = versionType1.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType1.explainConflictForReads((long) 52, (long) (byte) -1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean8 = versionType1.validateVersionForReads((long) (byte) -1);
        boolean boolean11 = versionType1.isVersionConflictForReads((long) (short) -1, (long) (byte) 0);
        byte byte12 = versionType1.getValue();
        boolean boolean15 = versionType1.isVersionConflictForReads((long) 'a', (long) (short) 10);
        org.elasticsearch.index.VersionType versionType16 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str20 = versionType16.explainConflictForWrites((long) (byte) 0, (long) 52, true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy3 = bulkShardRequest1.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.timeout(timeValue7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest8.remoteAddress();
        bulkShardRequest8.primaryTerm((long) (-1));
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = bulkShardRequest8.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = bulkShardRequest8.indices();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        org.elasticsearch.index.VersionType versionType6 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType6.isVersionConflictForReads((long) 0, 98L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType6.explainConflictForWrites(0L, 1L, true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        long long5 = versionType1.updateVersion((long) (-1), (long) '#');
        byte byte6 = versionType1.getValue();
        boolean boolean9 = versionType1.isVersionConflictForReads((long) 100, (long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType1.explainConflictForReads(32L, 1L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte5 = versionType4.getValue();
        long long8 = versionType4.updateVersion(98L, (long) (byte) 100);
        long long11 = versionType4.updateVersion(10L, (long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType4.explainConflictForReads((long) (short) 100, 32L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) (short) 10, 10L, true);
        boolean boolean8 = versionType0.isVersionConflictForReads((long) (short) 10, (long) ' ');
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean11 = versionType9.validateVersionForReads((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType9.explainConflictForWrites((long) 2, (long) (byte) 100, false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) (byte) -1, 10L, false);
        boolean boolean8 = versionType0.isVersionConflictForWrites(3L, 11L, false);
        byte byte9 = versionType0.getValue();
        boolean boolean11 = versionType0.validateVersionForWrites(11L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) '#', (long) (short) 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest6.index();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        byte byte4 = versionType0.getValue();
        byte byte5 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType6 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads((long) 1, 2L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads(10L);
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType5.explainConflictForWrites((-1L), (long) 1, false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType4.explainConflictForReads(0L, (long) (byte) 3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = builder7.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getCreationDate();
        org.apache.lucene.util.Version version13 = indexMetaData11.getMinimumCompatibleVersion();
        boolean boolean15 = indexMetaData11.isSameUUID("state-");
        int int16 = indexMetaData11.getNumberOfReplicas();
        int int17 = indexMetaData11.getRoutingFactor();
        org.elasticsearch.common.settings.Settings settings18 = indexMetaData11.getSettings();
        boolean boolean19 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder10.settings(settings18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData22 = builder10.mapping("indices:data/write/bulk[s]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType5.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType6.explainConflictForReads((long) 2, (long) (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        long long12 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = builder13.build();
        int int15 = builder13.getRoutingNumShards();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.removeAllAliases();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        long long5 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = bulkShardRequest6.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.setRefreshPolicy(refreshPolicy7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.setParentTask("Tuple [v1=9,index metadata (api), blocks METADATA_READ,METADATA_WRITE, v2=index.version.created]", 10L);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest0.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = bulkShardRequest0.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.index("index.");
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest4.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest4.getDescription();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType6 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean9 = versionType4.isVersionConflictForReads(0L, (long) (short) 0);
        boolean boolean12 = versionType4.isVersionConflictForReads((long) 100, (long) '4');
        org.elasticsearch.index.VersionType versionType13 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean16 = versionType4.isVersionConflictForReads((long) (byte) 3, (long) 35);
        boolean boolean19 = versionType4.isVersionConflictForReads((long) 100, (long) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str22 = versionType4.explainConflictForReads((long) (byte) 3, (long) 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion((long) 35, (long) ' ');
        boolean boolean14 = versionType0.isVersionConflictForReads((long) 32, (long) (byte) 0);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType15.explainConflictForWrites((long) 3, (-1L), false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        boolean boolean8 = versionType0.validateVersionForWrites(0L);
        long long11 = versionType0.updateVersion(35L, (long) (byte) -1);
        long long14 = versionType0.updateVersion((long) 97, (long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForReads((long) (byte) 3, (long) '#');
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId5 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (byte) 10, (long) '4');
        boolean boolean5 = versionType0.validateVersionForWrites((long) (short) 1);
        boolean boolean7 = versionType0.validateVersionForWrites(10L);
        boolean boolean9 = versionType0.validateVersionForReads(0L);
        long long12 = versionType0.updateVersion((long) (short) 1, (long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites((long) (-1), (long) (byte) 10, false);
    }
}

