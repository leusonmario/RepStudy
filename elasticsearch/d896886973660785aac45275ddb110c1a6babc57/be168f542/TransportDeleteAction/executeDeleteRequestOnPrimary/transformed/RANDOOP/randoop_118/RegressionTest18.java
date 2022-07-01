import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.version((long) '4');
        org.elasticsearch.index.VersionType versionType17 = deleteRequest14.versionType();
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest14.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.version(52L);
        java.lang.String str24 = deleteRequest23.parent();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.parent("delete {[hi!][null][null]}");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][]}", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("delete {[hi!][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.version((-3L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.setRefreshPolicy(refreshPolicy18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.type("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][]}", "delete {[][null][null]}", "");
        boolean boolean26 = deleteRequest25.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = deleteRequest25.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.routing("");
        org.elasticsearch.index.VersionType versionType34 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest31.versionType(versionType34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str40 = deleteRequest39.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = deleteRequest39.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest35.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest49.routing("");
        org.elasticsearch.index.VersionType versionType52 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest49.versionType(versionType52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str58 = deleteRequest57.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel59 = deleteRequest57.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest53.consistencyLevel(writeConsistencyLevel59);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest64.routing("");
        org.elasticsearch.index.VersionType versionType67 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest64.versionType(versionType67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str73 = deleteRequest72.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel74 = deleteRequest72.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest68.consistencyLevel(writeConsistencyLevel74);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest53.consistencyLevel(writeConsistencyLevel74);
        org.elasticsearch.tasks.TaskId taskId77 = deleteRequest76.getParentTask();
        org.elasticsearch.tasks.Task task78 = deleteRequest35.createTask((long) (-1), "delete {[][hi!][]}", "delete {[][hi!][]}", taskId77);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy79 = deleteRequest35.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest80 = deleteRequest25.setRefreshPolicy(refreshPolicy79);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest17.setRefreshPolicy(refreshPolicy79);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest82 = deleteRequest14.setRefreshPolicy(refreshPolicy79);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest7.setRefreshPolicy(refreshPolicy79);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest83.parent("delete {[null][null][null]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy86 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest87 = deleteRequest85.setRefreshPolicy(refreshPolicy86);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest89 = deleteRequest87.id("delete {[delete {[delete {[][delete {[][delete {[][hi!][]}][]}][null]}][hi!][]}][delete {[hi!][hi!][]}][delete {[][delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest91 = deleteRequest87.parent("delete {[delete {[delete {[][null][hi!]}][null][null]}][delete {[delete {[][hi!][]}][null][null]}][delete {[hi!][][]}]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(transportAddress27);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "delete {[][hi!][]}" + "'", str40, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel41 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel41.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "delete {[][hi!][]}" + "'", str58, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel59 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel59.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest60);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "delete {[][hi!][]}" + "'", str73, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel74 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel74.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(taskId77);
        org.junit.Assert.assertNotNull(task78);
        org.junit.Assert.assertTrue("'" + refreshPolicy79 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy79.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest80);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(deleteRequest82);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertNotNull(deleteRequest87);
        org.junit.Assert.assertNotNull(deleteRequest89);
        org.junit.Assert.assertNotNull(deleteRequest91);
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][delete {[][null][null]}]}", "delete {[delete {[][null][null]}][][delete {[][null][null]}]}", "delete {[delete {[][hi!][]}][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = deleteRequest5.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("");
        deleteRequest8.primaryTerm((long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.index("delete {[][hi!][]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.parent("delete {[][hi!][delete {[][null][null]}]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.setShardId(shardId10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("");
        org.elasticsearch.index.VersionType versionType19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest16.versionType(versionType19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str25 = deleteRequest24.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest24.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest20.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.version((long) '4');
        org.elasticsearch.index.VersionType versionType30 = deleteRequest27.versionType();
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest27.setShardId(shardId31);
        long long33 = deleteRequest27.primaryTerm();
        long long34 = deleteRequest27.version();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest27.setShardId(shardId35);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy37 = deleteRequest36.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest3.setRefreshPolicy(refreshPolicy37);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[][hi!][]}" + "'", str25, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertTrue("'" + refreshPolicy37 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy37.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest38);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][]}", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[hi!][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.version((-3L));
        java.lang.String str8 = deleteRequest5.routing();
        java.lang.String[] strArray9 = deleteRequest5.indices();
        long long10 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("");
        org.elasticsearch.index.VersionType versionType17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.versionType(versionType17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str23 = deleteRequest22.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.routing("");
        org.elasticsearch.index.VersionType versionType32 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest29.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str38 = deleteRequest37.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = deleteRequest37.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest33.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest18.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest49.index("");
        java.lang.String str52 = deleteRequest49.toString();
        org.elasticsearch.tasks.TaskId taskId53 = deleteRequest49.getParentTask();
        deleteRequest45.setParentTask(taskId53);
        java.lang.String[] strArray55 = deleteRequest45.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest59.routing("");
        org.elasticsearch.tasks.TaskId taskId62 = null;
        deleteRequest61.setParentTask(taskId62);
        java.lang.String str64 = deleteRequest61.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy67 = deleteRequest66.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest61.setRefreshPolicy(refreshPolicy67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest45.setRefreshPolicy(refreshPolicy67);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest18.setRefreshPolicy(refreshPolicy67);
        org.elasticsearch.tasks.TaskId taskId71 = deleteRequest18.getParentTask();
        deleteRequest5.setParentTask(taskId71);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[hi!][hi!][]}" + "'", str8, "delete {[hi!][hi!][]}");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[][hi!][]}" + "'", str23, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "delete {[][hi!][]}" + "'", str38, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel39 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel39.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "delete {[][hi!][]}" + "'", str52, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "delete {[][hi!][]}" + "'", str64, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy67 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy67.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(taskId71);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long4 = deleteRequest3.version();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.index("");
        java.lang.String str19 = deleteRequest16.toString();
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest16.getParentTask();
        deleteRequest12.setParentTask(taskId20);
        java.lang.String[] strArray22 = deleteRequest12.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("");
        org.elasticsearch.tasks.TaskId taskId29 = null;
        deleteRequest28.setParentTask(taskId29);
        java.lang.String str31 = deleteRequest28.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy34 = deleteRequest33.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest28.setRefreshPolicy(refreshPolicy34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest12.setRefreshPolicy(refreshPolicy34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest12.type("hi!");
        org.elasticsearch.tasks.TaskId taskId39 = deleteRequest38.getParentTask();
        org.elasticsearch.tasks.Task task40 = deleteRequest3.createTask(0L, "delete {[delete {[][delete {[][delete {[][hi!][]}][]}][null]}][hi!][]}", "delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}", taskId39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest3.index("delete {[hi!][hi!][hi!]}");
        boolean boolean43 = deleteRequest3.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][]}" + "'", str19, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "delete {[][hi!][]}" + "'", str31, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy34 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy34.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(taskId39);
        org.junit.Assert.assertNotNull(task40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest3.getParentTask();
        java.lang.String[] strArray5 = deleteRequest3.indices();
        org.elasticsearch.tasks.TaskId taskId6 = null;
        deleteRequest3.setParentTask(taskId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("delete {[][delete {[][hi!][]}][]}");
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][hi!][]}", "delete {[][delete {[null][null][null]}][]}", "delete {[hi!][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest3.remoteAddress(transportAddress4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[null][delete {[][hi!][]}][null]}");
        java.lang.String str8 = deleteRequest7.index();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[hi!][hi!][]}" + "'", str8, "delete {[hi!][hi!][]}");
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = deleteRequest5.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setRefreshPolicy(refreshPolicy8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.index.VersionType versionType11 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.versionType(versionType11);
        java.lang.Class<?> wildcardClass13 = versionType11.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[delete {[hi!][hi!][]}][null][null]}][delete {[delete {[][null][null]}][delete {[][null][null]}][]}][delete {[][delete {[][null][hi!]}][]}]}", "delete {[][null][null]}", "delete {[delete {[][hi!][]}][hi!][delete {[delete {[][hi!][hi!]}][hi!][delete {[][null][null]}]}]}");
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = deleteRequest1.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.setRefreshPolicy(refreshPolicy7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.id("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest6.remoteAddress(transportAddress11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest6.setShardId(shardId13);
        java.lang.String str15 = deleteRequest6.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.index.VersionType versionType22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.versionType(versionType22);
        org.elasticsearch.index.VersionType versionType24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest19.versionType(versionType24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest19.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.routing("");
        org.elasticsearch.tasks.TaskId taskId35 = null;
        deleteRequest34.setParentTask(taskId35);
        java.lang.String str37 = deleteRequest34.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy40 = deleteRequest39.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest34.setRefreshPolicy(refreshPolicy40);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy42 = deleteRequest41.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest27.setRefreshPolicy(refreshPolicy42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest6.setRefreshPolicy(refreshPolicy42);
        java.lang.String str45 = deleteRequest44.index();
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][null][hi!]}" + "'", str15, "delete {[][null][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[][hi!][]}" + "'", str37, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy40 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy40.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertTrue("'" + refreshPolicy42 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy42.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        deleteRequest3.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("");
        org.elasticsearch.index.VersionType versionType13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.versionType(versionType13);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest10.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = deleteRequest10.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.setShardId(shardId19);
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = null;
        deleteRequest17.remoteAddress(transportAddress21);
        java.lang.String str23 = deleteRequest17.routing();
        java.lang.String str24 = deleteRequest17.routing();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest30.getParentTask();
        java.lang.String str32 = deleteRequest30.getDescription();
        java.lang.String str33 = deleteRequest30.routing();
        java.lang.String str34 = deleteRequest30.getDescription();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest30.setShardId(shardId35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest30.routing("delete {[null][null][null]}");
        java.lang.String str39 = deleteRequest30.toString();
        java.lang.String[] strArray40 = deleteRequest30.indices();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[][hi!][]}" + "'", str32, "delete {[][hi!][]}");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[][hi!][]}" + "'", str34, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "delete {[][hi!][]}" + "'", str39, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.index.VersionType versionType11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.versionType(versionType11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str17 = deleteRequest16.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.index.VersionType versionType26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest23.versionType(versionType26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str32 = deleteRequest31.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = deleteRequest31.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest12.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest35.getParentTask();
        deleteRequest4.setParentTask(taskId36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.index("");
        org.elasticsearch.common.unit.TimeValue timeValue44 = deleteRequest43.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest4.timeout(timeValue44);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException46 = deleteRequest45.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException46, "delete {[][hi!][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][delete {[][hi!][]}][]}", (java.lang.Throwable) actionRequestValidationException46, "");
        java.lang.Throwable throwable51 = shardFailure50.cause;
        java.lang.String str52 = shardFailure50.reason;
        java.lang.String str53 = shardFailure50.reason;
        java.lang.String str54 = shardFailure50.indexUUID;
        java.lang.String str55 = shardFailure50.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[][hi!][]}" + "'", str17, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[][hi!][]}" + "'", str32, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(actionRequestValidationException46);
        org.junit.Assert.assertNotNull(throwable51);
        org.junit.Assert.assertEquals(throwable51.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable51.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable51.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "delete {[][delete {[][hi!][]}][]}" + "'", str52, "delete {[][delete {[][hi!][]}][]}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "delete {[][delete {[][hi!][]}][]}" + "'", str53, "delete {[][delete {[][hi!][]}][]}");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.tasks.TaskId taskId6 = null;
        deleteRequest5.setParentTask(taskId6);
        java.lang.String str8 = deleteRequest5.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = deleteRequest10.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = deleteRequest12.getRefreshPolicy();
        org.elasticsearch.index.VersionType versionType14 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest12.timeout(timeValue23);
        org.elasticsearch.common.transport.TransportAddress transportAddress25 = null;
        deleteRequest12.remoteAddress(transportAddress25);
        org.elasticsearch.index.shard.ShardId shardId27 = deleteRequest12.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest12.version((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest12.type("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType32 = deleteRequest12.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = deleteRequest12.consistencyLevel();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][hi!][]}" + "'", str8, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(shardId27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest3.setParentTask(taskId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.routing("delete {[][hi!][delete {[][hi!][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.index("");
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.version((long) '4');
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.toString();
        long long3 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy4 = deleteRequest1.getRefreshPolicy();
        java.lang.String str5 = deleteRequest1.getDescription();
        boolean boolean6 = deleteRequest1.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("");
        org.elasticsearch.index.VersionType versionType13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.versionType(versionType13);
        org.elasticsearch.index.VersionType versionType15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest10.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.parent("");
        java.lang.String str19 = deleteRequest18.index();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.routing("");
        org.elasticsearch.index.VersionType versionType27 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest24.versionType(versionType27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str33 = deleteRequest32.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest32.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest28.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.routing("");
        org.elasticsearch.index.VersionType versionType42 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest39.versionType(versionType42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str48 = deleteRequest47.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel49 = deleteRequest47.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest43.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest28.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest51.type("delete {[][hi!][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy54 = deleteRequest53.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest18.setRefreshPolicy(refreshPolicy54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest55.id("delete {[][hi!][delete {[][hi!][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest55.routing("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest59.type("delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}");
        org.elasticsearch.index.shard.ShardId shardId62 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest61.setShardId(shardId62);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel64 = deleteRequest63.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest1.consistencyLevel(writeConsistencyLevel64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "delete {[][null][null]}" + "'", str2, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + refreshPolicy4 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy4.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[][null][null]}" + "'", str5, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[][hi!][]}" + "'", str33, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "delete {[][hi!][]}" + "'", str48, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel49 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel49.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertTrue("'" + refreshPolicy54 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy54.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel64 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel64.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest65);
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.index("");
        java.lang.String str10 = deleteRequest7.toString();
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest7.getParentTask();
        deleteRequest3.setParentTask(taskId11);
        java.lang.String[] strArray13 = deleteRequest3.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("");
        org.elasticsearch.tasks.TaskId taskId20 = null;
        deleteRequest19.setParentTask(taskId20);
        java.lang.String str22 = deleteRequest19.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy25 = deleteRequest24.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest19.setRefreshPolicy(refreshPolicy25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.setRefreshPolicy(refreshPolicy25);
        long long28 = deleteRequest3.primaryTerm();
        long long29 = deleteRequest3.primaryTerm();
        long long30 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest3.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}", "delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue40 = deleteRequest39.timeout();
        org.elasticsearch.tasks.TaskId taskId41 = deleteRequest39.getParentTask();
        org.elasticsearch.tasks.Task task42 = deleteRequest32.createTask((long) ' ', "delete {[][delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}][null]}", "delete {[][hi!][delete {[hi!][null][null]}]}", taskId41);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][hi!][]}" + "'", str10, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[][hi!][]}" + "'", str22, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy25 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy25.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3L) + "'", long30 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(timeValue40);
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertNotNull(task42);
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest7.parent("hi!");
        java.lang.String str33 = deleteRequest32.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.id("delete {[][hi!][delete {[][hi!][delete {[][hi!][]}]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy37 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest36.setRefreshPolicy(refreshPolicy37);
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = deleteRequest36.remoteAddress();
        org.elasticsearch.index.VersionType versionType40 = deleteRequest36.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy42 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.setRefreshPolicy(refreshPolicy42);
        org.elasticsearch.common.transport.TransportAddress transportAddress44 = deleteRequest41.remoteAddress();
        org.elasticsearch.index.VersionType versionType45 = deleteRequest41.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest36.versionType(versionType45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy53 = deleteRequest52.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest50.setRefreshPolicy(refreshPolicy53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest46.setRefreshPolicy(refreshPolicy53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest59.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest61.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest61.index("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest61.version((long) 1);
        org.elasticsearch.common.transport.TransportAddress transportAddress68 = deleteRequest61.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[][null][null]}", "delete {[][null][null]}");
        long long73 = deleteRequest72.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest72.type("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel76 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest75.consistencyLevel(writeConsistencyLevel76);
        org.elasticsearch.common.unit.TimeValue timeValue78 = deleteRequest75.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = deleteRequest61.timeout(timeValue78);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest80 = deleteRequest46.timeout(timeValue78);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest35.timeout(timeValue78);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput82 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest35.writeTo(streamOutput82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNull(transportAddress39);
        org.junit.Assert.assertNotNull(versionType40);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNull(transportAddress44);
        org.junit.Assert.assertNotNull(versionType45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertTrue("'" + refreshPolicy53 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy53.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNull(transportAddress68);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNotNull(timeValue78);
        org.junit.Assert.assertNotNull(deleteRequest79);
        org.junit.Assert.assertNotNull(deleteRequest80);
        org.junit.Assert.assertNotNull(deleteRequest81);
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        long long15 = deleteRequest14.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str20 = deleteRequest19.toString();
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.setShardId(shardId21);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = deleteRequest22.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.setShardId(shardId26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy30 = deleteRequest29.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest25.setRefreshPolicy(refreshPolicy30);
        org.elasticsearch.index.VersionType versionType32 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest22.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest17.versionType(versionType32);
        org.elasticsearch.common.io.stream.StreamInput streamInput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest17.readFrom(streamInput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][null][null]}" + "'", str20, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + refreshPolicy30 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy30.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.versionType(versionType8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.type("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.routing("delete {[delete {[][delete {[][delete {[][hi!][]}][]}][null]}][hi!][]}");
        long long16 = deleteRequest15.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest15.indicesOptions();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions17);
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.index("");
        java.lang.String str20 = deleteRequest17.toString();
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest17.getParentTask();
        deleteRequest13.setParentTask(taskId21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("");
        org.elasticsearch.index.VersionType versionType29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str35 = deleteRequest34.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel36 = deleteRequest34.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest13.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest43.routing("");
        org.elasticsearch.index.VersionType versionType46 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest43.versionType(versionType46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str52 = deleteRequest51.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel53 = deleteRequest51.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest47.consistencyLevel(writeConsistencyLevel53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest58.routing("");
        org.elasticsearch.index.VersionType versionType61 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest58.versionType(versionType61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str67 = deleteRequest66.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel68 = deleteRequest66.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest62.consistencyLevel(writeConsistencyLevel68);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest47.consistencyLevel(writeConsistencyLevel68);
        org.elasticsearch.tasks.TaskId taskId71 = deleteRequest70.getParentTask();
        deleteRequest39.setParentTask(taskId71);
        deleteRequest38.setParentTask(taskId71);
        org.elasticsearch.index.VersionType versionType74 = deleteRequest38.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest3.versionType(versionType74);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest3.type("delete {[delete {[delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}][hi!][]}][hi!][]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][hi!][]}" + "'", str20, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "delete {[][hi!][]}" + "'", str35, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel36 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel36.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "delete {[][hi!][]}" + "'", str52, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel53 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel53.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest60);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "delete {[][hi!][]}" + "'", str67, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel68 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel68.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(taskId71);
        org.junit.Assert.assertNotNull(versionType74);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(deleteRequest77);
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.type("delete {[][hi!][]}");
        long long33 = deleteRequest30.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.index("");
        org.elasticsearch.common.unit.TimeValue timeValue40 = deleteRequest39.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest30.timeout(timeValue40);
        org.elasticsearch.index.VersionType versionType42 = deleteRequest30.versionType();
        java.lang.String str43 = deleteRequest30.index();
        java.lang.String str44 = deleteRequest30.index();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3L) + "'", long33 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(timeValue40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNull(versionType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setRefreshPolicy("");
        java.lang.String[] strArray10 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.id("delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("delete {[][null][null]}");
        deleteRequest22.primaryTerm((long) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest26.primaryTerm(10L);
        java.lang.String str29 = deleteRequest26.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest26.index("hi!");
        java.lang.String str32 = deleteRequest31.toString();
        long long33 = deleteRequest31.primaryTerm();
        org.elasticsearch.index.VersionType versionType34 = deleteRequest31.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest22.versionType(versionType34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest14.versionType(versionType34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str41 = deleteRequest40.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel42 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest40.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest44.setRefreshPolicy("");
        boolean boolean47 = deleteRequest46.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest46.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = deleteRequest46.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest36.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.index.VersionType versionType52 = deleteRequest36.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest36.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest36.version((long) (short) 100);
        org.elasticsearch.index.shard.IndexShard indexShard57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult58 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest56, indexShard57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[][null][null]}" + "'", str29, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[hi!][null][null]}" + "'", str32, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(versionType34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[][hi!][]}" + "'", str41, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel42 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel42.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel50 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel50.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(versionType52);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest56);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long4 = deleteRequest3.version();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy5 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[][delete {[][null][hi!]}][]}");
        java.lang.String str9 = deleteRequest3.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest3.validate();
        java.lang.String str11 = deleteRequest3.type();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertTrue("'" + refreshPolicy5 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy5.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[][][hi!]}" + "'", str9, "delete {[][][hi!]}");
        org.junit.Assert.assertNull(actionRequestValidationException10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String[] strArray2 = deleteRequest1.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.id("delete {[hi!][null][null]}");
        java.lang.String str5 = deleteRequest4.id();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest4.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.version((long) (short) -1);
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[hi!][null][null]}" + "'", str5, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.versionType(versionType8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("");
        java.lang.String str12 = deleteRequest11.index();
        deleteRequest11.primaryTerm((long) (short) 100);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy15 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("delete {[][delete {[null][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.setRefreshPolicy("");
        java.lang.String str28 = deleteRequest25.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest25.setRefreshPolicy("");
        java.lang.String str31 = deleteRequest30.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.routing("");
        org.elasticsearch.index.VersionType versionType38 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest35.versionType(versionType38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str44 = deleteRequest43.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = deleteRequest43.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest39.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest50.routing("");
        org.elasticsearch.index.VersionType versionType53 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest50.versionType(versionType53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str59 = deleteRequest58.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel60 = deleteRequest58.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest54.consistencyLevel(writeConsistencyLevel60);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest39.consistencyLevel(writeConsistencyLevel60);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest62.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest64.routing("delete {[][null][null]}");
        deleteRequest66.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue69 = deleteRequest66.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest30.timeout(timeValue69);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest17.timeout(timeValue69);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = deleteRequest71.type("delete {[][hi!][]}");
        java.lang.String str74 = deleteRequest73.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + refreshPolicy15 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy15.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[][hi!][]}" + "'", str44, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel45 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel45.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "delete {[][hi!][]}" + "'", str59, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel60 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel60.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(timeValue69);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertNotNull(deleteRequest73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "delete {[][delete {[][hi!][]}][]}" + "'", str74, "delete {[][delete {[][hi!][]}][]}");
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][]}", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("delete {[][hi!][]}");
        long long6 = deleteRequest5.version();
        boolean boolean7 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest5.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str21 = deleteRequest20.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest20.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.version((long) '4');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest23.routing("");
        long long28 = deleteRequest23.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.index("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.type("delete {[][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = deleteRequest32.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest5.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest34.getParentTask();
        java.lang.String str36 = deleteRequest34.toString();
        java.lang.String str37 = deleteRequest34.routing();
        long long38 = deleteRequest34.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][hi!][]}" + "'", str21, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[delete {[][hi!][]}][hi!][]}" + "'", str36, "delete {[delete {[][hi!][]}][hi!][]}");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.setRefreshPolicy(refreshPolicy1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.type("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][]}", "delete {[][null][null]}", "");
        boolean boolean9 = deleteRequest8.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest8.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("");
        org.elasticsearch.index.VersionType versionType17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.versionType(versionType17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str23 = deleteRequest22.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.routing("");
        org.elasticsearch.index.VersionType versionType35 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest32.versionType(versionType35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str41 = deleteRequest40.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel42 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest36.consistencyLevel(writeConsistencyLevel42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest47.routing("");
        org.elasticsearch.index.VersionType versionType50 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest47.versionType(versionType50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str56 = deleteRequest55.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = deleteRequest55.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest51.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest36.consistencyLevel(writeConsistencyLevel57);
        org.elasticsearch.tasks.TaskId taskId60 = deleteRequest59.getParentTask();
        org.elasticsearch.tasks.Task task61 = deleteRequest18.createTask((long) (-1), "delete {[][hi!][]}", "delete {[][hi!][]}", taskId60);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy62 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest8.setRefreshPolicy(refreshPolicy62);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest0.setRefreshPolicy(refreshPolicy62);
        org.elasticsearch.index.shard.ShardId shardId65 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest0.setShardId(shardId65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.common.transport.TransportAddress transportAddress69 = null;
        deleteRequest68.remoteAddress(transportAddress69);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[][hi!][]}" + "'", str23, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[][hi!][]}" + "'", str41, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel42 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel42.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "delete {[][hi!][]}" + "'", str56, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel57 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel57.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(taskId60);
        org.junit.Assert.assertNotNull(task61);
        org.junit.Assert.assertTrue("'" + refreshPolicy62 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy62.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest68);
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.index("hi!");
        long long7 = deleteRequest6.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest9.getRefreshPolicy();
        java.lang.String str11 = deleteRequest9.type();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest9.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.setRefreshPolicy(refreshPolicy12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.version((long) (short) 1);
        java.lang.String str16 = deleteRequest15.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.index("delete {[][delete {[][hi!][delete {[][hi!][]}]}][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest15.getRefreshPolicy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][null][null]}" + "'", str4, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long4 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String[] strArray8 = deleteRequest3.indices();
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.parent();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        java.lang.String[] strArray8 = deleteRequest3.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest3.validate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(actionRequestValidationException9);
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long4 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.index("");
        java.lang.String str11 = deleteRequest8.toString();
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest8.getParentTask();
        deleteRequest3.setParentTask(taskId12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.routing("delete {[][delete {[null][null][null]}][]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = deleteRequest17.remoteAddress();
        java.lang.String str20 = deleteRequest17.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest17.version(0L);
        org.elasticsearch.index.shard.IndexShard indexShard23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult24 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest17, indexShard23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][hi!][]}" + "'", str11, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(actionRequestValidationException18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest30.getParentTask();
        java.lang.String str32 = deleteRequest30.getDescription();
        org.elasticsearch.common.transport.TransportAddress transportAddress33 = null;
        deleteRequest30.remoteAddress(transportAddress33);
        long long35 = deleteRequest30.version();
        long long36 = deleteRequest30.primaryTerm();
        org.elasticsearch.common.transport.TransportAddress transportAddress37 = deleteRequest30.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[][hi!][]}" + "'", str32, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3L) + "'", long35 == (-3L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(transportAddress37);
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.index("");
        java.lang.String str20 = deleteRequest17.toString();
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest17.getParentTask();
        deleteRequest13.setParentTask(taskId21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("");
        org.elasticsearch.index.VersionType versionType29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str35 = deleteRequest34.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel36 = deleteRequest34.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest13.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest43.routing("");
        org.elasticsearch.index.VersionType versionType46 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest43.versionType(versionType46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str52 = deleteRequest51.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel53 = deleteRequest51.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest47.consistencyLevel(writeConsistencyLevel53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest58.routing("");
        org.elasticsearch.index.VersionType versionType61 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest58.versionType(versionType61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str67 = deleteRequest66.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel68 = deleteRequest66.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest62.consistencyLevel(writeConsistencyLevel68);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest47.consistencyLevel(writeConsistencyLevel68);
        org.elasticsearch.tasks.TaskId taskId71 = deleteRequest70.getParentTask();
        deleteRequest39.setParentTask(taskId71);
        deleteRequest38.setParentTask(taskId71);
        org.elasticsearch.index.VersionType versionType74 = deleteRequest38.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest3.versionType(versionType74);
        java.lang.String str76 = deleteRequest75.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = deleteRequest75.id("delete {[delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}][hi!][]}");
        org.elasticsearch.action.support.IndicesOptions indicesOptions79 = deleteRequest78.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest78.type("delete {[][hi!][delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest81.id("delete {[][delete {[][delete {[][hi!][]}][delete {[][null][null]}]}][null]}");
        java.lang.String str84 = deleteRequest81.index();
        java.lang.String str85 = deleteRequest81.parent();
        org.elasticsearch.common.unit.TimeValue timeValue86 = deleteRequest81.timeout();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][hi!][]}" + "'", str20, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "delete {[][hi!][]}" + "'", str35, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel36 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel36.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "delete {[][hi!][]}" + "'", str52, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel53 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel53.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest60);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "delete {[][hi!][]}" + "'", str67, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel68 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel68.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(taskId71);
        org.junit.Assert.assertNotNull(versionType74);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest78);
        org.junit.Assert.assertNotNull(indicesOptions79);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(timeValue86);
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][]}", "delete {[null][null][null]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy4 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy5 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertTrue("'" + refreshPolicy4 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy4.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + refreshPolicy5 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy5.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("");
        org.elasticsearch.index.VersionType versionType13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.versionType(versionType13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str19 = deleteRequest18.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest18.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.routing("");
        org.elasticsearch.index.VersionType versionType28 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest25.versionType(versionType28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str34 = deleteRequest33.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = deleteRequest33.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest29.consistencyLevel(writeConsistencyLevel35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest14.consistencyLevel(writeConsistencyLevel35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.type("delete {[][hi!][]}");
        java.lang.String str40 = deleteRequest39.type();
        java.lang.String str41 = deleteRequest39.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel42 = deleteRequest39.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest6.consistencyLevel(writeConsistencyLevel42);
        java.lang.String str44 = deleteRequest43.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest48.routing("");
        org.elasticsearch.tasks.TaskId taskId51 = null;
        deleteRequest50.setParentTask(taskId51);
        java.lang.String str53 = deleteRequest50.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy56 = deleteRequest55.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest50.setRefreshPolicy(refreshPolicy56);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy58 = deleteRequest57.getRefreshPolicy();
        org.elasticsearch.index.VersionType versionType59 = deleteRequest57.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest63.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest65.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue68 = deleteRequest67.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest57.timeout(timeValue68);
        org.elasticsearch.common.transport.TransportAddress transportAddress70 = null;
        deleteRequest57.remoteAddress(transportAddress70);
        org.elasticsearch.index.shard.ShardId shardId72 = deleteRequest57.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = deleteRequest57.version((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest57.type("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType77 = deleteRequest57.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = deleteRequest43.versionType(versionType77);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][]}" + "'", str19, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[][hi!][]}" + "'", str34, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel35 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel35.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "delete {[][hi!][]}" + "'", str40, "delete {[][hi!][]}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[][delete {[][hi!][]}][]}" + "'", str41, "delete {[][delete {[][hi!][]}][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel42 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel42.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[][hi!][delete {[][delete {[][hi!][]}][]}]}" + "'", str44, "delete {[][hi!][delete {[][delete {[][hi!][]}][]}]}");
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "delete {[][hi!][]}" + "'", str53, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy56 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy56.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertTrue("'" + refreshPolicy58 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy58.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(versionType59);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(timeValue68);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertNull(shardId72);
        org.junit.Assert.assertNotNull(deleteRequest74);
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(versionType77);
        org.junit.Assert.assertNotNull(deleteRequest78);
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        deleteRequest3.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("");
        org.elasticsearch.index.VersionType versionType13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.versionType(versionType13);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest10.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = deleteRequest10.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.index("");
        java.lang.String str28 = deleteRequest25.toString();
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest25.getParentTask();
        deleteRequest21.setParentTask(taskId29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.routing("");
        org.elasticsearch.index.VersionType versionType37 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest34.versionType(versionType37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str43 = deleteRequest42.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = deleteRequest42.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest38.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest21.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest51.routing("");
        org.elasticsearch.index.VersionType versionType54 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest51.versionType(versionType54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str60 = deleteRequest59.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = deleteRequest59.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest55.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest66.routing("");
        org.elasticsearch.index.VersionType versionType69 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest66.versionType(versionType69);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str75 = deleteRequest74.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel76 = deleteRequest74.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest70.consistencyLevel(writeConsistencyLevel76);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = deleteRequest55.consistencyLevel(writeConsistencyLevel76);
        org.elasticsearch.tasks.TaskId taskId79 = deleteRequest78.getParentTask();
        deleteRequest47.setParentTask(taskId79);
        deleteRequest46.setParentTask(taskId79);
        org.elasticsearch.index.VersionType versionType82 = deleteRequest46.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest3.versionType(versionType82);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest83.index("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue86 = deleteRequest85.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest88 = deleteRequest85.index("delete {[delete {[][hi!][delete {[][hi!][]}]}][hi!][hi!]}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][hi!][]}" + "'", str28, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[][hi!][]}" + "'", str43, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[][hi!][]}" + "'", str60, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel61 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel61.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "delete {[][hi!][]}" + "'", str75, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel76 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel76.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNotNull(deleteRequest78);
        org.junit.Assert.assertNotNull(taskId79);
        org.junit.Assert.assertNotNull(versionType82);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertNotNull(timeValue86);
        org.junit.Assert.assertNotNull(deleteRequest88);
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest32.version((long) (byte) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest36.version((long) (short) 100);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setRefreshPolicy("");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.parent("");
        java.lang.String[] strArray11 = deleteRequest5.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.version((long) (byte) 0);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        java.lang.String str15 = deleteRequest13.parent();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        org.elasticsearch.index.shard.IndexShard indexShard0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("");
        org.elasticsearch.index.VersionType versionType7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str13 = deleteRequest12.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.index.VersionType versionType22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.versionType(versionType22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str28 = deleteRequest27.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest8.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.routing("delete {[][null][null]}");
        deleteRequest35.primaryTerm((long) '#');
        org.elasticsearch.index.shard.ShardId shardId38 = deleteRequest35.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions39 = deleteRequest35.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest35.setShardId(shardId40);
        org.elasticsearch.index.translog.Translog.Location location42 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.RespondingWriteResult respondingWriteResult43 = null;
        org.elasticsearch.common.logging.ESLogger eSLogger44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.postWriteActions(indexShard0, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.delete.DeleteRequest>) deleteRequest41, location42, respondingWriteResult43, eSLogger44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][hi!][]}" + "'", str13, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][hi!][]}" + "'", str28, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNull(shardId38);
        org.junit.Assert.assertNotNull(indicesOptions39);
        org.junit.Assert.assertNotNull(deleteRequest41);
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.versionType(versionType8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("");
        java.lang.String str12 = deleteRequest11.index();
        deleteRequest11.primaryTerm((long) (short) 100);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy15 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("delete {[][delete {[null][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.setRefreshPolicy("");
        java.lang.String str28 = deleteRequest25.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest25.setRefreshPolicy("");
        java.lang.String str31 = deleteRequest30.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.routing("");
        org.elasticsearch.index.VersionType versionType38 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest35.versionType(versionType38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str44 = deleteRequest43.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = deleteRequest43.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest39.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest50.routing("");
        org.elasticsearch.index.VersionType versionType53 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest50.versionType(versionType53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str59 = deleteRequest58.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel60 = deleteRequest58.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest54.consistencyLevel(writeConsistencyLevel60);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest39.consistencyLevel(writeConsistencyLevel60);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest62.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest64.routing("delete {[][null][null]}");
        deleteRequest66.primaryTerm((long) '4');
        org.elasticsearch.common.unit.TimeValue timeValue69 = deleteRequest66.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest30.timeout(timeValue69);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest17.timeout(timeValue69);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = deleteRequest71.type("delete {[][hi!][]}");
        java.lang.String str74 = deleteRequest73.toString();
        java.lang.String str75 = deleteRequest73.index();
        java.lang.String str76 = deleteRequest73.type();
        org.elasticsearch.index.shard.IndexShard indexShard77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult78 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest73, indexShard77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + refreshPolicy15 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy15.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[][hi!][]}" + "'", str44, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel45 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel45.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "delete {[][hi!][]}" + "'", str59, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel60 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel60.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(timeValue69);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertNotNull(deleteRequest73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "delete {[][delete {[][hi!][]}][]}" + "'", str74, "delete {[][delete {[][hi!][]}][]}");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "delete {[][hi!][]}" + "'", str76, "delete {[][hi!][]}");
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][hi!][]}][hi!][]}", "delete {[][delete {[][delete {[][hi!][]}][delete {[][null][null]}]}][]}", "delete {[delete {[][hi!][]}][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.version(100L);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        deleteRequest3.remoteAddress(transportAddress7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str21 = deleteRequest20.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest20.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("hi!");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy27 = deleteRequest26.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest26.parent("delete {[delete {[][null][null]}][delete {[][null][null]}][]}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][hi!][]}" + "'", str21, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + refreshPolicy27 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy27.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.parent("delete {[][hi!][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest7.remoteAddress();
        java.lang.String str13 = deleteRequest7.routing();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9046");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long4 = deleteRequest3.version();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy5 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[][delete {[][null][hi!]}][]}");
        java.lang.String str9 = deleteRequest3.toString();
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest3.getParentTask();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertTrue("'" + refreshPolicy5 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy5.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[][][hi!]}" + "'", str9, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(taskId10);
    }

    @Test
    public void test9047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9047");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        java.lang.String str4 = deleteRequest3.index();
        deleteRequest3.setParentTask("delete {[][delete {[][hi!][]}][]}", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.routing("");
        org.elasticsearch.index.VersionType versionType14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.versionType(versionType14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = deleteRequest11.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.index("");
        java.lang.String str28 = deleteRequest25.toString();
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest25.getParentTask();
        deleteRequest21.setParentTask(taskId29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.routing("");
        org.elasticsearch.index.VersionType versionType37 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest34.versionType(versionType37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str43 = deleteRequest42.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = deleteRequest42.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest38.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest21.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest51.routing("");
        org.elasticsearch.index.VersionType versionType54 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest51.versionType(versionType54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str60 = deleteRequest59.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = deleteRequest59.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest55.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest66.routing("");
        org.elasticsearch.index.VersionType versionType69 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest66.versionType(versionType69);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str75 = deleteRequest74.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel76 = deleteRequest74.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest70.consistencyLevel(writeConsistencyLevel76);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = deleteRequest55.consistencyLevel(writeConsistencyLevel76);
        org.elasticsearch.tasks.TaskId taskId79 = deleteRequest78.getParentTask();
        deleteRequest47.setParentTask(taskId79);
        deleteRequest46.setParentTask(taskId79);
        org.elasticsearch.index.VersionType versionType82 = deleteRequest46.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest11.versionType(versionType82);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest83.type("delete {[null][null][null]}");
        java.lang.String str86 = deleteRequest85.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel87 = deleteRequest85.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest88 = deleteRequest3.consistencyLevel(writeConsistencyLevel87);
        org.elasticsearch.index.shard.IndexShard indexShard89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult90 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(transportAddress16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][hi!][]}" + "'", str28, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[][hi!][]}" + "'", str43, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[][hi!][]}" + "'", str60, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel61 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel61.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest68);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "delete {[][hi!][]}" + "'", str75, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel76 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel76.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNotNull(deleteRequest78);
        org.junit.Assert.assertNotNull(taskId79);
        org.junit.Assert.assertNotNull(versionType82);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "delete {[][delete {[null][null][null]}][]}" + "'", str86, "delete {[][delete {[null][null][null]}][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel87 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel87.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest88);
    }

    @Test
    public void test9048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9048");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = deleteRequest1.getRefreshPolicy();
        java.lang.String str3 = deleteRequest1.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.index("");
        java.lang.String str14 = deleteRequest11.toString();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest11.getParentTask();
        deleteRequest7.setParentTask(taskId15);
        java.lang.String[] strArray17 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.routing("");
        org.elasticsearch.tasks.TaskId taskId24 = null;
        deleteRequest23.setParentTask(taskId24);
        java.lang.String str26 = deleteRequest23.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy29 = deleteRequest28.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.setRefreshPolicy(refreshPolicy29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest7.setRefreshPolicy(refreshPolicy29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest7.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest7.routing("");
        java.lang.String str36 = deleteRequest7.toString();
        java.lang.String str37 = deleteRequest7.index();
        org.elasticsearch.index.VersionType versionType38 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest1.versionType(versionType38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest41.primaryTerm(10L);
        java.lang.String str44 = deleteRequest41.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = deleteRequest41.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest39.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.common.unit.TimeValue timeValue47 = deleteRequest46.timeout();
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][hi!][]}" + "'", str14, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "delete {[][hi!][]}" + "'", str26, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy29 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy29.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[][hi!][]}" + "'", str36, "delete {[][hi!][]}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(versionType38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[][null][null]}" + "'", str44, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel45 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel45.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(timeValue47);
    }

    @Test
    public void test9049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9049");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = deleteRequest5.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.setRefreshPolicy(refreshPolicy6);
        org.elasticsearch.index.VersionType versionType8 = deleteRequest1.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest1.type("");
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test9050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9050");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.versionType(versionType8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("");
        java.lang.String str12 = deleteRequest11.toString();
        long long13 = deleteRequest11.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.version((long) (short) 100);
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest11.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest18.primaryTerm(10L);
        java.lang.String[] strArray21 = deleteRequest18.indices();
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest11.timeout(timeValue22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.type("delete {[][delete {[][delete {[][delete {[][hi!][]}][delete {[][null][null]}]}][]}][delete {[][hi!][delete {[][hi!][]}]}]}");
        org.elasticsearch.index.shard.ShardId shardId26 = deleteRequest25.shardId();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNull(shardId26);
    }

    @Test
    public void test9051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9051");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.toString();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.setShardId(shardId3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setShardId(shardId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.setRefreshPolicy(refreshPolicy12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest4.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest4.id("delete {[hi!][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest4.id("delete {[][delete {[][hi!][delete {[null][delete {[hi!][null][null]}][null]}]}][]}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "delete {[][null][null]}" + "'", str2, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
    }

    @Test
    public void test9052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9052");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = deleteRequest1.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        long long7 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.routing("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest9.validate();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest9.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest9, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(versionType13);
    }

    @Test
    public void test9053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9053");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.index("");
        java.lang.String str14 = deleteRequest11.toString();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest11.getParentTask();
        deleteRequest7.setParentTask(taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.routing("");
        org.elasticsearch.index.VersionType versionType23 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest20.versionType(versionType23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str29 = deleteRequest28.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest7.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest36.routing("");
        org.elasticsearch.index.VersionType versionType39 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest36.versionType(versionType39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str45 = deleteRequest44.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = deleteRequest44.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest40.consistencyLevel(writeConsistencyLevel46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest51.routing("");
        org.elasticsearch.index.VersionType versionType54 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest51.versionType(versionType54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str60 = deleteRequest59.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = deleteRequest59.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest55.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest40.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest32.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest3.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.VersionType versionType70 = deleteRequest69.versionType();
        org.elasticsearch.common.unit.TimeValue timeValue71 = deleteRequest69.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = deleteRequest67.timeout(timeValue71);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][hi!][]}" + "'", str14, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[][hi!][]}" + "'", str29, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "delete {[][hi!][]}" + "'", str45, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel46 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel46.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[][hi!][]}" + "'", str60, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel61 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel61.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(versionType70);
        org.junit.Assert.assertNotNull(timeValue71);
        org.junit.Assert.assertNotNull(deleteRequest72);
    }

    @Test
    public void test9054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9054");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.index("");
        java.lang.String str10 = deleteRequest7.toString();
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest7.getParentTask();
        deleteRequest3.setParentTask(taskId11);
        java.lang.String[] strArray13 = deleteRequest3.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.index("delete {[delete {[][delete {[][hi!][]}][]}][hi!][]}");
        org.elasticsearch.common.unit.TimeValue timeValue18 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = deleteRequest25.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str34 = deleteRequest33.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = deleteRequest33.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest33.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.setRefreshPolicy("");
        java.lang.String[] strArray40 = deleteRequest37.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest37.id("delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest42.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest42.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest46.id("delete {[][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest46.routing("delete {[][hi!][delete {[][null][null]}]}");
        org.elasticsearch.tasks.TaskId taskId51 = deleteRequest46.getParentTask();
        org.elasticsearch.tasks.Task task52 = deleteRequest25.createTask((long) ' ', "delete {[][][hi!]}", "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][]}", taskId51);
        org.elasticsearch.tasks.Task task53 = deleteRequest15.createTask((long) 10, "delete {[][delete {[][hi!][]}][]}", "delete {[][hi!][hi!]}", taskId51);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest15.timeout("delete {[delete {[delete {[hi!][hi!][]}][null][null]}][hi!][delete {[][delete {[][hi!][]}][delete {[][null][null]}]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][hi!][]}][null][null]}][hi!][delete {[][delete {[][hi!][]}][delete {[][null][null]}]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][hi!][]}" + "'", str10, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(indicesOptions26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[][hi!][]}" + "'", str34, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel35 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel35.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(taskId51);
        org.junit.Assert.assertNotNull(task52);
        org.junit.Assert.assertNotNull(task53);
    }

    @Test
    public void test9055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9055");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setRefreshPolicy("");
        boolean boolean10 = deleteRequest9.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.index.VersionType versionType22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.versionType(versionType22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str28 = deleteRequest27.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.routing("");
        org.elasticsearch.index.VersionType versionType37 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest34.versionType(versionType37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str43 = deleteRequest42.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = deleteRequest42.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest38.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest23.consistencyLevel(writeConsistencyLevel44);
        org.elasticsearch.tasks.TaskId taskId47 = deleteRequest46.getParentTask();
        org.elasticsearch.tasks.Task task48 = deleteRequest12.createTask((long) 0, "delete {[][null][null]}", "delete {[][null][null]}", taskId47);
        org.elasticsearch.action.support.IndicesOptions indicesOptions49 = deleteRequest12.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "");
        org.elasticsearch.tasks.TaskId taskId54 = deleteRequest53.getParentTask();
        deleteRequest12.setParentTask(taskId54);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][hi!][]}" + "'", str28, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[][hi!][]}" + "'", str43, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(taskId47);
        org.junit.Assert.assertNotNull(task48);
        org.junit.Assert.assertNotNull(indicesOptions49);
        org.junit.Assert.assertNotNull(taskId54);
    }

    @Test
    public void test9056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9056");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.index("hi!");
        java.lang.String str7 = deleteRequest6.toString();
        long long8 = deleteRequest6.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.versionType(versionType15);
        org.elasticsearch.index.VersionType versionType17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest12.versionType(versionType17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest12.parent("");
        java.lang.String str21 = deleteRequest20.index();
        deleteRequest20.primaryTerm((long) (short) 100);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest20.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest6.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.setShardId(shardId26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest25.parent("delete {[hi!][hi!][]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest29.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest29.index("delete {[delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}][hi!][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress33 = deleteRequest32.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.parent("delete {[delete {[][hi!][delete {[][hi!][]}]}][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.parent("delete {[delete {[][hi!][]}][hi!][delete {[delete {[][hi!][hi!]}][hi!][delete {[][null][null]}]}]}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][null][null]}" + "'", str4, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[hi!][null][null]}" + "'", str7, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(transportAddress33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
    }

    @Test
    public void test9057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9057");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.routing("");
        org.elasticsearch.index.VersionType versionType14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str20 = deleteRequest19.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = deleteRequest19.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("");
        org.elasticsearch.index.VersionType versionType29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str35 = deleteRequest34.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel36 = deleteRequest34.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest15.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest3.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.type("delete {[][hi!][]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = deleteRequest41.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest41.version(10L);
        java.lang.String str45 = deleteRequest41.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][hi!][]}" + "'", str20, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel21 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel21.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "delete {[][hi!][]}" + "'", str35, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel36 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel36.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNull(actionRequestValidationException42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "delete {[][delete {[][hi!][]}][]}" + "'", str45, "delete {[][delete {[][hi!][]}][]}");
    }

    @Test
    public void test9058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9058");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.common.unit.TimeValue timeValue3 = deleteRequest1.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest1.consistencyLevel();
        org.elasticsearch.index.VersionType versionType5 = deleteRequest1.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.type("delete {[delete {[delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}][hi!][]}][delete {[delete {[][hi!][]}][hi!][]}][delete {[][delete {[null][null][null]}][]}]}");
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test9059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9059");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest7.parent("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest32.index("");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test9060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9060");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[][null][null]}", "delete {[][null][null]}");
        long long4 = deleteRequest3.primaryTerm();
        java.lang.String[] strArray5 = deleteRequest3.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("delete {[][hi!][]}");
        java.lang.String str9 = deleteRequest8.id();
        boolean boolean10 = deleteRequest8.getShouldPersistResult();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[][null][null]}" + "'", str9, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test9061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9061");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[delete {[][null][null]}][delete {[][null][null]}][]}][delete {[][delete {[][hi!][]}][]}][]}", "delete {[delete {[][delete {[][delete {[][hi!][]}][]}][hi!]}][hi!][]}");
    }

    @Test
    public void test9062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9062");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        deleteRequest7.primaryTerm((long) (short) 1);
        org.elasticsearch.common.transport.TransportAddress transportAddress33 = null;
        deleteRequest7.remoteAddress(transportAddress33);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy35 = deleteRequest7.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest7.type("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress38 = null;
        deleteRequest37.remoteAddress(transportAddress38);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertTrue("'" + refreshPolicy35 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy35.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest37);
    }

    @Test
    public void test9063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9063");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.versionType(versionType8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("");
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("");
        org.elasticsearch.index.VersionType versionType20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str26 = deleteRequest25.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest21.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.routing("");
        org.elasticsearch.index.VersionType versionType35 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest32.versionType(versionType35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str41 = deleteRequest40.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel42 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest36.consistencyLevel(writeConsistencyLevel42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest21.consistencyLevel(writeConsistencyLevel42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest44.type("delete {[][hi!][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy47 = deleteRequest46.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest11.setRefreshPolicy(refreshPolicy47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest11.parent("");
        org.elasticsearch.action.support.IndicesOptions indicesOptions51 = deleteRequest11.indicesOptions();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "delete {[][hi!][]}" + "'", str26, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel27 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel27.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[][hi!][]}" + "'", str41, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel42 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel42.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertTrue("'" + refreshPolicy47 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy47.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(indicesOptions51);
    }

    @Test
    public void test9064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9064");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.index("hi!");
        long long7 = deleteRequest6.version();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest6.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.id("delete {[delete {[][hi!][delete {[][hi!][]}]}][delete {[delete {[][delete {[][hi!][]}][]}][hi!][]}][delete {[][delete {[null][null][null]}][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.tasks.TaskId taskId15 = null;
        deleteRequest14.setParentTask(taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.routing("delete {[][hi!][delete {[][hi!][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.routing("");
        org.elasticsearch.index.VersionType versionType27 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest24.versionType(versionType27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str33 = deleteRequest32.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest32.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest28.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest35.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest20.timeout(timeValue36);
        java.lang.String str38 = deleteRequest20.parent();
        org.elasticsearch.index.VersionType versionType39 = deleteRequest20.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest6.versionType(versionType39);
        deleteRequest40.primaryTerm((long) 10);
        long long43 = deleteRequest40.primaryTerm();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][null][null]}" + "'", str4, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[][hi!][]}" + "'", str33, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(versionType39);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
    }

    @Test
    public void test9065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9065");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.index("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.index("");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest11.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest11.timeout();
        java.lang.String str14 = deleteRequest11.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.parent("delete {[][delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}][null]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = deleteRequest16.getRefreshPolicy();
        java.lang.String[] strArray18 = deleteRequest16.indices();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][hi!][delete {[][null][null]}]}" + "'", str14, "delete {[][hi!][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test9066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9066");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.routing("delete {[][null][null]}");
        deleteRequest34.primaryTerm((long) '#');
        org.elasticsearch.index.shard.ShardId shardId37 = deleteRequest34.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions38 = deleteRequest34.indicesOptions();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy39 = deleteRequest34.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest43.routing("");
        org.elasticsearch.index.VersionType versionType46 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest43.versionType(versionType46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str52 = deleteRequest51.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel53 = deleteRequest51.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest47.consistencyLevel(writeConsistencyLevel53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest34.consistencyLevel(writeConsistencyLevel53);
        org.elasticsearch.index.VersionType versionType56 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest55.versionType(versionType56);
        java.lang.String str58 = deleteRequest57.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress59 = null;
        deleteRequest57.remoteAddress(transportAddress59);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNull(shardId37);
        org.junit.Assert.assertNotNull(indicesOptions38);
        org.junit.Assert.assertTrue("'" + refreshPolicy39 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy39.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "delete {[][hi!][]}" + "'", str52, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel53 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel53.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "delete {[][null][null]}" + "'", str58, "delete {[][null][null]}");
    }

    @Test
    public void test9067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9067");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        deleteRequest8.setParentTask("delete {[hi!][hi!][]}", 10L);
        boolean boolean12 = deleteRequest8.getShouldPersistResult();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest8.versionType();
        java.lang.String str14 = deleteRequest8.index();
        java.lang.String str15 = deleteRequest8.index();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test9068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9068");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setShardId(shardId6);
        java.lang.String str8 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.routing("delete {[delete {[delete {[][null][hi!]}][null][null]}][delete {[delete {[][hi!][]}][null][null]}][delete {[hi!][][]}]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test9069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9069");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[][delete {[][hi!][]}][]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.index.VersionType versionType11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.versionType(versionType11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str17 = deleteRequest16.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.index.VersionType versionType26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest23.versionType(versionType26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str32 = deleteRequest31.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = deleteRequest31.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest12.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest35.getParentTask();
        deleteRequest4.setParentTask(taskId36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.index("");
        org.elasticsearch.common.unit.TimeValue timeValue44 = deleteRequest43.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest4.timeout(timeValue44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest45.setRefreshPolicy("");
        java.lang.String str48 = deleteRequest45.parent();
        org.elasticsearch.common.unit.TimeValue timeValue49 = deleteRequest45.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest3.timeout(timeValue49);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest54.routing("");
        org.elasticsearch.index.VersionType versionType57 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest54.versionType(versionType57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str63 = deleteRequest62.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel64 = deleteRequest62.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest58.consistencyLevel(writeConsistencyLevel64);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest65.version((long) '4');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest65.routing("");
        long long70 = deleteRequest65.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest72 = deleteRequest65.index("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long77 = deleteRequest76.version();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy78 = deleteRequest76.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest79 = deleteRequest72.setRefreshPolicy(refreshPolicy78);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest80 = deleteRequest3.setRefreshPolicy(refreshPolicy78);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest82 = deleteRequest80.version(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest84 = deleteRequest80.parent("delete {[hi!][hi!][hi!]}");
        long long85 = deleteRequest84.version();
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[][hi!][]}" + "'", str17, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[][hi!][]}" + "'", str32, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(timeValue49);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "delete {[][hi!][]}" + "'", str63, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel64 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel64.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 52L + "'", long70 == 52L);
        org.junit.Assert.assertNotNull(deleteRequest72);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-3L) + "'", long77 == (-3L));
        org.junit.Assert.assertTrue("'" + refreshPolicy78 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy78.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest79);
        org.junit.Assert.assertNotNull(deleteRequest80);
        org.junit.Assert.assertNotNull(deleteRequest82);
        org.junit.Assert.assertNotNull(deleteRequest84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test9070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9070");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.index("hi!");
        long long7 = deleteRequest6.version();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest6.remoteAddress();
        org.elasticsearch.action.support.IndicesOptions indicesOptions9 = deleteRequest6.indicesOptions();
        long long10 = deleteRequest6.version();
        boolean boolean11 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.routing("delete {[][hi!][delete {[][hi!][delete {[][hi!][delete {[][hi!][]}]}]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.version(100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][null][null]}" + "'", str4, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertNotNull(indicesOptions9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3L) + "'", long10 == (-3L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test9071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9071");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("");
        org.elasticsearch.index.VersionType versionType7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str13 = deleteRequest12.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.index.VersionType versionType22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.versionType(versionType22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str28 = deleteRequest27.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest8.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.tasks.TaskId taskId32 = deleteRequest31.getParentTask();
        deleteRequest0.setParentTask(taskId32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.index("");
        org.elasticsearch.common.unit.TimeValue timeValue40 = deleteRequest39.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest0.timeout(timeValue40);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = deleteRequest0.validate();
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][hi!][]}" + "'", str13, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][hi!][]}" + "'", str28, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(taskId32);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(timeValue40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
    }

    @Test
    public void test9072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9072");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[][null][null]}", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test9073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9073");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][delete {[][delete {[][hi!][]}][]}][null]}][hi!][]}", "delete {[][delete {[][hi!][]}][delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}]}", "delete {[null][delete {[hi!][null][null]}][null]}");
        java.lang.String[] strArray4 = deleteRequest3.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("delete {[delete {[][null][hi!]}][delete {[delete {[][null][null]}][delete {[null][null][null]}][delete {[][null][null]}]}][delete {[hi!][null][null]}]}");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test9074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9074");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.type("delete {[][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.routing("delete {[][null][null]}");
        deleteRequest34.primaryTerm((long) '#');
        org.elasticsearch.index.shard.ShardId shardId37 = deleteRequest34.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions38 = deleteRequest34.indicesOptions();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy39 = deleteRequest34.getRefreshPolicy();
        org.elasticsearch.index.VersionType versionType40 = deleteRequest34.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest44.index("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy47 = deleteRequest46.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy49 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest48.setRefreshPolicy(refreshPolicy49);
        org.elasticsearch.common.transport.TransportAddress transportAddress51 = deleteRequest48.remoteAddress();
        org.elasticsearch.index.VersionType versionType52 = deleteRequest48.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest46.versionType(versionType52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest34.versionType(versionType52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest54.id("");
        long long57 = deleteRequest56.version();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException58 = deleteRequest56.validate();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNull(shardId37);
        org.junit.Assert.assertNotNull(indicesOptions38);
        org.junit.Assert.assertTrue("'" + refreshPolicy39 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy39.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(versionType40);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertTrue("'" + refreshPolicy47 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy47.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNull(transportAddress51);
        org.junit.Assert.assertNotNull(versionType52);
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-3L) + "'", long57 == (-3L));
        org.junit.Assert.assertNull(actionRequestValidationException58);
    }

    @Test
    public void test9075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9075");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str21 = deleteRequest20.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest20.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.routing("");
        org.elasticsearch.index.VersionType versionType30 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest27.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str36 = deleteRequest35.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel37 = deleteRequest35.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest31.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest16.consistencyLevel(writeConsistencyLevel37);
        org.elasticsearch.tasks.TaskId taskId40 = deleteRequest39.getParentTask();
        deleteRequest8.setParentTask(taskId40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest45.index("");
        org.elasticsearch.common.unit.TimeValue timeValue48 = deleteRequest47.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest8.timeout(timeValue48);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException50 = deleteRequest49.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure52 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[][delete {[][hi!][]}][]}", (java.lang.Throwable) actionRequestValidationException50, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][hi!][]}", (java.lang.Throwable) actionRequestValidationException50, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure56 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException50, "delete {[null][delete {[][hi!][]}][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure58 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException50, "delete {[delete {[delete {[hi!][hi!][]}][null][null]}][hi!][]}");
        java.lang.Throwable throwable59 = shardFailure58.cause;
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][hi!][]}" + "'", str21, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[][hi!][]}" + "'", str36, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel37 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel37.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(taskId40);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(timeValue48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(actionRequestValidationException50);
        org.junit.Assert.assertNotNull(throwable59);
        org.junit.Assert.assertEquals(throwable59.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable59.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable59.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
    }

    @Test
    public void test9076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9076");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.routing("delete {[delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("delete {[delete {[][null][hi!]}][delete {[delete {[][delete {[][hi!][]}][]}][hi!][]}][delete {[][null][null]}]}");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
    }

    @Test
    public void test9077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9077");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.index("");
        java.lang.String str10 = deleteRequest7.toString();
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest7.getParentTask();
        deleteRequest3.setParentTask(taskId11);
        java.lang.String[] strArray13 = deleteRequest3.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("");
        org.elasticsearch.tasks.TaskId taskId20 = null;
        deleteRequest19.setParentTask(taskId20);
        java.lang.String str22 = deleteRequest19.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy25 = deleteRequest24.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest19.setRefreshPolicy(refreshPolicy25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.setRefreshPolicy(refreshPolicy25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest3.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest29.type("delete {[][delete {[null][null][null]}][]}");
        org.elasticsearch.index.shard.ShardId shardId34 = deleteRequest33.shardId();
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][hi!][]}" + "'", str10, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[][hi!][]}" + "'", str22, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy25 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy25.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNull(shardId34);
    }

    @Test
    public void test9078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9078");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.index("delete {[][delete {[][hi!][]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.parent("delete {[][hi!][delete {[][hi!][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.parent("delete {[][hi!][delete {[][hi!][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.type("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][delete {[][delete {[][hi!][]}][]}]}", "delete {[delete {[][null][null]}][delete {[null][null][null]}][delete {[][null][null]}]}", "delete {[delete {[][delete {[delete {[][null][null]}][delete {[][null][null]}][delete {[][null][null]}]}][null]}][null][null]}");
        java.lang.String[] strArray22 = deleteRequest21.indices();
        java.lang.String[] strArray23 = deleteRequest21.indices();
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest21.getParentTask();
        deleteRequest15.setParentTask(taskId24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.routing("");
        org.elasticsearch.index.VersionType versionType32 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest29.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str38 = deleteRequest37.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = deleteRequest37.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest33.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.version((long) '4');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest40.routing("");
        long long45 = deleteRequest40.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest40.index("delete {[][null][null]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy48 = deleteRequest40.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest15.setRefreshPolicy(refreshPolicy48);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(taskId24);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "delete {[][hi!][]}" + "'", str38, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel39 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel39.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertTrue("'" + refreshPolicy48 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy48.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest49);
    }

    @Test
    public void test9079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9079");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[][hi!][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest9.getRefreshPolicy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][]}" + "'", str4, "delete {[][hi!][]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test9080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9080");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("");
        org.elasticsearch.index.VersionType versionType7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str13 = deleteRequest12.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.index.VersionType versionType22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.versionType(versionType22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str28 = deleteRequest27.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest8.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.tasks.TaskId taskId32 = deleteRequest31.getParentTask();
        deleteRequest0.setParentTask(taskId32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.index("");
        org.elasticsearch.common.unit.TimeValue timeValue40 = deleteRequest39.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest0.timeout(timeValue40);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = deleteRequest41.validate();
        java.lang.String str43 = deleteRequest41.type();
        org.elasticsearch.common.transport.TransportAddress transportAddress44 = null;
        deleteRequest41.remoteAddress(transportAddress44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest47.primaryTerm(10L);
        java.lang.String[] strArray50 = deleteRequest47.indices();
        org.elasticsearch.common.unit.TimeValue timeValue51 = deleteRequest47.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest41.timeout(timeValue51);
        deleteRequest41.primaryTerm((long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest41.id("delete {[delete {[][delete {[][delete {[][hi!][]}][delete {[][null][null]}]}][]}][delete {[][delete {[][hi!][]}][]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][hi!][]}" + "'", str13, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][hi!][]}" + "'", str28, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(taskId32);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(timeValue40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(timeValue51);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(deleteRequest56);
    }

    @Test
    public void test9081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9081");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        long long4 = deleteRequest3.version();
        boolean boolean5 = deleteRequest3.getShouldPersistResult();
        long long6 = deleteRequest3.version();
        org.elasticsearch.index.VersionType versionType7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest8.timeout();
        boolean boolean11 = deleteRequest8.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][hi!][]}][]}", "delete {[][null][null]}", "");
        boolean boolean19 = deleteRequest18.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.index("");
        java.lang.String str33 = deleteRequest30.toString();
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest30.getParentTask();
        deleteRequest26.setParentTask(taskId34);
        org.elasticsearch.tasks.Task task36 = deleteRequest18.createTask((long) ' ', "", "delete {[hi!][null][null]}", taskId34);
        org.elasticsearch.tasks.TaskId taskId37 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task38 = deleteRequest8.createTask((long) 'a', "delete {[][delete {[][null][hi!]}][]}", "delete {[][delete {[][hi!][]}][delete {[][hi!][]}]}", taskId37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][hi!][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str45 = deleteRequest44.toString();
        deleteRequest44.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest51.routing("");
        org.elasticsearch.index.VersionType versionType54 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest51.versionType(versionType54);
        org.elasticsearch.common.transport.TransportAddress transportAddress56 = deleteRequest51.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy57 = deleteRequest51.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest44.setRefreshPolicy(refreshPolicy57);
        long long59 = deleteRequest58.version();
        long long60 = deleteRequest58.version();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy61 = deleteRequest58.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest40.setRefreshPolicy(refreshPolicy61);
        org.elasticsearch.tasks.TaskId taskId63 = deleteRequest62.getParentTask();
        deleteRequest8.setParentTask(taskId63);
        org.elasticsearch.common.transport.TransportAddress transportAddress65 = null;
        deleteRequest8.remoteAddress(transportAddress65);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[][hi!][]}" + "'", str33, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(task36);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertNotNull(task38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "delete {[][hi!][]}" + "'", str45, "delete {[][hi!][]}");
        org.junit.Assert.assertNotNull(deleteRequest53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNull(transportAddress56);
        org.junit.Assert.assertTrue("'" + refreshPolicy57 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy57.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-3L) + "'", long59 == (-3L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-3L) + "'", long60 == (-3L));
        org.junit.Assert.assertTrue("'" + refreshPolicy61 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy61.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(taskId63);
    }

    @Test
    public void test9082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9082");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("");
        org.elasticsearch.index.VersionType versionType6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.versionType(versionType6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.index.VersionType versionType21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest18.versionType(versionType21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest7.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest30.getParentTask();
        java.lang.String str32 = deleteRequest30.getDescription();
        java.lang.String str33 = deleteRequest30.routing();
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest30.getParentTask();
        org.elasticsearch.index.VersionType versionType35 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest30.versionType(versionType35);
        org.elasticsearch.index.VersionType versionType37 = deleteRequest36.versionType();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][]}" + "'", str12, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[][hi!][]}" + "'", str27, "delete {[][hi!][]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[][hi!][]}" + "'", str32, "delete {[][hi!][]}");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNull(versionType37);
    }
}

