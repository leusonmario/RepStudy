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
        java.lang.String str3 = versionType0.explainConflictForReads((long) (byte) 1, (long) (-1));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = bulkShardRequest0.toString();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest0.indices();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId17 = bulkShardRequest16.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task18 = bulkShardRequest12.createTask((long) (byte) 0, "current version [10] is different than the one provided [-1]", "index.creation_date", taskId17);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.seqNo(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest0.toString();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId1 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads((long) ' ', (long) 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType0.explainConflictForWrites((long) ' ', (long) ' ', true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        java.lang.String str9 = bulkShardRequest5.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest5.toString();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId12 = bulkShardRequest7.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest7.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray14 = bulkShardRequest7.indices();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest6.toString();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = bulkShardRequest0.indices();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType4.explainConflictForWrites((long) (short) -1, (long) 35, false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        bulkShardRequest6.seqNo((long) 'a');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        long long17 = bulkShardRequest15.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest18.getParentTask();
        bulkShardRequest15.setParentTask(taskId19);
        bulkShardRequest14.setParentTask(taskId19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task22 = bulkShardRequest6.createTask((-1L), "current version [-1] is different than the one provided [11]", "state-", taskId19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest7.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest7.indices();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkItemRequest7.index();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.index("current version [-1] is different than the one provided [0]");
        long long15 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest14.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest10.timeout(timeValue16);
        org.elasticsearch.common.unit.TimeValue timeValue18 = bulkShardRequest17.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = bulkShardRequest17.toString();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        long long11 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest12.getParentTask();
        bulkShardRequest9.setParentTask(taskId13);
        bulkShardRequest8.setParentTask(taskId13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest8.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task19 = bulkShardRequest0.createTask((long) (short) 1, "current version [0] is different than the one provided [1]", "current version [10] is different than the one provided [100]", taskId18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = bulkShardRequest0.toString();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = bulkShardRequest0.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest0.toString();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest7.toString();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId21 = bulkShardRequest19.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task22 = bulkShardRequest6.createTask((long) 97, "index.shadow_replicas", "primary_terms", taskId21);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean9 = versionType4.isVersionConflictForReads((long) (short) 100, (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType4.explainConflictForReads((long) (short) 10, (long) (short) 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        java.lang.String str9 = bulkShardRequest5.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest5.indices();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest9.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest9.toString();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        bulkShardRequest6.primaryTerm((long) '4');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest14.validate();
        org.elasticsearch.common.unit.TimeValue timeValue18 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest14.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long21 = bulkShardRequest20.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest20.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest20.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long27 = bulkShardRequest26.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest25, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId29 = bulkShardRequest26.getParentTask();
        bulkShardRequest19.setParentTask(taskId29);
        org.elasticsearch.tasks.TaskId taskId31 = bulkShardRequest19.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task32 = bulkShardRequest6.createTask((long) '4', "current version [35] is different than the one provided [100]", "index.blocks.metadata", taskId31);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        org.elasticsearch.tasks.TaskId taskId3 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest5.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray14 = bulkShardRequest5.indices();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue11 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.timeout(timeValue11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest13.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long20 = bulkShardRequest19.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest18, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.tasks.TaskId taskId22 = bulkShardRequest19.getParentTask();
        bulkShardRequest12.setParentTask(taskId22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task24 = bulkShardRequest0.createTask(35L, "current version [35] is different than the one provided [-1]", "current version [0] is different than the one provided [1]", taskId22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.toString();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        long long10 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId12 = bulkShardRequest11.getParentTask();
        bulkShardRequest8.setParentTask(taskId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest0.timeout(timeValue14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray16 = bulkShardRequest0.indices();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        org.elasticsearch.tasks.TaskId taskId3 = bulkShardRequest0.getParentTask();
        boolean boolean4 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest8.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        long long15 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId17 = bulkShardRequest16.getParentTask();
        bulkShardRequest13.setParentTask(taskId17);
        bulkShardRequest12.setParentTask(taskId17);
        bulkShardRequest11.setParentTask(taskId17);
        org.elasticsearch.tasks.TaskId taskId21 = bulkShardRequest11.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task22 = bulkShardRequest0.createTask((long) ' ', "current version [-1] is different than the one provided [11]", "index.", taskId21);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean9 = versionType4.isVersionConflictForReads((long) (short) 100, (long) (byte) 10);
        boolean boolean11 = versionType4.validateVersionForWrites((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = versionType4.explainConflictForReads((long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest0.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.toString();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType4.explainConflictForReads(0L, 98L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        bulkShardRequest0.primaryTerm((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest0.indices();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        bulkShardRequest0.setParentTask(taskId5);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest0.toString();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        long long10 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId12 = bulkShardRequest11.getParentTask();
        bulkShardRequest8.setParentTask(taskId12);
        bulkShardRequest0.setParentTask(taskId12);
        org.elasticsearch.index.shard.ShardId shardId15 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest0.toString();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType4.explainConflictForWrites((long) ' ', (long) ' ', true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean6 = versionType0.validateVersionForReads((long) (-1));
        boolean boolean8 = versionType0.validateVersionForReads(101L);
        boolean boolean12 = versionType0.isVersionConflictForWrites(11L, (long) '#', true);
        boolean boolean14 = versionType0.validateVersionForReads((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = versionType0.explainConflictForWrites((long) (byte) 3, (long) (byte) 1, false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest2.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest8.toString();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.seqNo(10L);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest0.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = bulkShardRequest0.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = bulkShardRequest0.indices();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest0.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest10.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest10.index("index.version.minimum_compatible");
        java.lang.String str20 = bulkShardRequest19.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long22 = bulkShardRequest21.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest21.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = bulkShardRequest21.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long28 = bulkShardRequest27.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest26, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest27.getParentTask();
        bulkShardRequest19.setParentTask(taskId30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task32 = bulkShardRequest0.createTask((long) ' ', "current version [35] is different than the one provided [35]", "current version [0] is different than the one provided [35]", taskId30);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        long long10 = bulkShardRequest7.primaryTerm();
        boolean boolean11 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.index("index.creation_date_string");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int15 = bulkItemRequest14.id();
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest14.request();
        org.elasticsearch.action.ActionRequest actionRequest17 = bulkItemRequest14.request();
        int int18 = bulkItemRequest14.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = bulkItemRequest14.index();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        int int13 = bulkItemRequest11.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkItemRequest11.index();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.seqNo(101L);
        java.lang.String str8 = bulkShardRequest0.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest0.indices();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest7.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest7.getDescription();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        long long6 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest10.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = bulkShardRequest17.validate();
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest17.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task20 = bulkShardRequest0.createTask((long) (byte) 1, "index.data_path", "current version [-1] is different than the one provided [11]", taskId19);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.seqNo(10L);
        long long11 = bulkShardRequest0.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = bulkShardRequest0.indices();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        long long4 = bulkShardRequest0.seqNo();
        long long5 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.minimum_compatible", (long) (short) 10);
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest0.toString();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = versionType4.explainConflictForWrites((long) 32, (long) 2, false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest11.index();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        long long4 = bulkShardRequest0.seqNo();
        long long5 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.version.minimum_compatible", (long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest0.indices();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        long long15 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId17 = bulkShardRequest16.getParentTask();
        bulkShardRequest13.setParentTask(taskId17);
        org.elasticsearch.common.unit.TimeValue timeValue19 = bulkShardRequest13.timeout();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = bulkShardRequest13.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId22 = bulkShardRequest13.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task23 = bulkShardRequest0.createTask((long) 97, "hi!", "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]", taskId22);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest1.shardId();
        org.elasticsearch.index.shard.ShardId shardId3 = bulkShardRequest1.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest4.index();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest10.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest10.validate();
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest10.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest16.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest21, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest22.getParentTask();
        bulkShardRequest15.setParentTask(taskId25);
        bulkShardRequest0.setParentTask(taskId25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = bulkShardRequest0.toString();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest13.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long19 = bulkShardRequest18.seqNo();
        long long20 = bulkShardRequest18.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId22 = bulkShardRequest21.getParentTask();
        bulkShardRequest18.setParentTask(taskId22);
        bulkShardRequest17.setParentTask(taskId22);
        bulkShardRequest16.setParentTask(taskId22);
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest16.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task27 = bulkShardRequest0.createTask((long) 100, "index.number_of_shards", "current version [97] is different than the one provided [35]", taskId26);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        long long10 = bulkShardRequest7.primaryTerm();
        boolean boolean11 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.index("index.creation_date_string");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int15 = bulkItemRequest14.id();
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest14.request();
        int int17 = bulkItemRequest14.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkItemRequest14.index();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) 10, 0L, false);
        long long12 = versionType0.updateVersion((long) (short) -1, (long) (short) 10);
        boolean boolean16 = versionType0.isVersionConflictForWrites(101L, 100L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForReads((long) 35, (long) 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        java.lang.String str12 = bulkShardRequest1.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest1.toString();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest7.indices();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        java.lang.String str6 = bulkShardRequest4.index();
        bulkShardRequest4.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest4.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkItemRequest10.index();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId7 = bulkShardRequest6.getParentTask();
        bulkShardRequest3.setParentTask(taskId7);
        bulkShardRequest2.setParentTask(taskId7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest11.index();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId12 = bulkShardRequest7.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest7.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest7.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest7.indices();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        java.lang.String str6 = bulkShardRequest4.index();
        bulkShardRequest4.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest4.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequest actionRequest11 = bulkItemRequest10.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest10.index();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest6.getParentTask();
        java.lang.String str10 = bulkShardRequest6.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        int int13 = bulkItemRequest11.id();
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest11.request();
        int int15 = bulkItemRequest11.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkItemRequest11.index();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest2.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        java.lang.String str11 = bulkShardRequest7.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = bulkShardRequest15.validate();
        org.elasticsearch.common.unit.TimeValue timeValue19 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest15.timeout(timeValue19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest13.timeout(timeValue19);
        org.elasticsearch.common.unit.TimeValue timeValue22 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest7.timeout(timeValue22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = bulkItemRequest24.index();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean6 = versionType0.validateVersionForReads((long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads(1L, (long) (byte) -1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.toString();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest0.indices();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest9.index();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        boolean boolean10 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.index("index.creation_date_string");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest6.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest0.toString();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest5.getDescription();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest14.validate();
        org.elasticsearch.common.unit.TimeValue timeValue18 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest14.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest12.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest1.timeout(timeValue18);
        org.elasticsearch.tasks.TaskId taskId22 = bulkShardRequest1.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray23 = bulkShardRequest1.indices();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForWrites((long) (short) 10, 12L, true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest0.toString();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        long long10 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId12 = bulkShardRequest11.getParentTask();
        bulkShardRequest8.setParentTask(taskId12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest8.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest15.validate();
        bulkShardRequest15.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long21 = bulkShardRequest20.seqNo();
        long long22 = bulkShardRequest20.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId24 = bulkShardRequest23.getParentTask();
        bulkShardRequest20.setParentTask(taskId24);
        bulkShardRequest15.setParentTask(taskId24);
        org.elasticsearch.tasks.TaskId taskId27 = bulkShardRequest15.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task28 = bulkShardRequest0.createTask(0L, "current version [0] is different than the one provided [0]", "current version [3] is higher than the one provided [52]", taskId27);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        bulkShardRequest6.primaryTerm((long) '4');
        bulkShardRequest6.seqNo((long) 100);
        boolean boolean13 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest6.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest6.index("index.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest16.toString();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType0.explainConflictForWrites(0L, 36L, true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId12 = bulkShardRequest7.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        long long18 = bulkShardRequest16.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId20 = bulkShardRequest19.getParentTask();
        bulkShardRequest16.setParentTask(taskId20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest16.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest23.validate();
        bulkShardRequest23.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long29 = bulkShardRequest28.seqNo();
        long long30 = bulkShardRequest28.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest31.getParentTask();
        bulkShardRequest28.setParentTask(taskId32);
        bulkShardRequest23.setParentTask(taskId32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task35 = bulkShardRequest7.createTask(36L, "current version [32] is different than the one provided [10]", "index.creation_date_string", taskId32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean9 = versionType4.isVersionConflictForReads((long) (short) 100, (long) (byte) 10);
        boolean boolean11 = versionType4.validateVersionForWrites((long) 1);
        org.elasticsearch.index.VersionType versionType12 = versionType4.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType12.explainConflictForWrites(1L, (long) (byte) 10, false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest3.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest3.indices();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.primaryTerm();
        bulkShardRequest11.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = bulkShardRequest11.consistencyLevel();
        long long16 = bulkShardRequest11.seqNo();
        org.elasticsearch.tasks.TaskId taskId17 = bulkShardRequest11.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task18 = bulkShardRequest4.createTask(0L, "current version [35] is different than the one provided [100]", "current version [10] is higher or equal to the one provided [53]", taskId17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int8 = bulkItemRequest7.id();
        org.elasticsearch.action.ActionRequest actionRequest9 = bulkItemRequest7.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest7.index();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        java.lang.String str7 = bulkShardRequest3.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest3.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.toString();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) '4');
        long long12 = bulkShardRequest1.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = bulkShardRequest0.indices();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        int int13 = bulkItemRequest11.id();
        org.elasticsearch.action.ActionRequest actionRequest14 = bulkItemRequest11.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest11.index();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.index("current version [-1] is different than the one provided [0]");
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest0.timeout(timeValue15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest16.toString();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        long long10 = bulkShardRequest7.primaryTerm();
        boolean boolean11 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.index("index.creation_date_string");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        long long15 = bulkShardRequest7.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest7.getDescription();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        bulkShardRequest8.primaryTerm(0L);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest8.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkShardRequest8.toString();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        boolean boolean13 = bulkShardRequest6.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest5.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest5.toString();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("index.version.minimum_compatible");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest9.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest9.toString();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int12 = bulkItemRequest11.id();
        int int13 = bulkItemRequest11.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkItemRequest11.index();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest1.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest1.toString();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean7 = versionType0.validateVersionForReads((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForWrites(100L, 2L, false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest0.shardId();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = bulkShardRequest0.indices();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        bulkShardRequest9.setParentTask(taskId14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting7, "_na_", (java.lang.Throwable) actionRequestValidationException17, "current version [10] is different than the one provided [100]");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable> versionTypeTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable>(versionType4, (java.lang.Throwable) actionRequestValidationException17);
        boolean boolean22 = versionType4.validateVersionForWrites((long) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str25 = versionType4.explainConflictForReads((long) (short) 1, 98L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        int int12 = bulkItemRequest11.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest11.index();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        java.lang.String str5 = bulkShardRequest3.index();
        bulkShardRequest3.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest3.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        long long13 = bulkShardRequest11.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest14.getParentTask();
        bulkShardRequest11.setParentTask(taskId15);
        bulkShardRequest10.setParentTask(taskId15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest20.getDescription();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest12.shardId();
        long long14 = bulkShardRequest12.seqNo();
        bulkShardRequest12.seqNo(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest12.getDescription();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean8 = versionType4.validateVersionForReads((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType4.explainConflictForWrites((long) (short) 1, (long) (-1), true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest5.remoteAddress();
        java.lang.String str10 = bulkShardRequest5.index();
        bulkShardRequest5.setParentTask("current version [0] is different than the one provided [0]", (long) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest5.toString();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest7.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest7.toString();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.index("current version [-1] is different than the one provided [0]");
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest0.timeout(timeValue15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest16.getDescription();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest11.validate();
        org.elasticsearch.common.unit.TimeValue timeValue15 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest11.timeout(timeValue15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long18 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest17.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long24 = bulkShardRequest23.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest23.getParentTask();
        bulkShardRequest16.setParentTask(taskId26);
        bulkShardRequest1.setParentTask(taskId26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        int int30 = bulkItemRequest29.id();
        int int31 = bulkItemRequest29.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = bulkItemRequest29.index();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest3.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        long long12 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest14.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = bulkShardRequest19.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest19.getDescription();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        java.lang.String str9 = bulkShardRequest5.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.index("indices:data/write/bulk[s]");
        java.lang.String str12 = bulkShardRequest5.index();
        boolean boolean13 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest14.getParentTask();
        org.elasticsearch.tasks.TaskId taskId17 = bulkShardRequest14.getParentTask();
        bulkShardRequest5.setParentTask(taskId17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray19 = bulkShardRequest5.indices();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest6.indices();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean6 = versionType0.validateVersionForReads((long) (-1));
        boolean boolean8 = versionType0.validateVersionForReads(101L);
        boolean boolean12 = versionType0.isVersionConflictForWrites(11L, (long) '#', true);
        byte byte13 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForWrites((long) (byte) -1, 0L, false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) 10, 0L, false);
        long long12 = versionType0.updateVersion((long) (short) -1, (long) (short) 10);
        boolean boolean16 = versionType0.isVersionConflictForWrites(101L, 100L, true);
        long long19 = versionType0.updateVersion(10L, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str22 = versionType0.explainConflictForReads((long) 97, 0L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.index("current version [-1] is different than the one provided [0]");
        long long15 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest14.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest10.timeout(timeValue16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest10.getDescription();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        int int13 = bulkItemRequest11.id();
        int int14 = bulkItemRequest11.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest11.index();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.setParentTask("current version [0] is different than the one provided [1]", 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        int int11 = bulkItemRequest10.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest10.index();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        long long10 = bulkShardRequest7.primaryTerm();
        boolean boolean11 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.index("index.creation_date_string");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest10.index("current version [-1] is different than the one provided [0]");
        long long14 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest0.timeout(timeValue15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long21 = bulkShardRequest20.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = bulkShardRequest22.validate();
        org.elasticsearch.common.unit.TimeValue timeValue26 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest22.timeout(timeValue26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest20.timeout(timeValue26);
        org.elasticsearch.common.unit.TimeValue timeValue29 = bulkShardRequest20.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long31 = bulkShardRequest30.seqNo();
        long long32 = bulkShardRequest30.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest33.getParentTask();
        bulkShardRequest30.setParentTask(taskId34);
        bulkShardRequest20.setParentTask(taskId34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task37 = bulkShardRequest16.createTask(12L, "current version [10] is different than the one provided [1]", "current version [35] is different than the one provided [54]", taskId34);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest14.validate();
        org.elasticsearch.common.unit.TimeValue timeValue18 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest14.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest12.timeout(timeValue18);
        org.elasticsearch.common.unit.TimeValue timeValue21 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest6.timeout(timeValue21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.seqNo();
        long long14 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest15.getParentTask();
        bulkShardRequest12.setParentTask(taskId16);
        bulkShardRequest7.setParentTask(taskId16);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest7.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest7.getDescription();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        long long3 = versionType0.updateVersion((long) 10, 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads(0L, 10L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        java.lang.String str5 = bulkShardRequest3.index();
        bulkShardRequest3.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest3.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        long long13 = bulkShardRequest11.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest14.getParentTask();
        bulkShardRequest11.setParentTask(taskId15);
        bulkShardRequest10.setParentTask(taskId15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest3.toString();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest9.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.index.shard.ShardId shardId14 = bulkShardRequest9.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest9.indices();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId12 = bulkShardRequest7.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = bulkShardRequest7.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest14.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest7.consistencyLevel(writeConsistencyLevel16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest7.getDescription();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        bulkShardRequest8.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest8.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest15.request();
        org.elasticsearch.action.ActionRequest actionRequest17 = bulkItemRequest15.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkItemRequest15.index();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long5 = bulkShardRequest4.seqNo();
        long long6 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest7.getParentTask();
        bulkShardRequest4.setParentTask(taskId8);
        bulkShardRequest3.setParentTask(taskId8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(35, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) ' ');
        bulkShardRequest6.primaryTerm((long) (byte) 1);
        bulkShardRequest6.primaryTerm((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest6.toString();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest11.index();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest12.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        long long16 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest17.getParentTask();
        bulkShardRequest14.setParentTask(taskId18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest14.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest21.validate();
        org.elasticsearch.common.unit.TimeValue timeValue23 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest21.timeout(timeValue23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest12.timeout(timeValue23);
        org.elasticsearch.common.unit.TimeValue timeValue26 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long28 = bulkShardRequest27.seqNo();
        long long29 = bulkShardRequest27.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId31 = bulkShardRequest30.getParentTask();
        bulkShardRequest27.setParentTask(taskId31);
        org.elasticsearch.common.unit.TimeValue timeValue33 = bulkShardRequest27.timeout();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException34 = bulkShardRequest27.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest27.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId36 = bulkShardRequest27.getParentTask();
        bulkShardRequest12.setParentTask(taskId36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray38 = bulkShardRequest12.indices();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long5 = bulkShardRequest4.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest4.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest9, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        long long13 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest10.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest1.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = bulkShardRequest10.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest10.toString();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest3.indices();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        java.lang.String str5 = bulkShardRequest0.index();
        org.elasticsearch.index.shard.ShardId shardId6 = bulkShardRequest0.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest0.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest0.toString();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType0.explainConflictForReads((long) 35, 1L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        boolean boolean9 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest6.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest6.indices();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, java.lang.CharSequence> streamableTuple13 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest11, (java.lang.CharSequence) "current version [10] is different than the one provided [32]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkItemRequest11.index();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.index.shard.ShardId shardId1 = bulkShardRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        org.elasticsearch.tasks.TaskId taskId3 = bulkShardRequest0.getParentTask();
        boolean boolean4 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId5 = bulkShardRequest0.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest0.indices();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest12.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        long long16 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId18 = bulkShardRequest17.getParentTask();
        bulkShardRequest14.setParentTask(taskId18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest14.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest21.validate();
        org.elasticsearch.common.unit.TimeValue timeValue23 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest21.timeout(timeValue23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest12.timeout(timeValue23);
        long long26 = bulkShardRequest12.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = bulkShardRequest12.toString();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean8 = versionType4.validateVersionForReads((long) (short) 100);
        org.elasticsearch.index.VersionType versionType9 = versionType4.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType9.explainConflictForWrites(53L, 35L, false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        bulkShardRequest6.primaryTerm((long) '4');
        bulkShardRequest6.seqNo((long) 100);
        long long13 = bulkShardRequest6.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest6.toString();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        int int8 = bulkItemRequest7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.ActionRequest actionRequest11 = bulkItemRequest10.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest10.index();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean6 = versionType0.validateVersionForReads((long) (-1));
        boolean boolean8 = versionType0.validateVersionForReads(101L);
        boolean boolean12 = versionType0.isVersionConflictForWrites(11L, (long) '#', true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType0.explainConflictForWrites(53L, 97L, true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        boolean boolean10 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest7.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest9.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkItemRequest13.index();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest3.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        long long12 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest14.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest19.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest19.getDescription();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        long long10 = bulkShardRequest7.primaryTerm();
        boolean boolean11 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.index("index.creation_date_string");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int15 = bulkItemRequest14.id();
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest14.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkItemRequest14.index();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId1 = bulkShardRequest0.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.ActionRequest actionRequest11 = bulkItemRequest10.request();
        int int12 = bulkItemRequest10.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest10.index();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean9 = versionType4.isVersionConflictForReads((long) (short) 100, (long) (byte) 10);
        boolean boolean13 = versionType4.isVersionConflictForWrites((long) 100, 35L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType4.explainConflictForReads((long) 0, 0L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        java.lang.String str6 = bulkShardRequest4.index();
        bulkShardRequest4.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest4.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest4.indices();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        bulkShardRequest1.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        java.lang.String str9 = bulkShardRequest5.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest5.getDescription();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest3.consistencyLevel();
        long long6 = bulkShardRequest3.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest3.indices();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkItemRequest10.index();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long5 = bulkShardRequest4.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest4.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest9, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        long long13 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest10.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        int int22 = bulkItemRequest21.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = bulkItemRequest21.index();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest0.index("current version [10] is higher or equal to the one provided [0]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.seqNo(10L);
        long long11 = bulkShardRequest0.seqNo();
        boolean boolean12 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest0.toString();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest8.toString();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest1.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.timeout(timeValue5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest3.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest3.indices();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        java.lang.String str6 = bulkShardRequest4.index();
        bulkShardRequest4.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest4.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long13 = bulkShardRequest12.seqNo();
        long long14 = bulkShardRequest12.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest15.getParentTask();
        bulkShardRequest12.setParentTask(taskId16);
        bulkShardRequest11.setParentTask(taskId16);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel20);
        bulkShardRequest21.primaryTerm(34L);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData30 = indexMetaData28.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData32 = indexMetaData28.mapping("hi!");
        int int33 = indexMetaData28.getTotalNumberOfShards();
        long long34 = indexMetaData28.getVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long36 = bulkShardRequest35.seqNo();
        long long37 = bulkShardRequest35.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId39 = bulkShardRequest38.getParentTask();
        bulkShardRequest35.setParentTask(taskId39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest35.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest35.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long46 = bulkShardRequest45.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions47 = bulkShardRequest45.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException48 = bulkShardRequest45.validate();
        org.elasticsearch.common.unit.TimeValue timeValue49 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest45.timeout(timeValue49);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long52 = bulkShardRequest51.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = bulkShardRequest51.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = bulkShardRequest51.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long58 = bulkShardRequest57.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple59 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest56, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest57);
        org.elasticsearch.tasks.TaskId taskId60 = bulkShardRequest57.getParentTask();
        bulkShardRequest50.setParentTask(taskId60);
        bulkShardRequest35.setParentTask(taskId60);
        boolean boolean63 = indexMetaData28.equals((java.lang.Object) taskId60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task64 = bulkShardRequest21.createTask((long) (short) 10, "Tuple [v1={\n  \"key\" : \"index.routing.allocation.initial_recovery.\",\n  \"properties\" : [ ],\n  \"is_group_setting\" : true,\n  \"default\" : \"\"\n}, v2=null]", "current version [0] is different than the one provided [100]", taskId60);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        java.lang.String str7 = bulkShardRequest3.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest3.toString();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest12.toString();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        long long13 = bulkShardRequest5.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest5.toString();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean7 = versionType0.validateVersionForReads((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = versionType0.explainConflictForWrites(11L, 10L, false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        int int4 = bulkItemRequest3.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest3.index();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId3 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest2.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        java.lang.String str11 = bulkShardRequest7.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = bulkShardRequest15.validate();
        org.elasticsearch.common.unit.TimeValue timeValue19 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest15.timeout(timeValue19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest13.timeout(timeValue19);
        org.elasticsearch.common.unit.TimeValue timeValue22 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest7.timeout(timeValue22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int25 = bulkItemRequest24.id();
        int int26 = bulkItemRequest24.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = bulkItemRequest24.index();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest5.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest5.indices();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean6 = versionType0.validateVersionForReads((long) (-1));
        boolean boolean8 = versionType0.validateVersionForReads(101L);
        long long11 = versionType0.updateVersion((long) (short) 1, (long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForWrites(4L, (long) (short) 0, false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        long long10 = bulkShardRequest7.primaryTerm();
        boolean boolean11 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.index("index.creation_date_string");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int15 = bulkItemRequest14.id();
        org.elasticsearch.action.ActionRequest actionRequest16 = bulkItemRequest14.request();
        int int17 = bulkItemRequest14.id();
        org.elasticsearch.action.ActionRequest actionRequest18 = bulkItemRequest14.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = bulkItemRequest14.index();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long5 = bulkShardRequest4.seqNo();
        long long6 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest7.getParentTask();
        bulkShardRequest4.setParentTask(taskId8);
        bulkShardRequest3.setParentTask(taskId8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        int int14 = bulkItemRequest13.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest13.index();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkItemRequest15.index();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        bulkShardRequest1.primaryTerm((long) '#');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        long long11 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest12.getParentTask();
        bulkShardRequest9.setParentTask(taskId13);
        bulkShardRequest1.setParentTask(taskId13);
        org.elasticsearch.index.shard.ShardId shardId16 = bulkShardRequest1.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkItemRequest17.index();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long9 = bulkShardRequest8.seqNo();
        long long10 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId12 = bulkShardRequest11.getParentTask();
        bulkShardRequest8.setParentTask(taskId12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest0.timeout(timeValue14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.timeout(timeValue4);
        long long6 = bulkShardRequest0.primaryTerm();
        bulkShardRequest0.setParentTask("index.number_of_shards", (-1L));
        long long10 = bulkShardRequest0.seqNo();
        bulkShardRequest0.primaryTerm(0L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long18 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest17.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long24 = bulkShardRequest23.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest22, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        java.lang.String str26 = bulkShardRequest22.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        long long28 = bulkShardRequest22.seqNo();
        org.elasticsearch.tasks.TaskId taskId29 = bulkShardRequest22.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task30 = bulkShardRequest0.createTask(0L, "current version [33] is different than the one provided [1]", "current version [4] is different than the one provided [2]", taskId29);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        bulkShardRequest0.primaryTerm((-1L));
        bulkShardRequest0.seqNo(35L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest13.validate();
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest11.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest0.timeout(timeValue17);
        long long21 = bulkShardRequest20.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bulkShardRequest20.toString();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest2.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        long long9 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId5 = bulkShardRequest3.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest3.indices();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest10.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest10.validate();
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest10.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long17 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest16.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest16.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long23 = bulkShardRequest22.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest21, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest22.getParentTask();
        bulkShardRequest15.setParentTask(taskId25);
        bulkShardRequest0.setParentTask(taskId25);
        org.elasticsearch.action.support.IndicesOptions indicesOptions28 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long30 = bulkShardRequest29.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest29.index("current version [-1] is different than the one provided [0]");
        long long33 = bulkShardRequest32.seqNo();
        long long34 = bulkShardRequest32.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel36 = bulkShardRequest32.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long38 = bulkShardRequest37.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions39 = bulkShardRequest37.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long41 = bulkShardRequest40.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest40.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest40.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long47 = bulkShardRequest46.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple48 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest45, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest46);
        long long49 = bulkShardRequest46.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue50 = bulkShardRequest46.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long52 = bulkShardRequest51.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions53 = bulkShardRequest51.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel54 = bulkShardRequest51.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = bulkShardRequest46.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = bulkShardRequest37.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = bulkShardRequest56.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = bulkShardRequest32.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.tasks.TaskId taskId59 = bulkShardRequest58.getParentTask();
        bulkShardRequest0.setParentTask(taskId59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = bulkShardRequest0.toString();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long6 = bulkShardRequest5.seqNo();
        long long7 = bulkShardRequest5.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest8.getParentTask();
        bulkShardRequest5.setParentTask(taskId9);
        bulkShardRequest4.setParentTask(taskId9);
        bulkShardRequest3.setParentTask(taskId9);
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest3.getParentTask();
        long long14 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest3.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray16 = bulkShardRequest3.indices();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        bulkShardRequest8.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest8.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest8.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkItemRequest15.index();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest3.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = bulkShardRequest3.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest3.toString();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        java.lang.String str5 = bulkShardRequest3.index();
        bulkShardRequest3.primaryTerm((long) 100);
        org.elasticsearch.index.shard.ShardId shardId8 = bulkShardRequest3.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        long long13 = bulkShardRequest11.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest14.getParentTask();
        bulkShardRequest11.setParentTask(taskId15);
        bulkShardRequest10.setParentTask(taskId15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest3.toString();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        bulkShardRequest9.setParentTask(taskId14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting7, "_na_", (java.lang.Throwable) actionRequestValidationException17, "current version [10] is different than the one provided [100]");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable> versionTypeTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable>(versionType4, (java.lang.Throwable) actionRequestValidationException17);
        org.elasticsearch.index.VersionType versionType21 = versionType4.versionTypeForReplicationAndRecovery();
        boolean boolean23 = versionType4.validateVersionForReads(12L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str26 = versionType4.explainConflictForReads(12L, (-1L));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        boolean boolean4 = versionType0.isVersionConflictForWrites(0L, (long) 'a', false);
        boolean boolean6 = versionType0.validateVersionForReads((long) (-1));
        boolean boolean8 = versionType0.validateVersionForReads(101L);
        boolean boolean12 = versionType0.isVersionConflictForWrites(11L, (long) '#', true);
        long long15 = versionType0.updateVersion((long) (byte) 100, (long) (byte) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites((long) (byte) 2, (long) 32, true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        bulkShardRequest7.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.index.shard.ShardId shardId12 = bulkShardRequest7.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest7.validate();
        bulkShardRequest7.primaryTerm(98L);
        bulkShardRequest7.setParentTask("current version [5] is different than the one provided [100]", 36L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = bulkShardRequest7.toString();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest7.validate();
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest7.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest11.index("current version [-1] is different than the one provided [0]");
        long long15 = bulkShardRequest14.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest14.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest10.timeout(timeValue16);
        org.elasticsearch.common.unit.TimeValue timeValue18 = bulkShardRequest17.timeout();
        bulkShardRequest17.primaryTerm(3L);
        long long21 = bulkShardRequest17.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bulkShardRequest17.getDescription();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        bulkShardRequest0.primaryTerm((long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        long long9 = bulkShardRequest0.seqNo();
        java.lang.String str10 = bulkShardRequest0.index();
        boolean boolean11 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest0.toString();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) 10, 0L, false);
        long long12 = versionType0.updateVersion((long) (short) -1, (long) (short) 10);
        byte byte13 = versionType0.getValue();
        boolean boolean15 = versionType0.validateVersionForWrites((long) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = versionType0.explainConflictForWrites(4L, 102L, true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId7 = bulkShardRequest6.getParentTask();
        bulkShardRequest3.setParentTask(taskId7);
        bulkShardRequest2.setParentTask(taskId7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long11 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(2, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        long long9 = versionType4.updateVersion((long) (byte) 10, (long) 1);
        boolean boolean13 = versionType4.isVersionConflictForWrites((-1L), (long) (byte) 2, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType4.explainConflictForWrites(37L, 100L, false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long5 = bulkShardRequest4.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest4.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest9, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        long long13 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest10.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bulkItemRequest21.index();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        long long12 = bulkShardRequest6.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest6.toString();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest3.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        long long12 = bulkShardRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long15 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = bulkShardRequest14.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest14.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel17);
        bulkShardRequest19.seqNo(4L);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData27 = indexMetaData25.mappingOrDefault("");
        long long28 = indexMetaData25.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap29 = indexMetaData25.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters30 = indexMetaData25.includeFilters();
        int int31 = indexMetaData25.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state32 = indexMetaData25.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap33 = indexMetaData25.getAliases();
        org.elasticsearch.Version version34 = indexMetaData25.getCreationVersion();
        org.elasticsearch.Version version35 = indexMetaData25.getUpgradedVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long37 = bulkShardRequest36.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest36.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest39.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId41 = bulkShardRequest39.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.tasks.TaskId> versionTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.tasks.TaskId>(version35, taskId41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task43 = bulkShardRequest19.createTask((long) (short) -1, "current version [-1] is different than the one provided [54]", "current version [12] is different than the one provided [52]", taskId41);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest8.validate();
        bulkShardRequest8.setParentTask("current version [10] is different than the one provided [100]", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        long long15 = bulkShardRequest13.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId17 = bulkShardRequest16.getParentTask();
        bulkShardRequest13.setParentTask(taskId17);
        bulkShardRequest8.setParentTask(taskId17);
        org.elasticsearch.tasks.TaskId taskId20 = bulkShardRequest8.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray22 = bulkShardRequest8.indices();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest6.toString();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) 10, 0L, false);
        long long12 = versionType0.updateVersion((long) (short) -1, (long) (short) 10);
        byte byte13 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str17 = versionType0.explainConflictForWrites(0L, 12L, true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str5 = versionType0.explainConflictForWrites(13L, 0L, false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long10 = bulkShardRequest9.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest9.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest9.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long16 = bulkShardRequest15.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest14, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long19 = bulkShardRequest18.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest18.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest15.consistencyLevel(writeConsistencyLevel20);
        long long22 = bulkShardRequest21.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue23 = bulkShardRequest21.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest0.timeout(timeValue23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest0.index("hi!");
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest7.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest7.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest7.indices();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        bulkShardRequest9.setParentTask(taskId14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting7, "_na_", (java.lang.Throwable) actionRequestValidationException17, "current version [10] is different than the one provided [100]");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable> versionTypeTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable>(versionType4, (java.lang.Throwable) actionRequestValidationException17);
        boolean boolean22 = versionType4.validateVersionForWrites((long) 10);
        long long25 = versionType4.updateVersion((long) 2, (long) (byte) 10);
        long long28 = versionType4.updateVersion((long) (short) 1, 3L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str32 = versionType4.explainConflictForWrites((long) (short) 100, (long) (short) -1, true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        java.lang.String str10 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest11.request();
        int int13 = bulkItemRequest11.id();
        int int14 = bulkItemRequest11.id();
        org.elasticsearch.action.ActionRequest actionRequest15 = bulkItemRequest11.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkItemRequest11.index();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        java.lang.String str9 = bulkShardRequest5.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.index("indices:data/write/bulk[s]");
        java.lang.String str12 = bulkShardRequest5.index();
        boolean boolean13 = bulkShardRequest5.getShouldPersistResult();
        bulkShardRequest5.seqNo((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest5.getDescription();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean3 = versionType0.validateVersionForReads((long) 0);
        long long6 = versionType0.updateVersion((long) 1, 34L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads(33L, (long) ' ');
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest0.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest0.indices();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.seqNo();
        long long5 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId7 = bulkShardRequest6.getParentTask();
        bulkShardRequest3.setParentTask(taskId7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest3.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest10.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest10.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.tasks.TaskId taskId15 = bulkShardRequest10.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkItemRequest16.index();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        long long12 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest13.getParentTask();
        bulkShardRequest10.setParentTask(taskId14);
        bulkShardRequest9.setParentTask(taskId14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting7, "_na_", (java.lang.Throwable) actionRequestValidationException17, "current version [10] is different than the one provided [100]");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable> versionTypeTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.index.VersionType, java.lang.Throwable>(versionType4, (java.lang.Throwable) actionRequestValidationException17);
        org.elasticsearch.index.VersionType versionType21 = versionType4.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str24 = versionType21.explainConflictForReads((long) (byte) 0, 4L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        long long9 = bulkShardRequest1.primaryTerm();
        bulkShardRequest1.primaryTerm((long) (byte) -1);
        bulkShardRequest1.setParentTask("current version [3] is different than the one provided [-1]", 54L);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkItemRequest15.index();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest2.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.timeout(timeValue6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest0.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest0.indices();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId4 = bulkShardRequest3.getParentTask();
        bulkShardRequest0.setParentTask(taskId4);
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest0.timeout();
        bulkShardRequest0.primaryTerm((-1L));
        bulkShardRequest0.seqNo(35L);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long12 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long14 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest13.validate();
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest11.timeout(timeValue17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest0.timeout(timeValue17);
        bulkShardRequest20.seqNo((long) 'a');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long27 = bulkShardRequest26.seqNo();
        long long28 = bulkShardRequest26.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest29.getParentTask();
        bulkShardRequest26.setParentTask(taskId30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest26.index("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest26.index("index.version.minimum_compatible");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long37 = bulkShardRequest36.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions38 = bulkShardRequest36.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException39 = bulkShardRequest36.validate();
        org.elasticsearch.common.unit.TimeValue timeValue40 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest36.timeout(timeValue40);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long43 = bulkShardRequest42.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest42.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = bulkShardRequest42.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long49 = bulkShardRequest48.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple50 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest47, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest48);
        org.elasticsearch.tasks.TaskId taskId51 = bulkShardRequest48.getParentTask();
        bulkShardRequest41.setParentTask(taskId51);
        bulkShardRequest26.setParentTask(taskId51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task54 = bulkShardRequest20.createTask(33L, "current version [100] is different than the one provided [-1]", "current version [35] is different than the one provided [52]", taskId51);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        long long4 = bulkShardRequest3.primaryTerm();
        java.lang.String str5 = bulkShardRequest3.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest3.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.toString();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType5 = versionType4.versionTypeForReplicationAndRecovery();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple6 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest3, versionType4);
        boolean boolean8 = versionType4.validateVersionForReads((long) (short) 100);
        org.elasticsearch.index.VersionType versionType9 = versionType4.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType9.explainConflictForReads(0L, (long) (byte) 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        long long2 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId3 = bulkShardRequest0.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest5, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        boolean boolean9 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest6.validate();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = bulkShardRequest6.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest6.toString();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) 10, 0L, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType0.explainConflictForWrites((long) 0, 13L, true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest6, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest6.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.index.VersionType versionType1 = versionType0.versionTypeForReplicationAndRecovery();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 100, (long) (byte) 10, false);
        boolean boolean9 = versionType0.isVersionConflictForWrites((long) (byte) 10, 0L, false);
        long long12 = versionType0.updateVersion((long) (byte) -1, 102L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) 3, 100L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = bulkShardRequest0.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest0.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long7 = bulkShardRequest6.primaryTerm();
        bulkShardRequest6.primaryTerm((long) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel10);
        boolean boolean12 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest5.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long20 = bulkShardRequest19.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest19.index("current version [-1] is different than the one provided [0]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest19.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long26 = bulkShardRequest25.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> bulkShardRequestTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(bulkShardRequest24, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        java.lang.String str28 = bulkShardRequest24.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        long long30 = bulkShardRequest24.seqNo();
        org.elasticsearch.tasks.TaskId taskId31 = bulkShardRequest24.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task32 = bulkShardRequest5.createTask((long) 100, "current version [97] is different than the one provided [2]", "current version [97] is different than the one provided [0]", taskId31);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        bulkShardRequest2.setParentTask(taskId6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest2.index("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest9.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest9.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest9.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = bulkShardRequest9.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest9.toString();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        long long3 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.tasks.TaskId taskId5 = bulkShardRequest4.getParentTask();
        bulkShardRequest1.setParentTask(taskId5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest1.index("hi!");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest9.index();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = bulkShardRequest1.index("current version [-1] is different than the one provided [0]");
        long long5 = bulkShardRequest4.seqNo();
        long long6 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        java.lang.String str8 = bulkShardRequest4.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest9.index();
    }
}

