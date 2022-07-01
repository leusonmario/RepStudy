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
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = bulkShardRequest1.indices();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType0.explainConflictForWrites((long) (short) -1, (long) 100, false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForWrites((long) 100, (long) (byte) 100, false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType5.explainConflictForWrites((long) ' ', (long) (byte) 0, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType1.explainConflictForWrites(1L, 0L, false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForWrites((long) (short) 0, (long) (short) 1, false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType1.explainConflictForReads((long) 10, (long) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForWrites(0L, 10L, false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        long long11 = versionType0.updateVersion(1L, (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) (byte) 0, (long) (byte) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) (byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites(10L, 10L, false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        boolean boolean4 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest8.timeout();
        boolean boolean11 = indexMetaData0.equals((java.lang.Object) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("state-");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest8.toString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (byte) 3);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) 10, (long) 0, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForWrites((long) (byte) 0, (long) (short) 0, true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (byte) 3);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) 10, (long) 0, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForReads((long) (byte) 3, 97L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads((long) (byte) -1, (long) (byte) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType1.explainConflictForReads((long) (byte) -1, (long) (short) -1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType2.explainConflictForWrites((long) (short) 1, 0L, true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.unit.TimeValue timeValue4 = bulkShardRequest2.timeout();
        boolean boolean5 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest6.index();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest1.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest1.toString();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType1.explainConflictForReads((long) (byte) 3, (long) ' ');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        java.lang.String str6 = bulkShardRequest2.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        long long12 = versionType0.updateVersion((long) (byte) 1, (long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites(97L, (long) 32, true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType3.explainConflictForReads((long) (-1), (long) (byte) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForReads((long) '#', (long) (byte) 3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        org.elasticsearch.index.VersionType versionType16 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForReads((long) ' ', 10L);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites((long) 10, (long) (short) 100, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType1.explainConflictForWrites((long) 1, (long) 0, false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType0.explainConflictForReads((long) (short) 1, 0L);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean2 = versionType0.validateVersionForWrites((long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType0.explainConflictForReads((long) 'a', 100L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        long long8 = versionType5.updateVersion((long) 100, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType5.explainConflictForReads((long) (byte) 100, 97L);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        org.elasticsearch.index.VersionType versionType12 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites((long) (byte) 100, (long) ' ', true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        boolean boolean13 = versionType0.isVersionConflictForWrites(100L, (long) (byte) 1, false);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads(10L, (long) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForReads((long) 0, 97L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        long long12 = versionType0.updateVersion((long) (byte) 1, (long) (byte) 1);
        org.elasticsearch.index.VersionType versionType13 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType13.explainConflictForWrites((long) 10, (long) (short) -1, true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType3.validateVersionForWrites(10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType3.explainConflictForReads((long) 97, (long) (byte) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        long long16 = versionType0.updateVersion((long) (byte) 1, (long) 32);
        boolean boolean20 = versionType0.isVersionConflictForWrites(97L, (long) ' ', false);
        long long23 = versionType0.updateVersion(100L, 0L);
        boolean boolean26 = versionType0.isVersionConflictForReads((long) 32, (long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType0.explainConflictForReads((long) (short) 1, (long) ' ');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        long long16 = versionType0.updateVersion((long) (byte) 1, (long) 32);
        boolean boolean20 = versionType0.isVersionConflictForWrites(97L, (long) ' ', false);
        long long23 = versionType0.updateVersion(100L, 0L);
        boolean boolean26 = versionType0.isVersionConflictForReads((long) 32, (long) ' ');
        org.elasticsearch.index.VersionType versionType27 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str31 = versionType0.explainConflictForWrites(0L, 10L, false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder7, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest11 = builderTuple10.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest11);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequestReplicatedWriteRequest11.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.blocks.read", (java.lang.Throwable) actionRequestValidationException13, "index.number_of_shards");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_replicas", (java.lang.Throwable) actionRequestValidationException13, "index.uuid");
        org.elasticsearch.index.VersionType versionType19 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte20 = versionType19.getValue();
        org.elasticsearch.index.VersionType versionType21 = versionType19.versionTypeForReplicationAndRecovery();
        long long24 = versionType21.updateVersion((long) 'a', (long) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.IllegalArgumentException, org.elasticsearch.index.VersionType> illegalArgumentExceptionTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.IllegalArgumentException, org.elasticsearch.index.VersionType>((java.lang.IllegalArgumentException) actionRequestValidationException13, versionType21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType21.explainConflictForReads((long) 0, (long) 32);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        boolean boolean6 = versionType1.isVersionConflictForWrites((long) '4', (long) 1, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForWrites(97L, (long) (byte) 100, true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        long long18 = versionType0.updateVersion((long) (-1), (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str22 = versionType0.explainConflictForWrites((long) 32, 0L, true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForWrites((long) 'a');
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) -1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) 97, (long) (byte) 1);
        boolean boolean12 = versionType1.isVersionConflictForWrites((long) '#', (-1L), true);
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType13.explainConflictForReads((long) (byte) 10, (long) (-1));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) ' ');
        byte byte4 = versionType0.getValue();
        byte byte5 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (byte) 1, 10L, false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 97, (long) 97, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) (short) -1, (long) (byte) 3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte6 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites(32L, (long) (short) 100, false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        long long12 = versionType0.updateVersion((long) (byte) 3, (long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) 52, (long) (byte) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        org.elasticsearch.index.VersionType versionType12 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType12.explainConflictForReads((long) (byte) 2, (long) (byte) 2);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        org.elasticsearch.index.VersionType versionType12 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte13 = versionType12.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType12.explainConflictForReads((long) 35, (long) (short) 100);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        boolean boolean13 = versionType0.isVersionConflictForWrites(100L, (long) (byte) 1, false);
        boolean boolean15 = versionType0.validateVersionForWrites(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads((long) (short) 1, (long) (-1));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        boolean boolean13 = versionType0.isVersionConflictForWrites(100L, (long) (byte) 1, false);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads((long) (byte) 1, 100L);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId1 = bulkShardRequest0.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue2 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest1.timeout();
        boolean boolean4 = bulkShardRequest1.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.toString();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads((long) (byte) 3, (long) (byte) 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) 10, 10L);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) 0, (long) '#');
        boolean boolean8 = versionType0.validateVersionForReads(32L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads((long) (short) 10, (long) ' ');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        boolean boolean10 = versionType0.validateVersionForWrites((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForReads((long) 3, (long) 10);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        boolean boolean15 = versionType0.isVersionConflictForWrites((long) 35, 1L, false);
        org.elasticsearch.index.VersionType versionType16 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForReads((long) 3, (long) 1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) (byte) 3);
        org.elasticsearch.index.VersionType versionType7 = versionType0.versionTypeForReplicationAndRecovery();
        byte byte8 = versionType7.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType7.explainConflictForReads(10L, (long) 35);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType1.isVersionConflictForReads((long) (short) 0, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType1.explainConflictForWrites((-1L), (long) 100, true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        boolean boolean6 = versionType1.isVersionConflictForWrites((long) '4', (long) 1, false);
        org.elasticsearch.index.VersionType versionType7 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType1.explainConflictForReads((long) (short) 0, (long) (short) 100);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        long long12 = versionType0.updateVersion((long) (byte) 3, (long) (short) 100);
        org.elasticsearch.index.VersionType versionType13 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean17 = versionType0.isVersionConflictForWrites((long) 0, 0L, true);
        boolean boolean19 = versionType0.validateVersionForReads(10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str22 = versionType0.explainConflictForReads((long) 35, (long) 52);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.shared_filesystem");
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.apache.lucene.util.Version version9 = indexMetaData8.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData8.includeFilters();
        java.util.Set<java.lang.String> strSet12 = indexMetaData8.activeAllocationIds(1);
        java.lang.String str13 = indexMetaData8.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        java.lang.String[] strArray41 = new java.lang.String[] { "index.version.created_string", "primary_terms", "index.creation_date_string", "hi!", "index.blocks.read", "index.priority", "index.number_of_replicas", "index.blocks.read_only", "active_allocations", "state-", "index.", "index.auto_expand_replicas", "index.number_of_replicas", "index.uuid", "state-", "hi!", "index.version.created", "primary_terms", "index.version.upgraded", "primary_terms" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder19.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder16.putActiveAllocationIds((int) (byte) 3, (java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, java.io.Serializable> indicesOptionsTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.IndicesOptions, java.io.Serializable>(indicesOptions7, (java.io.Serializable) strSet42);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting47 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple51 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder49, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest50);
        org.elasticsearch.common.transport.TransportAddress transportAddress52 = bulkShardRequest50.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException53 = bulkShardRequest50.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure55 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting47, "index.version.upgraded_string", (java.lang.Throwable) actionRequestValidationException53, "index.blocks.read");
        org.elasticsearch.common.collect.Tuple<java.util.HashSet<java.lang.String>, java.lang.RuntimeException> strSetTuple56 = new org.elasticsearch.common.collect.Tuple<java.util.HashSet<java.lang.String>, java.lang.RuntimeException>((java.util.HashSet<java.lang.String>) strSet42, (java.lang.RuntimeException) actionRequestValidationException53);
        org.elasticsearch.index.VersionType versionType57 = org.elasticsearch.index.VersionType.FORCE;
        byte byte58 = versionType57.getValue();
        boolean boolean61 = versionType57.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType62 = versionType57.versionTypeForReplicationAndRecovery();
        boolean boolean64 = versionType57.validateVersionForReads((long) (short) 1);
        org.elasticsearch.index.VersionType versionType65 = versionType57.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<java.util.HashSet<java.lang.String>, java.io.Serializable> strSetTuple66 = new org.elasticsearch.common.collect.Tuple<java.util.HashSet<java.lang.String>, java.io.Serializable>((java.util.HashSet<java.lang.String>) strSet42, (java.io.Serializable) versionType57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str69 = versionType57.explainConflictForReads(0L, (long) ' ');
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        boolean boolean15 = versionType0.isVersionConflictForWrites((long) 35, 1L, false);
        byte byte16 = versionType0.getValue();
        boolean boolean18 = versionType0.validateVersionForReads(100L);
        boolean boolean21 = versionType0.isVersionConflictForReads(100L, (long) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str25 = versionType0.explainConflictForWrites(35L, (long) 52, false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        boolean boolean4 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest8.timeout();
        boolean boolean11 = indexMetaData0.equals((java.lang.Object) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("state-");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest13.getDescription();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean4 = versionType1.validateVersionForReads((long) (byte) 1);
        boolean boolean6 = versionType1.validateVersionForWrites((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType1.explainConflictForReads(10L, 32L);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForWrites((long) 'a');
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) -1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) 97, (long) (byte) 1);
        boolean boolean12 = versionType1.isVersionConflictForWrites((long) '#', (-1L), true);
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType14 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType14.explainConflictForWrites((-1L), 101L, false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean6 = versionType3.isVersionConflictForReads((long) 0, (long) ' ');
        boolean boolean9 = versionType3.isVersionConflictForReads((long) 97, (long) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType3.explainConflictForReads((long) (short) 10, (long) (byte) 10);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        long long11 = versionType0.updateVersion(1L, (-1L));
        boolean boolean13 = versionType0.validateVersionForWrites((long) 0);
        boolean boolean16 = versionType0.isVersionConflictForReads((long) (short) -1, (long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForReads(32L, (long) '#');
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        long long11 = versionType0.updateVersion(1L, (-1L));
        boolean boolean13 = versionType0.validateVersionForWrites((long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForReads((long) (byte) 3, 101L);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForWrites((long) 'a');
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) -1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) 97, (long) (byte) 1);
        boolean boolean12 = versionType1.isVersionConflictForWrites((long) '#', (-1L), true);
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType14 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType1.explainConflictForReads((long) (short) 100, (long) 100);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForWrites((long) (byte) -1, 52L, true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType4 = versionType3.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType4.explainConflictForWrites((-1L), (long) 32, true);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        org.elasticsearch.index.VersionType versionType12 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites((long) (byte) 0, (long) 100, false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        byte byte7 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForReads((long) '4', (long) 0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForWrites((long) 'a');
        byte byte4 = versionType1.getValue();
        boolean boolean8 = versionType1.isVersionConflictForWrites((long) 32, (long) (short) 0, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType1.explainConflictForWrites((long) (short) -1, 32L, true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        org.elasticsearch.index.VersionType versionType12 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType13 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType13.explainConflictForWrites((long) (short) 10, (long) 35, false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte2 = versionType1.getValue();
        org.elasticsearch.index.VersionType versionType3 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType1.validateVersionForWrites((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType1.explainConflictForReads((long) (byte) 1, (long) (byte) 3);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        boolean boolean18 = versionType0.isVersionConflictForReads((long) (short) 100, (long) (byte) 0);
        org.elasticsearch.index.VersionType versionType19 = versionType0.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType20 = versionType0.versionTypeForReplicationAndRecovery();
        long long23 = versionType20.updateVersion((long) (byte) 100, (long) 0);
        org.elasticsearch.index.VersionType versionType24 = versionType20.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str28 = versionType24.explainConflictForWrites(100L, 35L, true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        boolean boolean18 = versionType0.isVersionConflictForReads((long) (short) 100, (long) (byte) 0);
        org.elasticsearch.index.VersionType versionType19 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str23 = versionType19.explainConflictForWrites((long) (short) -1, 100L, false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        org.elasticsearch.index.VersionType versionType2 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean4 = versionType1.validateVersionForReads((long) (byte) 1);
        boolean boolean6 = versionType1.validateVersionForWrites((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType1.explainConflictForReads(97L, (long) 100);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForReads((long) (-1), (long) 35);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        long long16 = versionType0.updateVersion((long) (byte) 1, (long) 32);
        boolean boolean20 = versionType0.isVersionConflictForWrites(97L, (long) ' ', false);
        long long23 = versionType0.updateVersion(100L, 0L);
        boolean boolean26 = versionType0.isVersionConflictForReads((long) 32, (long) ' ');
        org.elasticsearch.index.VersionType versionType27 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType0.explainConflictForReads((long) (byte) 100, 0L);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForWrites((long) 'a');
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) -1);
        boolean boolean8 = versionType1.isVersionConflictForReads((long) 97, (long) (byte) 1);
        boolean boolean12 = versionType1.isVersionConflictForWrites((long) '#', (-1L), true);
        org.elasticsearch.index.VersionType versionType13 = versionType1.versionTypeForReplicationAndRecovery();
        org.elasticsearch.index.VersionType versionType14 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType1.explainConflictForReads((long) 3, (long) 'a');
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (short) 100);
        boolean boolean11 = versionType0.validateVersionForReads(1L);
        org.elasticsearch.index.VersionType versionType12 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean14 = versionType0.validateVersionForWrites((long) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForWrites(35L, 100L, false);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) '4');
        byte byte4 = versionType0.getValue();
        boolean boolean6 = versionType0.validateVersionForReads(35L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites((long) (short) 0, (long) ' ', true);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        byte byte8 = versionType0.getValue();
        long long11 = versionType0.updateVersion(1L, (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) (short) 10, 101L);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        boolean boolean4 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest8.timeout();
        boolean boolean11 = indexMetaData0.equals((java.lang.Object) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("state-");
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest13.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest13.toString();
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((-1L));
        byte byte10 = versionType0.getValue();
        byte byte11 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType0.explainConflictForReads((long) 32, 1L);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean7 = versionType0.isVersionConflictForReads((long) (byte) 3, (long) (short) -1);
        boolean boolean9 = versionType0.validateVersionForReads((long) (byte) 3);
        boolean boolean12 = versionType0.isVersionConflictForReads((long) 'a', (long) (byte) 1);
        boolean boolean14 = versionType0.validateVersionForWrites(0L);
        org.elasticsearch.index.VersionType versionType15 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType15.explainConflictForWrites((long) 'a', (long) 35, false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder7, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest11 = builderTuple10.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest11);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequestReplicatedWriteRequest11.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.blocks.read", (java.lang.Throwable) actionRequestValidationException13, "index.number_of_shards");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.number_of_replicas", (java.lang.Throwable) actionRequestValidationException13, "index.uuid");
        org.elasticsearch.index.VersionType versionType19 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        byte byte20 = versionType19.getValue();
        org.elasticsearch.index.VersionType versionType21 = versionType19.versionTypeForReplicationAndRecovery();
        long long24 = versionType21.updateVersion((long) 'a', (long) 100);
        org.elasticsearch.common.collect.Tuple<java.lang.IllegalArgumentException, org.elasticsearch.index.VersionType> illegalArgumentExceptionTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.IllegalArgumentException, org.elasticsearch.index.VersionType>((java.lang.IllegalArgumentException) actionRequestValidationException13, versionType21);
        org.elasticsearch.index.VersionType versionType26 = versionType21.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str30 = versionType21.explainConflictForWrites(0L, (long) '#', true);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        long long8 = versionType5.updateVersion((long) 100, 10L);
        org.elasticsearch.index.VersionType versionType9 = versionType5.versionTypeForReplicationAndRecovery();
        byte byte10 = versionType9.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType9.explainConflictForReads((long) 32, (long) (short) -1);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) ' ');
        boolean boolean7 = versionType0.isVersionConflictForWrites((long) 3, 35L, false);
        byte byte8 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForReads((long) (short) 10, (long) 1);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean3 = versionType1.validateVersionForWrites((long) 'a');
        boolean boolean5 = versionType1.validateVersionForReads((long) (short) -1);
        long long8 = versionType1.updateVersion((long) 10, (long) (-1));
        org.elasticsearch.index.VersionType versionType9 = versionType1.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType9.explainConflictForReads(0L, (long) 100);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) '4');
        byte byte4 = versionType0.getValue();
        boolean boolean6 = versionType0.validateVersionForReads(35L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType0.explainConflictForWrites(32L, (long) (short) 100, true);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        boolean boolean6 = versionType0.validateVersionForReads((long) 0);
        long long9 = versionType0.updateVersion(1L, 0L);
        boolean boolean13 = versionType0.isVersionConflictForWrites((long) (short) 1, 100L, true);
        boolean boolean15 = versionType0.validateVersionForReads((long) (byte) 3);
        boolean boolean18 = versionType0.isVersionConflictForReads((long) (short) 100, (long) (byte) 0);
        org.elasticsearch.index.VersionType versionType19 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean23 = versionType0.isVersionConflictForWrites((long) 35, (long) (short) 10, false);
        boolean boolean26 = versionType0.isVersionConflictForReads((long) (short) 0, (long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType0.explainConflictForReads((long) '4', (long) 97);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean7 = versionType0.validateVersionForReads((long) (short) 1);
        org.elasticsearch.index.VersionType versionType8 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean11 = versionType8.isVersionConflictForReads((long) 10, (long) (short) 100);
        long long14 = versionType8.updateVersion(0L, (long) (byte) 10);
        org.elasticsearch.index.VersionType versionType15 = versionType8.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType15.explainConflictForWrites((long) (short) -1, (-1L), true);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 0);
        org.elasticsearch.index.VersionType versionType5 = versionType0.versionTypeForReplicationAndRecovery();
        long long8 = versionType5.updateVersion((long) 100, 10L);
        boolean boolean12 = versionType5.isVersionConflictForWrites(0L, (long) (byte) 0, false);
        long long15 = versionType5.updateVersion((long) (-1), (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType5.explainConflictForWrites((-1L), 52L, false);
    }
}

