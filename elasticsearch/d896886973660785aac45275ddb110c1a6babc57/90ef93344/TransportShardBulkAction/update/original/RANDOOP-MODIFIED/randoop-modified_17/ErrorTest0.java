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
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, "index.version.created_string");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest1.toString();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest3.toString();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest4.index();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = bulkShardRequest0.indices();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        long long2 = bulkShardRequest0.seqNo();
        long long3 = bulkShardRequest0.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = bulkShardRequest0.indices();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.toString();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        long long2 = bulkShardRequest0.seqNo();
        long long3 = bulkShardRequest0.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        long long2 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest1.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = bulkShardRequest13.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest13.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task20 = bulkShardRequest3.createTask((long) '4', "indices:data/write/bulk[s]", "", taskId19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest8.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest8.getDescription();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str3 = versionType0.explainConflictForReads(100L, (long) ' ');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.toString();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest8.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task15 = bulkShardRequest0.createTask((long) 1, "", "index.auto_expand_replicas", taskId14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = bulkShardRequest1.toString();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        long long12 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest10.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest19.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest19.getParentTask();
        bulkShardRequest10.setParentTask(taskId25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task27 = bulkShardRequest2.createTask((long) (byte) -1, "", "index.shared_filesystem.recover_on_any_node", taskId25);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.shadow_replicas");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest2.toString();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest1.indices();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        long long19 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest26.getParentTask();
        bulkShardRequest17.setParentTask(taskId32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task34 = bulkShardRequest6.createTask((long) (short) 1, "current version [0] is different than the one provided [100]", "index.number_of_replicas", taskId32);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray1 = bulkShardRequest0.indices();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest9.indices();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.toString();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.shadow_replicas");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        long long16 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        long long21 = bulkShardRequest19.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest19.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean29 = bulkShardRequest28.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = bulkShardRequest28.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest28.getParentTask();
        bulkShardRequest19.setParentTask(taskId34);
        bulkShardRequest14.setParentTask(taskId34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task37 = bulkShardRequest0.createTask((long) ' ', "current version [97] is different than the one provided [100]", "index.blocks.write", taskId34);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        bulkShardRequest6.setParentTask("index.creation_date_string", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.common.unit.TimeValue timeValue24 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest20.timeout(timeValue24);
        org.elasticsearch.common.unit.TimeValue timeValue26 = bulkShardRequest25.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest13.timeout(timeValue26);
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest13.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task29 = bulkShardRequest6.createTask((long) 'a', "index.blocks.write", "current version [0] is different than the one provided [100]", taskId28);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long7 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest12.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = bulkShardRequest21.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId27 = bulkShardRequest21.getParentTask();
        bulkShardRequest12.setParentTask(taskId27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task29 = bulkShardRequest2.createTask((long) (byte) 3, "current version [-1] is different than the one provided [35]", "index.number_of_shards", taskId27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) '#', 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) (byte) 1, (long) (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        long long5 = bulkShardRequest1.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest1.toString();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        long long4 = versionType0.updateVersion((long) (-1), (long) ' ');
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads(0L, 100L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest4.toString();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest9.indices();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest1.toString();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        long long16 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        long long21 = bulkShardRequest19.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest19.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean29 = bulkShardRequest28.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = bulkShardRequest28.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest28.getParentTask();
        bulkShardRequest19.setParentTask(taskId34);
        bulkShardRequest14.setParentTask(taskId34);
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest14.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task38 = bulkShardRequest3.createTask((long) (byte) 1, "index.number_of_shards", "primary_terms", taskId37);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        long long12 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest20.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = bulkShardRequest20.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15, indicesOptions23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        long long28 = bulkShardRequest26.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest26.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean36 = bulkShardRequest35.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.support.IndicesOptions indicesOptions40 = bulkShardRequest35.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId41 = bulkShardRequest35.getParentTask();
        bulkShardRequest26.setParentTask(taskId41);
        bulkShardRequest15.setParentTask(taskId41);
        bulkShardRequest10.setParentTask(taskId41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task45 = bulkShardRequest2.createTask((long) 52, "current version [-1] is higher or equal to the one provided [0]", "indices:data/write/bulk[s]", taskId41);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        long long2 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest0.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.unit.TimeValue timeValue11 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.timeout(timeValue11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest0.timeout(timeValue13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest0.toString();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest6.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest6.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, indicesOptions9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest12.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = bulkShardRequest21.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId27 = bulkShardRequest21.getParentTask();
        bulkShardRequest12.setParentTask(taskId27);
        bulkShardRequest1.setParentTask(taskId27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.common.unit.TimeValue timeValue37 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest33.timeout(timeValue37);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = bulkShardRequest33.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.creation_date_string", bulkItemRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = serializableTuple6.v2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkItemRequest7.index();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet14 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean17 = bulkShardRequest16.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest16.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest16.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest21.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest21.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16, indicesOptions24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean28 = bulkShardRequest27.getShouldPersistResult();
        long long29 = bulkShardRequest27.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest27.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean37 = bulkShardRequest36.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.support.IndicesOptions indicesOptions41 = bulkShardRequest36.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId42 = bulkShardRequest36.getParentTask();
        bulkShardRequest27.setParentTask(taskId42);
        bulkShardRequest16.setParentTask(taskId42);
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.tasks.TaskId> indexShardStateSetTuple45 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.tasks.TaskId>(indexShardStateSet14, taskId42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task46 = bulkShardRequest4.createTask((long) (short) 0, "index.version.upgraded", "_na_", taskId42);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.common.unit.TimeValue timeValue23 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest19.timeout(timeValue23);
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest24.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task26 = bulkShardRequest12.createTask((long) 97, "index.auto_expand_replicas", "", taskId25);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest8.consistencyLevel();
        bulkShardRequest8.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        long long22 = bulkShardRequest18.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest18.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = bulkItemRequest26.index();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.ActionRequest actionRequest10 = bulkItemRequest9.request();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, actionRequest10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest11.index();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        long long10 = bulkShardRequest8.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest17.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest17.getParentTask();
        bulkShardRequest8.setParentTask(taskId23);
        bulkShardRequest3.setParentTask(taskId23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = bulkItemRequest27.index();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte5 = versionType4.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest3, (org.elasticsearch.common.io.stream.Writeable) versionType4);
        boolean boolean10 = versionType4.isVersionConflictForWrites((long) (short) 0, (long) (byte) 0, false);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        long long16 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple18 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.blocks.read_only", bulkItemRequest17);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple19 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest17);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple20 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) boolean10, bulkItemRequest17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkItemRequest17.index();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest3.indices();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest2.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest2.toString();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest9.toString();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest8.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3, indicesOptions11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest3.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest25.index("");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean34 = bulkShardRequest33.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.support.IndicesOptions indicesOptions38 = bulkShardRequest33.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId39 = bulkShardRequest33.getParentTask();
        bulkShardRequest25.setParentTask(taskId39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task41 = bulkShardRequest3.createTask((long) (short) 0, "index.auto_expand_replicas", "current version [100] is higher or equal to the one provided [1]", taskId39);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest3.toString();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest2.indices();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest4.toString();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest1.indices();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest8.consistencyLevel();
        bulkShardRequest8.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        long long22 = bulkShardRequest18.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest18.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest8.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple25 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = bulkShardRequest8.toString();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.seqNo();
        bulkShardRequest0.primaryTerm((long) (-1));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        long long7 = bulkShardRequest5.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        long long12 = bulkShardRequest10.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest10.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest19.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest19.getParentTask();
        bulkShardRequest10.setParentTask(taskId25);
        bulkShardRequest5.setParentTask(taskId25);
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest5.getParentTask();
        bulkShardRequest0.setParentTask(taskId28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray30 = bulkShardRequest0.indices();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, "index.version.created_string");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest1.indices();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest3.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.toString();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        boolean boolean5 = bulkShardRequest1.getShouldPersistResult();
        java.lang.String str6 = bulkShardRequest1.index();
        java.lang.String str7 = bulkShardRequest1.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest1.indices();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest8.timeout();
        java.lang.String str10 = bulkShardRequest8.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest8.indices();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = bulkShardRequest3.indices();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        java.lang.String str2 = bulkShardRequest0.index();
        bulkShardRequest0.seqNo((long) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str3 = bulkShardRequest2.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest2.indices();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest4.indices();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest0.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = bulkShardRequest0.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.toString();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean17 = bulkShardRequest16.getShouldPersistResult();
        long long18 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        long long21 = bulkShardRequest16.seqNo();
        java.lang.String str22 = bulkShardRequest16.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.tasks.TaskId taskId24 = bulkShardRequest16.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task25 = bulkShardRequest4.createTask((long) 10, "index.shared_filesystem", "index.shadow_replicas", taskId24);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        long long8 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean19 = bulkShardRequest18.getShouldPersistResult();
        long long20 = bulkShardRequest18.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest18.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean28 = bulkShardRequest27.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.support.IndicesOptions indicesOptions32 = bulkShardRequest27.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId33 = bulkShardRequest27.getParentTask();
        bulkShardRequest18.setParentTask(taskId33);
        bulkShardRequest13.setParentTask(taskId33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task36 = bulkShardRequest3.createTask(0L, "index.blocks.read", "index.blocks.read", taskId33);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        bulkShardRequest2.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("hi!", (long) (short) 10);
        java.lang.String str11 = bulkShardRequest2.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        long long3 = bulkShardRequest0.seqNo();
        bulkShardRequest0.seqNo((-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest0.indices();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.index("index.number_of_shards");
        bulkShardRequest2.primaryTerm(0L);
        bulkShardRequest2.seqNo((long) (short) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest5.index();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        long long13 = bulkShardRequest11.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest17.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest17.consistencyLevel();
        bulkShardRequest17.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        long long31 = bulkShardRequest27.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest27.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest17.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.common.unit.TimeValue timeValue41 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest37.timeout(timeValue41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest33.timeout(timeValue41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest4.timeout(timeValue41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray45 = bulkShardRequest4.indices();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest2.indicesOptions();
        boolean boolean6 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        long long19 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest26.getParentTask();
        bulkShardRequest17.setParentTask(taskId32);
        bulkShardRequest12.setParentTask(taskId32);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData37 = indexMetaData35.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap38 = indexMetaData35.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData35);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap40 = indexMetaData35.getActiveAllocationIds();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.cluster.metadata.IndexMetaData> taskIdTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.cluster.metadata.IndexMetaData>(taskId32, indexMetaData35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task42 = bulkShardRequest2.createTask((long) (short) 10, "index.version.created", "index.version.upgraded_string", taskId32);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest15.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10, indicesOptions18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions> transportRequestTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.transport.TransportRequest) bulkShardRequest3, indicesOptions18);
        long long21 = bulkShardRequest3.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bulkShardRequest3.toString();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        bulkShardRequest2.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        long long16 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest18.getDescription();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = bulkShardRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest10.getParentTask();
        bulkShardRequest2.setParentTask(taskId16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkItemRequest7.index();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        java.lang.Class<?> wildcardClass7 = indexMetaData0.getClass();
        org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable>((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.io.Serializable) versionType8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType8.explainConflictForReads((long) '#', (long) (byte) 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet5 = indexMetaData0.activeAllocationIds((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = indexMetaData0.getClass();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData7.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap10 = indexMetaData7.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData11.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData11);
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData11.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData7.diff(indexMetaData11);
        boolean boolean17 = indexMetaData11.isSameUUID("index.shared_filesystem.recover_on_any_node");
        java.lang.String str18 = indexMetaData11.getIndexUUID();
        int int19 = indexMetaData11.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData20.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData20);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap24 = indexMetaData20.getMappings();
        long long25 = indexMetaData20.getVersion();
        int int26 = indexMetaData20.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap27 = indexMetaData20.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters29 = indexMetaData28.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData33 = indexMetaData28.mapping("index.priority");
        org.elasticsearch.Version version34 = indexMetaData28.getCreationVersion();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff35 = indexMetaData20.diff(indexMetaData28);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff36 = indexMetaData11.diff(indexMetaData20);
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.AnnotatedElement, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>> annotatedElementTuple37 = org.elasticsearch.common.collect.Tuple.tuple((java.lang.reflect.AnnotatedElement) wildcardClass6, indexMetaDataDiff36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean43 = bulkShardRequest42.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.support.IndicesOptions indicesOptions47 = bulkShardRequest42.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId48 = bulkShardRequest42.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest49 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple50 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) wildcardClass6, bulkItemRequest49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = bulkItemRequest49.index();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData3.requireFilters();
        org.elasticsearch.Version version5 = indexMetaData3.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple12 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData3, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        long long16 = bulkShardRequest8.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest8.toString();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest5.timeout(timeValue15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean19 = bulkShardRequest18.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest18.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest18.consistencyLevel();
        bulkShardRequest18.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        long long32 = bulkShardRequest28.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = bulkShardRequest28.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest18.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest41 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.common.unit.TimeValue timeValue42 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest38.timeout(timeValue42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest34.timeout(timeValue42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest5.timeout(timeValue42);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = bulkShardRequest45.toString();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData8.requireFilters();
        org.elasticsearch.Version version10 = indexMetaData8.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple17 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap18 = indexMetaData8.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        long long26 = bulkShardRequest22.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = bulkShardRequest22.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> strSetImmutableOpenIntMapTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(strSetImmutableOpenIntMap18, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.tasks.TaskId taskId29 = bulkShardRequest22.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task30 = bulkShardRequest1.createTask((long) 0, "current version [100] is different than the one provided [0]", "current version [0] is higher or equal to the one provided [10]", taskId29);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest11.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6, indicesOptions14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        long long19 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest26.getParentTask();
        bulkShardRequest17.setParentTask(taskId32);
        bulkShardRequest6.setParentTask(taskId32);
        bulkShardRequest1.setParentTask(taskId32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = bulkShardRequest1.toString();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        long long15 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel16);
        bulkShardRequest17.seqNo((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest17.getDescription();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = bulkShardRequest4.indices();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest4.consistencyLevel();
        long long13 = bulkShardRequest4.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray14 = bulkShardRequest4.indices();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest12.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.ActionRequest actionRequest18 = bulkItemRequest17.request();
        org.elasticsearch.tasks.TaskId taskId19 = actionRequest18.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task20 = bulkShardRequest2.createTask(32L, "", "", taskId19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType1.explainConflictForReads(10L, 97L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        java.lang.Class<?> wildcardClass7 = indexMetaData0.getClass();
        org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable>((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.io.Serializable) versionType8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType8.explainConflictForReads((long) (byte) 100, (long) (short) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest6.toString();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.index("");
        bulkShardRequest8.setParentTask("index.creation_date_string", (-1L));
        long long12 = bulkShardRequest8.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest15.consistencyLevel();
        bulkShardRequest15.seqNo((long) 0);
        long long22 = bulkShardRequest15.seqNo();
        java.lang.String str23 = bulkShardRequest15.index();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.common.io.stream.Streamable> bulkShardRequestActionRequestTuple24 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8, (org.elasticsearch.common.io.stream.Streamable) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray26 = bulkShardRequest15.indices();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest4.toString();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo(0L);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = bulkShardRequest3.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest3.toString();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest2.timeout();
        bulkShardRequest2.setParentTask("current version [-1] is higher or equal to the one provided [0]", 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest5.timeout(timeValue9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkItemRequest13.index();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) 52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = versionType0.explainConflictForReads(100L, 32L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest2.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest20.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest24.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest24.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task29 = bulkShardRequest2.createTask((long) 0, "current version [0] is higher or equal to the one provided [100]", "index.shadow_replicas", taskId28);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest8.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3, indicesOptions11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkShardRequest3.toString();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkItemRequest10.index();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.seqNo(1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest1.indices();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        bulkShardRequest0.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        bulkShardRequest9.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean17 = bulkShardRequest16.getShouldPersistResult();
        long long18 = bulkShardRequest16.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue19 = bulkShardRequest16.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest9.timeout(timeValue19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest0.timeout(timeValue19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray22 = bulkShardRequest21.indices();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkItemRequest4.index();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.index("index.number_of_shards");
        bulkShardRequest2.primaryTerm(0L);
        bulkShardRequest2.seqNo((long) (short) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = bulkShardRequest2.indices();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        long long15 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel16);
        bulkShardRequest17.seqNo((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest17.toString();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple7 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.blocks.read_only", bulkItemRequest6);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) 10.0f, bulkItemRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest6.index();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        long long9 = bulkShardRequest7.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest13.consistencyLevel();
        bulkShardRequest13.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        long long27 = bulkShardRequest23.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest23.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple30 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel11, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = bulkShardRequest31.getDescription();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest3.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str4 = versionType0.explainConflictForReads(10L, 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        long long9 = bulkShardRequest7.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest13.consistencyLevel();
        bulkShardRequest13.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        long long27 = bulkShardRequest23.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest23.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple30 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel11, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel11);
        long long32 = bulkShardRequest31.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = bulkShardRequest31.getDescription();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.index("index.number_of_shards");
        bulkShardRequest2.primaryTerm(0L);
        bulkShardRequest2.seqNo((long) (short) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest2.validate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        bulkShardRequest19.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        bulkShardRequest19.setParentTask("hi!", (long) (short) 10);
        java.lang.String str28 = bulkShardRequest19.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest19.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task31 = bulkShardRequest2.createTask((long) (-1), "Tuple [v1=4, v2=null]", "current version [52] is different than the one provided [52]", taskId30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest7);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 97, 0L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str15 = versionType0.explainConflictForReads((long) 1, (long) ' ');
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        bulkShardRequest2.seqNo((long) 0);
        long long9 = bulkShardRequest2.seqNo();
        java.lang.String str10 = bulkShardRequest2.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(32, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = bulkShardRequest2.indices();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest6.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest6.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, indicesOptions9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest12.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = bulkShardRequest21.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId27 = bulkShardRequest21.getParentTask();
        bulkShardRequest12.setParentTask(taskId27);
        bulkShardRequest1.setParentTask(taskId27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = bulkShardRequest1.toString();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, "index.version.created_string");
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.index("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest12.validate();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest6.timeout(timeValue16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray18 = bulkShardRequest6.indices();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        bulkShardRequest6.setParentTask("index.creation_date_string", (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest6.indices();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest2.timeout();
        bulkShardRequest2.setParentTask("current version [-1] is higher or equal to the one provided [0]", 0L);
        java.lang.String str20 = bulkShardRequest2.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray21 = bulkShardRequest2.indices();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        java.lang.String str7 = bulkShardRequest6.index();
        bulkShardRequest6.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str12 = bulkShardRequest11.index();
        boolean boolean13 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray22 = bulkShardRequest21.indices();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean2 = versionType0.validateVersionForReads((long) (short) 1);
        org.elasticsearch.index.VersionType versionType3 = versionType0.versionTypeForReplicationAndRecovery();
        long long6 = versionType3.updateVersion((long) (byte) 3, (long) (byte) 1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9, "index.version.created_string");
        bulkShardRequest9.setParentTask("active_allocations", (long) (short) 1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest9.index("current version [32] is different than the one provided [32]");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple20 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) (byte) 3, bulkItemRequest19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkItemRequest19.index();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        boolean boolean9 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        boolean boolean12 = versionType0.isVersionConflictForReads(100L, (-1L));
        boolean boolean14 = versionType0.validateVersionForReads((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData15.mapping("primary_terms");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData15.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData15.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData15);
        org.elasticsearch.index.Index index21 = indexMetaData15.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = indexMetaData15.getState();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean25 = bulkShardRequest24.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.index.VersionType versionType27 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte28 = versionType27.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest26, (org.elasticsearch.common.io.stream.Writeable) versionType27);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple30 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) state22, bulkItemRequest26);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple31 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) boolean14, bulkItemRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = serializableTuple31.v2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = bulkItemRequest32.index();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        bulkShardRequest1.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.setParentTask("hi!", (long) (short) 10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long11 = bulkShardRequest10.seqNo();
        bulkShardRequest10.primaryTerm((long) (-1));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        long long17 = bulkShardRequest15.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        long long22 = bulkShardRequest20.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest20.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean30 = bulkShardRequest29.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.support.IndicesOptions indicesOptions34 = bulkShardRequest29.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId35 = bulkShardRequest29.getParentTask();
        bulkShardRequest20.setParentTask(taskId35);
        bulkShardRequest15.setParentTask(taskId35);
        org.elasticsearch.tasks.TaskId taskId38 = bulkShardRequest15.getParentTask();
        bulkShardRequest10.setParentTask(taskId38);
        bulkShardRequest1.setParentTask(taskId38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = bulkShardRequest1.toString();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo(0L);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest3.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest2.shardId();
        long long5 = bulkShardRequest2.seqNo();
        bulkShardRequest2.seqNo((-1L));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest2.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest2.indices();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkItemRequest10.index();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, "index.version.created_string");
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest2.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest2.toString();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.index.shard.ShardId shardId13 = bulkShardRequest2.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean19 = bulkShardRequest18.getShouldPersistResult();
        long long20 = bulkShardRequest18.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest18.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean25 = bulkShardRequest24.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = bulkShardRequest24.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest24.consistencyLevel();
        bulkShardRequest24.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        long long38 = bulkShardRequest34.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple41 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel22, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.tasks.TaskId taskId43 = bulkShardRequest13.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task44 = bulkShardRequest6.createTask((long) (byte) 3, "", "index.data_path", taskId43);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.VersionType versionType4 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte5 = versionType4.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest3, (org.elasticsearch.common.io.stream.Writeable) versionType4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest3.index();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long7 = bulkShardRequest2.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue8 = bulkShardRequest2.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest2.indices();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = bulkShardRequest8.timeout();
        java.lang.String str10 = bulkShardRequest8.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest8.getDescription();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        long long10 = bulkShardRequest8.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest17.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest17.getParentTask();
        bulkShardRequest8.setParentTask(taskId23);
        bulkShardRequest3.setParentTask(taskId23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        long long7 = bulkShardRequest3.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest3.indices();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        bulkShardRequest6.setParentTask("index.creation_date_string", (-1L));
        long long10 = bulkShardRequest6.primaryTerm();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting11 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_EXCLUDE_GROUP_SETTING;
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.lang.Object> transportMessageTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.lang.Object>((org.elasticsearch.transport.TransportMessage) bulkShardRequest6, (java.lang.Object) settingsSetting11);
        bulkShardRequest6.seqNo((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest6.indices();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest actionRequest8 = bulkItemRequest7.request();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest5.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest3.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest3.toString();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean5 = versionType1.isVersionConflictForWrites((long) (byte) 3, (long) ' ', false);
        boolean boolean9 = versionType1.isVersionConflictForWrites((long) (-1), 32L, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType1.explainConflictForReads((long) 10, (long) (byte) 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest1.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.primaryTerm((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.timeout(timeValue7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest8.indices();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        java.lang.String str3 = bulkShardRequest1.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = bulkShardRequest1.indices();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        long long8 = bulkShardRequest3.seqNo();
        java.lang.String str9 = bulkShardRequest3.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkItemRequest10.index();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest9.index();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        int int10 = bulkItemRequest9.id();
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple11 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType1, bulkItemRequest9);
        org.elasticsearch.action.ActionRequest actionRequest12 = bulkItemRequest9.request();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, actionRequest12);
        int int14 = bulkItemRequest13.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest13.index();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        long long3 = bulkShardRequest1.primaryTerm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest1.toString();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest1.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest3.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest3.toString();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        java.lang.String str7 = bulkShardRequest6.index();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13, "index.version.created_string");
        bulkShardRequest13.setParentTask("active_allocations", (long) (short) 1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest13.index("current version [32] is different than the one provided [32]");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.tasks.TaskId taskId24 = bulkShardRequest13.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task25 = bulkShardRequest6.createTask((long) (byte) 1, "current version [1] is higher or equal to the one provided [52]", "current version [-1] is higher or equal to the one provided [0]", taskId24);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest6.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest6.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, indicesOptions9);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest12.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = bulkShardRequest21.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId27 = bulkShardRequest21.getParentTask();
        bulkShardRequest12.setParentTask(taskId27);
        bulkShardRequest1.setParentTask(taskId27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.common.unit.TimeValue timeValue37 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = bulkShardRequest33.timeout(timeValue37);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = bulkShardRequest33.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean46 = bulkShardRequest45.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel48 = bulkShardRequest45.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel49 = bulkShardRequest45.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest50.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions53 = bulkShardRequest50.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple54 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest45, indicesOptions53);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean57 = bulkShardRequest56.getShouldPersistResult();
        long long58 = bulkShardRequest56.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest59 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest56);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest61 = bulkShardRequest56.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean66 = bulkShardRequest65.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest67 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest65);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest68 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest65);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest69 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest65);
        org.elasticsearch.action.support.IndicesOptions indicesOptions70 = bulkShardRequest65.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId71 = bulkShardRequest65.getParentTask();
        bulkShardRequest56.setParentTask(taskId71);
        bulkShardRequest45.setParentTask(taskId71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task74 = bulkShardRequest40.createTask((long) (short) 100, "current version [32] is different than the one provided [32]", "index.shadow_replicas", taskId71);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest11.index();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.unit.TimeValue timeValue8 = bulkShardRequest3.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.toString();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        long long13 = bulkShardRequest11.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest15.index("index.number_of_replicas");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest15.toString();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest8.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3, indicesOptions11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        java.lang.String str18 = bulkShardRequest3.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray19 = bulkShardRequest3.indices();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest1.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long6 = bulkShardRequest2.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest5.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest5.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest5.consistencyLevel();
        long long14 = bulkShardRequest5.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkItemRequest15.index();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest7);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 97, 0L, true);
        boolean boolean14 = versionType0.validateVersionForWrites((long) 1);
        boolean boolean17 = versionType0.isVersionConflictForReads((long) (short) -1, (long) 1);
        byte byte18 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str22 = versionType0.explainConflictForWrites((long) (short) -1, 10L, true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, "index.version.created_string");
        org.elasticsearch.index.shard.ShardId shardId7 = bulkShardRequest2.shardId();
        long long8 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest2.indices();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest11.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6, indicesOptions14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        long long19 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest26.getParentTask();
        bulkShardRequest17.setParentTask(taskId32);
        bulkShardRequest6.setParentTask(taskId32);
        bulkShardRequest1.setParentTask(taskId32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        bulkShardRequest0.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        bulkShardRequest9.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        long long7 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId9 = bulkShardRequest3.shardId();
        bulkShardRequest3.setParentTask("current version [100] is different than the one provided [35]", (long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest3.toString();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("active_allocations");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest5.toString();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.blocks.read");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest2.indices();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest3.index("index.number_of_shards");
        bulkShardRequest3.primaryTerm(0L);
        bulkShardRequest3.seqNo((long) (short) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(32, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest3.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        bulkShardRequest13.seqNo(0L);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel20);
        long long22 = bulkShardRequest3.primaryTerm();
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet23 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean26 = bulkShardRequest25.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest30.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = bulkShardRequest30.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25, indicesOptions33);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean37 = bulkShardRequest36.getShouldPersistResult();
        long long38 = bulkShardRequest36.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest36.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean46 = bulkShardRequest45.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest49 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.support.IndicesOptions indicesOptions50 = bulkShardRequest45.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId51 = bulkShardRequest45.getParentTask();
        bulkShardRequest36.setParentTask(taskId51);
        bulkShardRequest25.setParentTask(taskId51);
        org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.tasks.TaskId> indexShardStateSetTuple54 = new org.elasticsearch.common.collect.Tuple<java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.tasks.TaskId>(indexShardStateSet23, taskId51);
        bulkShardRequest3.setParentTask(taskId51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest7.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean22 = bulkShardRequest21.getShouldPersistResult();
        long long23 = bulkShardRequest21.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue24 = bulkShardRequest21.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.common.unit.TimeValue timeValue32 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest28.timeout(timeValue32);
        org.elasticsearch.common.unit.TimeValue timeValue34 = bulkShardRequest33.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest21.timeout(timeValue34);
        org.elasticsearch.tasks.TaskId taskId36 = bulkShardRequest21.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task37 = bulkShardRequest7.createTask((long) 0, "current version [100] is different than the one provided [0]", "index.creation_date_string", taskId36);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest8.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3, indicesOptions11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest3.indices();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest2.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest2.indices();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest11.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.tasks.TaskId taskId19 = bulkShardRequest15.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task20 = bulkShardRequest1.createTask((long) (byte) 1, "current version [97] is different than the one provided [0]", "current version [100] is different than the one provided [52]", taskId19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        long long2 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest0.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.unit.TimeValue timeValue11 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.timeout(timeValue11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest0.timeout(timeValue13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest0.validate();
        long long16 = bulkShardRequest0.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.Version version4 = indexMetaData2.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple11 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData2, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest7.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple6 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest5);
        boolean boolean9 = versionType0.isVersionConflictForReads((long) (short) 10, (long) 'a');
        boolean boolean12 = versionType0.isVersionConflictForReads(100L, (-1L));
        boolean boolean14 = versionType0.validateVersionForReads((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData15.mapping("primary_terms");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData15.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData15.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData15);
        org.elasticsearch.index.Index index21 = indexMetaData15.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = indexMetaData15.getState();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean25 = bulkShardRequest24.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.index.VersionType versionType27 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte28 = versionType27.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest26, (org.elasticsearch.common.io.stream.Writeable) versionType27);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple30 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) state22, bulkItemRequest26);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple31 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) boolean14, bulkItemRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = serializableTuple31.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = serializableTuple31.v2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = bulkItemRequest33.index();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        long long7 = bulkShardRequest5.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = bulkShardRequest11.consistencyLevel();
        bulkShardRequest11.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        long long25 = bulkShardRequest21.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest21.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple28 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel9, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.support.IndicesOptions indicesOptions30 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(32, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = bulkShardRequest11.toString();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.blocks.read");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest13.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        long long22 = bulkShardRequest20.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest20.index("index.number_of_shards");
        java.lang.String str26 = bulkShardRequest25.index();
        bulkShardRequest25.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str31 = bulkShardRequest30.index();
        boolean boolean32 = bulkShardRequest30.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean35 = bulkShardRequest34.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest30.consistencyLevel(writeConsistencyLevel38);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel38);
        org.elasticsearch.tasks.TaskId taskId41 = bulkShardRequest40.getParentTask();
        bulkShardRequest13.setParentTask(taskId41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task43 = bulkShardRequest2.createTask(53L, "current version [32] is different than the one provided [1]", "current version [10] is different than the one provided [32]", taskId41);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) '#', 1L);
        byte byte5 = versionType0.getValue();
        long long8 = versionType0.updateVersion(0L, (long) 52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str12 = versionType0.explainConflictForWrites((long) (byte) 0, 0L, true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkItemRequest3.index();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = bulkShardRequest0.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.toString();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = bulkShardRequest1.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        long long5 = bulkShardRequest1.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest1.indices();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        long long10 = bulkShardRequest8.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest8.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = bulkShardRequest17.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest17.getParentTask();
        bulkShardRequest8.setParentTask(taskId23);
        bulkShardRequest3.setParentTask(taskId23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean32 = bulkShardRequest31.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean37 = bulkShardRequest36.getShouldPersistResult();
        long long38 = bulkShardRequest36.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest36.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean43 = bulkShardRequest42.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = bulkShardRequest42.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = bulkShardRequest42.consistencyLevel();
        bulkShardRequest42.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest53 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest52);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest54 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest52);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest55 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest52);
        long long56 = bulkShardRequest52.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = bulkShardRequest52.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = bulkShardRequest42.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple59 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel40, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = bulkShardRequest31.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.tasks.TaskId taskId61 = bulkShardRequest31.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest64 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest65 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest64);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest66 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest64);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException67 = bulkShardRequest64.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel68 = bulkShardRequest64.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId69 = bulkShardRequest64.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.tasks.TaskId> taskIdTuple70 = org.elasticsearch.common.collect.Tuple.tuple(taskId61, taskId69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task71 = bulkShardRequest3.createTask(53L, "current version [3] is higher or equal to the one provided [1]", "index.version.created", taskId69);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.setParentTask("current version [-1] is higher or equal to the one provided [-1]", (long) 100);
        bulkShardRequest4.primaryTerm(100L);
        org.elasticsearch.common.unit.TimeValue timeValue17 = bulkShardRequest4.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray18 = bulkShardRequest4.indices();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        java.lang.String str7 = bulkShardRequest6.index();
        bulkShardRequest6.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str12 = bulkShardRequest11.index();
        boolean boolean13 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.tasks.TaskId taskId22 = bulkShardRequest21.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = bulkShardRequest21.toString();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean4 = versionType0.isVersionConflictForReads((long) '#', 1L);
        byte byte5 = versionType0.getValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (byte) 0, 100L, false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData7.requireFilters();
        org.elasticsearch.Version version9 = indexMetaData7.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple16 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap17 = indexMetaData7.getActiveAllocationIds();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        long long25 = bulkShardRequest21.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest21.consistencyLevel();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> strSetImmutableOpenIntMapTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(strSetImmutableOpenIntMap17, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest21.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.transport.TransportRequest> indexMetaDataDiffableTuple29 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (org.elasticsearch.transport.TransportRequest) bulkShardRequest21);
        org.elasticsearch.common.unit.TimeValue timeValue30 = bulkShardRequest21.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = bulkShardRequest21.toString();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest0.consistencyLevel(writeConsistencyLevel8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = bulkShardRequest0.indices();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest5.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.common.unit.TimeValue timeValue18 = bulkShardRequest17.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bulkShardRequest17.getDescription();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = bulkShardRequest1.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest1.consistencyLevel();
        bulkShardRequest1.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        long long15 = bulkShardRequest11.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData18.requireFilters();
        org.elasticsearch.Version version20 = indexMetaData18.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean24 = bulkShardRequest23.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple27 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData18, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap28 = indexMetaData18.getActiveAllocationIds();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.cluster.metadata.IndexMetaData> bulkShardRequestActionRequestTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.cluster.metadata.IndexMetaData>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17, indexMetaData18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = bulkShardRequest17.getDescription();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        bulkShardRequest2.setParentTask("current version [97] is different than the one provided [100]", (long) 1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest14.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest18.index("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest24.validate();
        org.elasticsearch.common.unit.TimeValue timeValue28 = bulkShardRequest24.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest18.timeout(timeValue28);
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest18.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task31 = bulkShardRequest2.createTask((long) (byte) 1, "current version [100] is different than the one provided [35]", "current version [97] is different than the one provided [32]", taskId30);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData4.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff8 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData4.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData4.requireFilters();
        int int11 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData4.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData13.requireFilters();
        org.elasticsearch.Version version15 = indexMetaData13.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean19 = bulkShardRequest18.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple22 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData13, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = bulkShardRequest18.remoteAddress();
        boolean boolean24 = indexMetaData4.equals((java.lang.Object) bulkShardRequest18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = bulkShardRequest18.indices();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        boolean boolean7 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        int int9 = bulkItemRequest8.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest8.index();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, "index.version.created_string");
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest1.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = bulkShardRequest1.indices();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest6.timeout(timeValue10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean17 = bulkShardRequest16.getShouldPersistResult();
        long long18 = bulkShardRequest16.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest16.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean26 = bulkShardRequest25.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.support.IndicesOptions indicesOptions30 = bulkShardRequest25.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId31 = bulkShardRequest25.getParentTask();
        bulkShardRequest16.setParentTask(taskId31);
        bulkShardRequest6.setParentTask(taskId31);
        org.elasticsearch.tasks.TaskId taskId34 = bulkShardRequest6.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.seqNo((-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean43 = bulkShardRequest42.getShouldPersistResult();
        long long44 = bulkShardRequest42.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean48 = bulkShardRequest47.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest49 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest47);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = bulkShardRequest47.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel51 = bulkShardRequest47.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest52.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions55 = bulkShardRequest52.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple56 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest47, indicesOptions55);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean59 = bulkShardRequest58.getShouldPersistResult();
        long long60 = bulkShardRequest58.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest61 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest58);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest63 = bulkShardRequest58.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest67 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean68 = bulkShardRequest67.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest69 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest67);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest70 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest67);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest71 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest67);
        org.elasticsearch.action.support.IndicesOptions indicesOptions72 = bulkShardRequest67.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId73 = bulkShardRequest67.getParentTask();
        bulkShardRequest58.setParentTask(taskId73);
        bulkShardRequest47.setParentTask(taskId73);
        bulkShardRequest42.setParentTask(taskId73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task77 = bulkShardRequest6.createTask((long) '4', "index.blocks.write", "current version [32] is higher than the one provided [97]", taskId73);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = bulkShardRequest5.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = bulkShardRequest19.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest19.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel27);
        boolean boolean29 = bulkShardRequest28.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = bulkShardRequest28.toString();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = bulkShardRequest1.remoteAddress();
        boolean boolean6 = bulkShardRequest1.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String> bulkShardRequestActionRequestTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, java.lang.String>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest1, "index.version.created_string");
        bulkShardRequest1.setParentTask("active_allocations", (long) (short) 1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.index("current version [32] is different than the one provided [32]");
        bulkShardRequest1.primaryTerm((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest1.toString();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long4 = bulkShardRequest3.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        int int8 = bulkItemRequest7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest7.index();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        java.lang.String str2 = bulkShardRequest0.index();
        java.lang.String str3 = bulkShardRequest0.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.support.IndicesOptions indicesOptions27 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest22.getParentTask();
        bulkShardRequest13.setParentTask(taskId28);
        bulkShardRequest2.setParentTask(taskId28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.common.unit.TimeValue timeValue38 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest34.timeout(timeValue38);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel40);
        bulkShardRequest41.primaryTerm((long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.elasticsearch.index.shard.ShardId shardId45 = bulkShardRequest41.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = bulkShardRequest41.toString();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        long long8 = bulkShardRequest6.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest6.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.support.IndicesOptions indicesOptions20 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId21 = bulkShardRequest15.getParentTask();
        bulkShardRequest6.setParentTask(taskId21);
        bulkShardRequest1.setParentTask(taskId21);
        org.elasticsearch.tasks.TaskId taskId24 = bulkShardRequest1.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = bulkShardRequest1.indices();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long3 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkItemRequest5.index();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        boolean boolean7 = bulkShardRequest2.getShouldPersistResult();
        boolean boolean8 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkItemRequest9.index();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        bulkShardRequest8.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        long long17 = bulkShardRequest15.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue18 = bulkShardRequest15.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest8.timeout(timeValue18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest19.index("index.number_of_replicas");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray26 = bulkShardRequest21.indices();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        int int10 = bulkItemRequest9.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkItemRequest9.index();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest9.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4, indicesOptions12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkShardRequest4.getDescription();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        java.lang.Class<?> wildcardClass7 = indexMetaData0.getClass();
        org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable>((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.io.Serializable) versionType8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = versionType8.explainConflictForWrites((long) 1, 10L, true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest3.indicesOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = bulkShardRequest3.indices();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        bulkShardRequest2.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        bulkShardRequest11.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.seqNo((long) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = bulkShardRequest2.toString();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest5.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest5.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkShardRequest5.toString();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest6.timeout(timeValue10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple15 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "current version [100] is higher than the one provided [32]", bulkItemRequest14);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = serializableTuple15.v2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bulkItemRequest16.index();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        java.lang.String str2 = bulkShardRequest0.index();
        long long3 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.lang.Comparable<java.lang.String>> transportMessageTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportMessage, java.lang.Comparable<java.lang.String>>((org.elasticsearch.transport.TransportMessage) bulkShardRequest0, (java.lang.Comparable<java.lang.String>) "current version [10] is different than the one provided [35]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest0.indices();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        long long13 = bulkShardRequest11.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest4.timeout(timeValue14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = bulkShardRequest17.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest17.consistencyLevel();
        bulkShardRequest17.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        long long31 = bulkShardRequest27.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest27.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest17.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.common.unit.TimeValue timeValue41 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest37.timeout(timeValue41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = bulkShardRequest33.timeout(timeValue41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest4.timeout(timeValue41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = bulkShardRequest44.getDescription();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest2.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest3.indicesOptions();
        bulkShardRequest3.setParentTask("index.shared_filesystem", (long) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest3.toString();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("");
        bulkShardRequest6.setParentTask("index.creation_date_string", (-1L));
        bulkShardRequest6.primaryTerm((long) (byte) 0);
        org.elasticsearch.common.unit.TimeValue timeValue12 = bulkShardRequest6.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest6.getDescription();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData2 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData2.requireFilters();
        org.elasticsearch.Version version4 = indexMetaData2.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple11 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData2, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        bulkShardRequest17.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean25 = bulkShardRequest24.getShouldPersistResult();
        long long26 = bulkShardRequest24.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue27 = bulkShardRequest24.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest17.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest7.timeout(timeValue27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray31 = bulkShardRequest7.indices();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean10 = bulkShardRequest9.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest9.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest9.consistencyLevel();
        bulkShardRequest9.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        long long23 = bulkShardRequest19.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple26 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel7, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.support.IndicesOptions indicesOptions28 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId30 = bulkShardRequest9.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = bulkItemRequest31.index();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest9.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4, indicesOptions12);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest21.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = bulkShardRequest21.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = bulkShardRequest21.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean33 = bulkShardRequest32.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest32);
        org.elasticsearch.index.VersionType versionType35 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte36 = versionType35.getValue();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable> streamableTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest34, (org.elasticsearch.common.io.stream.Writeable) versionType35);
        boolean boolean41 = versionType35.isVersionConflictForWrites(0L, 1L, false);
        byte byte42 = versionType35.getValue();
        org.elasticsearch.index.VersionType versionType43 = versionType35.versionTypeForReplicationAndRecovery();
        java.lang.String str46 = versionType35.explainConflictForReads(100L, (long) '#');
        boolean boolean50 = versionType35.isVersionConflictForWrites((long) 97, (long) 32, true);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType> bulkShardRequestTuple51 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, org.elasticsearch.index.VersionType>(bulkShardRequest28, versionType35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = bulkShardRequest28.toString();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean3 = versionType0.validateVersionForWrites((long) (-1));
        org.elasticsearch.index.VersionType versionType4 = versionType0.versionTypeForReplicationAndRecovery();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str7 = versionType0.explainConflictForReads((long) 100, (-1L));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        long long5 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAllAliases();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        long long4 = versionType0.updateVersion((long) (-1), (long) ' ');
        boolean boolean6 = versionType0.validateVersionForReads(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = versionType0.explainConflictForReads(1L, (long) 3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest8.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3, indicesOptions11);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        long long16 = bulkShardRequest14.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest14.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean24 = bulkShardRequest23.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.support.IndicesOptions indicesOptions28 = bulkShardRequest23.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId29 = bulkShardRequest23.getParentTask();
        bulkShardRequest14.setParentTask(taskId29);
        bulkShardRequest3.setParentTask(taskId29);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.common.unit.TimeValue timeValue39 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest35.timeout(timeValue39);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = bulkShardRequest35.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel41);
        bulkShardRequest42.primaryTerm((long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = bulkShardRequest42.getDescription();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        long long5 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.creationDate((long) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = builder8.mapping("index.number_of_shards");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest5.toString();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("index.creation_date_string");
        long long8 = bulkShardRequest7.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest7.toString();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest8.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = bulkShardRequest8.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3, indicesOptions11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.unit.TimeValue timeValue17 = bulkShardRequest3.timeout();
        bulkShardRequest3.setParentTask("current version [-1] is higher or equal to the one provided [0]", 0L);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bulkItemRequest21.index();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 3, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest6.indices();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        long long5 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple7 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.creation_date_string", bulkItemRequest6);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.version.upgraded", bulkItemRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest6.index();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest2.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        bulkShardRequest3.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        long long17 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bulkItemRequest21.index();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkShardRequest4.toString();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str2 = bulkShardRequest1.index();
        boolean boolean3 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest1.consistencyLevel(writeConsistencyLevel9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData20 = indexMetaData18.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData18.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters23 = indexMetaData22.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData22);
        org.elasticsearch.common.settings.Settings settings25 = indexMetaData22.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff26 = indexMetaData18.diff(indexMetaData22);
        int int27 = indexMetaData18.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long29 = indexMetaData28.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData31 = indexMetaData28.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version32 = indexMetaData28.getCreationVersion();
        long long33 = indexMetaData28.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap34 = indexMetaData28.getAliases();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff35 = indexMetaData18.diff(indexMetaData28);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.WriteConsistencyLevel, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>> writeConsistencyLevelTuple36 = org.elasticsearch.common.collect.Tuple.tuple(writeConsistencyLevel17, indexMetaDataDiff35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest10.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest37.index("current version [-1] is different than the one provided [0]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray40 = bulkShardRequest39.indices();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest3.getParentTask();
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest3.shardId();
        bulkShardRequest3.primaryTerm((long) 'a');
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = bulkShardRequest18.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest18.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId23 = bulkShardRequest18.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task24 = bulkShardRequest3.createTask((long) (byte) 100, "current version [52] is different than the one provided [52]", "current version [97] is higher or equal to the one provided [-1]", taskId23);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.support.IndicesOptions indicesOptions27 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest22.getParentTask();
        bulkShardRequest13.setParentTask(taskId28);
        bulkShardRequest2.setParentTask(taskId28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.common.unit.TimeValue timeValue38 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest34.timeout(timeValue38);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel40);
        bulkShardRequest41.primaryTerm((long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = bulkShardRequest41.toString();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = bulkShardRequest1.index("index.shared_filesystem");
        org.elasticsearch.tasks.TaskId taskId6 = bulkShardRequest5.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkShardRequest5.toString();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(3, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        bulkShardRequest15.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        boolean boolean24 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest15.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task26 = bulkShardRequest2.createTask(32L, "index.shared_filesystem.recover_on_any_node", "current version [35] is higher or equal to the one provided [-1]", taskId25);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.setParentTask("current version [10] is different than the one provided [35]", (long) 0);
        long long10 = bulkShardRequest3.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = bulkShardRequest3.indices();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest6.index();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest3.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest3.index("indices:data/write/bulk[s]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest10.toString();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        long long3 = bulkShardRequest0.seqNo();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = bulkShardRequest0.validate();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest0.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = bulkShardRequest0.indices();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        bulkShardRequest2.seqNo((long) 0);
        long long9 = bulkShardRequest2.seqNo();
        java.lang.String str10 = bulkShardRequest2.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(32, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bulkItemRequest11.index();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.index("index.number_of_replicas");
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest4.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkShardRequest4.getDescription();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest4.timeout(timeValue8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.setParentTask("current version [-1] is higher or equal to the one provided [-1]", (long) 100);
        bulkShardRequest4.primaryTerm(100L);
        org.elasticsearch.common.unit.TimeValue timeValue17 = bulkShardRequest4.timeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest4.toString();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest2.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest6.index("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest9.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest9.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = bulkShardRequest9.indices();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.action.IndicesRequest> versionTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.action.IndicesRequest>(version4, (org.elasticsearch.action.IndicesRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest7.toString();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest5.timeout(timeValue9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest5.getDescription();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest11.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = bulkShardRequest11.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6, indicesOptions14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        long long19 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest26.getParentTask();
        bulkShardRequest17.setParentTask(taskId32);
        bulkShardRequest6.setParentTask(taskId32);
        bulkShardRequest1.setParentTask(taskId32);
        boolean boolean36 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException37 = bulkShardRequest1.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = bulkShardRequest1.toString();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest5.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId11 = bulkShardRequest5.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bulkItemRequest13.index();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.common.unit.TimeValue timeValue10 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        long long12 = bulkShardRequest4.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkShardRequest4.getDescription();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest4.toString();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        byte byte1 = versionType0.getValue();
        boolean boolean5 = versionType0.isVersionConflictForWrites((long) 0, (long) 52, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = versionType0.explainConflictForReads((long) (short) 100, (long) (byte) 10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple14 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType6, bulkItemRequest13);
        boolean boolean18 = versionType6.isVersionConflictForWrites((long) 97, 0L, true);
        boolean boolean21 = versionType6.isVersionConflictForReads((long) 'a', (long) 0);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.index.VersionType> indexMetaDataDiffableTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.index.VersionType>((org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, versionType6);
        boolean boolean24 = versionType6.validateVersionForReads((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str27 = versionType6.explainConflictForReads((long) ' ', (long) (byte) -1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        boolean boolean8 = bulkShardRequest3.getShouldPersistResult();
        boolean boolean9 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.setParentTask("current version [100] is different than the one provided [100]", (-1L));
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long1 = bulkShardRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId2 = bulkShardRequest0.shardId();
        long long3 = bulkShardRequest0.seqNo();
        boolean boolean4 = bulkShardRequest0.getShouldPersistResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        bulkShardRequest4.seqNo(0L);
        bulkShardRequest4.primaryTerm((long) (-1));
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest4.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkItemRequest14.index();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest7);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 97, 0L, true);
        boolean boolean14 = versionType0.validateVersionForWrites((long) 1);
        boolean boolean17 = versionType0.isVersionConflictForReads((long) (short) -1, (long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str21 = versionType0.explainConflictForWrites((long) (short) -1, (long) 'a', false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest4.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = bulkShardRequest4.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest4.index("current version [-1] is different than the one provided [32]");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bulkShardRequest14.toString();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest13.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean23 = bulkShardRequest22.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest22);
        org.elasticsearch.action.support.IndicesOptions indicesOptions27 = bulkShardRequest22.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId28 = bulkShardRequest22.getParentTask();
        bulkShardRequest13.setParentTask(taskId28);
        bulkShardRequest2.setParentTask(taskId28);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.common.unit.TimeValue timeValue38 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest34.timeout(timeValue38);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel40);
        bulkShardRequest41.primaryTerm((long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean48 = bulkShardRequest47.getShouldPersistResult();
        long long49 = bulkShardRequest47.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest47);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest47.index("index.number_of_shards");
        org.elasticsearch.common.unit.TimeValue timeValue53 = bulkShardRequest47.timeout();
        org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.common.unit.TimeValue> charSequenceTuple54 = new org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.common.unit.TimeValue>((java.lang.CharSequence) "index.shadow_replicas", timeValue53);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = bulkShardRequest41.timeout(timeValue53);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest63 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest64 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest65 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest66 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest67 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest63);
        org.elasticsearch.action.ActionRequest actionRequest68 = bulkItemRequest67.request();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest72 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean73 = bulkShardRequest72.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest74 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest72);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest76 = bulkShardRequest72.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest77 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest76);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel78 = bulkShardRequest76.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest79 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest76);
        org.elasticsearch.tasks.TaskId taskId80 = bulkShardRequest76.getParentTask();
        actionRequest68.setParentTask(taskId80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task82 = bulkShardRequest41.createTask((long) 32, "current version [100] is different than the one provided [-1]", "hi!", taskId80);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bulkItemRequest6.index();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel11);
        bulkShardRequest12.setParentTask("primary_terms", (long) 52);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        long long21 = bulkShardRequest19.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        long long24 = bulkShardRequest19.seqNo();
        java.lang.String str25 = bulkShardRequest19.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.tasks.TaskId taskId27 = bulkShardRequest19.getParentTask();
        bulkShardRequest12.setParentTask(taskId27);
        long long29 = bulkShardRequest12.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = bulkShardRequest12.getDescription();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId17 = bulkShardRequest2.shardId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long4 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        boolean boolean5 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean8 = bulkShardRequest7.getShouldPersistResult();
        long long9 = bulkShardRequest7.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = bulkShardRequest7.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        bulkShardRequest16.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest16.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = bulkShardRequest7.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest2.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = bulkShardRequest2.toString();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = bulkShardRequest2.indicesOptions();
        boolean boolean6 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(97, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = bulkShardRequest2.indices();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.numberOfReplicas(1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.removeAlias("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.removeAlias("current version [0] is higher or equal to the one provided [97]");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData12.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData12);
        org.elasticsearch.common.settings.Settings settings15 = indexMetaData12.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData12.getInitialRecoveryFilters();
        int int17 = indexMetaData12.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state18 = indexMetaData12.getState();
        byte byte19 = state18.id();
        byte byte20 = state18.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder11.state(state18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean26 = bulkShardRequest25.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest30.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = bulkShardRequest30.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25, indicesOptions33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        bulkShardRequest25.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = bulkShardRequest25.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest43 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest42.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress47 = bulkShardRequest42.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel48 = bulkShardRequest42.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel48);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest49);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple51 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) state18, bulkItemRequest50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = bulkItemRequest50.index();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = bulkShardRequest1.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        bulkShardRequest1.seqNo(1L);
        bulkShardRequest1.setParentTask("current version [10] is different than the one provided [-1]", (long) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest1.toString();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest3.consistencyLevel();
        bulkShardRequest3.seqNo((long) 0);
        long long10 = bulkShardRequest3.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue16 = bulkShardRequest13.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.common.unit.TimeValue timeValue24 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest20.timeout(timeValue24);
        org.elasticsearch.common.unit.TimeValue timeValue26 = bulkShardRequest25.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest13.timeout(timeValue26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = bulkShardRequest3.timeout(timeValue26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean31 = bulkShardRequest30.getShouldPersistResult();
        long long32 = bulkShardRequest30.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest30);
        org.elasticsearch.common.unit.TimeValue timeValue34 = bulkShardRequest30.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest28.timeout(timeValue34);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = bulkShardRequest35.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = bulkShardRequest35.toString();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest1.indicesOptions();
        boolean boolean5 = bulkShardRequest1.getShouldPersistResult();
        java.lang.String str6 = bulkShardRequest1.index();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest1.validate();
        long long8 = bulkShardRequest1.seqNo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest1.getDescription();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.toString();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        bulkShardRequest2.seqNo((long) 0);
        long long9 = bulkShardRequest2.seqNo();
        java.lang.String str10 = bulkShardRequest2.index();
        long long11 = bulkShardRequest2.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(32, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bulkItemRequest12.index();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet5 = indexMetaData0.activeAllocationIds((int) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("active_allocations");
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        long long17 = bulkShardRequest13.seqNo();
        boolean boolean18 = indexMetaData0.equals((java.lang.Object) bulkShardRequest13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray19 = bulkShardRequest13.indices();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest3.getDescription();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        boolean boolean7 = bulkShardRequest2.getShouldPersistResult();
        boolean boolean8 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("current version [100] is different than the one provided [100]", (-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        long long22 = bulkShardRequest20.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = bulkShardRequest20.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = bulkShardRequest26.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = bulkShardRequest26.consistencyLevel();
        bulkShardRequest26.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        long long40 = bulkShardRequest36.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = bulkShardRequest36.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest26.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple43 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel24, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest15.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.tasks.TaskId taskId45 = bulkShardRequest15.getParentTask();
        bulkShardRequest2.setParentTask(taskId45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray47 = bulkShardRequest2.indices();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest3.index("");
        bulkShardRequest7.setParentTask("index.creation_date_string", (-1L));
        bulkShardRequest7.primaryTerm((long) (byte) 0);
        long long13 = bulkShardRequest7.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bulkShardRequest7.toString();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        long long2 = bulkShardRequest0.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue3 = bulkShardRequest0.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.unit.TimeValue timeValue11 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest7.timeout(timeValue11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest0.timeout(timeValue13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray16 = bulkShardRequest0.indices();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest5.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean14 = bulkShardRequest13.getShouldPersistResult();
        long long15 = bulkShardRequest13.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest13.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest19.consistencyLevel();
        bulkShardRequest19.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        long long33 = bulkShardRequest29.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = bulkShardRequest29.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple36 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel17, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray37 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet39 = java.util.EnumSet.noneOf(org.elasticsearch.index.shard.IndexShardState.class);
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet39, indexShardStateArray37);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.WriteConsistencyLevel, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> writeConsistencyLevelTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.WriteConsistencyLevel, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(writeConsistencyLevel17, indexShardStateSet39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest43 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = bulkItemRequest43.index();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        bulkShardRequest6.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = bulkShardRequest6.remoteAddress();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean21 = bulkShardRequest20.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.support.IndicesOptions indicesOptions25 = bulkShardRequest20.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest20.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest20);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest20.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest36.index("");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean45 = bulkShardRequest44.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest44);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest44);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest44);
        org.elasticsearch.action.support.IndicesOptions indicesOptions49 = bulkShardRequest44.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId50 = bulkShardRequest44.getParentTask();
        bulkShardRequest36.setParentTask(taskId50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task52 = bulkShardRequest6.createTask((long) 0, "current version [97] is higher than the one provided [3]", "current version [52] is higher or equal to the one provided [100]", taskId50);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo(0L);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest3.consistencyLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bulkShardRequest3.toString();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = bulkShardRequest3.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest3.getParentTask();
        org.elasticsearch.index.shard.ShardId shardId10 = bulkShardRequest3.shardId();
        bulkShardRequest3.primaryTerm((long) 'a');
        bulkShardRequest3.setParentTask("current version [32] is higher or equal to the one provided [0]", 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray16 = bulkShardRequest3.indices();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("primary_terms");
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean7 = bulkShardRequest6.getShouldPersistResult();
        long long8 = bulkShardRequest6.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest6.index("index.number_of_shards");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        boolean boolean14 = indexMetaData0.equals((java.lang.Object) bulkShardRequest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = bulkShardRequest6.indices();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean4 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean9 = bulkShardRequest8.getShouldPersistResult();
        long long10 = bulkShardRequest8.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = bulkShardRequest14.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest14.consistencyLevel();
        bulkShardRequest14.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        long long28 = bulkShardRequest24.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = bulkShardRequest24.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = bulkShardRequest14.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple31 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest14);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest3.consistencyLevel(writeConsistencyLevel12);
        bulkShardRequest3.seqNo((long) (short) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray36 = bulkShardRequest3.indices();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean2 = bulkShardRequest1.getShouldPersistResult();
        long long3 = bulkShardRequest1.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = bulkShardRequest1.index("index.number_of_shards");
        java.lang.String str7 = bulkShardRequest6.index();
        bulkShardRequest6.primaryTerm((long) (byte) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest6.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str12 = bulkShardRequest11.index();
        boolean boolean13 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean16 = bulkShardRequest15.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest15.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest6.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = bulkShardRequest21.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray23 = bulkShardRequest21.indices();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str1 = bulkShardRequest0.index();
        boolean boolean2 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = bulkShardRequest4.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest9.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = bulkShardRequest9.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4, indicesOptions12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestReplicationRequestTuple14 = org.elasticsearch.common.collect.Tuple.tuple((org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest0, indicesOptions12);
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = bulkShardRequest0.indicesOptions();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean18 = bulkShardRequest17.getShouldPersistResult();
        long long19 = bulkShardRequest17.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest17.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = bulkShardRequest26.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId32 = bulkShardRequest26.getParentTask();
        bulkShardRequest17.setParentTask(taskId32);
        bulkShardRequest0.setParentTask(taskId32);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException35 = bulkShardRequest0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL;
        java.lang.String str3 = versionType0.explainConflictForReads((long) (-1), (long) '#');
        java.lang.String str7 = versionType0.explainConflictForWrites((long) (byte) 0, (long) (byte) 0, true);
        byte byte8 = versionType0.getValue();
        boolean boolean11 = versionType0.isVersionConflictForReads((long) 32, 10L);
        org.elasticsearch.index.VersionType versionType12 = org.elasticsearch.index.VersionType.EXTERNAL;
        byte byte13 = versionType12.getValue();
        boolean boolean15 = versionType12.validateVersionForReads((long) (short) -1);
        boolean boolean17 = versionType12.validateVersionForReads((long) (short) 1);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean20 = bulkShardRequest19.getShouldPersistResult();
        long long21 = bulkShardRequest19.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = bulkShardRequest19.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean26 = bulkShardRequest25.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = bulkShardRequest25.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = bulkShardRequest25.consistencyLevel();
        bulkShardRequest25.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        long long39 = bulkShardRequest35.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest35.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple42 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel23, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray43 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet45 = java.util.EnumSet.noneOf(org.elasticsearch.index.shard.IndexShardState.class);
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet45, indexShardStateArray43);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.WriteConsistencyLevel, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>> writeConsistencyLevelTuple47 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.WriteConsistencyLevel, java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState>>(writeConsistencyLevel23, indexShardStateSet45);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean54 = bulkShardRequest53.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest55 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest53);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest56 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest53);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest57 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest53);
        org.elasticsearch.action.support.IndicesOptions indicesOptions58 = bulkShardRequest53.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId59 = bulkShardRequest53.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest60 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest53);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple61 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) "index.version.created_string", bulkItemRequest60);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple62 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) indexShardStateSet45, bulkItemRequest60);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple63 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) boolean17, bulkItemRequest60);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple64 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) boolean11, bulkItemRequest60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = bulkItemRequest60.index();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        long long4 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        bulkShardRequest11.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest2.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters25 = indexMetaData24.requireFilters();
        org.elasticsearch.Version version26 = indexMetaData24.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean30 = bulkShardRequest29.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple33 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) indexMetaData24, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest29);
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = bulkShardRequest29.remoteAddress();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean37 = bulkShardRequest36.getShouldPersistResult();
        long long38 = bulkShardRequest36.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean42 = bulkShardRequest41.getShouldPersistResult();
        long long43 = bulkShardRequest41.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest44 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest41);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest41.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean51 = bulkShardRequest50.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest52 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest50);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest53 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest50);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest54 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest50);
        org.elasticsearch.action.support.IndicesOptions indicesOptions55 = bulkShardRequest50.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId56 = bulkShardRequest50.getParentTask();
        bulkShardRequest41.setParentTask(taskId56);
        bulkShardRequest36.setParentTask(taskId56);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData59 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData61 = indexMetaData59.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap62 = indexMetaData59.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData59);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap64 = indexMetaData59.getActiveAllocationIds();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.cluster.metadata.IndexMetaData> taskIdTuple65 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.cluster.metadata.IndexMetaData>(taskId56, indexMetaData59);
        bulkShardRequest29.setParentTask(taskId56);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest69 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest70 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest69);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest71 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest69);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest73 = bulkShardRequest69.index("index.blocks.read");
        org.elasticsearch.common.transport.TransportAddress transportAddress74 = bulkShardRequest73.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId75 = bulkShardRequest73.getParentTask();
        bulkShardRequest29.setParentTask(taskId75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task77 = bulkShardRequest19.createTask((long) 1, "current version [97] is higher or equal to the one provided [2]", "current version [-1] is higher or equal to the one provided [-1]", taskId75);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest0 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean1 = bulkShardRequest0.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = bulkShardRequest0.remoteAddress();
        bulkShardRequest0.primaryTerm((long) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = bulkShardRequest0.getDescription();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings3 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap6 = indexMetaData0.getActiveAllocationIds();
        java.lang.Class<?> wildcardClass7 = indexMetaData0.getClass();
        org.elasticsearch.index.VersionType versionType8 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationTuple9 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.GenericDeclaration, java.io.Serializable>((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.io.Serializable) versionType8);
        boolean boolean13 = versionType8.isVersionConflictForWrites((long) (byte) -1, (long) (byte) 10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType8.explainConflictForReads(0L, 52L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean3 = bulkShardRequest2.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest7.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = bulkShardRequest7.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2, indicesOptions10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        bulkShardRequest2.setParentTask("index.shared_filesystem.recover_on_any_node", (long) '#');
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId17 = bulkShardRequest2.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue18 = bulkShardRequest2.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean25 = bulkShardRequest24.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean30 = bulkShardRequest29.getShouldPersistResult();
        long long31 = bulkShardRequest29.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest29);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = bulkShardRequest29.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean36 = bulkShardRequest35.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = bulkShardRequest35.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = bulkShardRequest35.consistencyLevel();
        bulkShardRequest35.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest46 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest47 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest45);
        long long49 = bulkShardRequest45.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = bulkShardRequest45.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple52 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel33, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest35);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = bulkShardRequest24.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.tasks.TaskId taskId54 = bulkShardRequest24.getParentTask();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest58 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest59 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException60 = bulkShardRequest57.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = bulkShardRequest57.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId62 = bulkShardRequest57.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.tasks.TaskId> taskIdTuple63 = org.elasticsearch.common.collect.Tuple.tuple(taskId54, taskId62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task64 = bulkShardRequest2.createTask(0L, "current version [0] is higher or equal to the one provided [2]", "current version [35] is different than the one provided [32]", taskId62);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = bulkShardRequest3.validate();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest3.timeout();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkItemRequest8.index();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean5 = bulkShardRequest4.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = bulkShardRequest4.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId10 = bulkShardRequest4.getParentTask();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest4.index("index.version.created");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean15 = bulkShardRequest14.getShouldPersistResult();
        long long16 = bulkShardRequest14.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue17 = bulkShardRequest14.timeout();
        bulkShardRequest14.setParentTask("index.shared_filesystem.recover_on_any_node", (long) 1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = bulkShardRequest14.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = bulkShardRequest13.consistencyLevel(writeConsistencyLevel21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = bulkShardRequest13.toString();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple8 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType0, bulkItemRequest7);
        boolean boolean12 = versionType0.isVersionConflictForWrites((long) 97, 0L, true);
        boolean boolean15 = versionType0.isVersionConflictForReads((long) 'a', (long) 0);
        long long18 = versionType0.updateVersion((long) 100, 2L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str22 = versionType0.explainConflictForWrites((long) ' ', (long) (short) -1, false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest2.validate();
        org.elasticsearch.common.unit.TimeValue timeValue6 = bulkShardRequest2.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = bulkShardRequest2.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest2.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bulkShardRequest2.toString();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        bulkShardRequest3.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean11 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest10.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest15.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = bulkShardRequest15.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10, indicesOptions18);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions> transportRequestTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.transport.TransportRequest) bulkShardRequest3, indicesOptions18);
        org.elasticsearch.index.shard.ShardId shardId21 = bulkShardRequest3.shardId();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest3.index("current version [0] is higher or equal to the one provided [100]");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean27 = bulkShardRequest26.getShouldPersistResult();
        bulkShardRequest26.setParentTask("index.number_of_replicas", (long) (byte) -1);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        bulkShardRequest26.setParentTask("hi!", (long) (short) 10);
        java.lang.String str35 = bulkShardRequest26.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest26);
        org.elasticsearch.tasks.TaskId taskId37 = bulkShardRequest26.getParentTask();
        bulkShardRequest3.setParentTask(taskId37);
        boolean boolean39 = bulkShardRequest3.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId40 = bulkShardRequest3.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray41 = bulkShardRequest3.indices();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest4 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        int int7 = bulkItemRequest6.id();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData8.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData8);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap12 = indexMetaData8.getMappings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData8.mapping("current version [-1] is different than the one provided [32]");
        org.elasticsearch.Version version15 = indexMetaData8.getUpgradedVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData8.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData8.excludeFilters();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>> streamableTuple18 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>>((org.elasticsearch.common.io.stream.Streamable) bulkItemRequest6, (org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData8);
        int int19 = indexMetaData8.getNumberOfReplicas();
        long long20 = indexMetaData8.getCreationDate();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest24);
        bulkShardRequest24.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean32 = bulkShardRequest31.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest33 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = bulkShardRequest31.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest31.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        bulkShardRequest36.primaryTerm((long) 0);
        org.elasticsearch.action.support.IndicesOptions indicesOptions39 = bulkShardRequest36.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions> bulkShardRequestActionRequestTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31, indicesOptions39);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions> transportRequestTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.transport.TransportRequest, org.elasticsearch.action.support.IndicesOptions>((org.elasticsearch.transport.TransportRequest) bulkShardRequest24, indicesOptions39);
        long long42 = bulkShardRequest24.seqNo();
        boolean boolean43 = indexMetaData8.equals((java.lang.Object) bulkShardRequest24);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest51 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest52 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest51);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest53 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest51);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest54 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest51);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest55 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest51);
        org.elasticsearch.action.ActionRequest actionRequest56 = bulkItemRequest55.request();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean61 = bulkShardRequest60.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest62 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest60);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest64 = bulkShardRequest60.index("index.shared_filesystem");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest65 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest64);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel66 = bulkShardRequest64.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest67 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest64);
        org.elasticsearch.tasks.TaskId taskId68 = bulkShardRequest64.getParentTask();
        actionRequest56.setParentTask(taskId68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.tasks.Task task70 = bulkShardRequest24.createTask((long) (byte) 0, "current version [32] is different than the one provided [100]", "current version [1] is different than the one provided [100]", taskId68);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mappingOrDefault("index.number_of_shards");
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.action.IndicesRequest> versionTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.Version, org.elasticsearch.action.IndicesRequest>(version4, (org.elasticsearch.action.IndicesRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        long long13 = bulkShardRequest11.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue14 = bulkShardRequest11.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.common.unit.TimeValue timeValue22 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest18.timeout(timeValue22);
        org.elasticsearch.common.unit.TimeValue timeValue24 = bulkShardRequest23.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest11.timeout(timeValue24);
        org.elasticsearch.tasks.TaskId taskId26 = bulkShardRequest11.getParentTask();
        bulkShardRequest7.setParentTask(taskId26);
        java.lang.String str28 = bulkShardRequest7.index();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = bulkShardRequest7.getDescription();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.String str3 = bulkShardRequest2.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        long long6 = bulkShardRequest2.seqNo();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = bulkShardRequest2.indicesOptions();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2);
        org.elasticsearch.tasks.TaskId taskId9 = bulkShardRequest2.getParentTask();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bulkShardRequest2.getDescription();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.VersionType versionType6 = org.elasticsearch.index.VersionType.FORCE;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest> serializableTuple14 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, org.elasticsearch.action.bulk.BulkItemRequest>((java.io.Serializable) versionType6, bulkItemRequest13);
        boolean boolean18 = versionType6.isVersionConflictForWrites((long) 97, 0L, true);
        boolean boolean21 = versionType6.isVersionConflictForReads((long) 'a', (long) 0);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.index.VersionType> indexMetaDataDiffableTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.index.VersionType>((org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, versionType6);
        long long25 = versionType6.updateVersion((long) (byte) -1, 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str29 = versionType6.explainConflictForWrites((long) '4', (long) 3, true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromValue((byte) 3);
        boolean boolean5 = versionType1.isVersionConflictForWrites((long) (byte) 3, (long) ' ', false);
        boolean boolean9 = versionType1.isVersionConflictForWrites((long) (-1), 32L, true);
        org.elasticsearch.index.VersionType versionType10 = versionType1.versionTypeForReplicationAndRecovery();
        boolean boolean13 = versionType1.isVersionConflictForReads((long) 3, 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = versionType1.explainConflictForReads(0L, 100L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean6 = bulkShardRequest5.getShouldPersistResult();
        long long7 = bulkShardRequest5.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest5.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = bulkShardRequest11.consistencyLevel();
        bulkShardRequest11.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest22 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest23 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest21);
        long long25 = bulkShardRequest21.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = bulkShardRequest21.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest11.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple28 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel9, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = bulkItemRequest32.index();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest6 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest7 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest8 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        bulkShardRequest5.seqNo((long) (byte) 0);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean13 = bulkShardRequest12.getShouldPersistResult();
        long long14 = bulkShardRequest12.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue15 = bulkShardRequest12.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest5.timeout(timeValue15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest16.index("index.number_of_replicas");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = bulkShardRequest18.remoteAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bulkShardRequest18.getDescription();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        long long2 = bulkShardRequest1.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.elasticsearch.index.shard.ShardId shardId4 = bulkShardRequest1.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue5 = bulkShardRequest1.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = bulkShardRequest1.index("current version [10] is different than the one provided [100]");
        java.lang.String str8 = bulkShardRequest1.index();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData9.mapping("primary_terms");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap12 = indexMetaData9.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData13.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData13);
        org.elasticsearch.common.settings.Settings settings16 = indexMetaData13.getSettings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff17 = indexMetaData9.diff(indexMetaData13);
        boolean boolean19 = indexMetaData13.isSameUUID("index.shared_filesystem.recover_on_any_node");
        long long20 = indexMetaData13.getVersion();
        long long21 = indexMetaData13.getVersion();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean24 = bulkShardRequest23.getShouldPersistResult();
        long long25 = bulkShardRequest23.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = bulkShardRequest23.remoteAddress();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = bulkShardRequest23.validate();
        boolean boolean29 = indexMetaData13.equals((java.lang.Object) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean32 = bulkShardRequest31.getShouldPersistResult();
        long long33 = bulkShardRequest31.seqNo();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = bulkShardRequest31.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        boolean boolean38 = bulkShardRequest37.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest37);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = bulkShardRequest37.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = bulkShardRequest37.consistencyLevel();
        bulkShardRequest37.primaryTerm((long) (short) 100);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest48 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 100, (org.elasticsearch.action.ActionRequest) bulkShardRequest47);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest49 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest47);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest50 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest47);
        long long51 = bulkShardRequest47.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel52 = bulkShardRequest47.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest53 = bulkShardRequest37.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> writeConsistencyLevelEnumTuple54 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Enum<org.elasticsearch.action.WriteConsistencyLevel>) writeConsistencyLevel35, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest37);
        org.elasticsearch.common.unit.TimeValue timeValue55 = bulkShardRequest37.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = bulkShardRequest23.timeout(timeValue55);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = bulkShardRequest1.timeout(timeValue55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray58 = bulkShardRequest57.indices();
    }
}

