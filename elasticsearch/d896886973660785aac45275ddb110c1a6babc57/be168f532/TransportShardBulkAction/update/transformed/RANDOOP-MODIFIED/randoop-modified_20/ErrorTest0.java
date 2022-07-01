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
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest4 = builderTuple3.v2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = builderTuple3.toString();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkItemRequest2.index();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = bulkShardRequest1.indices();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType0.explainConflictForWrites((long) '#', (-1L), false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = bulkShardRequest2.indices();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest1.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = bulkShardRequest1.indices();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest3.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest6.index();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest3.toString();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        int int8 = bulkItemRequest7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest3.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest3.toString();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = builderTuple3.toString();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) 10, (long) 32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForWrites((long) (short) -1, 10L, true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType7 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType7.explainConflictForWrites((long) 2, (long) 2, true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType7 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType8 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType8.explainConflictForReads(0L, (long) (byte) 3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest2.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.primaryTerm((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest2.indices();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) (byte) 2);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        boolean boolean12 = versionType0.validateVersionForWrites((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) (byte) 3, (long) (byte) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkItemRequest7.index();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) (byte) 2);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        boolean boolean12 = versionType0.validateVersionForWrites((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites(2L, (long) 0, false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = null;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType1.validateVersionForReads((long) (byte) 2);
        boolean boolean5 = versionType1.validateVersionForWrites((long) 10);
        byte byte6 = versionType1.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>> clusterBlockTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>>(clusterBlock0, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType1);
        org.elasticsearch.index.VersionType versionType8 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType9 = versionType1.versionTypeForReplicationAndRecovery();
        long long12 = versionType1.updateVersion(0L, 3L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType1.explainConflictForWrites((long) (byte) 3, (long) (byte) 0, true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean6 = versionType0.validateVersionForWrites((long) 0);
        boolean boolean10 = versionType0.isVersionConflictForWrites((long) (byte) 1, (long) (byte) -1, false);
        boolean boolean14 = versionType0.isVersionConflictForWrites((long) 2, (long) (short) 10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForReads((long) (byte) 10, (long) (byte) 2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = null;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType1.validateVersionForReads((long) (byte) 2);
        boolean boolean5 = versionType1.validateVersionForWrites((long) 10);
        byte byte6 = versionType1.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>> clusterBlockTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>>(clusterBlock0, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForReads((long) (byte) 2, (long) 52);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest3.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest3.toString();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads(10L, (long) '4');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) (byte) 2);
        boolean boolean10 = versionType0.isVersionConflictForReads(35L, 0L);
        org.elasticsearch.index.VersionType versionType11 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites((long) (short) 100, (long) (byte) 10, true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType7 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType7.explainConflictForReads(36L, 33L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = builderTuple5.toString();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = null;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType1.validateVersionForReads((long) (byte) 2);
        boolean boolean5 = versionType1.validateVersionForWrites((long) 10);
        byte byte6 = versionType1.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>> clusterBlockTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>>(clusterBlock0, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType1);
        org.elasticsearch.index.VersionType versionType8 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType9 = versionType1.versionTypeForReplicationAndRecovery();
        long long12 = versionType1.updateVersion(0L, 3L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType1.explainConflictForReads((long) 100, (long) '4');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 0, (long) (byte) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForReads((long) '4', 0L);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType7 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForWrites((long) '4', (long) (-1), true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads((long) 32, 10L);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest4.indices();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest2.toString();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        boolean boolean6 = versionType0.validateVersionForWrites((long) 0);
        boolean boolean10 = versionType0.isVersionConflictForWrites((long) (byte) 1, (long) (byte) -1, false);
        boolean boolean13 = versionType0.isVersionConflictForReads((long) 52, (long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForWrites((long) 3, (long) (-1), false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.primaryTerm((long) 35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest4.indices();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = null;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType1.validateVersionForReads((long) (byte) 2);
        boolean boolean5 = versionType1.validateVersionForWrites((long) 10);
        byte byte6 = versionType1.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>> clusterBlockTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>>(clusterBlock0, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType1);
        org.elasticsearch.index.VersionType versionType8 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType9 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType10 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType1.explainConflictForWrites((long) ' ', 2L, false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap9 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.includeFilters();
        org.elasticsearch.common.settings.Settings settings11 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = builder12.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = builder12.build();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.elasticsearch.cluster.block.ClusterBlock clusterBlock0 = null;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType1.validateVersionForReads((long) (byte) 2);
        boolean boolean5 = versionType1.validateVersionForWrites((long) 10);
        byte byte6 = versionType1.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>> clusterBlockTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.block.ClusterBlock, java.lang.Enum<org.elasticsearch.index.VersionType>>(clusterBlock0, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForReads((long) 35, (long) 'a');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (byte) 2);
        boolean boolean4 = versionType0.validateVersionForWrites((long) 10);
        byte byte5 = versionType0.getValue();
        byte byte6 = versionType0.getValue();
        org.elasticsearch.index.VersionType versionType7 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForReads((long) 97, (long) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest4.validate();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest4.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.setParentTask("index.", (long) 32);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = bulkShardRequest4.indices();
    }
}

