import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        java.lang.String str6 = deleteRequest0.parent();
        long long7 = deleteRequest0.version();
        long long8 = deleteRequest0.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        java.lang.String str9 = shardFailure7.reason;
        java.lang.String str10 = shardFailure7.indexUUID;
        java.lang.Throwable throwable11 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][]}][null][null]}", throwable11, "delete {[delete {[null][][null]}][delete {[null][null][]}][hi!]}");
        java.lang.String str14 = shardFailure13.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting15 = shardFailure13.routing;
        java.lang.String str16 = shardFailure13.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[delete {[null][null][]}][null][null]}" + "'", str14, "delete {[delete {[null][null][]}][null][null]}");
        org.junit.Assert.assertNull(shardRouting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[delete {[null][null][]}][null][null]}" + "'", str16, "delete {[delete {[null][null][]}][null][null]}");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest5.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.id("");
        long long13 = deleteRequest5.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.id("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest16.indicesOptions();
        java.lang.String str18 = deleteRequest16.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest19.setParentTask("hi!", 10L);
        java.lang.String[] strArray23 = deleteRequest19.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest19.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.setShardId(shardId26);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest5.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId33 = deleteRequest32.shardId();
        long long34 = deleteRequest32.seqNo();
        org.elasticsearch.index.shard.ShardId shardId35 = deleteRequest32.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest36.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId39 = deleteRequest38.shardId();
        deleteRequest38.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest38.routing("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String str45 = deleteRequest44.parent();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = deleteRequest44.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest32.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest29.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest48.refresh(true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(shardId33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNull(shardId39);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel46 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel46.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest50);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(true);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId17);
        java.lang.String str19 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        java.lang.String str24 = deleteRequest20.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest20.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest3.timeout(timeValue27);
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = deleteRequest28.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.consistencyLevel(writeConsistencyLevel41);
        deleteRequest42.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest42.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest51.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest53.refresh(true);
        java.lang.String[] strArray56 = deleteRequest53.indices();
        java.lang.String str57 = deleteRequest53.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest62.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest64.refresh(true);
        org.elasticsearch.tasks.TaskId taskId67 = deleteRequest64.getParentTask();
        org.elasticsearch.tasks.Task task68 = deleteRequest53.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId67);
        org.elasticsearch.tasks.Task task69 = deleteRequest42.createTask(100L, "", "delete {[null][null][null]}", taskId67);
        org.elasticsearch.tasks.Task task70 = deleteRequest34.createTask(10L, "", "delete {[null][null][hi!]}", taskId67);
        deleteRequest28.setParentTask(taskId67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = deleteRequest28.refresh(false);
        java.lang.String str74 = deleteRequest28.id();
        java.lang.String str75 = deleteRequest28.type();
        long long76 = deleteRequest28.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue77 = deleteRequest28.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel78 = deleteRequest28.consistencyLevel();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "delete {[][null][null]}" + "'", str57, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(taskId67);
        org.junit.Assert.assertNotNull(task68);
        org.junit.Assert.assertNotNull(task69);
        org.junit.Assert.assertNotNull(task70);
        org.junit.Assert.assertNotNull(deleteRequest73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(timeValue77);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel78 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel78.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        boolean boolean20 = deleteRequest19.getShouldPersistResult();
        java.lang.String str21 = deleteRequest19.getDescription();
        deleteRequest19.primaryTerm((-3L));
        org.elasticsearch.common.unit.TimeValue timeValue24 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest19.timeout(timeValue24);
        java.lang.String[] strArray26 = deleteRequest19.indices();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[null][null][null]}" + "'", str21, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        java.lang.String[] strArray3 = deleteRequest0.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        long long11 = deleteRequest8.seqNo();
        java.lang.String str12 = deleteRequest8.toString();
        java.lang.String str13 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.id("");
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions21 = deleteRequest20.indicesOptions();
        java.lang.String str22 = deleteRequest20.id();
        long long23 = deleteRequest20.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest20.setShardId(shardId24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId33 = null;
        org.elasticsearch.tasks.Task task34 = deleteRequest29.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest29.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.refresh(true);
        org.elasticsearch.tasks.TaskId taskId43 = deleteRequest40.getParentTask();
        deleteRequest29.setParentTask(taskId43);
        deleteRequest25.setParentTask(taskId43);
        org.elasticsearch.tasks.Task task46 = deleteRequest15.createTask((long) 'a', "hi!", "", taskId43);
        org.elasticsearch.tasks.TaskId taskId47 = deleteRequest15.getParentTask();
        org.elasticsearch.tasks.Task task48 = deleteRequest0.createTask((long) 0, "delete {[hi!][null][delete {[null][hi!][null]}]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][null][null]}]}][null]}", taskId47);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[null][null][null]}" + "'", str12, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[null][null][]}" + "'", str16, "delete {[null][null][]}");
        org.junit.Assert.assertNotNull(indicesOptions21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(task34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertNotNull(task46);
        org.junit.Assert.assertNotNull(taskId47);
        org.junit.Assert.assertNotNull(task48);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest10.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.consistencyLevel(writeConsistencyLevel12);
        java.lang.String str14 = deleteRequest13.routing();
        org.elasticsearch.index.VersionType versionType15 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.versionType(versionType15);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest18.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = deleteRequest20.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId29 = deleteRequest28.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest28.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.support.IndicesOptions indicesOptions32 = deleteRequest28.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException34 = deleteRequest33.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest33.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue37 = deleteRequest36.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest36.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest40.setParentTask("hi!", 10L);
        java.lang.String[] strArray44 = deleteRequest40.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest45.setParentTask("hi!", 10L);
        java.lang.String[] strArray49 = deleteRequest45.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = deleteRequest45.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest40.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest39.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest28.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest18.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest16.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest16.routing("delete {[null][][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest57.version((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][][]}", deleteRequest59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNull(shardId29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(indicesOptions32);
        org.junit.Assert.assertNotNull(actionRequestValidationException34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel50 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel50.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertNotNull(deleteRequest59);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        java.lang.String str13 = deleteRequest12.getDescription();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest12.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest15.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.refresh(false);
        org.elasticsearch.index.VersionType versionType22 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.versionType(versionType22);
        deleteRequest23.seqNo((long) (byte) -1);
        boolean boolean26 = deleteRequest23.getShouldPersistResult();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest12.consistencyLevel(writeConsistencyLevel27);
        boolean boolean29 = deleteRequest12.refresh();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][][]}" + "'", str13, "delete {[][][]}");
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel27 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel27.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest7.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        deleteRequest17.remoteAddress(transportAddress20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        java.lang.String[] strArray26 = deleteRequest22.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest17.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest3.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest3.version((long) 10);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest3.setShardId(shardId32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest3.type("delete {[][][delete {[][][hi!]}]}");
        long long36 = deleteRequest3.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest3.setShardId(shardId37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.index("delete {[delete {[delete {[][null][null]}][hi!][null]}][delete {[][null][null]}][delete {[][][]}]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel27 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel27.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest40);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("");
        boolean boolean8 = deleteRequest7.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.index("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.version((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("delete {[delete {[delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[null][][null]}][null][null]}][null]}][null][null]}");
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest5.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.setShardId(shardId20);
        java.lang.String str22 = deleteRequest19.routing();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest19.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest19.routing("delete {[][][delete {[][null][null]}]}");
        java.lang.String str26 = deleteRequest19.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest19.routing("delete {[delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress29 = deleteRequest19.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNull(transportAddress29);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        deleteRequest1.setParentTask("hi!", (long) (short) -1);
        deleteRequest1.setParentTask("hi!", (long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.version((long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest1.index("delete {[null][][null]}");
        java.lang.String str14 = deleteRequest1.index();
        java.lang.String str15 = deleteRequest1.type();
        boolean boolean16 = deleteRequest1.getShouldPersistResult();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[null][][null]}" + "'", str14, "delete {[null][][null]}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        deleteRequest0.primaryTerm((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest7.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.routing("delete {[delete {[null][null][null]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][null][null]}]}");
        deleteRequest10.seqNo((long) '#');
        java.lang.String str13 = deleteRequest10.routing();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[null][null][null]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][null][null]}]}" + "'", str13, "delete {[delete {[null][null][null]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][null][null]}]}");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        deleteRequest0.setParentTask("delete {[null][null][null]}", 0L);
        long long9 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.type("delete {[delete {[][null][null]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][null][null]}][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest14.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest18.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest14.timeout(timeValue22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.refresh(false);
        org.elasticsearch.tasks.TaskId taskId27 = deleteRequest26.getParentTask();
        deleteRequest14.setParentTask(taskId27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest14.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue31 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest14.type("delete {[null][null][null]}");
        long long34 = deleteRequest14.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = deleteRequest35.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = deleteRequest37.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest37.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue41 = deleteRequest40.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest35.timeout(timeValue41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest35.index("hi!");
        java.lang.String[] strArray45 = deleteRequest35.indices();
        java.lang.String str46 = deleteRequest35.parent();
        org.elasticsearch.common.unit.TimeValue timeValue47 = deleteRequest35.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest14.timeout(timeValue47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest11.timeout(timeValue47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest11.version((long) (byte) 10);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(taskId27);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException36);
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(timeValue41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest51);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.VersionType versionType6 = deleteRequest2.versionType();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        boolean boolean13 = deleteRequest10.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId14 = null;
        deleteRequest10.setParentTask(taskId14);
        java.lang.String str16 = deleteRequest10.parent();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest9.timeout(timeValue21);
        boolean boolean23 = deleteRequest9.refresh();
        java.lang.String str24 = deleteRequest9.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][null][]}", "delete {[][null][null]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        long long5 = deleteRequest3.version();
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.version((long) 'a');
        boolean boolean12 = deleteRequest9.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest9.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.routing("delete {[null][][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = deleteRequest9.remoteAddress();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(transportAddress17);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        deleteRequest1.remoteAddress(transportAddress2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.String str11 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest1.createTask((long) (byte) 100, "delete {[null][hi!][null]}", "delete {[][][]}", taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.timeout(timeValue27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.timeout(timeValue27);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.setShardId(shardId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = deleteRequest35.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest35.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue39 = deleteRequest38.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest38.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest42.setParentTask("hi!", 10L);
        java.lang.String[] strArray46 = deleteRequest42.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest47.setParentTask("hi!", 10L);
        java.lang.String[] strArray51 = deleteRequest47.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel52 = deleteRequest47.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest42.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest41.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.index.shard.ShardId shardId55 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest41.setShardId(shardId55);
        org.elasticsearch.common.transport.TransportAddress transportAddress57 = null;
        deleteRequest41.remoteAddress(transportAddress57);
        org.elasticsearch.tasks.TaskId taskId59 = deleteRequest41.getParentTask();
        org.elasticsearch.tasks.Task task60 = deleteRequest29.createTask((long) 'a', "delete {[][][]}", "hi!", taskId59);
        org.elasticsearch.tasks.Task task61 = deleteRequest1.createTask((long) (-1), "delete {[hi!][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][hi!][null]}]}", "delete {[null][hi!][]}", taskId59);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest1.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest63.type("delete {[][][]}");
        java.lang.String str66 = deleteRequest63.id();
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(actionRequestValidationException36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel52 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel52.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(taskId59);
        org.junit.Assert.assertNotNull(task60);
        org.junit.Assert.assertNotNull(task61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        deleteRequest11.remoteAddress(transportAddress14);
        java.lang.String str16 = deleteRequest11.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest11.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest11.version((long) (byte) 1);
        org.elasticsearch.index.VersionType versionType21 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest5.versionType(versionType21);
        java.lang.String str23 = deleteRequest22.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.routing("delete {[delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}][null][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(versionType21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(deleteRequest25);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][delete {[null][null][hi!]}]}", "delete {[][delete {[delete {[null][null][null]}][delete {[null][null][null]}][]}][delete {[null][hi!][null]}]}", "delete {[hi!][null][hi!]}");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure9 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException7, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException7, "");
        java.lang.Throwable throwable12 = shardFailure11.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", throwable12, "");
        java.lang.String str15 = shardFailure14.reason;
        java.lang.Throwable throwable16 = shardFailure14.cause;
        java.lang.String str17 = shardFailure14.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable12.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][null][hi!]}" + "'", str15, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable16.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[null][null][hi!]}" + "'", str17, "delete {[null][null][hi!]}");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][]}", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}");
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest5.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.timeout(timeValue14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.timeout(timeValue14);
        java.lang.String str17 = deleteRequest16.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("delete {[null][null][null]}");
        java.lang.String str20 = deleteRequest19.type();
        java.lang.String str21 = deleteRequest19.toString();
        boolean boolean22 = deleteRequest19.getShouldPersistResult();
        deleteRequest19.primaryTerm((long) (byte) 100);
        java.lang.String str25 = deleteRequest19.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest19.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest5.consistencyLevel(writeConsistencyLevel26);
        boolean boolean28 = deleteRequest27.refresh();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[null][null][delete {[null][null][null]}]}" + "'", str21, "delete {[null][null][delete {[null][null][null]}]}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[null][null][delete {[null][null][null]}]}" + "'", str25, "delete {[null][null][delete {[null][null][null]}]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.index("delete {[null][hi!][]}");
        java.lang.String str22 = deleteRequest19.routing();
        org.elasticsearch.index.VersionType versionType23 = deleteRequest19.versionType();
        java.lang.String str24 = deleteRequest19.id();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.version((-1L));
        deleteRequest3.setParentTask("delete {[delete {[][null][null]}][hi!][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.index("delete {[null][null][delete {[null][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.version((long) (short) 0);
        boolean boolean16 = deleteRequest3.refresh();
        java.lang.String str17 = deleteRequest3.parent();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][null][null]}", "delete {[null][null][null]}");
        java.lang.String str4 = deleteRequest3.index();
        long long5 = deleteRequest3.primaryTerm();
        boolean boolean6 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][null][null]}");
        long long9 = deleteRequest3.seqNo();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.setShardId(shardId10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.setShardId(shardId12);
        org.elasticsearch.index.shard.ShardId shardId14 = deleteRequest13.shardId();
        long long15 = deleteRequest13.version();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.seqNo();
        java.lang.String str12 = deleteRequest3.id();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest3.versionType();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setShardId(shardId14);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest16.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = deleteRequest20.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.refresh(false);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest28.getParentTask();
        deleteRequest16.setParentTask(taskId29);
        org.elasticsearch.tasks.Task task31 = deleteRequest12.createTask(0L, "delete {[][null][null]}", "", taskId29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest12.parent("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException34 = deleteRequest33.validate();
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest33.getParentTask();
        boolean boolean36 = deleteRequest33.refresh();
        java.lang.String str37 = deleteRequest33.parent();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNull(actionRequestValidationException34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[delete {[null][null][null]}][][]}" + "'", str37, "delete {[delete {[null][null][null]}][][]}");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String str9 = deleteRequest7.id();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.type("delete {[delete {[null][null][]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.index("delete {[null][delete {[][][hi!]}][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.timeout(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest0.shardId();
        deleteRequest0.setParentTask("delete {[null][null][hi!]}", (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout("delete {[][delete {[null][null][]}][delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[null][null][]}][delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(shardId7);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest0.remoteAddress(transportAddress5);
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest3.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = deleteRequest10.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.id("delete {[null][hi!][null]}");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        org.elasticsearch.tasks.Task task19 = deleteRequest3.createTask((-1L), "delete {[null][null][hi!]}", "delete {[null][null][]}", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest3.refresh(false);
        java.lang.String str22 = deleteRequest3.type();
        long long23 = deleteRequest3.primaryTerm();
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = null;
        deleteRequest3.remoteAddress(transportAddress24);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNotNull(indicesOptions11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[delete {[][null][null]}][hi!][null]}][null][null]}", "delete {[null][delete {[][][delete {[][null][null]}]}][null]}", "delete {[delete {[null][null][delete {[null][null][null]}]}][hi!][null]}");
        java.lang.String str4 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("delete {[null][hi!][delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][null][null]}][null]}]}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[delete {[delete {[][null][null]}][hi!][null]}][null][null]}][delete {[null][delete {[][][delete {[][null][null]}]}][null]}][delete {[delete {[null][null][delete {[null][null][null]}]}][hi!][null]}]}" + "'", str4, "delete {[delete {[delete {[delete {[][null][null]}][hi!][null]}][null][null]}][delete {[null][delete {[][][delete {[][null][null]}]}][null]}][delete {[delete {[null][null][delete {[null][null][null]}]}][hi!][null]}]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        deleteRequest10.remoteAddress(transportAddress13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest15.setParentTask("hi!", 10L);
        java.lang.String[] strArray19 = deleteRequest15.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest15.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.consistencyLevel(writeConsistencyLevel20);
        java.lang.String str22 = deleteRequest21.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.routing("hi!");
        long long25 = deleteRequest21.seqNo();
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest21.setShardId(shardId26);
        org.elasticsearch.index.shard.IndexShard indexShard28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult29 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest27, indexShard28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest27);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][]}][delete {[null][hi!][delete {[][null][null]}]}][delete {[delete {[null][][null]}][null][null]}]}", "delete {[hi!][delete {[delete {[null][null][null]}][null][null]}][delete {[delete {[null][null][null]}][null][null]}]}", "delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}");
        long long4 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("delete {[null][null][null]}");
        boolean boolean8 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = deleteRequest9.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.refresh(false);
        org.elasticsearch.index.VersionType versionType16 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest12.versionType(versionType16);
        long long18 = deleteRequest12.version();
        org.elasticsearch.index.VersionType versionType19 = deleteRequest12.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest5.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.setShardId(shardId22);
        deleteRequest23.primaryTerm((-3L));
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest5.setParentTask("hi!", 10L);
        java.lang.String[] strArray9 = deleteRequest5.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.index.VersionType versionType20 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.versionType(versionType20);
        deleteRequest21.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest21.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.refresh(true);
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest31.getParentTask();
        org.elasticsearch.tasks.Task task35 = deleteRequest21.createTask((long) (short) 10, "", "hi!", taskId34);
        deleteRequest0.setParentTask(taskId34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest0.type("delete {[null][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.refresh(false);
        long long42 = deleteRequest39.seqNo();
        java.lang.String str43 = deleteRequest39.toString();
        java.lang.String str44 = deleteRequest39.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest39.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest39.type("hi!");
        org.elasticsearch.action.support.IndicesOptions indicesOptions49 = deleteRequest48.indicesOptions();
        java.lang.String str50 = deleteRequest48.getDescription();
        org.elasticsearch.tasks.TaskId taskId51 = deleteRequest48.getParentTask();
        deleteRequest38.setParentTask(taskId51);
        org.elasticsearch.tasks.TaskId taskId53 = deleteRequest38.getParentTask();
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest38.setShardId(shardId54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest38.index("delete {[][delete {[null][null][]}][delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest38.version((long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest63.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel66 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest65.consistencyLevel(writeConsistencyLevel66);
        deleteRequest67.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest67.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions76 = deleteRequest75.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = deleteRequest75.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest79.refresh(false);
        org.elasticsearch.index.VersionType versionType82 = deleteRequest79.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest78.versionType(versionType82);
        deleteRequest83.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId86 = deleteRequest83.getParentTask();
        org.elasticsearch.tasks.Task task87 = deleteRequest67.createTask((long) (byte) 10, "delete {[null][null][null]}", "delete {[][][hi!]}", taskId86);
        org.elasticsearch.tasks.Task task88 = deleteRequest59.createTask((long) (byte) 0, "delete {[delete {[delete {[delete {[null][null][]}][hi!][null]}][null][null]}][null][null]}", "delete {[delete {[][null][null]}][][hi!]}", taskId86);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId24);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(task35);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[null][null][null]}" + "'", str43, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(indicesOptions49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "delete {[null][hi!][]}" + "'", str50, "delete {[null][hi!][]}");
        org.junit.Assert.assertNotNull(taskId51);
        org.junit.Assert.assertNotNull(taskId53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertNotNull(indicesOptions76);
        org.junit.Assert.assertNotNull(deleteRequest78);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(versionType82);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(taskId86);
        org.junit.Assert.assertNotNull(task87);
        org.junit.Assert.assertNotNull(task88);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        long long5 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("delete {[delete {[][null][null]}][null][null]}");
        java.lang.String str8 = deleteRequest7.type();
        java.lang.String str9 = deleteRequest7.getDescription();
        deleteRequest7.seqNo(10L);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[delete {[][null][null]}][null][null]}" + "'", str8, "delete {[delete {[][null][null]}][null][null]}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][delete {[delete {[][null][null]}][null][null]}][null]}" + "'", str9, "delete {[null][delete {[delete {[][null][null]}][null][null]}][null]}");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        deleteRequest2.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.routing("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.refresh(false);
        org.elasticsearch.index.VersionType versionType12 = deleteRequest9.versionType();
        java.lang.String str13 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest16.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest19.versionType(versionType23);
        deleteRequest24.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId27 = deleteRequest24.getParentTask();
        deleteRequest15.setParentTask(taskId27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest15.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.type("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest33.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.timeout(timeValue36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest2.timeout(timeValue36);
        org.elasticsearch.action.support.IndicesOptions indicesOptions39 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest2.refresh(false);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(versionType12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(taskId27);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(indicesOptions39);
        org.junit.Assert.assertNotNull(deleteRequest41);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest3.remoteAddress(transportAddress5);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest10.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("");
        java.lang.String str17 = deleteRequest13.routing();
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest13.getParentTask();
        deleteRequest0.setParentTask(taskId18);
        java.lang.String str20 = deleteRequest0.routing();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest0.createTask((long) (-1), "", "hi!", taskId11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest0.setShardId(shardId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.version((long) (short) 10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest0.consistencyLevel();
        java.lang.String str18 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId28 = deleteRequest27.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.consistencyLevel(writeConsistencyLevel29);
        java.lang.String str31 = deleteRequest30.routing();
        org.elasticsearch.index.VersionType versionType32 = deleteRequest30.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest22.versionType(versionType32);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest33.consistencyLevel();
        java.lang.String str35 = deleteRequest33.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest33.routing("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress38 = deleteRequest33.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean43 = deleteRequest42.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest42.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue46 = deleteRequest45.timeout();
        long long47 = deleteRequest45.primaryTerm();
        deleteRequest45.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType51 = deleteRequest45.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest33.versionType(versionType51);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest0.versionType(versionType51);
        java.lang.String str54 = deleteRequest53.parent();
        java.lang.String str55 = deleteRequest53.type();
        java.lang.String str56 = deleteRequest53.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest57.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = deleteRequest61.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest61.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue65 = deleteRequest64.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest57.timeout(timeValue65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions68 = deleteRequest67.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest67.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = deleteRequest71.refresh(false);
        org.elasticsearch.index.VersionType versionType74 = deleteRequest71.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest70.versionType(versionType74);
        deleteRequest75.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId78 = deleteRequest75.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel79 = deleteRequest75.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest80 = deleteRequest66.consistencyLevel(writeConsistencyLevel79);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest53.consistencyLevel(writeConsistencyLevel79);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest53.type("delete {[null][delete {[][][delete {[][][hi!]}]}][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput84 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest83.readFrom(streamInput84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(shardId28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNull(transportAddress38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(timeValue46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(versionType51);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(indicesOptions68);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(deleteRequest73);
        org.junit.Assert.assertNotNull(versionType74);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(taskId78);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel79 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel79.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest80);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(deleteRequest83);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[hi!][delete {[null][null][null]}][delete {[][null][null]}]}");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        deleteRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.routing("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest4.remoteAddress();
        long long10 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest4.routing("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest4.index("delete {[delete {[null][][null]}][delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}][null]}");
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][][null]}][delete {[null][null][]}][hi!]}");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        java.lang.String str9 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.id("delete {[delete {[delete {[][][]}][null][null]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.index("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest5.shardId();
        long long7 = deleteRequest5.primaryTerm();
        deleteRequest5.setParentTask("delete {[delete {[][null][null]}][hi!][null]}", (long) (short) 1);
        java.lang.String str11 = deleteRequest5.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.getDescription();
        long long14 = deleteRequest12.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.timeout(timeValue19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest21.timeout(timeValue27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest21.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress31 = null;
        deleteRequest21.remoteAddress(transportAddress31);
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest21.setShardId(shardId33);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest34.getParentTask();
        deleteRequest20.setParentTask(taskId35);
        long long37 = deleteRequest20.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId41 = deleteRequest40.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress42 = null;
        deleteRequest40.remoteAddress(transportAddress42);
        java.lang.String str44 = deleteRequest40.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "");
        org.elasticsearch.action.support.IndicesOptions indicesOptions49 = deleteRequest48.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId50 = deleteRequest48.shardId();
        org.elasticsearch.index.VersionType versionType51 = deleteRequest48.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel52 = deleteRequest48.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest40.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest20.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest12.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest5.consistencyLevel(writeConsistencyLevel52);
        java.lang.String str57 = deleteRequest56.routing();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}" + "'", str11, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3L) + "'", long14 == (-3L));
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNull(shardId41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(indicesOptions49);
        org.junit.Assert.assertNull(shardId50);
        org.junit.Assert.assertNotNull(versionType51);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel52 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel52.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest2.timeout(timeValue10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.refresh(false);
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        deleteRequest2.setParentTask(taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest2.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest2.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest2.type("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        java.lang.String[] strArray26 = deleteRequest22.indices();
        java.lang.String[] strArray27 = deleteRequest22.indices();
        org.elasticsearch.index.VersionType versionType28 = deleteRequest22.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest2.versionType(versionType28);
        deleteRequest2.seqNo((long) 1);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException32 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][hi!][null]}]}", (java.lang.Throwable) actionRequestValidationException32, "delete {[null][delete {[][][hi!]}][null]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting35 = shardFailure34.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(actionRequestValidationException32);
        org.junit.Assert.assertNull(shardRouting35);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest0.createTask((long) (-1), "", "hi!", taskId11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest0.setShardId(shardId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.version((long) (short) 10);
        boolean boolean17 = deleteRequest0.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest0.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.index("");
        java.lang.String str27 = deleteRequest26.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue32 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.timeout(timeValue32);
        deleteRequest31.primaryTerm(1L);
        java.lang.String str36 = deleteRequest31.parent();
        org.elasticsearch.tasks.TaskId taskId37 = deleteRequest31.getParentTask();
        deleteRequest26.setParentTask(taskId37);
        org.elasticsearch.tasks.Task task39 = deleteRequest0.createTask(0L, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}", "delete {[null][delete {[delete {[][null][null]}][hi!][null]}][null]}", taskId37);
        deleteRequest0.primaryTerm((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(timeValue32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertNotNull(task39);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest3.getParentTask();
        deleteRequest3.setParentTask("delete {[][null][null]}", (long) (byte) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId22 = deleteRequest21.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.consistencyLevel(writeConsistencyLevel23);
        java.lang.String str25 = deleteRequest24.routing();
        org.elasticsearch.index.VersionType versionType26 = deleteRequest24.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest16.versionType(versionType26);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest27.consistencyLevel();
        java.lang.String str29 = deleteRequest27.id();
        deleteRequest27.seqNo((long) 0);
        java.lang.String str32 = deleteRequest27.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.type("");
        org.elasticsearch.common.unit.TimeValue timeValue35 = deleteRequest34.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest3.timeout(timeValue35);
        org.elasticsearch.index.shard.ShardId shardId37 = deleteRequest3.shardId();
        deleteRequest3.seqNo((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest3.timeout("delete {[delete {[null][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNull(shardId37);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest14.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.index("delete {[][null][null]}");
        java.lang.String str23 = deleteRequest22.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.timeout(timeValue28);
        org.elasticsearch.common.transport.TransportAddress transportAddress30 = null;
        deleteRequest27.remoteAddress(transportAddress30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest27.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions35 = deleteRequest34.indicesOptions();
        deleteRequest34.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest42.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest44.refresh(true);
        org.elasticsearch.tasks.TaskId taskId47 = deleteRequest44.getParentTask();
        org.elasticsearch.tasks.Task task48 = deleteRequest34.createTask((long) (byte) 1, "", "delete {[null][null][null]}", taskId47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest49.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException54 = deleteRequest53.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest53.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue57 = deleteRequest56.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest49.timeout(timeValue57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest59.setParentTask("hi!", 10L);
        java.lang.String[] strArray63 = deleteRequest59.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel64 = deleteRequest59.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest59.type("hi!");
        org.elasticsearch.index.VersionType versionType67 = deleteRequest66.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest49.versionType(versionType67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest34.versionType(versionType67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest27.versionType(versionType67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest22.versionType(versionType67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = deleteRequest14.versionType(versionType67);
        long long73 = deleteRequest14.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest14.id("delete {[delete {[null][null][]}][delete {[hi!][null][null]}][delete {[null][null][delete {[null][null][null]}]}]}");
        org.elasticsearch.index.VersionType versionType76 = deleteRequest75.versionType();
        java.lang.String str77 = deleteRequest75.id();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[delete {[][null][null]}][hi!][null]}" + "'", str23, "delete {[delete {[][null][null]}][hi!][null]}");
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(indicesOptions35);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(taskId47);
        org.junit.Assert.assertNotNull(task48);
        org.junit.Assert.assertNotNull(actionRequestValidationException54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(timeValue57);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel64 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel64.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(versionType67);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertNotNull(deleteRequest72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(versionType76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "delete {[delete {[null][null][]}][delete {[hi!][null][null]}][delete {[null][null][delete {[null][null][null]}]}]}" + "'", str77, "delete {[delete {[null][null][]}][delete {[hi!][null][null]}][delete {[null][null][delete {[null][null][null]}]}]}");
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure7.routing;
        java.lang.String str10 = shardFailure7.indexUUID;
        java.lang.Throwable throwable11 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][hi!][]}][null][null]}", throwable11, "delete {[null][delete {[][][hi!]}][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest7.shardId();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest7.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((-1L));
        boolean boolean12 = deleteRequest11.getShouldPersistResult();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest11.setParentTask("hi!", 10L);
        java.lang.String[] strArray15 = deleteRequest11.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest11.remoteAddress(transportAddress16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId21 = deleteRequest20.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.consistencyLevel(writeConsistencyLevel22);
        java.lang.String str24 = deleteRequest23.routing();
        org.elasticsearch.index.VersionType versionType25 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.versionType(versionType25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.versionType(versionType25);
        java.lang.String str28 = deleteRequest3.routing();
        org.elasticsearch.tasks.TaskId taskId32 = null;
        org.elasticsearch.tasks.Task task33 = deleteRequest3.createTask((-3L), "", "hi!", taskId32);
        java.lang.String str34 = deleteRequest3.id();
        long long35 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(shardId21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(task33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[][null][delete {[delete {[null][null][null]}][][]}]}][null][null]}");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.id("delete {[null][null][null]}");
        long long6 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.String str11 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.timeout(timeValue14);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.consistencyLevel(writeConsistencyLevel16);
        java.lang.String str18 = deleteRequest15.index();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        deleteRequest1.seqNo(1L);
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest1.shardId();
        java.lang.String str5 = deleteRequest1.type();
        java.lang.String str6 = deleteRequest1.parent();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest1.timeout();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest1.setShardId(shardId8);
        long long10 = deleteRequest1.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest1.parent("delete {[delete {[][][hi!]}][delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}][null]}");
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.routing("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.version((long) (byte) -1);
        java.lang.String str17 = deleteRequest14.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = deleteRequest14.remoteAddress();
        java.lang.String str19 = deleteRequest14.toString();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[delete {[][null][null]}][hi!][null]}" + "'", str17, "delete {[delete {[][null][null]}][hi!][null]}");
        org.junit.Assert.assertNull(transportAddress18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][][]}" + "'", str19, "delete {[][][]}");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest7.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest0.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.index("delete {[null][null][delete {[null][null][null]}]}");
        java.lang.String str21 = deleteRequest0.type();
        long long22 = deleteRequest0.version();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        java.lang.String str11 = deleteRequest10.routing();
        java.lang.String str12 = deleteRequest10.parent();
        org.elasticsearch.index.VersionType versionType13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.versionType(versionType13);
        java.lang.String str15 = deleteRequest10.routing();
        java.lang.String str16 = deleteRequest10.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.index.VersionType versionType20 = deleteRequest17.versionType();
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest17.timeout();
        org.elasticsearch.index.VersionType versionType22 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest10.versionType(versionType22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest24.setParentTask("hi!", 10L);
        java.lang.String[] strArray28 = deleteRequest24.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException29 = deleteRequest24.validate();
        org.elasticsearch.index.VersionType versionType30 = deleteRequest24.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest23.versionType(versionType30);
        org.elasticsearch.common.io.stream.StreamInput streamInput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest23.readFrom(streamInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(actionRequestValidationException29);
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        java.lang.String[] strArray10 = deleteRequest0.indices();
        java.lang.String str11 = deleteRequest0.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest0.remoteAddress();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(transportAddress12);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest10.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        java.lang.String str15 = deleteRequest10.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId18 = deleteRequest10.shardId();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[null][null][null]}][][]}" + "'", str13, "delete {[delete {[null][null][null]}][][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(shardId18);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.parent("delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}");
        java.lang.String str9 = deleteRequest8.parent();
        java.lang.String[] strArray10 = deleteRequest8.indices();
        boolean boolean11 = deleteRequest8.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest8.id("delete {[delete {[null][delete {[][null][null]}][null]}][delete {[hi!][][delete {[][null][null]}]}][delete {[null][delete {[][null][null]}][null]}]}");
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}" + "'", str9, "delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.index("delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest2.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.type("");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest13.versionType();
        deleteRequest13.primaryTerm((long) (byte) -1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest13.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest2.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.index.VersionType versionType21 = deleteRequest2.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest2.timeout("delete {[delete {[null][null][null]}][delete {[null][null][null]}][delete {[][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][delete {[null][null][null]}][delete {[][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(versionType21);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        java.lang.Throwable throwable9 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable9, "hi!");
        java.lang.String str12 = shardFailure11.indexUUID;
        java.lang.String str13 = shardFailure11.indexUUID;
        java.lang.String str14 = shardFailure11.reason;
        java.lang.String str15 = shardFailure11.reason;
        java.lang.String str16 = shardFailure11.reason;
        java.lang.Throwable throwable17 = shardFailure11.cause;
        java.lang.String str18 = shardFailure11.reason;
        java.lang.String str19 = shardFailure11.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting20 = shardFailure11.routing;
        java.lang.String str21 = shardFailure11.indexUUID;
        java.lang.String str22 = shardFailure11.indexUUID;
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(throwable17);
        org.junit.Assert.assertEquals(throwable17.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable17.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable17.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(shardRouting20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest14.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue18 = deleteRequest17.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.timeout(timeValue18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest12.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = null;
        deleteRequest12.remoteAddress(transportAddress22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest12.setShardId(shardId24);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task27 = deleteRequest8.createTask((long) (byte) 0, "", "", taskId26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest8.type("delete {[delete {[null][null][null]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest8.refresh(false);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(task27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.index();
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest3.getParentTask();
        long long10 = deleteRequest3.version();
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest3.shardId();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3L) + "'", long10 == (-3L));
        org.junit.Assert.assertNull(shardId11);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        java.lang.Throwable throwable9 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable9, "hi!");
        java.lang.String str12 = shardFailure11.indexUUID;
        java.lang.String str13 = shardFailure11.indexUUID;
        java.lang.String str14 = shardFailure11.reason;
        java.lang.String str15 = shardFailure11.reason;
        java.lang.String str16 = shardFailure11.indexUUID;
        java.lang.String str17 = shardFailure11.indexUUID;
        java.lang.String str18 = shardFailure11.indexUUID;
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("");
        java.lang.String str7 = deleteRequest6.type();
        java.lang.String[] strArray8 = deleteRequest6.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest6.remoteAddress();
        boolean boolean10 = deleteRequest6.getShouldPersistResult();
        boolean boolean11 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = deleteRequest12.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest12.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = null;
        deleteRequest12.remoteAddress(transportAddress18);
        long long20 = deleteRequest12.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.version((long) (-1));
        org.elasticsearch.index.VersionType versionType23 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.versionType(versionType23);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indicesOptions13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3L) + "'", long20 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("");
        java.lang.String str7 = deleteRequest6.routing();
        deleteRequest6.seqNo((long) 'a');
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        org.elasticsearch.index.VersionType versionType5 = deleteRequest2.versionType();
        java.lang.String str6 = deleteRequest2.type();
        java.lang.String str7 = deleteRequest2.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.index("");
        java.lang.String str10 = deleteRequest9.parent();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException11, "delete {[null][null][null]}");
        java.lang.String str14 = shardFailure13.reason;
        java.lang.String str15 = shardFailure13.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting16 = shardFailure13.routing;
        java.lang.String str17 = shardFailure13.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(shardRouting16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[null][null][null]}" + "'", str17, "delete {[null][null][null]}");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest0.remoteAddress(transportAddress3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][hi!]}][null][null]}", "delete {[null][delete {[][][delete {[][null][null]}]}][null]}", "delete {[][null][null]}");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest15.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest18.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.refresh(false);
        org.elasticsearch.index.VersionType versionType25 = deleteRequest22.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.versionType(versionType25);
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest15.timeout(timeValue27);
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.setShardId(shardId29);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = deleteRequest28.validate();
        java.lang.String str32 = deleteRequest28.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest28.routing("delete {[null][null][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNull(actionRequestValidationException31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[null][null][null]}" + "'", str32, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest34);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.type("");
        long long14 = deleteRequest9.seqNo();
        deleteRequest9.primaryTerm((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest9.refresh(false);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        long long4 = deleteRequest2.seqNo();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest2.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest9.remoteAddress(transportAddress12);
        java.lang.String str14 = deleteRequest9.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.id("");
        java.lang.String str17 = deleteRequest9.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest18.setParentTask("hi!", 10L);
        java.lang.String[] strArray22 = deleteRequest18.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest23.setParentTask("hi!", 10L);
        java.lang.String[] strArray27 = deleteRequest23.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest18.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest18.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions32 = deleteRequest31.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest31.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.refresh(false);
        org.elasticsearch.index.VersionType versionType38 = deleteRequest35.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest34.versionType(versionType38);
        deleteRequest39.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId42 = deleteRequest39.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest47.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest49.refresh(true);
        org.elasticsearch.tasks.TaskId taskId52 = deleteRequest49.getParentTask();
        org.elasticsearch.tasks.Task task53 = deleteRequest39.createTask((long) (short) 10, "", "hi!", taskId52);
        deleteRequest18.setParentTask(taskId52);
        deleteRequest9.setParentTask(taskId52);
        deleteRequest2.setParentTask(taskId52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest2.id("delete {[null][null][delete {[null][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest58.id("delete {[delete {[null][delete {[][null][null]}][null]}][delete {[hi!][][delete {[][null][null]}]}][delete {[null][delete {[][null][null]}][null]}]}");
        java.lang.String str61 = deleteRequest60.parent();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(versionType38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(taskId42);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(taskId52);
        org.junit.Assert.assertNotNull(task53);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(deleteRequest60);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        boolean boolean13 = deleteRequest10.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.refresh(false);
        deleteRequest15.setParentTask("delete {[null][null][delete {[][][hi!]}]}", (long) (byte) 10);
        java.lang.String str19 = deleteRequest15.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest15.routing("delete {[null][hi!][delete {[delete {[null][null][null]}][null][null]}]}");
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest21.timeout();
        java.lang.String str23 = deleteRequest21.type();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.version((long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.id("delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}");
        org.elasticsearch.index.VersionType versionType10 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        boolean boolean14 = deleteRequest11.getShouldPersistResult();
        java.lang.String[] strArray15 = deleteRequest11.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest11.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.type("hi!");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        org.elasticsearch.index.shard.ShardId shardId23 = deleteRequest21.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.refresh(true);
        java.lang.String str28 = deleteRequest27.type();
        java.lang.String str29 = deleteRequest27.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest31.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest38.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest38.id("delete {[null][null][null]}");
        long long44 = deleteRequest38.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest45.refresh(false);
        org.elasticsearch.index.VersionType versionType48 = deleteRequest45.versionType();
        java.lang.String str49 = deleteRequest45.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest45.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue52 = deleteRequest51.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest38.timeout(timeValue52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest35.timeout(timeValue52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest27.timeout(timeValue52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest21.timeout(timeValue52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest11.timeout(timeValue52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest9.timeout(timeValue52);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNull(shardId23);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-3L) + "'", long44 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(versionType48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(timeValue52);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertNotNull(deleteRequest58);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.tasks.TaskId taskId3 = deleteRequest2.getParentTask();
        boolean boolean4 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest2.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest2.remoteAddress(transportAddress6);
        java.lang.String[] strArray8 = deleteRequest2.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest2.id("delete {[null][null][delete {[null][null][null]}]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest2.consistencyLevel();
        org.elasticsearch.index.VersionType versionType12 = deleteRequest2.versionType();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(taskId3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(versionType12);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        java.lang.String str8 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.version((long) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest14.setParentTask("hi!", 10L);
        java.lang.String[] strArray18 = deleteRequest14.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.type("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        java.lang.String str23 = deleteRequest21.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.refresh(false);
        long long30 = deleteRequest27.seqNo();
        java.lang.String str31 = deleteRequest27.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress32 = deleteRequest27.remoteAddress();
        java.lang.String str33 = deleteRequest27.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest34.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException39 = deleteRequest38.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest38.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue42 = deleteRequest41.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest34.timeout(timeValue42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest44.refresh(false);
        org.elasticsearch.tasks.TaskId taskId47 = deleteRequest46.getParentTask();
        deleteRequest34.setParentTask(taskId47);
        deleteRequest27.setParentTask(taskId47);
        org.elasticsearch.tasks.Task task50 = deleteRequest21.createTask((long) (short) -1, "delete {[null][null][delete {[delete {[][null][null]}][hi!][null]}]}", "delete {[null][hi!][null]}", taskId47);
        org.elasticsearch.tasks.Task task51 = deleteRequest0.createTask(1L, "delete {[delete {[delete {[null][null][]}][hi!][null]}][null][null]}", "delete {[delete {[null][hi!][]}][delete {[null][hi!][]}][delete {[null][hi!][]}]}", taskId47);
        java.lang.Class<?> wildcardClass52 = task51.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][null]}" + "'", str8, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "delete {[null][null][null]}" + "'", str31, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(transportAddress32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(actionRequestValidationException39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(timeValue42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(taskId47);
        org.junit.Assert.assertNotNull(task50);
        org.junit.Assert.assertNotNull(task51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        deleteRequest2.primaryTerm((long) (byte) 10);
        boolean boolean6 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest2.versionType();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(versionType7);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        deleteRequest0.primaryTerm((long) ' ');
        java.lang.String str6 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest7.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest15.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.consistencyLevel(writeConsistencyLevel17);
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.versionType(versionType20);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest21.consistencyLevel();
        java.lang.String str23 = deleteRequest21.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest21.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest26.setParentTask("hi!", 10L);
        java.lang.String[] strArray30 = deleteRequest26.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest0.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest33.getParentTask();
        java.lang.String str35 = deleteRequest33.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest36.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException41 = deleteRequest40.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest40.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue44 = deleteRequest43.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest36.timeout(timeValue44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest50.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest52.refresh(true);
        deleteRequest52.primaryTerm((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress57 = deleteRequest52.remoteAddress();
        java.lang.String str58 = deleteRequest52.id();
        java.lang.String str59 = deleteRequest52.toString();
        org.elasticsearch.tasks.TaskId taskId60 = deleteRequest52.getParentTask();
        org.elasticsearch.tasks.Task task61 = deleteRequest36.createTask(10L, "delete {[][null][null]}", "delete {[][][hi!]}", taskId60);
        org.elasticsearch.index.VersionType versionType62 = deleteRequest36.versionType();
        org.elasticsearch.index.VersionType versionType63 = deleteRequest36.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest33.versionType(versionType63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "delete {[null][null][null]}" + "'", str35, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNull(transportAddress57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "delete {[][null][null]}" + "'", str59, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(taskId60);
        org.junit.Assert.assertNotNull(task61);
        org.junit.Assert.assertNotNull(versionType62);
        org.junit.Assert.assertNotNull(versionType63);
        org.junit.Assert.assertNotNull(deleteRequest64);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure9 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException7, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException7, "");
        java.lang.Throwable throwable12 = shardFailure11.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][][hi!]}", throwable12, "delete {[][][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting15 = shardFailure14.routing;
        java.lang.String str16 = shardFailure14.indexUUID;
        java.lang.Throwable throwable17 = shardFailure14.cause;
        java.lang.String str18 = shardFailure14.indexUUID;
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable12.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[][][hi!]}" + "'", str16, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(throwable17);
        org.junit.Assert.assertEquals(throwable17.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable17.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable17.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[][][hi!]}" + "'", str18, "delete {[][][hi!]}");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(true);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId17);
        java.lang.String str19 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        java.lang.String str24 = deleteRequest20.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest20.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest3.timeout(timeValue27);
        long long29 = deleteRequest3.primaryTerm();
        deleteRequest3.setParentTask("delete {[delete {[null][delete {[][null][null]}][null]}][delete {[hi!][][delete {[][null][null]}]}][delete {[null][delete {[][null][null]}][null]}]}", (long) '#');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.refresh(false);
        org.elasticsearch.index.VersionType versionType36 = deleteRequest33.versionType();
        java.lang.String str37 = deleteRequest33.type();
        java.lang.String str38 = deleteRequest33.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest33.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId44 = deleteRequest43.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest43.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.support.IndicesOptions indicesOptions47 = deleteRequest43.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException49 = deleteRequest48.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest48.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue52 = deleteRequest51.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest51.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest55.setParentTask("hi!", 10L);
        java.lang.String[] strArray59 = deleteRequest55.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest60.setParentTask("hi!", 10L);
        java.lang.String[] strArray64 = deleteRequest60.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel65 = deleteRequest60.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest55.consistencyLevel(writeConsistencyLevel65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest54.consistencyLevel(writeConsistencyLevel65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest43.consistencyLevel(writeConsistencyLevel65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest33.consistencyLevel(writeConsistencyLevel65);
        long long70 = deleteRequest33.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException72 = deleteRequest71.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = deleteRequest71.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest74.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = deleteRequest77.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId80 = deleteRequest79.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel81 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest82 = deleteRequest79.consistencyLevel(writeConsistencyLevel81);
        java.lang.String str83 = deleteRequest82.routing();
        org.elasticsearch.index.VersionType versionType84 = deleteRequest82.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest74.versionType(versionType84);
        long long86 = deleteRequest74.seqNo();
        org.elasticsearch.tasks.TaskId taskId87 = deleteRequest74.getParentTask();
        deleteRequest33.setParentTask(taskId87);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel89 = deleteRequest33.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest90 = deleteRequest3.consistencyLevel(writeConsistencyLevel89);
        java.lang.String str91 = deleteRequest90.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(versionType36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "delete {[null][null][null]}" + "'", str38, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNull(shardId44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(indicesOptions47);
        org.junit.Assert.assertNotNull(actionRequestValidationException49);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(timeValue52);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel65 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel65.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException72);
        org.junit.Assert.assertNotNull(deleteRequest74);
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(deleteRequest79);
        org.junit.Assert.assertNull(shardId80);
        org.junit.Assert.assertNotNull(deleteRequest82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(versionType84);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(taskId87);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel89 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel89.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "delete {[][null][null]}" + "'", str91, "delete {[][null][null]}");
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest6.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.versionType(versionType10);
        boolean boolean12 = deleteRequest11.getShouldPersistResult();
        java.lang.String str13 = deleteRequest11.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest11.consistencyLevel();
        boolean boolean18 = deleteRequest11.getShouldPersistResult();
        java.lang.String[] strArray19 = deleteRequest11.indices();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.version((long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[][delete {[null][delete {[][][hi!]}][null]}][delete {[delete {[][][]}][null][null]}]}");
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String str11 = deleteRequest7.toString();
        long long12 = deleteRequest7.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.timeout(timeValue17);
        org.elasticsearch.index.shard.ShardId shardId21 = deleteRequest20.shardId();
        java.lang.String str22 = deleteRequest20.getDescription();
        boolean boolean23 = deleteRequest20.getShouldPersistResult();
        java.lang.String str24 = deleteRequest20.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.index("delete {[null][null][null]}");
        java.lang.String str33 = deleteRequest30.id();
        deleteRequest30.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.index("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress38 = null;
        deleteRequest30.remoteAddress(transportAddress38);
        org.elasticsearch.index.shard.ShardId shardId40 = deleteRequest30.shardId();
        java.lang.String str41 = deleteRequest30.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str43 = deleteRequest42.getDescription();
        org.elasticsearch.index.shard.ShardId shardId44 = deleteRequest42.shardId();
        boolean boolean45 = deleteRequest42.refresh();
        deleteRequest42.primaryTerm((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest42.routing("delete {[][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = deleteRequest49.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest30.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest20.consistencyLevel(writeConsistencyLevel50);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(shardId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[null][null][null]}" + "'", str22, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "delete {[null][null][null]}" + "'", str24, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNull(shardId40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[null][null][null]}" + "'", str43, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel50 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel50.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest52);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest4.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest8.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest11.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest4.timeout(timeValue12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(false);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        deleteRequest4.setParentTask(taskId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest4.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest4.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest4.type("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[null][hi!][null]}][]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[null][null][delete {[null][null][null]}]}");
        java.lang.Throwable throwable27 = shardFailure26.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure29 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][delete {[null][null][null]}]}", throwable27, "delete {[][hi!][delete {[null][null][null]}]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = shardFailure29.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(throwable27);
        org.junit.Assert.assertEquals(throwable27.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable27.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable27.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNull(shardRouting30);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest0.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest0.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.id("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = deleteRequest14.indicesOptions();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest14.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.setShardId(shardId24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId31 = deleteRequest30.shardId();
        long long32 = deleteRequest30.seqNo();
        org.elasticsearch.index.shard.ShardId shardId33 = deleteRequest30.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId37 = deleteRequest36.shardId();
        deleteRequest36.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest36.routing("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String str43 = deleteRequest42.parent();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = deleteRequest42.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest30.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest27.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest46.refresh(true);
        java.lang.String str49 = deleteRequest48.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest48.index("delete {[delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][][hi!]}");
        long long52 = deleteRequest51.version();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException53 = deleteRequest51.validate();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNull(shardId31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(shardId33);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNull(shardId37);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "delete {[delete {[][null][null]}][hi!][null]}" + "'", str49, "delete {[delete {[][null][null]}][hi!][null]}");
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-3L) + "'", long52 == (-3L));
        org.junit.Assert.assertNull(actionRequestValidationException53);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        long long5 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout(timeValue10);
        org.elasticsearch.index.VersionType versionType13 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.version((long) (byte) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.refresh(false);
        org.elasticsearch.index.VersionType versionType19 = deleteRequest16.versionType();
        java.lang.String str20 = deleteRequest16.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest16.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest12.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest25.setParentTask("hi!", 10L);
        java.lang.String[] strArray29 = deleteRequest25.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress33 = null;
        deleteRequest25.remoteAddress(transportAddress33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean39 = deleteRequest38.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest38.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest42.setParentTask("hi!", 10L);
        java.lang.String[] strArray46 = deleteRequest42.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel47 = deleteRequest42.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest41.consistencyLevel(writeConsistencyLevel47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest25.consistencyLevel(writeConsistencyLevel47);
        org.elasticsearch.index.VersionType versionType50 = deleteRequest49.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest24.versionType(versionType50);
        java.lang.String str52 = deleteRequest24.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions54 = deleteRequest53.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest53.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest53.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress59 = null;
        deleteRequest53.remoteAddress(transportAddress59);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest53.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest63.refresh(false);
        boolean boolean66 = deleteRequest63.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue71 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = deleteRequest70.timeout(timeValue71);
        org.elasticsearch.common.transport.TransportAddress transportAddress73 = null;
        deleteRequest70.remoteAddress(transportAddress73);
        java.lang.String str75 = deleteRequest70.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest70.parent("hi!");
        org.elasticsearch.index.VersionType versionType78 = deleteRequest70.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = deleteRequest63.versionType(versionType78);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest63.id("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel82 = deleteRequest81.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest62.consistencyLevel(writeConsistencyLevel82);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest84 = deleteRequest24.consistencyLevel(writeConsistencyLevel82);
        java.lang.String str85 = deleteRequest24.routing();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException86 = deleteRequest24.validate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel47 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel47.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(versionType50);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(indicesOptions54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeValue71);
        org.junit.Assert.assertNotNull(deleteRequest72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNotNull(versionType78);
        org.junit.Assert.assertNotNull(deleteRequest79);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel82 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel82.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(actionRequestValidationException86);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.type("delete {[hi!][delete {[null][delete {[][][delete {[][null][null]}]}][null]}][null]}");
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[delete {[null][null][null]}][null][null]}", "delete {[delete {[null][null][null]}][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.index.VersionType versionType6 = deleteRequest3.versionType();
        java.lang.String str7 = deleteRequest3.getDescription();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[hi!][delete {[delete {[null][null][null]}][null][null]}][delete {[delete {[null][null][null]}][null][null]}]}" + "'", str7, "delete {[hi!][delete {[delete {[null][null][null]}][null][null]}][delete {[delete {[null][null][null]}][null][null]}]}");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        deleteRequest1.remoteAddress(transportAddress2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.String str11 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest1.createTask((long) (byte) 100, "delete {[null][hi!][null]}", "delete {[][][]}", taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.timeout(timeValue27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.timeout(timeValue27);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.setShardId(shardId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = deleteRequest35.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest35.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue39 = deleteRequest38.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest38.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest42.setParentTask("hi!", 10L);
        java.lang.String[] strArray46 = deleteRequest42.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest47.setParentTask("hi!", 10L);
        java.lang.String[] strArray51 = deleteRequest47.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel52 = deleteRequest47.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest42.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest41.consistencyLevel(writeConsistencyLevel52);
        org.elasticsearch.index.shard.ShardId shardId55 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest41.setShardId(shardId55);
        org.elasticsearch.common.transport.TransportAddress transportAddress57 = null;
        deleteRequest41.remoteAddress(transportAddress57);
        org.elasticsearch.tasks.TaskId taskId59 = deleteRequest41.getParentTask();
        org.elasticsearch.tasks.Task task60 = deleteRequest29.createTask((long) 'a', "delete {[][][]}", "hi!", taskId59);
        org.elasticsearch.tasks.Task task61 = deleteRequest1.createTask((long) (-1), "delete {[hi!][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][hi!][null]}]}", "delete {[null][hi!][]}", taskId59);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest1.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest63.parent("delete {[delete {[delete {[delete {[null][null][]}][hi!][null]}][null][null]}][null][null]}");
        long long66 = deleteRequest65.version();
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(actionRequestValidationException36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel52 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel52.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(taskId59);
        org.junit.Assert.assertNotNull(task60);
        org.junit.Assert.assertNotNull(task61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-3L) + "'", long66 == (-3L));
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure5 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException3, "hi!");
        java.lang.String str6 = shardFailure5.reason;
        java.lang.String str7 = shardFailure5.indexUUID;
        java.lang.String str8 = shardFailure5.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure5.routing;
        java.lang.String str10 = shardFailure5.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(shardRouting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        java.lang.String str15 = deleteRequest0.routing();
        java.lang.String str16 = deleteRequest0.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest0.index("delete {[hi!][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][hi!][null]}]}");
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.setShardId(shardId19);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.index("delete {[null][null][hi!]}");
        java.lang.String str13 = deleteRequest8.routing();
        java.lang.String str14 = deleteRequest8.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.timeout(timeValue21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest15.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress25 = null;
        deleteRequest15.remoteAddress(transportAddress25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest15.id("delete {[null][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.routing("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.common.unit.TimeValue timeValue31 = deleteRequest30.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest8.timeout(timeValue31);
        java.lang.String str33 = deleteRequest32.id();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        java.lang.String str4 = deleteRequest2.id();
        long long5 = deleteRequest2.primaryTerm();
        java.lang.String str6 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest11.setParentTask("hi!", 10L);
        java.lang.String[] strArray15 = deleteRequest11.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest11.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = null;
        deleteRequest11.remoteAddress(transportAddress19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean25 = deleteRequest24.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest28.setParentTask("hi!", 10L);
        java.lang.String[] strArray32 = deleteRequest28.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest11.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue40 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.timeout(timeValue40);
        org.elasticsearch.common.transport.TransportAddress transportAddress42 = null;
        deleteRequest39.remoteAddress(transportAddress42);
        java.lang.String str44 = deleteRequest39.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest39.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest39.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue49 = deleteRequest39.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest11.timeout(timeValue49);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest8.timeout(timeValue49);
        boolean boolean52 = deleteRequest8.refresh();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][delete {[][null][null]}]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(timeValue40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(timeValue49);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.version(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.id("");
        java.lang.String str17 = deleteRequest16.routing();
        deleteRequest16.primaryTerm((long) 10);
        boolean boolean20 = deleteRequest16.refresh();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        long long7 = deleteRequest4.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][][null]}", (java.lang.Throwable) actionRequestValidationException10, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][delete {[null][null][hi!]}]}", (java.lang.Throwable) actionRequestValidationException10, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][]}][null][null]}", "", "delete {[null][null][delete {[][][hi!]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        long long7 = deleteRequest4.seqNo();
        java.lang.String str8 = deleteRequest4.toString();
        java.lang.String str9 = deleteRequest4.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest4.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest4.type("hi!");
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        java.lang.String str15 = deleteRequest13.getDescription();
        java.lang.String str16 = deleteRequest13.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest24.setParentTask("hi!", 10L);
        java.lang.String[] strArray28 = deleteRequest24.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest29.setParentTask("hi!", 10L);
        java.lang.String[] strArray33 = deleteRequest29.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest29.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest24.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest23.consistencyLevel(writeConsistencyLevel34);
        long long37 = deleteRequest23.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions39 = deleteRequest38.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest38.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest38.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue44 = deleteRequest43.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest23.timeout(timeValue44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest13.timeout(timeValue44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest3.timeout(timeValue44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest47.parent("delete {[delete {[null][][null]}][null][null]}");
        long long50 = deleteRequest49.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][null]}" + "'", str8, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][hi!][]}" + "'", str15, "delete {[null][hi!][]}");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest0.remoteAddress();
        boolean boolean10 = deleteRequest0.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.timeout(timeValue15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = deleteRequest14.remoteAddress();
        java.lang.String str18 = deleteRequest14.index();
        java.lang.String str19 = deleteRequest14.type();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest14.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue25 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.timeout(timeValue25);
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = null;
        deleteRequest24.remoteAddress(transportAddress27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest29.setParentTask("hi!", 10L);
        java.lang.String str33 = deleteRequest29.toString();
        long long34 = deleteRequest29.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue39 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.timeout(timeValue39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest29.timeout(timeValue39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest24.timeout(timeValue39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest14.timeout(timeValue39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest43.index("delete {[null][delete {[][][hi!]}][null]}");
        java.lang.String str46 = deleteRequest45.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest47.setParentTask("hi!", 10L);
        java.lang.String str51 = deleteRequest47.toString();
        long long52 = deleteRequest47.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue57 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest56.timeout(timeValue57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest47.timeout(timeValue57);
        org.elasticsearch.index.VersionType versionType60 = deleteRequest59.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest59.version((long) (byte) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest63.refresh(false);
        org.elasticsearch.index.VersionType versionType66 = deleteRequest63.versionType();
        java.lang.String str67 = deleteRequest63.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest63.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue70 = deleteRequest69.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest59.timeout(timeValue70);
        long long72 = deleteRequest71.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue77 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = deleteRequest76.timeout(timeValue77);
        org.elasticsearch.common.transport.TransportAddress transportAddress79 = null;
        deleteRequest76.remoteAddress(transportAddress79);
        java.lang.String str81 = deleteRequest76.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest76.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest76.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue86 = deleteRequest76.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest87 = deleteRequest71.timeout(timeValue86);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest88 = deleteRequest45.timeout(timeValue86);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest89 = deleteRequest0.timeout(timeValue86);
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[null][null][null]}" + "'", str33, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3L) + "'", long34 == (-3L));
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "delete {[null][null][null]}" + "'", str51, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-3L) + "'", long52 == (-3L));
        org.junit.Assert.assertNotNull(timeValue57);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(versionType60);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(versionType66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertNotNull(timeValue70);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(timeValue77);
        org.junit.Assert.assertNotNull(deleteRequest78);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertNotNull(timeValue86);
        org.junit.Assert.assertNotNull(deleteRequest87);
        org.junit.Assert.assertNotNull(deleteRequest88);
        org.junit.Assert.assertNotNull(deleteRequest89);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        deleteRequest1.remoteAddress(transportAddress2);
        boolean boolean4 = deleteRequest1.getShouldPersistResult();
        long long5 = deleteRequest1.primaryTerm();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest8.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = deleteRequest12.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest12.remoteAddress(transportAddress16);
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest12.getParentTask();
        deleteRequest12.primaryTerm((long) (byte) 1);
        org.elasticsearch.index.VersionType versionType21 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest8.versionType(versionType21);
        long long23 = deleteRequest8.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest8.timeout();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest8.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.version((long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.refresh(false);
        java.lang.Class<?> wildcardClass31 = deleteRequest28.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(indicesOptions13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(versionType21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure5 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException3, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure5.routing;
        java.lang.String str7 = shardFailure5.reason;
        java.lang.Throwable throwable8 = shardFailure5.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure5.routing;
        java.lang.String str10 = shardFailure5.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting11 = shardFailure5.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNull(shardRouting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(shardRouting11);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        deleteRequest3.primaryTerm((long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version(100L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.type("delete {[delete {[][null][null]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.version((long) (byte) 1);
        java.lang.String str14 = deleteRequest13.toString();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[null][delete {[delete {[][null][null]}][null][null]}][null]}" + "'", str14, "delete {[null][delete {[delete {[][null][null]}][null][null]}][null]}");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(true);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId17);
        java.lang.String str19 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        java.lang.String str24 = deleteRequest20.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest20.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest3.timeout(timeValue27);
        long long29 = deleteRequest3.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest3.setShardId(shardId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.refresh(false);
        deleteRequest34.setParentTask("hi!", (long) (byte) 100);
        org.elasticsearch.common.unit.TimeValue timeValue38 = deleteRequest34.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest31.timeout(timeValue38);
        deleteRequest31.setParentTask("delete {[delete {[null][null][delete {[null][null][null]}]}][hi!][null]}", 100L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(deleteRequest39);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}", "delete {[hi!][null][null]}", "delete {[null][null][delete {[null][null][null]}]}");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.refresh(true);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest6.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest6.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        deleteRequest6.remoteAddress(transportAddress13);
        java.lang.String str15 = deleteRequest6.getDescription();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][][hi!]}" + "'", str15, "delete {[][][hi!]}");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        java.lang.String str4 = deleteRequest2.id();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest2.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest6.setParentTask("hi!", 10L);
        java.lang.String[] strArray10 = deleteRequest6.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest11.setParentTask("hi!", 10L);
        java.lang.String[] strArray15 = deleteRequest11.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest6.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.index("hi!");
        deleteRequest21.seqNo((long) (short) 1);
        java.lang.String str24 = deleteRequest21.parent();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest21.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest2.consistencyLevel(writeConsistencyLevel25);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = deleteRequest26.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure29 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][][delete {[null][null][]}]}", (java.lang.Throwable) actionRequestValidationException27, "delete {[][][delete {[][null][null]}]}");
        java.lang.String str30 = shardFailure29.reason;
        java.lang.Throwable throwable31 = shardFailure29.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting32 = shardFailure29.routing;
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[hi!][][delete {[null][null][]}]}" + "'", str30, "delete {[hi!][][delete {[null][null][]}]}");
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable31.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting32);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.type();
        java.lang.String str14 = deleteRequest12.toString();
        boolean boolean15 = deleteRequest12.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId19 = deleteRequest18.shardId();
        deleteRequest18.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest18.version((-3L));
        java.lang.String str25 = deleteRequest24.type();
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.setShardId(shardId26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest31.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue35 = deleteRequest31.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest31.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = deleteRequest31.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest31.routing("delete {[][null][null]}");
        org.elasticsearch.tasks.TaskId taskId41 = deleteRequest31.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest31.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest47.refresh(false);
        org.elasticsearch.index.VersionType versionType50 = deleteRequest47.versionType();
        java.lang.String[] strArray51 = deleteRequest47.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest47.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest47.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException60 = deleteRequest59.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = deleteRequest61.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest61.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue65 = deleteRequest64.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest59.timeout(timeValue65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest59.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress69 = null;
        deleteRequest59.remoteAddress(transportAddress69);
        org.elasticsearch.index.shard.ShardId shardId71 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = deleteRequest59.setShardId(shardId71);
        org.elasticsearch.tasks.TaskId taskId73 = deleteRequest59.getParentTask();
        org.elasticsearch.tasks.Task task74 = deleteRequest55.createTask((long) (byte) 0, "", "", taskId73);
        org.elasticsearch.tasks.Task task75 = deleteRequest43.createTask((long) (byte) 1, "delete {[delete {[][null][null]}][hi!][null]}", "delete {[null][null][delete {[][][hi!]}]}", taskId73);
        org.elasticsearch.tasks.Task task76 = deleteRequest27.createTask(52L, "delete {[null][delete {[null][hi!][null]}][hi!]}", "delete {[][delete {[null][null][]}][delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}]}", taskId73);
        deleteRequest12.setParentTask(taskId73);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[null][null][delete {[null][null][null]}]}" + "'", str14, "delete {[null][null][delete {[null][null][null]}]}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(shardId19);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel38 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel38.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(versionType50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(actionRequestValidationException60);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest72);
        org.junit.Assert.assertNotNull(taskId73);
        org.junit.Assert.assertNotNull(task74);
        org.junit.Assert.assertNotNull(task75);
        org.junit.Assert.assertNotNull(task76);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        java.lang.String[] strArray6 = deleteRequest5.indices();
        java.lang.String str7 = deleteRequest5.index();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][hi!][null]}", "delete {[hi!][][delete {[][null][null]}]}", "delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest7.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest14.setParentTask("hi!", 10L);
        java.lang.String str18 = deleteRequest14.toString();
        long long19 = deleteRequest14.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue24 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest14.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest7.timeout(timeValue24);
        org.elasticsearch.index.shard.ShardId shardId28 = deleteRequest27.shardId();
        java.lang.String str29 = deleteRequest27.getDescription();
        boolean boolean30 = deleteRequest27.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest27.getParentTask();
        org.elasticsearch.tasks.Task task32 = deleteRequest3.createTask(100L, "delete {[delete {[delete {[][null][null]}][hi!][null]}][delete {[][null][null]}][delete {[][][]}]}", "delete {[delete {[null][null][null]}][null][null]}", taskId31);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[null][null][null]}" + "'", str18, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3L) + "'", long19 == (-3L));
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(shardId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[null][null][null]}" + "'", str29, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertNotNull(task32);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        deleteRequest0.seqNo((long) (byte) -1);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        java.lang.String str9 = shardFailure7.reason;
        java.lang.String str10 = shardFailure7.indexUUID;
        java.lang.Throwable throwable11 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][]}][null][null]}", throwable11, "delete {[delete {[null][][null]}][delete {[null][null][]}][hi!]}");
        java.lang.String str14 = shardFailure13.reason;
        java.lang.String str15 = shardFailure13.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[delete {[null][null][]}][null][null]}" + "'", str14, "delete {[delete {[null][null][]}][null][null]}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[delete {[null][null][]}][null][null]}" + "'", str15, "delete {[delete {[null][null][]}][null][null]}");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][delete {[delete {[null][null][null]}][][]}]}");
        boolean boolean2 = deleteRequest1.getShouldPersistResult();
        java.lang.String str3 = deleteRequest1.id();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String str6 = deleteRequest3.index();
        java.lang.String str7 = deleteRequest3.id();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest0.remoteAddress();
        java.lang.String[] strArray10 = deleteRequest0.indices();
        boolean boolean11 = deleteRequest0.getShouldPersistResult();
        java.lang.String str12 = deleteRequest0.index();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest15.indicesOptions();
        long long18 = deleteRequest15.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.parent("delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest21.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest25.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue29 = deleteRequest28.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest21.timeout(timeValue29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.refresh(false);
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest33.getParentTask();
        deleteRequest21.setParentTask(taskId34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest21.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue38 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest21.type("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest41.setParentTask("hi!", 10L);
        java.lang.String[] strArray45 = deleteRequest41.indices();
        java.lang.String[] strArray46 = deleteRequest41.indices();
        org.elasticsearch.index.VersionType versionType47 = deleteRequest41.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest21.versionType(versionType47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest49.setParentTask("hi!", 10L);
        java.lang.String str53 = deleteRequest49.toString();
        org.elasticsearch.common.unit.TimeValue timeValue54 = deleteRequest49.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest21.timeout(timeValue54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest20.timeout(timeValue54);
        org.elasticsearch.common.transport.TransportAddress transportAddress57 = null;
        deleteRequest20.remoteAddress(transportAddress57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest20.id("delete {[delete {[null][null][hi!]}][delete {[null][null][null]}][delete {[delete {[][][]}][null][null]}]}");
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(timeValue29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(versionType47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "delete {[null][null][null]}" + "'", str53, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest60);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean11 = deleteRequest10.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue25 = deleteRequest24.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest17.timeout(timeValue25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.refresh(false);
        org.elasticsearch.tasks.TaskId taskId30 = deleteRequest29.getParentTask();
        deleteRequest17.setParentTask(taskId30);
        org.elasticsearch.tasks.Task task32 = deleteRequest13.createTask((-1L), "delete {[][][hi!]}", "delete {[][][]}", taskId30);
        deleteRequest3.setParentTask(taskId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest3.index("delete {[][null][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(task32);
        org.junit.Assert.assertNotNull(deleteRequest35);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("");
        java.lang.String str7 = deleteRequest6.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.version(0L);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest9.remoteAddress(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        long long8 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.type("hi!");
        java.lang.String str11 = deleteRequest10.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("delete {[delete {[null][null][null]}][null][null]}");
        long long14 = deleteRequest10.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest18.setParentTask("hi!", 10L);
        java.lang.String[] strArray22 = deleteRequest18.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest23.setParentTask("hi!", 10L);
        java.lang.String[] strArray27 = deleteRequest23.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest18.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.index("hi!");
        deleteRequest33.seqNo((long) (short) 1);
        java.lang.String str36 = deleteRequest33.parent();
        java.lang.String str37 = deleteRequest33.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.type("hi!");
        org.elasticsearch.tasks.TaskId taskId43 = deleteRequest42.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest42.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest45.routing("");
        long long48 = deleteRequest47.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest47.type("delete {[null][delete {[][][hi!]}][null]}");
        long long51 = deleteRequest47.version();
        org.elasticsearch.index.shard.ShardId shardId52 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest47.setShardId(shardId52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest57.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = deleteRequest61.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest61.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue65 = deleteRequest64.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest57.timeout(timeValue65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest67.setParentTask("hi!", 10L);
        java.lang.String[] strArray71 = deleteRequest67.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel72 = deleteRequest67.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = deleteRequest67.type("hi!");
        org.elasticsearch.index.VersionType versionType75 = deleteRequest74.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest57.versionType(versionType75);
        org.elasticsearch.tasks.TaskId taskId77 = deleteRequest76.getParentTask();
        org.elasticsearch.tasks.Task task78 = deleteRequest47.createTask(52L, "delete {[][][delete {[][null][null]}]}", "delete {[null][null][delete {[][][hi!]}]}", taskId77);
        deleteRequest33.setParentTask(taskId77);
        org.elasticsearch.tasks.Task task80 = deleteRequest10.createTask((long) 1, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}", "delete {[hi!][][delete {[null][null][null]}]}", taskId77);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-3L) + "'", long51 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel72 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel72.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest74);
        org.junit.Assert.assertNotNull(versionType75);
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(taskId77);
        org.junit.Assert.assertNotNull(task78);
        org.junit.Assert.assertNotNull(task80);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.index("");
        java.lang.String str8 = deleteRequest7.parent();
        long long9 = deleteRequest7.version();
        java.lang.String str10 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest7.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.timeout(timeValue21);
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        deleteRequest20.remoteAddress(transportAddress23);
        java.lang.String str25 = deleteRequest20.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest20.id("");
        java.lang.String str28 = deleteRequest27.routing();
        java.lang.String str29 = deleteRequest27.parent();
        java.lang.String str30 = deleteRequest27.type();
        org.elasticsearch.common.unit.TimeValue timeValue31 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest7.timeout(timeValue31);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertNotNull(deleteRequest32);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String str8 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.type("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.timeout(timeValue15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest14.remoteAddress(transportAddress17);
        java.lang.String str19 = deleteRequest14.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = deleteRequest24.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest21.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest3.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest33.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId35 = deleteRequest33.shardId();
        java.lang.String str36 = deleteRequest33.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest33.timeout("delete {[][null][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[][delete {[null][null][]}][hi!]}" + "'", str36, "delete {[][delete {[null][null][]}][hi!]}");
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean10 = deleteRequest9.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest12.timeout();
        long long14 = deleteRequest12.primaryTerm();
        deleteRequest12.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType18 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest3.versionType(versionType18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.setShardId(shardId20);
        java.lang.String str22 = deleteRequest19.toString();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest19.timeout();
        java.lang.String str24 = deleteRequest19.parent();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}" + "'", str22, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest0.createTask((long) (-1), "", "hi!", taskId11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest0.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("hi!");
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.type("delete {[delete {[null][null][null]}][][]}");
        java.lang.String str20 = deleteRequest16.type();
        org.elasticsearch.index.VersionType versionType21 = deleteRequest16.versionType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[delete {[null][null][null]}][][]}" + "'", str20, "delete {[delete {[null][null][null]}][][]}");
        org.junit.Assert.assertNotNull(versionType21);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        java.lang.String str11 = deleteRequest3.index();
        java.lang.String str12 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest13.setParentTask("hi!", 10L);
        java.lang.String[] strArray17 = deleteRequest13.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest18.setParentTask("hi!", 10L);
        java.lang.String[] strArray22 = deleteRequest18.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest18.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest13.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions28 = deleteRequest27.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress31 = null;
        deleteRequest27.remoteAddress(transportAddress31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest27.getParentTask();
        deleteRequest13.setParentTask(taskId33);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest13.getParentTask();
        deleteRequest3.setParentTask(taskId35);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(indicesOptions28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(taskId35);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        boolean boolean8 = deleteRequest7.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        java.lang.String str15 = deleteRequest11.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest18.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.refresh(false);
        org.elasticsearch.index.VersionType versionType25 = deleteRequest22.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.versionType(versionType25);
        deleteRequest26.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest26.getParentTask();
        deleteRequest17.setParentTask(taskId29);
        deleteRequest7.setParentTask(taskId29);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(taskId29);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId6 = null;
        deleteRequest2.setParentTask(taskId6);
        deleteRequest2.seqNo((long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest2.index("delete {[null][null][]}");
        boolean boolean12 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest2.index("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest2.refresh(false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[null][null][hi!]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}]}", deleteRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest1.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest1.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest9.remoteAddress(transportAddress12);
        java.lang.String str14 = deleteRequest9.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest9.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = deleteRequest26.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest26.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue30 = deleteRequest29.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest22.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.refresh(false);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest34.getParentTask();
        deleteRequest22.setParentTask(taskId35);
        org.elasticsearch.tasks.Task task37 = deleteRequest18.createTask(0L, "delete {[][null][null]}", "", taskId35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest18.parent("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.action.support.IndicesOptions indicesOptions40 = deleteRequest39.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue41 = deleteRequest39.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest1.timeout(timeValue41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest1.refresh(false);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertNotNull(task37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(indicesOptions40);
        org.junit.Assert.assertNotNull(timeValue41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest44);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        deleteRequest1.seqNo(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[null][][null]}");
        long long6 = deleteRequest1.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.version((long) (byte) -1);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        long long8 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.index("delete {[null][null][]}");
        long long13 = deleteRequest12.version();
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        long long8 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.consistencyLevel(writeConsistencyLevel17);
        deleteRequest18.seqNo((long) (byte) 0);
        java.lang.String str21 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = deleteRequest26.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest26.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue30 = deleteRequest29.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest22.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.refresh(false);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest34.getParentTask();
        deleteRequest22.setParentTask(taskId35);
        deleteRequest18.setParentTask(taskId35);
        org.elasticsearch.tasks.Task task38 = deleteRequest0.createTask((long) (-1), "delete {[null][null][]}", "", taskId35);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException39 = deleteRequest0.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest0.setShardId(shardId41);
        java.lang.String str43 = deleteRequest42.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest42.id("");
        org.elasticsearch.index.shard.ShardId shardId46 = deleteRequest45.shardId();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertNotNull(task38);
        org.junit.Assert.assertNotNull(actionRequestValidationException39);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel40 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel40.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNull(shardId46);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        deleteRequest0.primaryTerm((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.version((long) (byte) 100);
        java.lang.String str10 = deleteRequest9.toString();
        deleteRequest9.primaryTerm((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][null]}" + "'", str10, "delete {[null][null][null]}");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][null]}", "delete {[delete {[][][]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean10 = deleteRequest9.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest12.timeout();
        long long14 = deleteRequest12.primaryTerm();
        deleteRequest12.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType18 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest3.versionType(versionType18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        boolean boolean23 = deleteRequest20.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.timeout(timeValue28);
        org.elasticsearch.common.transport.TransportAddress transportAddress30 = null;
        deleteRequest27.remoteAddress(transportAddress30);
        java.lang.String str32 = deleteRequest27.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.parent("hi!");
        org.elasticsearch.index.VersionType versionType35 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest20.versionType(versionType35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest19.versionType(versionType35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException39 = deleteRequest38.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException41 = deleteRequest40.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest40.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue44 = deleteRequest43.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest38.timeout(timeValue44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest38.index("hi!");
        java.lang.String[] strArray48 = deleteRequest38.indices();
        java.lang.String str49 = deleteRequest38.parent();
        org.elasticsearch.common.unit.TimeValue timeValue50 = deleteRequest38.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest19.timeout(timeValue50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest19.version((long) 'a');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel54 = deleteRequest19.consistencyLevel();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(versionType35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(actionRequestValidationException39);
        org.junit.Assert.assertNotNull(actionRequestValidationException41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(timeValue50);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel54 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel54.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("delete {[null][null][null]}");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.routing("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("delete {[delete {[null][null][null]}][null][null]}");
        java.lang.String str13 = deleteRequest12.type();
        java.lang.String str14 = deleteRequest12.getDescription();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest12.validate();
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest12.timeout();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[null][null][null]}][null][null]}" + "'", str13, "delete {[delete {[null][null][null]}][null][null]}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][null][null]}][null]}" + "'", str14, "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][null][null]}][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNotNull(timeValue16);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest16.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest19.versionType(versionType23);
        java.lang.String str25 = deleteRequest24.type();
        org.elasticsearch.index.VersionType versionType26 = deleteRequest24.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest0.versionType(versionType26);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest0.setShardId(shardId28);
        java.lang.String str30 = deleteRequest29.id();
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.id("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = deleteRequest14.indicesOptions();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest14.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.setShardId(shardId24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.refresh(false);
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest27.getParentTask();
        java.lang.String[] strArray32 = deleteRequest27.indices();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(actionRequestValidationException28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.index("delete {[null][null][null]}");
        boolean boolean10 = deleteRequest7.refresh();
        java.lang.String str11 = deleteRequest7.index();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest7.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][hi!][]}", (java.lang.Throwable) actionRequestValidationException12, "delete {[null][hi!][]}");
        java.lang.String str15 = shardFailure14.indexUUID;
        java.lang.String str16 = shardFailure14.reason;
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][hi!][]}" + "'", str15, "delete {[null][hi!][]}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[null][hi!][]}" + "'", str16, "delete {[null][hi!][]}");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][]}", "delete {[][null][null]}");
        deleteRequest3.primaryTerm((long) (short) 1);
        deleteRequest3.seqNo(0L);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest0.remoteAddress(transportAddress10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.setShardId(shardId12);
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.parent("delete {[delete {[null][null][null]}][delete {[null][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(versionType19);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest0.createTask((long) (-1), "", "hi!", taskId11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest0.setShardId(shardId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.version((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.type("delete {[][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest16.consistencyLevel();
        java.lang.String[] strArray20 = deleteRequest16.indices();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String str11 = deleteRequest7.toString();
        long long12 = deleteRequest7.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.timeout(timeValue17);
        java.lang.String str21 = deleteRequest20.toString();
        java.lang.String str22 = deleteRequest20.parent();
        java.lang.String str23 = deleteRequest20.parent();
        deleteRequest20.seqNo((long) (-1));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest29.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.type("");
        java.lang.String str36 = deleteRequest35.type();
        java.lang.String[] strArray37 = deleteRequest35.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress38 = deleteRequest35.remoteAddress();
        boolean boolean39 = deleteRequest35.getShouldPersistResult();
        java.lang.String str40 = deleteRequest35.type();
        org.elasticsearch.tasks.TaskId taskId41 = deleteRequest35.getParentTask();
        org.elasticsearch.tasks.Task task42 = deleteRequest20.createTask((long) (short) 1, "delete {[delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][null][null]}][null]}][null][null]}", "delete {[null][delete {[null][null][null]}][delete {[null][null][null]}]}", taskId41);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[null][null][null]}" + "'", str21, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNull(transportAddress38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertNotNull(task42);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        long long5 = deleteRequest2.seqNo();
        java.lang.String str6 = deleteRequest2.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest2.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("hi!");
        deleteRequest14.setParentTask("hi!", (long) (short) -1);
        deleteRequest14.setParentTask("hi!", (long) 'a');
        deleteRequest14.setParentTask("delete {[][][hi!]}", (long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.timeout(timeValue30);
        org.elasticsearch.common.transport.TransportAddress transportAddress32 = deleteRequest29.remoteAddress();
        boolean boolean33 = deleteRequest29.getShouldPersistResult();
        java.lang.String str34 = deleteRequest29.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest29.type("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue41 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.timeout(timeValue41);
        org.elasticsearch.common.transport.TransportAddress transportAddress43 = null;
        deleteRequest40.remoteAddress(transportAddress43);
        java.lang.String str45 = deleteRequest40.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest40.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest47.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException51 = deleteRequest50.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest50.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue54 = deleteRequest53.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest53.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = deleteRequest53.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest47.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest29.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest14.consistencyLevel(writeConsistencyLevel57);
        java.lang.String str61 = deleteRequest60.id();
        java.lang.String str62 = deleteRequest60.id();
        org.elasticsearch.tasks.TaskId taskId63 = deleteRequest60.getParentTask();
        org.elasticsearch.tasks.Task task64 = deleteRequest9.createTask((long) (short) 10, "delete {[][][]}", "delete {[delete {[null][null][]}][delete {[hi!][null][null]}][delete {[null][null][delete {[null][null][null]}]}]}", taskId63);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest9.type("delete {[delete {[][null][null]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest9.id("delete {[null][null][delete {[null][null][hi!]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][hi!][delete {[delete {[null][null][null]}][null][null]}]}][null][null]}", deleteRequest68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNull(transportAddress32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(timeValue41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(actionRequestValidationException51);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(timeValue54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel57 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel57.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(deleteRequest60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(taskId63);
        org.junit.Assert.assertNotNull(task64);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest68);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        deleteRequest3.primaryTerm((long) (byte) 100);
        java.lang.String str8 = deleteRequest3.getDescription();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest3.versionType();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.refresh(false);
        org.elasticsearch.index.VersionType versionType15 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId19 = deleteRequest18.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.index.VersionType versionType22 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest12.versionType(versionType22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean28 = deleteRequest27.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue31 = deleteRequest30.timeout();
        long long32 = deleteRequest30.primaryTerm();
        deleteRequest30.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType36 = deleteRequest30.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest23.versionType(versionType36);
        org.elasticsearch.common.transport.TransportAddress transportAddress38 = null;
        deleteRequest23.remoteAddress(transportAddress38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean44 = deleteRequest43.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest43.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue47 = deleteRequest46.timeout();
        long long48 = deleteRequest46.primaryTerm();
        deleteRequest46.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType52 = deleteRequest46.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest23.versionType(versionType52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException55 = deleteRequest54.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException57 = deleteRequest56.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest56.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue60 = deleteRequest59.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest54.timeout(timeValue60);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest54.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress64 = null;
        deleteRequest54.remoteAddress(transportAddress64);
        org.elasticsearch.index.shard.ShardId shardId66 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest54.setShardId(shardId66);
        org.elasticsearch.tasks.TaskId taskId68 = deleteRequest67.getParentTask();
        deleteRequest53.setParentTask(taskId68);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue74 = deleteRequest73.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel75 = deleteRequest73.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest53.consistencyLevel(writeConsistencyLevel75);
        org.elasticsearch.common.unit.TimeValue timeValue77 = deleteRequest76.timeout();
        org.elasticsearch.index.shard.ShardId shardId78 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = deleteRequest76.setShardId(shardId78);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest79.refresh(false);
        org.elasticsearch.common.unit.TimeValue timeValue82 = deleteRequest81.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest3.timeout(timeValue82);
        org.elasticsearch.index.shard.ShardId shardId84 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest83.setShardId(shardId84);
        org.elasticsearch.common.io.stream.StreamInput streamInput86 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest85.readFrom(streamInput86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][null]}" + "'", str8, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(shardId19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(versionType36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(versionType52);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(actionRequestValidationException55);
        org.junit.Assert.assertNotNull(actionRequestValidationException57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(timeValue60);
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(taskId68);
        org.junit.Assert.assertNotNull(timeValue74);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel75 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel75.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(timeValue77);
        org.junit.Assert.assertNotNull(deleteRequest79);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(timeValue82);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        deleteRequest0.seqNo((long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("delete {[null][null][]}");
        boolean boolean10 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.index("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String str13 = deleteRequest12.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.timeout(timeValue21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.timeout(timeValue21);
        java.lang.String str24 = deleteRequest16.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.type("hi!");
        org.elasticsearch.tasks.TaskId taskId30 = deleteRequest29.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest29.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest29.id("delete {[][null][null]}");
        java.lang.String str35 = deleteRequest29.type();
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest29.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest16.timeout(timeValue36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest12.timeout(timeValue36);
        java.lang.Class<?> wildcardClass39 = deleteRequest38.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        long long5 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout(timeValue10);
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[null][null][null]}");
        org.elasticsearch.tasks.TaskId taskId21 = null;
        deleteRequest20.setParentTask(taskId21);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest20.setShardId(shardId23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest28.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.type("hi!");
        org.elasticsearch.tasks.TaskId taskId43 = deleteRequest42.getParentTask();
        org.elasticsearch.tasks.Task task44 = deleteRequest34.createTask((-3L), "delete {[delete {[null][null][null]}][][]}", "delete {[null][hi!][]}", taskId43);
        org.elasticsearch.tasks.Task task45 = deleteRequest20.createTask(97L, "delete {[delete {[delete {[null][null][]}][hi!][null]}][null][null]}", "delete {[hi!][delete {[delete {[null][null][null]}][null][null]}][delete {[delete {[null][null][null]}][null][null]}]}", taskId43);
        org.elasticsearch.tasks.Task task46 = deleteRequest12.createTask((-1L), "delete {[hi!][][delete {[null][null][null]}]}", "delete {[][delete {[null][delete {[][][hi!]}][null]}][delete {[delete {[][][]}][null][null]}]}", taskId43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertNotNull(task44);
        org.junit.Assert.assertNotNull(task45);
        org.junit.Assert.assertNotNull(task46);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        deleteRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest4.type("delete {[null][null][]}");
        java.lang.Class<?> wildcardClass11 = deleteRequest4.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        boolean boolean7 = deleteRequest5.refresh();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        deleteRequest1.setParentTask("hi!", (long) (short) -1);
        deleteRequest1.setParentTask("hi!", (long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.version((long) (short) 1);
        java.lang.String str12 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest1.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue22 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.timeout(timeValue22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest17.timeout(timeValue22);
        java.lang.String str25 = deleteRequest24.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = deleteRequest28.indicesOptions();
        java.lang.String str30 = deleteRequest28.id();
        long long31 = deleteRequest28.primaryTerm();
        java.lang.String str32 = deleteRequest28.routing();
        java.lang.String str33 = deleteRequest28.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = deleteRequest37.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException40 = deleteRequest39.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest39.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue43 = deleteRequest42.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest37.timeout(timeValue43);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId55 = null;
        org.elasticsearch.tasks.Task task56 = deleteRequest51.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId55);
        org.elasticsearch.tasks.TaskId taskId57 = deleteRequest51.getParentTask();
        org.elasticsearch.tasks.Task task58 = deleteRequest44.createTask((long) 1, "delete {[][null][null]}", "delete {[delete {[][null][null]}][hi!][null]}", taskId57);
        org.elasticsearch.tasks.Task task59 = deleteRequest28.createTask((long) ' ', "delete {[null][null][null]}", "", taskId57);
        deleteRequest27.setParentTask(taskId57);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException61 = deleteRequest27.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "delete {[][null][null]}");
        org.elasticsearch.action.support.IndicesOptions indicesOptions66 = deleteRequest65.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest65.version(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest69.refresh(false);
        org.elasticsearch.index.VersionType versionType72 = deleteRequest69.versionType();
        java.lang.String[] strArray73 = deleteRequest69.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest69.version((long) (short) 0);
        java.lang.String str76 = deleteRequest69.id();
        org.elasticsearch.index.shard.ShardId shardId77 = deleteRequest69.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest79.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest81.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest83.index("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType86 = deleteRequest83.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest87 = deleteRequest69.versionType(versionType86);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest88 = deleteRequest65.versionType(versionType86);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest89 = deleteRequest27.versionType(versionType86);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest90 = deleteRequest14.versionType(versionType86);
        org.elasticsearch.index.shard.ShardId shardId91 = deleteRequest90.shardId();
        deleteRequest90.seqNo((long) ' ');
        boolean boolean94 = deleteRequest90.getShouldPersistResult();
        org.elasticsearch.index.VersionType versionType95 = deleteRequest90.versionType();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[null][null][null]}" + "'", str33, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
        org.junit.Assert.assertNotNull(actionRequestValidationException40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(timeValue43);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(task56);
        org.junit.Assert.assertNotNull(taskId57);
        org.junit.Assert.assertNotNull(task58);
        org.junit.Assert.assertNotNull(task59);
        org.junit.Assert.assertNotNull(actionRequestValidationException61);
        org.junit.Assert.assertNotNull(indicesOptions66);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertNotNull(versionType72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(shardId77);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertNotNull(versionType86);
        org.junit.Assert.assertNotNull(deleteRequest87);
        org.junit.Assert.assertNotNull(deleteRequest88);
        org.junit.Assert.assertNotNull(deleteRequest89);
        org.junit.Assert.assertNotNull(deleteRequest90);
        org.junit.Assert.assertNull(shardId91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(versionType95);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][][]}", "delete {[hi!][null][hi!]}", "delete {[null][null][delete {[delete {[][null][null]}][hi!][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[null][hi!][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][][delete {[][null][null]}]}", "delete {[null][null][]}", "delete {[delete {[null][null][null]}][][delete {[delete {[null][null][null]}][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        java.lang.String str8 = deleteRequest4.type();
        java.lang.String str9 = deleteRequest4.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest4.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        long long14 = deleteRequest11.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.refresh(false);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = deleteRequest11.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest11.getParentTask();
        deleteRequest3.setParentTask(taskId18);
        java.lang.Class<?> wildcardClass20 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.type("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.parent("delete {[][][delete {[delete {[][null][null]}][hi!][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest6.routing("delete {[delete {[delete {[null][null][null]}][][]}][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("delete {[hi!][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.type("delete {[delete {[null][null][delete {[null][null][null]}]}][hi!][null]}");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest10.validate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest7.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.versionType(versionType14);
        deleteRequest15.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest15.getParentTask();
        deleteRequest6.setParentTask(taskId18);
        deleteRequest6.setParentTask("hi!", (long) (-1));
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        deleteRequest6.remoteAddress(transportAddress23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest6.type("delete {[delete {[null][null][delete {[null][null][null]}]}][hi!][null]}");
        boolean boolean27 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest6.setShardId(shardId28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest6.index("delete {[][delete {[delete {[delete {[][null][null]}][hi!][null]}][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest6.type("delete {[delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[null][][null]}][null][null]}][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest6.id("delete {[delete {[null][][null]}][null][null]}");
        deleteRequest6.seqNo(0L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest0.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.parent("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest0.remoteAddress(transportAddress10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest0.timeout();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue12);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest0.indicesOptions();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest0.remoteAddress();
        java.lang.String str9 = deleteRequest0.getDescription();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest0.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.refresh(false);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest0.indicesOptions();
        java.lang.String str13 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.routing("delete {[delete {[][null][null]}][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest0.routing("delete {[delete {[null][null][null]}][null][null]}");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest6.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.versionType(versionType10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean16 = deleteRequest15.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        long long20 = deleteRequest18.primaryTerm();
        deleteRequest18.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType24 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest11.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = deleteRequest28.indicesOptions();
        java.lang.String str30 = deleteRequest28.id();
        long long31 = deleteRequest28.primaryTerm();
        java.lang.String str32 = deleteRequest28.routing();
        java.lang.String str33 = deleteRequest28.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = deleteRequest37.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException40 = deleteRequest39.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest39.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue43 = deleteRequest42.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest37.timeout(timeValue43);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId55 = null;
        org.elasticsearch.tasks.Task task56 = deleteRequest51.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId55);
        org.elasticsearch.tasks.TaskId taskId57 = deleteRequest51.getParentTask();
        org.elasticsearch.tasks.Task task58 = deleteRequest44.createTask((long) 1, "delete {[][null][null]}", "delete {[delete {[][null][null]}][hi!][null]}", taskId57);
        org.elasticsearch.tasks.Task task59 = deleteRequest28.createTask((long) ' ', "delete {[null][null][null]}", "", taskId57);
        deleteRequest27.setParentTask(taskId57);
        org.elasticsearch.common.transport.TransportAddress transportAddress61 = deleteRequest27.remoteAddress();
        org.elasticsearch.index.VersionType versionType62 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest27.version(10L);
        long long65 = deleteRequest64.version();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[null][null][null]}" + "'", str33, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
        org.junit.Assert.assertNotNull(actionRequestValidationException40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(timeValue43);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(task56);
        org.junit.Assert.assertNotNull(taskId57);
        org.junit.Assert.assertNotNull(task58);
        org.junit.Assert.assertNotNull(task59);
        org.junit.Assert.assertNull(transportAddress61);
        org.junit.Assert.assertNotNull(versionType62);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.index("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest5.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest5.remoteAddress();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNull(transportAddress7);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        deleteRequest0.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(true);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest0.createTask((long) (byte) 1, "", "delete {[null][null][null]}", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest15.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest15.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest25.setParentTask("hi!", 10L);
        java.lang.String[] strArray29 = deleteRequest25.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.type("hi!");
        org.elasticsearch.index.VersionType versionType33 = deleteRequest32.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest15.versionType(versionType33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest0.versionType(versionType33);
        java.lang.String str36 = deleteRequest0.toString();
        org.elasticsearch.index.shard.ShardId shardId37 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest0.id("delete {[hi!][delete {[null][hi!][null]}][]}");
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(versionType33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[null][null][null]}" + "'", str36, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId37);
        org.junit.Assert.assertNotNull(deleteRequest39);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        deleteRequest1.seqNo(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[null][][null]}");
        long long6 = deleteRequest1.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest10.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("delete {[null][delete {[null][hi!][null]}][hi!]}");
        long long16 = deleteRequest13.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        java.lang.String str11 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("delete {[delete {[null][null][]}][hi!][null]}");
        java.lang.String str16 = deleteRequest13.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest13.parent("delete {[delete {[null][null][]}][hi!][null]}");
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][hi!]}" + "'", str11, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        boolean boolean13 = deleteRequest9.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.parent("delete {[][null][delete {[null][null][null]}]}");
        deleteRequest15.primaryTerm(32L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        java.lang.String str5 = deleteRequest0.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.id("delete {[][][hi!]}");
        deleteRequest7.seqNo((long) (byte) -1);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        java.lang.String str9 = deleteRequest8.type();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.index("delete {[delete {[][][hi!]}][delete {[delete {[][null][null]}][hi!][null]}][delete {[null][null][null]}]}");
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[delete {[null][null][]}][delete {[hi!][null][null]}][delete {[null][null][delete {[null][null][null]}]}]}][null][null]}", "delete {[delete {[null][null][null]}][delete {[delete {[][][hi!]}][][delete {[][null][null]}]}][delete {[delete {[][null][null]}][null][null]}]}", "delete {[null][][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        deleteRequest1.setParentTask("hi!", (long) (short) -1);
        deleteRequest1.setParentTask("hi!", (long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.version((long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        deleteRequest13.setParentTask("delete {[null][null][]}", (long) (byte) 0);
        java.lang.String str18 = deleteRequest13.id();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        deleteRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest9.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest9.shardId();
        long long16 = deleteRequest9.seqNo();
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest8.timeout(timeValue17);
        org.elasticsearch.index.shard.ShardId shardId19 = deleteRequest18.shardId();
        java.lang.String str20 = deleteRequest18.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = deleteRequest18.consistencyLevel();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(shardId19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(writeConsistencyLevel21);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String str13 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        org.elasticsearch.tasks.Task task21 = deleteRequest9.createTask((long) (-1), "", "hi!", taskId20);
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest9.getParentTask();
        deleteRequest8.setParentTask(taskId22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions25 = deleteRequest24.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.refresh(false);
        org.elasticsearch.index.VersionType versionType31 = deleteRequest28.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest27.versionType(versionType31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.refresh(true);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest27.getParentTask();
        deleteRequest8.setParentTask(taskId35);
        java.lang.String str37 = deleteRequest8.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = deleteRequest8.consistencyLevel();
        java.lang.String[] strArray39 = deleteRequest8.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress40 = deleteRequest8.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(indicesOptions25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(versionType31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel38 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel38.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNull(transportAddress40);
    }
}

