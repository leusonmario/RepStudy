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
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 10, (long) (short) -1, true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str25 = versionType12.explainConflictForWrites((long) 10, (long) (byte) 100, true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        boolean boolean21 = versionType12.isVersionConflictForWrites((long) 0, (long) (short) 0, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str24 = versionType12.explainConflictForReads(100L, (long) (byte) 100);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads(100L, (long) (byte) 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        boolean boolean27 = versionType12.isVersionConflictForWrites((long) (short) -1, (long) 0, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType12.explainConflictForWrites(0L, (long) 1, false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        boolean boolean25 = versionType12.validateVersionForWrites((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType12.explainConflictForReads(1L, (long) (short) 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str24 = versionType12.explainConflictForReads((long) (short) 10, (long) (byte) 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType27.explainConflictForReads((long) 10, 1L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = bulkShardRequest1.indices();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        byte byte18 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType12.explainConflictForReads((long) (byte) 1, 0L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        long long29 = versionType12.updateVersion((long) (short) 100, (long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForReads((long) (byte) 2, (long) 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.primaryTerm((long) (-1));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest2.indices();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType12.explainConflictForReads(1L, (long) 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        long long34 = versionType12.updateVersion(0L, (long) 35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType12.explainConflictForReads((long) (short) -1, (long) 3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str34 = versionType12.explainConflictForReads(1L, (long) (short) 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        org.elasticsearch.index.VersionType versionType22 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType22.explainConflictForWrites(10L, (long) (short) 0, true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        byte byte18 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType19 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType12.explainConflictForWrites((long) (byte) -1, (long) 0, false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue1 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType12.explainConflictForReads((long) (byte) 1, (long) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType12.explainConflictForReads((long) (byte) 10, (long) 3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        byte byte28 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType12.explainConflictForReads((-1L), (long) (short) -1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        boolean boolean23 = versionType12.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType24 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType12.explainConflictForWrites((long) (-1), 97L, false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        boolean boolean25 = versionType12.validateVersionForReads((-1L));
        boolean boolean28 = versionType12.isVersionConflictForReads((long) (-1), 97L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType12.explainConflictForReads((long) '4', (long) 97);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest1.toString();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean28 = versionType12.validateVersionForWrites((long) 97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForWrites((long) 35, 10L, false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        boolean boolean23 = versionType12.validateVersionForWrites(0L);
        boolean boolean26 = versionType12.isVersionConflictForReads((long) '#', 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType12.explainConflictForReads((long) (short) 10, 98L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest3.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        boolean boolean8 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest4.getDescription();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet0 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest3, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        boolean boolean6 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int9 = builder8.numberOfShards();
        java.lang.String[] strArray13 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder8.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>> streamableTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest4, strSet14);
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, java.lang.Iterable<java.lang.String>> indexShardStateSetTuple18 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, java.lang.Iterable<java.lang.String>>(indexShardStateSet0, (java.lang.Iterable<java.lang.String>) strSet14);
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
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.common.io.stream.Writeable> strCollectionTuple41 = new org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.common.io.stream.Writeable>((java.util.AbstractCollection<java.lang.String>) strSet14, (org.elasticsearch.common.io.stream.Writeable) versionType31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str44 = versionType31.explainConflictForReads((-1L), (long) (byte) 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean28 = versionType12.validateVersionForWrites((long) 97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForWrites((long) 97, (long) (byte) 1, false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        long long24 = versionType12.updateVersion((long) 1, (long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType12.explainConflictForWrites((long) 100, 10L, false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        long long29 = versionType12.updateVersion((long) (short) 100, (long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType12.explainConflictForWrites((-1L), 97L, true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType12.explainConflictForReads(2L, (long) 'a');
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) (short) 1, (-1L));
        boolean boolean5 = versionType0.validateVersionForWrites((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) 35, (long) 32, false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        long long32 = versionType12.updateVersion((long) (short) 1, (long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType12.explainConflictForReads(0L, 2L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder4.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder4.removeAllAliases();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        long long34 = versionType12.updateVersion(0L, (long) 35);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple36 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        boolean boolean38 = versionType12.validateVersionForWrites((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str42 = versionType12.explainConflictForWrites((long) (-1), (long) (-1), false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) 100);
        boolean boolean31 = versionType12.isVersionConflictForReads((long) 'a', (long) (byte) 2);
        boolean boolean33 = versionType12.validateVersionForWrites((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType12.explainConflictForWrites(2L, (long) 52, false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        boolean boolean27 = versionType23.validateVersionForWrites(1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType23.explainConflictForReads(0L, 32L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        boolean boolean23 = versionType12.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType24 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str27 = versionType12.explainConflictForReads(97L, (long) (byte) 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        boolean boolean23 = versionType12.validateVersionForWrites(0L);
        boolean boolean26 = versionType12.isVersionConflictForReads((long) '#', 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType12.explainConflictForWrites((long) 'a', (long) (short) 100, false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        org.elasticsearch.index.VersionType versionType30 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType12.explainConflictForReads((long) 10, 0L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData5);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData5.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData5.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff9 = indexMetaData4.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData5.requireFilters();
        org.elasticsearch.Version version11 = indexMetaData5.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData5.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder3.settings(settings12);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting14 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder16.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder17.numberOfReplicas((int) '#');
        int int20 = builder17.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder23.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.numberOfReplicas((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int30 = builder29.numberOfShards();
        java.lang.String[] strArray34 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder29.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet35);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder24.putActiveAllocationIds((int) (short) 0, (java.util.Set<java.lang.String>) strSet35);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>, java.lang.Iterable<java.lang.String>> indexMetaDataFromXContentBuilderTuple39 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData21, (java.lang.Iterable<java.lang.String>) strSet35);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap40 = indexMetaData21.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData21);
        org.elasticsearch.common.settings.Settings settings44 = indexMetaData21.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder17.settings(settings44);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.common.xcontent.ToXContent> toXContentToBytesTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.common.xcontent.ToXContent>((org.elasticsearch.action.support.ToXContentToBytes) booleanSetting14, (org.elasticsearch.common.xcontent.ToXContent) settings44);
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder3.settings(settings44);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData49 = builder48.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder48.version((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData52 = builder48.build();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType12.explainConflictForReads((long) (short) 1, (long) 32);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) 100);
        boolean boolean31 = versionType12.isVersionConflictForReads((long) 'a', (long) (byte) 2);
        boolean boolean33 = versionType12.validateVersionForWrites((long) ' ');
        byte byte34 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str38 = versionType12.explainConflictForWrites((long) (byte) 1, (long) (byte) -1, true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 10, 10L);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType28 = versionType27.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType28.explainConflictForWrites((long) (short) 10, (long) 35, false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        boolean boolean34 = versionType12.isVersionConflictForReads((long) (byte) 2, 2L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType12.explainConflictForReads((long) (short) 10, 1L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType12.explainConflictForReads((long) 0, (long) (byte) 100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType12.explainConflictForReads((long) (short) 100, (long) (short) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest2.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest0.timeout(timeValue3);
        java.lang.String str5 = bulkShardRequest0.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        long long24 = versionType12.updateVersion((long) 1, (long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str27 = versionType12.explainConflictForReads((long) (byte) 10, 0L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType12.explainConflictForWrites((long) (short) 1, (long) 0, true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        boolean boolean23 = versionType12.validateVersionForWrites(0L);
        boolean boolean26 = versionType12.isVersionConflictForReads((long) '#', 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType12.explainConflictForWrites((long) 97, 100L, false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        boolean boolean25 = versionType12.validateVersionForWrites((long) 1);
        boolean boolean27 = versionType12.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType12.explainConflictForReads((long) (byte) -1, (long) 52);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        boolean boolean25 = versionType12.validateVersionForReads((-1L));
        boolean boolean28 = versionType12.isVersionConflictForReads((long) (-1), 97L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForWrites((long) ' ', (long) (byte) 2, true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.creationDate((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder5.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = builder9.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.removeAllAliases();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        boolean boolean34 = versionType12.isVersionConflictForReads((long) (byte) 2, 2L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str38 = versionType12.explainConflictForWrites((long) 1, (long) (byte) 0, true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType32 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean34 = versionType32.validateVersionForReads((long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType32.explainConflictForReads(35L, 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean29 = versionType12.validateVersionForReads(10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForReads((long) 52, (long) (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        boolean boolean25 = versionType12.validateVersionForReads((-1L));
        boolean boolean28 = versionType12.isVersionConflictForReads((long) (-1), 97L);
        org.elasticsearch.index.VersionType versionType29 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean31 = versionType29.validateVersionForReads((long) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str34 = versionType29.explainConflictForReads(98L, 0L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue2 = bulkShardRequest1.timeout();
        java.lang.String str3 = bulkShardRequest1.index();
        org.elasticsearch.common.unit.TimeValue timeValue4 = bulkShardRequest1.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        java.lang.Throwable throwable9 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, false, throwable9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest3, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting14 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_NUMBER_OF_REPLICAS_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.xcontent.ToXContent> streamableTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.xcontent.ToXContent>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest6, (org.elasticsearch.common.xcontent.ToXContent) intSetting14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        java.lang.Throwable throwable24 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest21, false, throwable24, writeResult25);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest18, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.index.VersionType versionType28 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean32 = versionType28.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType> streamableTuple33 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.index.VersionType>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest18, versionType28);
        boolean boolean37 = versionType28.isVersionConflictForWrites(10L, (long) (byte) 0, false);
        boolean boolean39 = versionType28.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType40 = versionType28.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<java.lang.Integer>, java.lang.Enum<org.elasticsearch.index.VersionType>> intSettingTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.settings.Setting<java.lang.Integer>, java.lang.Enum<org.elasticsearch.index.VersionType>>(intSetting14, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str44 = versionType40.explainConflictForReads(0L, (long) 52);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        boolean boolean25 = versionType12.validateVersionForReads((-1L));
        boolean boolean28 = versionType12.isVersionConflictForReads((long) (-1), 97L);
        org.elasticsearch.index.VersionType versionType29 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean31 = versionType29.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.index.VersionType versionType32 = versionType29.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType32.explainConflictForReads((long) (byte) -1, (long) (byte) 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        long long34 = versionType12.updateVersion(0L, (long) 35);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple36 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte37 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType38 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str41 = versionType38.explainConflictForReads((long) (byte) 0, (long) (byte) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        boolean boolean34 = versionType12.isVersionConflictForReads((long) (short) 100, (long) (short) -1);
        byte byte35 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str39 = versionType12.explainConflictForWrites((long) 52, 0L, false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        boolean boolean25 = versionType12.validateVersionForReads((-1L));
        boolean boolean28 = versionType12.isVersionConflictForReads((long) (-1), 97L);
        boolean boolean32 = versionType12.isVersionConflictForWrites(0L, (long) 32, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType12.explainConflictForReads(97L, (long) (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        boolean boolean25 = versionType12.validateVersionForWrites((long) 1);
        boolean boolean27 = versionType12.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType12.explainConflictForWrites((long) (byte) 1, (long) (byte) 100, false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        long long34 = versionType12.updateVersion(0L, (long) 35);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple36 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte37 = versionType12.getValue();
        boolean boolean39 = versionType12.validateVersionForReads((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str42 = versionType12.explainConflictForReads((long) (byte) 1, (long) 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        boolean boolean25 = versionType12.validateVersionForWrites((long) 1);
        boolean boolean27 = versionType12.validateVersionForReads(0L);
        boolean boolean29 = versionType12.validateVersionForReads((long) 35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForReads((long) 1, (long) 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue2 = bulkShardRequest1.timeout();
        java.lang.String str3 = bulkShardRequest1.index();
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest1.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        long long29 = versionType12.updateVersion((long) 3, 0L);
        org.elasticsearch.index.VersionType versionType30 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str34 = versionType30.explainConflictForWrites(0L, (long) ' ', false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        boolean boolean23 = versionType12.validateVersionForReads(97L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType12.explainConflictForReads(0L, (long) 52);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = bulkShardRequest0.toString();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        byte byte27 = versionType23.getValue();
        boolean boolean29 = versionType23.validateVersionForWrites(1L);
        boolean boolean31 = versionType23.validateVersionForReads((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str34 = versionType23.explainConflictForReads((long) 3, (long) (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        long long24 = versionType12.updateVersion((long) 1, (long) (short) 10);
        byte byte25 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType12.explainConflictForWrites((long) (short) -1, (long) (byte) 0, false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest3.shardId();
        long long8 = bulkShardRequest3.primaryTerm();
        bulkShardRequest3.primaryTerm((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest3.toString();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet0 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.action.ActionRequest actionRequest2 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest3, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        boolean boolean6 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int9 = builder8.numberOfShards();
        java.lang.String[] strArray13 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder8.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet14);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>> streamableTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest4, strSet14);
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, java.lang.Iterable<java.lang.String>> indexShardStateSetTuple18 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, java.lang.Iterable<java.lang.String>>(indexShardStateSet0, (java.lang.Iterable<java.lang.String>) strSet14);
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
        org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.common.io.stream.Writeable> strCollectionTuple41 = new org.elasticsearch.common.collect.Tuple<java.util.AbstractCollection<java.lang.String>, org.elasticsearch.common.io.stream.Writeable>((java.util.AbstractCollection<java.lang.String>) strSet14, (org.elasticsearch.common.io.stream.Writeable) versionType31);
        boolean boolean43 = versionType31.validateVersionForReads((long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str47 = versionType31.explainConflictForWrites((long) 35, (long) (byte) -1, true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType27.explainConflictForReads((long) 100, (long) (byte) 3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) (short) 10);
        long long31 = versionType12.updateVersion(1L, (long) '4');
        long long34 = versionType12.updateVersion(0L, (long) 35);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple36 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte37 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType38 = versionType12.versionTypeForReplicationAndRecovery();
        byte byte39 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str43 = versionType12.explainConflictForWrites(32L, (long) 'a', true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        long long24 = versionType12.updateVersion((long) 1, (long) (short) 10);
        byte byte25 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType12.explainConflictForReads((long) (byte) 100, 0L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) 100);
        boolean boolean31 = versionType12.isVersionConflictForReads((long) 'a', (long) (byte) 2);
        org.elasticsearch.index.VersionType versionType32 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForWrites((long) (short) -1, (long) 10, false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType32 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForWrites((long) 100, (long) (byte) 10, true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        byte byte18 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType19 = versionType12.versionTypeForReplicationAndRecovery();
        long long22 = versionType19.updateVersion((long) (short) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str25 = versionType19.explainConflictForReads((long) (byte) 2, (long) 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
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
        bulkShardRequest8.seqNo((long) 0);
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, throwable21, writeResult22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest8.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException24, "update");
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
        boolean boolean48 = versionType39.isVersionConflictForWrites(10L, (long) (byte) 0, false);
        boolean boolean50 = versionType39.validateVersionForReads(10L);
        boolean boolean52 = versionType39.validateVersionForWrites((long) 1);
        boolean boolean54 = versionType39.validateVersionForReads(0L);
        boolean boolean56 = versionType39.validateVersionForReads((long) 35);
        org.elasticsearch.common.collect.Tuple<java.lang.RuntimeException, java.lang.Enum<org.elasticsearch.index.VersionType>> runtimeExceptionTuple57 = new org.elasticsearch.common.collect.Tuple<java.lang.RuntimeException, java.lang.Enum<org.elasticsearch.index.VersionType>>((java.lang.RuntimeException) actionRequestValidationException24, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str60 = versionType39.explainConflictForReads((long) (byte) 0, (long) 52);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 0);
        long long26 = versionType12.updateVersion((long) (short) 0, (long) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType12.explainConflictForWrites(1L, 52L, false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites((long) (short) 10, (long) (short) 100, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) (-1), (long) (byte) 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest4.index();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        boolean boolean25 = versionType12.validateVersionForWrites((long) 1);
        org.elasticsearch.index.VersionType versionType26 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType12.explainConflictForWrites((long) ' ', (long) (byte) -1, false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        byte byte18 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType19 = versionType12.versionTypeForReplicationAndRecovery();
        long long22 = versionType19.updateVersion((long) (short) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str25 = versionType19.explainConflictForReads((long) (byte) 3, (long) 10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean30 = versionType12.isVersionConflictForReads((-1L), (long) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str34 = versionType12.explainConflictForWrites(35L, (long) (short) 0, true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        boolean boolean29 = versionType25.isVersionConflictForWrites((long) '#', (long) (byte) 3, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType25.explainConflictForWrites(0L, (-1L), true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        byte byte24 = versionType12.getValue();
        byte byte25 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType12.explainConflictForReads((long) (short) 1, 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        boolean boolean33 = versionType12.validateVersionForReads(32L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType12.explainConflictForWrites((long) 10, (-1L), false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType12.explainConflictForWrites((long) 35, (long) (byte) 0, true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.auto_expand_replicas");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.index("primary_terms");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = builder9.mapping("current version [10] is higher than the one provided [97]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        boolean boolean32 = versionType12.validateVersionForReads((long) (short) 1);
        org.elasticsearch.index.VersionType versionType33 = versionType12.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType34 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType34.explainConflictForReads((long) 35, (long) (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        long long29 = versionType12.updateVersion((long) 3, 0L);
        boolean boolean32 = versionType12.isVersionConflictForReads((long) 97, (long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForWrites(0L, (long) (byte) 0, true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        boolean boolean27 = versionType12.isVersionConflictForWrites((long) (short) -1, (long) 0, true);
        org.elasticsearch.index.VersionType versionType28 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean31 = versionType28.isVersionConflictForReads((long) 1, (long) 35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType28.explainConflictForWrites(97L, 32L, true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType28 = versionType27.versionTypeForReplicationAndRecovery();
        boolean boolean32 = versionType28.isVersionConflictForWrites(32L, (long) ' ', true);
        org.elasticsearch.index.VersionType versionType33 = versionType28.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType28.explainConflictForReads(0L, 98L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType32 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean34 = versionType32.validateVersionForReads((long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType32.explainConflictForReads((long) 0, (long) 35);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        boolean boolean23 = versionType12.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType24 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str27 = versionType12.explainConflictForReads((long) (byte) 10, 35L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) 100);
        boolean boolean31 = versionType12.isVersionConflictForReads((long) 'a', (long) (byte) 2);
        boolean boolean33 = versionType12.validateVersionForWrites((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForReads((long) (byte) 1, 10L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = bulkShardRequest1.indices();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        byte byte18 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType19 = versionType12.versionTypeForReplicationAndRecovery();
        long long22 = versionType19.updateVersion((long) (short) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str25 = versionType19.explainConflictForReads((long) (short) 10, (long) (short) -1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        boolean boolean25 = versionType12.validateVersionForWrites((long) 1);
        org.elasticsearch.index.VersionType versionType26 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean28 = versionType26.validateVersionForWrites((long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType26.explainConflictForReads((long) (byte) 0, (long) (byte) 3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean29 = versionType27.validateVersionForWrites((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType27.explainConflictForWrites((long) 97, (long) 3, false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType27.explainConflictForReads((long) (byte) -1, 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        boolean boolean25 = versionType12.isVersionConflictForWrites((long) (byte) 10, (-1L), false);
        org.elasticsearch.index.VersionType versionType26 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType12.explainConflictForReads((long) (byte) 10, 35L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        boolean boolean32 = versionType12.validateVersionForReads((long) (short) 1);
        org.elasticsearch.index.VersionType versionType33 = versionType12.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType34 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType12.explainConflictForReads((long) 52, (long) 'a');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        byte byte28 = versionType12.getValue();
        boolean boolean30 = versionType12.validateVersionForWrites((long) (short) 10);
        org.elasticsearch.index.VersionType versionType31 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType12.explainConflictForWrites((long) 0, (long) 10, true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean29 = versionType12.validateVersionForReads(10L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int32 = builder31.numberOfShards();
        java.lang.String[] strArray36 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder31.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = builder31.mapping("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder44.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder45.numberOfReplicas((int) '#');
        org.elasticsearch.action.ActionRequest actionRequest50 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest51 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest50);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple53 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest51, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest52);
        boolean boolean54 = bulkShardRequest52.getShouldPersistResult();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.write");
        int int57 = builder56.numberOfShards();
        java.lang.String[] strArray61 = new java.lang.String[] { "index.blocks.read", "index.blocks.read" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = builder56.putActiveAllocationIds((int) (byte) -1, (java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>> streamableTuple65 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.util.LinkedHashSet<java.lang.String>>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest52, strSet62);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder66 = builder45.putActiveAllocationIds((int) (short) 10, (java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder31.putActiveAllocationIds((int) (byte) 0, (java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.util.HashSet<java.lang.String>> versionTypeTuple68 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.util.HashSet<java.lang.String>>(versionType12, (java.util.HashSet<java.lang.String>) strSet62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str72 = versionType12.explainConflictForWrites((long) 0, (long) (short) 100, true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType28 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType12.explainConflictForWrites((long) 52, (long) 1, false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        org.elasticsearch.index.VersionType versionType26 = versionType25.versionTypeForReplicationAndRecovery();
        long long29 = versionType25.updateVersion(2L, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType25.explainConflictForReads(1L, (long) '4');
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean29 = versionType12.validateVersionForReads(10L);
        boolean boolean32 = versionType12.isVersionConflictForReads(0L, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForWrites(97L, (long) 1, true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        org.elasticsearch.index.VersionType versionType30 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean32 = versionType12.validateVersionForReads(3L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType12.explainConflictForReads(52L, 3L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        byte byte27 = versionType23.getValue();
        boolean boolean29 = versionType23.validateVersionForWrites(1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType23.explainConflictForWrites(11L, (long) (short) 10, false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 10, 10L);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean30 = versionType27.isVersionConflictForReads((long) (short) 1, (long) (byte) 3);
        boolean boolean32 = versionType27.validateVersionForReads((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType27.explainConflictForWrites(0L, (long) (byte) 3, false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForWrites(98L, 33L, false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.auto_expand_replicas");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.index("primary_terms");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.removeAlias("hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType28 = versionType27.versionTypeForReplicationAndRecovery();
        boolean boolean31 = versionType28.isVersionConflictForReads((long) (-1), 97L);
        org.elasticsearch.index.VersionType versionType32 = versionType28.versionTypeForReplicationAndRecovery();
        org.elasticsearch.action.ActionRequest actionRequest35 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest36, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest37);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.ActionRequest actionRequest41 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest42 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest42, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest43);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple45 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest39, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest43);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue47 = bulkShardRequest46.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest43.timeout(timeValue47);
        long long49 = bulkShardRequest43.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException50 = bulkShardRequest43.validate();
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.common.ValidationException> objTuple51 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.common.ValidationException>((java.lang.Object) versionType28, (org.elasticsearch.common.ValidationException) actionRequestValidationException50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str55 = versionType28.explainConflictForWrites(33L, 98L, true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.auto_expand_replicas");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.index("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfShards(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = builder9.build();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        long long29 = versionType12.updateVersion((long) 3, 0L);
        boolean boolean32 = versionType12.isVersionConflictForReads((long) 97, (long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str36 = versionType12.explainConflictForWrites(33L, (long) (short) 0, true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) 100);
        boolean boolean31 = versionType12.isVersionConflictForReads((long) 'a', (long) (byte) 2);
        boolean boolean33 = versionType12.validateVersionForWrites((long) ' ');
        byte byte34 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str37 = versionType12.explainConflictForReads((long) (byte) 0, 11L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        boolean boolean27 = versionType12.isVersionConflictForWrites((long) (short) -1, (long) 0, true);
        org.elasticsearch.index.VersionType versionType28 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean31 = versionType28.isVersionConflictForReads((long) 1, (long) 35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str35 = versionType28.explainConflictForWrites((long) (byte) 10, 4L, false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String> versionTypeEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, java.lang.String>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType12, "indices:data/write/bulk[s]");
        byte byte26 = versionType12.getValue();
        boolean boolean30 = versionType12.isVersionConflictForWrites((long) (short) 10, 0L, false);
        byte byte31 = versionType12.getValue();
        boolean boolean35 = versionType12.isVersionConflictForWrites(35L, (long) 0, false);
        long long38 = versionType12.updateVersion((long) '4', (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str42 = versionType12.explainConflictForWrites(0L, 2L, false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForReads((long) 100);
        boolean boolean7 = versionType1.isVersionConflictForWrites((long) 100, (long) 97, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForReads((long) 0, (long) (short) 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 0, (long) (byte) -1);
        boolean boolean29 = versionType12.isVersionConflictForReads((long) (short) 1, 0L);
        org.elasticsearch.index.VersionType versionType30 = versionType12.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str34 = versionType12.explainConflictForWrites(4L, 0L, true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        boolean boolean28 = versionType12.validateVersionForWrites((long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType12.explainConflictForReads((long) 100, (long) (byte) 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 10, 10L);
        byte byte27 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType12.explainConflictForReads((long) (byte) 100, (long) (short) -1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        boolean boolean23 = versionType12.validateVersionForReads((long) (byte) 100);
        long long26 = versionType12.updateVersion((long) (byte) 10, 10L);
        org.elasticsearch.index.VersionType versionType27 = versionType12.versionTypeForReplicationAndRecovery();
        boolean boolean29 = versionType27.validateVersionForReads(97L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str33 = versionType27.explainConflictForWrites((long) '#', (long) 3, false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.ActionRequest actionRequest7 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.ActionRequest actionRequest13 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest14, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest11, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.unit.TimeValue timeValue19 = bulkShardRequest18.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest15.timeout(timeValue19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, writeResult22);
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.update.UpdateHelper.Result result28 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest30);
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result28, (org.elasticsearch.action.ActionRequest) bulkShardRequest30, false, throwable33, writeResult34);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest27, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest30);
        java.lang.Throwable throwable38 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult39 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult40 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest30, true, throwable38, writeResult39);
        org.elasticsearch.index.shard.ShardId shardId41 = bulkShardRequest30.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue42 = bulkShardRequest30.timeout();
        org.elasticsearch.tasks.TaskId taskId43 = bulkShardRequest30.getParentTask();
        bulkShardRequest20.setParentTask(taskId43);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult46 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult47 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, writeResult46);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest(3, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.update.UpdateHelper.Result result50 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest54 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest53);
        org.elasticsearch.action.update.UpdateHelper.Result result55 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest58 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        java.lang.Throwable throwable60 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult61 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult62 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result55, (org.elasticsearch.action.ActionRequest) bulkShardRequest57, false, throwable60, writeResult61);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkItemRequestTuple63 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkItemRequest54, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest64 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        java.lang.Throwable throwable66 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult writeResult67 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult68 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result50, (org.elasticsearch.action.ActionRequest) bulkShardRequest57, false, throwable66, writeResult67);
        org.elasticsearch.common.transport.TransportAddress transportAddress69 = bulkShardRequest57.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest70 = new org.elasticsearch.action.bulk.BulkItemRequest(35, (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        org.elasticsearch.index.VersionType versionType72 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, java.lang.Enum<org.elasticsearch.index.VersionType>> bulkItemRequestTuple73 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, java.lang.Enum<org.elasticsearch.index.VersionType>>(bulkItemRequest70, (java.lang.Enum<org.elasticsearch.index.VersionType>) versionType72);
        org.elasticsearch.index.VersionType versionType74 = versionType72.versionTypeForReplicationAndRecovery();
        boolean boolean76 = versionType72.validateVersionForWrites(1L);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, java.io.Serializable> bulkItemRequestTuple77 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkItemRequest, java.io.Serializable>(bulkItemRequest48, (java.io.Serializable) versionType72);
        boolean boolean81 = versionType72.isVersionConflictForWrites((long) (byte) 2, (long) '4', true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str85 = versionType72.explainConflictForWrites((long) 10, (long) (short) 0, false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.seqNo((long) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest2.indices();
    }
}

