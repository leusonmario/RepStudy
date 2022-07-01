import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable5, writeResult6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.setRefreshPolicy("");
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest14.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest20.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest14, false, (java.lang.Throwable) actionRequestValidationException22, writeResult23);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, (java.lang.Throwable) actionRequestValidationException22, writeResult25);
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = null;
        bulkShardRequest3.remoteAddress(transportAddress27);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting32 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting34 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result36 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result37 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable40 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result37, (org.elasticsearch.action.ActionRequest) bulkShardRequest38, true, throwable40, writeResult41);
        org.elasticsearch.index.shard.ShardId shardId43 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = bulkShardRequest38.setShardId(shardId43);
        org.elasticsearch.common.unit.TimeValue timeValue45 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest38.timeout(timeValue45);
        java.lang.String str47 = bulkShardRequest38.index();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting49 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result51 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder53, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest54);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException56 = bulkShardRequest54.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder59, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = bulkShardRequest60.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult63 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult64 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result51, (org.elasticsearch.action.ActionRequest) bulkShardRequest54, false, (java.lang.Throwable) actionRequestValidationException62, writeResult63);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure66 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting49, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException62, "delete");
        java.lang.Throwable throwable67 = shardFailure66.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult68 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult69 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result36, (org.elasticsearch.action.ActionRequest) bulkShardRequest38, true, throwable67, writeResult68);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure71 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting34, "index.version.created", throwable67, "current version [97] is higher than the one provided [0]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure73 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting32, "current version [2] is higher than the one provided [10]", throwable67, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure75 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting30, "", throwable67, "");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult76 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult77 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, throwable67, writeResult76);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(bulkShardRequest44);
        org.junit.Assert.assertNotNull(timeValue45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(actionRequestValidationException56);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertNotNull(throwable67);
        org.junit.Assert.assertEquals(throwable67.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable67.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable67.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest9.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest15.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, (java.lang.Throwable) actionRequestValidationException17, writeResult18);
        java.lang.Throwable throwable20 = updateResult19.error;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "index.version.created_string", throwable20, "index.shadow_replicas");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [0] is different than the one provided [-1]", throwable20, "index.number_of_shards");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable20, "current version [10] is higher than the one provided [35]");
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable20.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.timeout(timeValue12);
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest7.getParentTask();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest7.validate();
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = bulkShardRequest7.timeout(timeValue12);
        org.elasticsearch.index.shard.ShardId shardId14 = bulkShardRequest13.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest13);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap17 = indexMetaData16.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData16);
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable23 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result20, (org.elasticsearch.action.ActionRequest) bulkShardRequest21, true, throwable23, writeResult24);
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result28 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder30, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, writeResult35);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder30, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult38 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult39 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result28, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, writeResult38);
        bulkShardRequest34.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result43 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple47 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder45, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest46);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException48 = bulkShardRequest46.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple53 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder51, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest52);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException54 = bulkShardRequest52.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult55 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult56 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result43, (org.elasticsearch.action.ActionRequest) bulkShardRequest46, false, (java.lang.Throwable) actionRequestValidationException54, writeResult55);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult57 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult58 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, true, (java.lang.Throwable) actionRequestValidationException54, writeResult57);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult59 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult60 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest21, false, (java.lang.Throwable) actionRequestValidationException54, writeResult59);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder18, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy62 = bulkShardRequest21.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest63 = bulkShardRequest13.setRefreshPolicy(refreshPolicy62);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = bulkShardRequest63.timeout("_na_");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [_na_] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(bulkShardRequest13);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(actionRequestValidationException48);
        org.junit.Assert.assertNotNull(actionRequestValidationException54);
        org.junit.Assert.assertTrue("'" + refreshPolicy62 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy62.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest63);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        java.lang.String str13 = bulkShardRequest9.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple18 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder16, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = bulkShardRequest17.setShardId(shardId20);
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable25 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, true, throwable25, writeResult26);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest23.setShardId(shardId28);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest23.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest21.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest9.timeout(timeValue30);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest33.index("index.number_of_shards");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException40 = bulkShardRequest38.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, true, (java.lang.Throwable) actionRequestValidationException40, writeResult41);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult43 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult44 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, actionRequest1, true, (java.lang.Throwable) actionRequestValidationException40, writeResult43);
        org.elasticsearch.action.ActionRequest actionRequest45 = updateResult44.actionRequest;
        boolean boolean46 = updateResult44.retry;
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bulkShardRequest21);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(bulkShardRequest35);
        org.junit.Assert.assertNotNull(actionRequestValidationException40);
        org.junit.Assert.assertNull(actionRequest45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean9 = indexMetaData0.isSameUUID("index.blocks.write");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mapping("current version [-1] is different than the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult19 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult20 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest18, writeResult19);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder14.index("_na_");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData25 = builder14.mapping("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder14.setRoutingNumShards((int) '4');
        int int28 = builder27.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state30 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        byte byte31 = state30.id();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData32 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int33 = indexMetaData32.getNumberOfReplicas();
        long long34 = indexMetaData32.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters35 = indexMetaData32.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData36 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff37 = indexMetaData32.diff(indexMetaData36);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.State, org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData>> stateTuple38 = org.elasticsearch.common.collect.Tuple.tuple(state30, indexMetaDataDiff37);
        byte byte39 = state30.id();
        byte byte40 = state30.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder27.state(state30);
        byte byte42 = state30.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder12.state(state30);
        java.util.Set<java.lang.String> strSet45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder43.putActiveAllocationIds((int) (byte) 0, strSet45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(mappingMetaData25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + state30 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state30.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertNotNull(indexMetaData32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters35);
        org.junit.Assert.assertNotNull(indexMetaData36);
        org.junit.Assert.assertNotNull(indexMetaDataDiff37);
        org.junit.Assert.assertNotNull(stateTuple38);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 0 + "'", byte42 == (byte) 0);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getNumberOfReplicas();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData4.includeFilters();
        boolean boolean9 = indexMetaData4.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap11 = indexMetaData4.getActiveAllocationIds();
        org.elasticsearch.Version version12 = indexMetaData4.getCreationVersion();
        int int13 = indexMetaData4.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        java.lang.String[] strArray44 = new java.lang.String[] { "delete", "index.auto_expand_replicas", "index.creation_date", "delete", "hi!", "index.auto_expand_replicas", "index.blocks.read_only", "active_allocations", "_na_", "current version [1] is different than the one provided [-1]", "index.number_of_shards", "index.blocks.write", "index.blocks.write", "index.blocks.metadata", "index.shared_filesystem.recover_on_any_node", "index.priority", "active_allocations", "current version [97] is higher than the one provided [0]", "primary_terms", "index.blocks.read_only", "delete", "index.version.upgraded_string", "active_allocations", "index.version.upgraded" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder18.putActiveAllocationIds((-1), (java.util.Set<java.lang.String>) strSet45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder15.putActiveAllocationIds((int) (byte) 3, (java.util.Set<java.lang.String>) strSet45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder2.putActiveAllocationIds((int) '4', (java.util.Set<java.lang.String>) strSet45);
        int int50 = builder2.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom52 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder2.putCustom("index.creation_date", custom52);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder2.putMapping(mappingMetaData54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards(100);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable7 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, true, throwable7, writeResult8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        long long14 = builder1.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfReplicas();
        long long17 = indexMetaData15.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData15.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData15.diff(indexMetaData19);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData15.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = indexMetaData15.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder1.state(state22);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int25 = indexMetaData24.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData24);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap27 = indexMetaData24.getCustoms();
        org.elasticsearch.common.settings.Settings settings28 = indexMetaData24.getSettings();
        boolean boolean29 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings28);
        boolean boolean30 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder1.settings(settings28);
        boolean boolean32 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings28);
        boolean boolean33 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings28);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(indexMetaData24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        long long3 = versionType0.updateVersion((long) 10, 10L);
        boolean boolean5 = versionType0.validateVersionForReads((long) ' ');
        boolean boolean9 = versionType0.isVersionConflictForWrites(100L, (long) '4', true);
        java.lang.String str13 = versionType0.explainConflictForWrites(0L, 2L, false);
        boolean boolean15 = versionType0.validateVersionForWrites((long) (byte) 2);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "current version [0] is higher than the one provided [2]" + "'", str13, "current version [0] is higher than the one provided [2]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataMetaDataStateFormat0 = org.elasticsearch.cluster.metadata.IndexMetaData.FORMAT;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfReplicas();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataMetaDataStateFormatTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.metadata.IndexMetaData>(indexMetaDataMetaDataStateFormat0, indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        int int6 = indexMetaData1.getRoutingFactor();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, writeResult17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, writeResult20);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder9, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.action.update.UpdateHelper.Result result23 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException29 = bulkShardRequest27.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder32, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest33);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException35 = bulkShardRequest33.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, false, (java.lang.Throwable) actionRequestValidationException35, writeResult36);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest27.consistencyLevel(writeConsistencyLevel38);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy40 = bulkShardRequest39.getRefreshPolicy();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result23, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult41);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder9, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.support.IndicesOptions indicesOptions44 = bulkShardRequest39.indicesOptions();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple45 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder7, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel46 = bulkShardRequest39.consistencyLevel();
        org.junit.Assert.assertNotNull(indexMetaDataMetaDataStateFormat0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(actionRequestValidationException29);
        org.junit.Assert.assertNotNull(actionRequestValidationException35);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertTrue("'" + refreshPolicy40 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy40.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions44);
        org.junit.Assert.assertNull(writeConsistencyLevel46);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder15, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = bulkShardRequest16.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder21, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest22.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result13, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, false, (java.lang.Throwable) actionRequestValidationException24, writeResult25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest16);
        org.elasticsearch.action.ActionRequest actionRequest28 = bulkItemRequest27.request();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder30, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, writeResult35);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder30, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.tasks.TaskId taskId38 = bulkShardRequest34.getParentTask();
        actionRequest28.setParentTask(taskId38);
        bulkShardRequest7.setParentTask(taskId38);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult41 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult42 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult41);
        org.elasticsearch.action.update.UpdateHelper.Result result43 = updateResult42.result;
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(actionRequest28);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNull(result43);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        boolean boolean9 = indexMetaData0.isSameUUID("index.blocks.write");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mapping("current version [-1] is different than the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.numberOfShards((int) (byte) 3);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap8 = indexMetaData0.getCustoms();
        long long9 = indexMetaData0.getVersion();
        long long10 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int7 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData0.getSettings();
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings8);
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings8, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(settings10);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("state-");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) (short) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest8 = builderTuple7.v2();
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder11, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest12.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder17, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = bulkShardRequest18.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, false, (java.lang.Throwable) actionRequestValidationException20, writeResult21);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple23 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) bulkShardRequestActionRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, bulkShardRequestActionRequest8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder1.numberOfShards((int) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder26.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder26.setRoutingNumShards(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int31 = indexMetaData30.getNumberOfReplicas();
        long long32 = indexMetaData30.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters33 = indexMetaData30.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData34 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff35 = indexMetaData30.diff(indexMetaData34);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters36 = indexMetaData30.getInitialRecoveryFilters();
        int int37 = indexMetaData30.getNumberOfReplicas();
        org.elasticsearch.common.settings.Settings settings38 = indexMetaData30.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state39 = indexMetaData30.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder26.state(state39);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest8);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters33);
        org.junit.Assert.assertNotNull(indexMetaData34);
        org.junit.Assert.assertNotNull(indexMetaDataDiff35);
        org.junit.Assert.assertNull(discoveryNodeFilters36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertTrue("'" + state39 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state39.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.setShardId(shardId8);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest3.index("index.blocks.write");
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest3.timeout(timeValue13);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest14, writeResult15);
        java.lang.String str17 = bulkShardRequest14.index();
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest14.shardId();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder21, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, writeResult26);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder21, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest25);
        org.elasticsearch.index.shard.ShardId shardId30 = bulkShardRequest25.shardId();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy31 = bulkShardRequest25.getRefreshPolicy();
        org.elasticsearch.common.unit.TimeValue timeValue32 = bulkShardRequest25.timeout();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy33 = bulkShardRequest25.getRefreshPolicy();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy34 = bulkShardRequest25.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest14.setRefreshPolicy(refreshPolicy34);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest35);
        org.elasticsearch.common.io.stream.StreamInput streamInput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest35.readFrom(streamInput37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "index.blocks.write" + "'", str17, "index.blocks.write");
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNull(shardId30);
        org.junit.Assert.assertTrue("'" + refreshPolicy31 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy31.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(timeValue32);
        org.junit.Assert.assertTrue("'" + refreshPolicy33 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy33.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + refreshPolicy34 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy34.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest35);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("_na_");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap10 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData0.getSettings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData14 = indexMetaData0.mapping("current version [10] is different than the one provided [3]");
        int int15 = indexMetaData0.getRoutingNumShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNull(mappingMetaData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.fromString("current version [0] is different than the one provided [32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [0] is different than the one provided [32]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        int int3 = builder2.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest8 = builderTuple7.v2();
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder11, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest12.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder17, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = bulkShardRequest18.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult21 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult22 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, false, (java.lang.Throwable) actionRequestValidationException20, writeResult21);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple23 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) bulkShardRequestActionRequest8, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, true, throwable29, writeResult30);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest32 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable36 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, true, throwable36, writeResult37);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest34.setShardId(shardId39);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = bulkShardRequest34.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest27.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest42);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest44 = builderTuple43.v2();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequestActionRequest44);
        org.elasticsearch.common.io.stream.StreamInput streamInput46 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkItemRequest45.readFrom(streamInput46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest8);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel41 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel41.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest44);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        int int7 = indexMetaData0.getRoutingFactor();
        java.util.Set<java.lang.String> strSet9 = indexMetaData0.activeAllocationIds((int) (byte) 0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("update");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.requireFilters();
        org.elasticsearch.index.Index index13 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.Version version14 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state15 = indexMetaData0.getState();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertTrue("'" + state15 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state15.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        int int9 = indexMetaData0.getNumberOfReplicas();
        int int10 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap11 = indexMetaData0.getAliases();
        long long12 = indexMetaData0.getCreationDate();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataMetaDataStateFormat0 = org.elasticsearch.cluster.metadata.IndexMetaData.FORMAT;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean4 = versionType1.isVersionConflictForReads((long) 100, (long) (byte) -1);
        byte byte5 = versionType1.getValue();
        boolean boolean7 = versionType1.validateVersionForWrites((long) (byte) 10);
        java.lang.String str11 = versionType1.explainConflictForWrites((long) (byte) 100, 100L, false);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.index.VersionType> indexMetaDataMetaDataStateFormatTuple12 = org.elasticsearch.common.collect.Tuple.tuple(indexMetaDataMetaDataStateFormat0, versionType1);
        java.lang.String str16 = versionType1.explainConflictForWrites((long) 97, (long) (short) 100, true);
        org.elasticsearch.index.VersionType versionType17 = versionType1.versionTypeForReplicationAndRecovery();
        byte byte18 = versionType1.getValue();
        org.junit.Assert.assertNotNull(indexMetaDataMetaDataStateFormat0);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 2 + "'", byte5 == (byte) 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [100] is higher than the one provided [100]" + "'", str11, "current version [100] is higher than the one provided [100]");
        org.junit.Assert.assertNotNull(indexMetaDataMetaDataStateFormatTuple12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "current version [97] is higher than the one provided [100]" + "'", str16, "current version [97] is higher than the one provided [100]");
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 2 + "'", byte18 == (byte) 2);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, true, throwable6, writeResult7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest9 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable13 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, true, throwable13, writeResult14);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = bulkShardRequest11.setShardId(shardId16);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest11.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = bulkShardRequest4.consistencyLevel(writeConsistencyLevel18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting24 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable30 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, true, throwable30, writeResult31);
        org.elasticsearch.action.update.UpdateHelper.Result result34 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder36, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest37);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException39 = bulkShardRequest37.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder42, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest43);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException45 = bulkShardRequest43.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult46 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult47 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result34, (org.elasticsearch.action.ActionRequest) bulkShardRequest37, false, (java.lang.Throwable) actionRequestValidationException45, writeResult46);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult48 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult49 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, false, (java.lang.Throwable) actionRequestValidationException45, writeResult48);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure51 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting24, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException45, "delete");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure53 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting22, "index.shadow_replicas", (java.lang.Throwable) actionRequestValidationException45, "state-");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult54 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult55 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, false, (java.lang.Throwable) actionRequestValidationException45, writeResult54);
        org.elasticsearch.tasks.TaskId taskId56 = bulkShardRequest4.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress57 = null;
        bulkShardRequest4.remoteAddress(transportAddress57);
        java.lang.String str59 = bulkShardRequest4.index();
        boolean boolean60 = bulkShardRequest4.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = bulkShardRequest4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bulkShardRequest17);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException39);
        org.junit.Assert.assertNotNull(actionRequestValidationException45);
        org.junit.Assert.assertNotNull(taskId56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards(100);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable7 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, true, throwable7, writeResult8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        int int13 = builder1.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder1.numberOfReplicas((int) (short) 10);
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder18, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = bulkShardRequest19.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder24, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest25.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, false, (java.lang.Throwable) actionRequestValidationException27, writeResult28);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest19.setShardId(shardId32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder15, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        long long35 = bulkShardRequest19.primaryTerm();
        boolean boolean36 = bulkShardRequest19.getShouldPersistResult();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest9.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult15);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest(3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.io.stream.StreamInput streamInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bulkShardRequest9.readFrom(streamInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId13);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder1.index("current version [35] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state18 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder16.state(state18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder16.index("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int25 = indexMetaData24.getNumberOfReplicas();
        long long26 = indexMetaData24.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters27 = indexMetaData24.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters28 = indexMetaData24.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData30 = indexMetaData24.mapping("index.version.created");
        org.elasticsearch.common.settings.Settings settings31 = indexMetaData24.getSettings();
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder23.settings(settings32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder16.settings(settings32);
        int int35 = builder16.numberOfShards();
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + state18 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state18.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(indexMetaData24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters27);
        org.junit.Assert.assertNull(discoveryNodeFilters28);
        org.junit.Assert.assertNull(mappingMetaData30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        int int2 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest7 = builderTuple6.v2();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder10, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest11.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple18 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder16, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = bulkShardRequest17.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, false, (java.lang.Throwable) actionRequestValidationException19, writeResult20);
        org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> objTuple22 = new org.elasticsearch.common.collect.Tuple<java.lang.Object, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.Object) bulkShardRequestActionRequest7, (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder1.creationDate((-1L));
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest28 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException29 = bulkShardRequest27.validate();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder25, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest31 = builderTuple30.v2();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builderTuple30.v1();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder32.setRoutingNumShards(32);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int36 = indexMetaData35.getNumberOfReplicas();
        long long37 = indexMetaData35.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters38 = indexMetaData35.includeFilters();
        java.lang.String str39 = indexMetaData35.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state40 = indexMetaData35.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder34.state(state40);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder41.primaryTerm((int) (byte) 2, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(actionRequestValidationException29);
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "_na_" + "'", str39, "_na_");
        org.junit.Assert.assertTrue("'" + state40 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state40.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int7 = indexMetaData0.getNumberOfShards();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mapping("current version [10] is higher than the one provided [35]");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData0.requireFilters();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData0.getSettings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap13 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult2 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult3 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest1, writeResult2);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest4 = updateResult3.request();
        org.elasticsearch.action.update.UpdateResponse updateResponse5 = updateResult3.noopResult;
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest4);
        org.junit.Assert.assertNull(updateResponse5);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataMetaDataStateFormat0 = org.elasticsearch.cluster.metadata.IndexMetaData.FORMAT;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfReplicas();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataMetaDataStateFormatTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.gateway.MetaDataStateFormat<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.cluster.metadata.IndexMetaData>(indexMetaDataMetaDataStateFormat0, indexMetaData1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap5 = indexMetaData1.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        int int7 = indexMetaData1.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        org.apache.lucene.util.Version version9 = indexMetaData1.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaDataMetaDataStateFormat0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(version9);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_shards");
        java.lang.String[] strArray18 = new java.lang.String[] { "state-", "index.creation_date_string", "index.version.created_string", "", "", "index.shared_filesystem.recover_on_any_node", "index.version.upgraded_string", "index.version.minimum_compatible", "index.creation_date", "index.creation_date_string", "index.version.upgraded", "delete", "index.version.upgraded", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder2.putActiveAllocationIds((int) (byte) 0, (java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder2.index("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder27, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.action.update.UpdateHelper.Result result30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result30, (org.elasticsearch.action.ActionRequest) bulkShardRequest31, writeResult32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder27, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest31);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder23, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest31.index("index.number_of_shards");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult40 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult41 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult40);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult42 = updateResult41.writeResult;
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNull(writeResult42);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable5, writeResult6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.setRefreshPolicy("");
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet10 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest16, writeResult17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder12.numberOfShards(10);
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder24, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest25.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple32 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder30, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException33 = bulkShardRequest31.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult34 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult35 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest25, false, (java.lang.Throwable) actionRequestValidationException33, writeResult34);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel36 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest37 = bulkShardRequest25.consistencyLevel(writeConsistencyLevel36);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple38 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder21, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.common.collect.Tuple<java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>> indexShardStateSetTuple39 = new org.elasticsearch.common.collect.Tuple<java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>>((java.util.AbstractSet<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet10, builderTuple38);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.IndicesRequest, java.util.Collection<org.elasticsearch.index.shard.IndexShardState>> indicesRequestTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.IndicesRequest, java.util.Collection<org.elasticsearch.index.shard.IndexShardState>>((org.elasticsearch.action.IndicesRequest) bulkShardRequest9, (java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet10);
        org.elasticsearch.index.shard.ShardId shardId41 = bulkShardRequest9.shardId();
        org.elasticsearch.action.update.UpdateHelper.Result result42 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result43 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable46 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult47 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult48 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result43, (org.elasticsearch.action.ActionRequest) bulkShardRequest44, true, throwable46, writeResult47);
        org.elasticsearch.index.shard.ShardId shardId49 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = bulkShardRequest44.setShardId(shardId49);
        org.elasticsearch.common.unit.TimeValue timeValue51 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = bulkShardRequest44.timeout(timeValue51);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting54 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result56 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest59 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple60 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder58, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest59);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException61 = bulkShardRequest59.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest65 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple66 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder64, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest65);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException67 = bulkShardRequest65.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult68 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult69 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result56, (org.elasticsearch.action.ActionRequest) bulkShardRequest59, false, (java.lang.Throwable) actionRequestValidationException67, writeResult68);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure71 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting54, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException67, "delete");
        java.lang.Throwable throwable72 = shardFailure71.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult73 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult74 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result42, (org.elasticsearch.action.ActionRequest) bulkShardRequest44, true, throwable72, writeResult73);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel75 = bulkShardRequest44.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest76 = bulkShardRequest9.consistencyLevel(writeConsistencyLevel75);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest77 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy78 = bulkShardRequest9.getRefreshPolicy();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult79 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult80 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult79);
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(indexShardStateSet10);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertNotNull(actionRequestValidationException33);
        org.junit.Assert.assertNotNull(bulkShardRequest37);
        org.junit.Assert.assertNull(shardId41);
        org.junit.Assert.assertNotNull(bulkShardRequest50);
        org.junit.Assert.assertNotNull(timeValue51);
        org.junit.Assert.assertNotNull(bulkShardRequest52);
        org.junit.Assert.assertNotNull(actionRequestValidationException61);
        org.junit.Assert.assertNotNull(actionRequestValidationException67);
        org.junit.Assert.assertNotNull(throwable72);
        org.junit.Assert.assertEquals(throwable72.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable72.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable72.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel75 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel75.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest76);
        org.junit.Assert.assertTrue("'" + refreshPolicy78 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy78.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) 100, (long) (byte) -1);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) '4', (long) '#');
        java.lang.String str9 = versionType0.explainConflictForReads(35L, 100L);
        boolean boolean12 = versionType0.isVersionConflictForReads((long) (short) 10, (long) (byte) -1);
        boolean boolean14 = versionType0.validateVersionForReads((long) (byte) 10);
        boolean boolean16 = versionType0.validateVersionForReads((-1L));
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, true, throwable21, writeResult22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = bulkShardRequest19.setShardId(shardId24);
        org.elasticsearch.common.unit.TimeValue timeValue26 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = bulkShardRequest19.timeout(timeValue26);
        java.lang.String str28 = bulkShardRequest19.index();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result32 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder34, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest35);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException37 = bulkShardRequest35.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder40, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException43 = bulkShardRequest41.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult44 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult45 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result32, (org.elasticsearch.action.ActionRequest) bulkShardRequest35, false, (java.lang.Throwable) actionRequestValidationException43, writeResult44);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure47 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting30, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException43, "delete");
        java.lang.Throwable throwable48 = shardFailure47.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult49 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult50 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, true, throwable48, writeResult49);
        org.elasticsearch.common.collect.Tuple<java.io.Serializable, java.lang.Throwable> serializableTuple51 = new org.elasticsearch.common.collect.Tuple<java.io.Serializable, java.lang.Throwable>((java.io.Serializable) boolean16, throwable48);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [35] is different than the one provided [100]" + "'", str9, "current version [35] is different than the one provided [100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest25);
        org.junit.Assert.assertNotNull(timeValue26);
        org.junit.Assert.assertNotNull(bulkShardRequest27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(actionRequestValidationException37);
        org.junit.Assert.assertNotNull(actionRequestValidationException43);
        org.junit.Assert.assertNotNull(throwable48);
        org.junit.Assert.assertEquals(throwable48.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable48.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable48.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is different than the one provided [-1]", throwable2, "current version [100] is different than the one provided [32]");
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        org.elasticsearch.action.ActionRequest actionRequest1 = null;
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest2 = null; // flaky: new org.elasticsearch.action.bulk.BulkItemRequest(2, actionRequest1);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable7 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, true, throwable7, writeResult8);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest10 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, true, throwable14, writeResult15);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest12.setShardId(shardId17);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = bulkShardRequest12.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = bulkShardRequest5.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        java.lang.String str22 = bulkShardRequest5.index();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, writeResult23);
        org.elasticsearch.tasks.TaskId taskId25 = bulkShardRequest5.getParentTask();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, writeResult26);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(taskId25);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        boolean boolean5 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings4);
        boolean boolean6 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings4);
        boolean boolean7 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings4);
        boolean boolean8 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings4);
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings4);
        boolean boolean10 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings9);
        org.elasticsearch.transport.TransportService transportService11 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService12 = null;
        org.elasticsearch.indices.IndicesService indicesService13 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool14 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction15 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction16 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper17 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters18 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction20 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings9, transportService11, clusterService12, indicesService13, threadPool14, shardStateAction15, mappingUpdatedAction16, updateHelper17, actionFilters18, indexNameExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap2 = indexMetaData0.getActiveAllocationIds();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int6 = indexMetaData5.getNumberOfReplicas();
        long long7 = indexMetaData5.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData5.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData5.diff(indexMetaData9);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData9.mapping("index.priority");
        org.elasticsearch.Version version13 = indexMetaData9.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData9);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData17 = indexMetaData0.mapping("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap2);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNotNull(indexMetaDataDiff10);
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNull(mappingMetaData17);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_shards");
        java.lang.String[] strArray17 = new java.lang.String[] { "state-", "index.creation_date_string", "index.version.created_string", "", "", "index.shared_filesystem.recover_on_any_node", "index.version.upgraded_string", "index.version.minimum_compatible", "index.creation_date", "index.creation_date_string", "index.version.upgraded", "delete", "index.version.upgraded", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder1.putActiveAllocationIds((int) (byte) 0, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.numberOfReplicas(10);
        int int23 = builder20.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder20.index("current version [100] is different than the one provided [2]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder28, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest29);
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult33 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult34 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest32, writeResult33);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder28, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest32);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest32);
        org.elasticsearch.index.shard.ShardId shardId37 = bulkShardRequest32.shardId();
        org.elasticsearch.index.VersionType versionType38 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        long long41 = versionType38.updateVersion((long) (short) 10, (long) 100);
        boolean boolean43 = versionType38.validateVersionForReads((long) (short) 100);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.common.io.stream.Writeable> bulkShardRequestReplicationRequestTuple44 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest32, (org.elasticsearch.common.io.stream.Writeable) versionType38);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple45 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder25, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest32);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(shardId37);
        org.junit.Assert.assertNotNull(versionType38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting4 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple9 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder7, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = bulkShardRequest8.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest14.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult17 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult18 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, false, (java.lang.Throwable) actionRequestValidationException16, writeResult17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult> toXContentToBytesTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult>((org.elasticsearch.action.support.ToXContentToBytes) booleanSetting4, updateResult18);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = updateResult18.request();
        boolean boolean21 = updateResult18.retry;
        org.elasticsearch.action.update.UpdateHelper.Result result22 = updateResult18.result;
        org.elasticsearch.action.update.UpdateHelper.Result result23 = updateResult18.result;
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest24 = updateResult18.request();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest24, writeResult25);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest27 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = bulkShardRequestReplicatedWriteRequest24.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is different than the one provided [-1]", (java.lang.Throwable) actionRequestValidationException28, "current version [3] is different than the one provided [52]");
        org.junit.Assert.assertNotNull(booleanSetting4);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(bulkShardRequest20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(result22);
        org.junit.Assert.assertNull(result23);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest24);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest5 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = bulkShardRequest3.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue7 = bulkShardRequest3.timeout();
        org.elasticsearch.tasks.TaskId taskId8 = bulkShardRequest3.getParentTask();
        long long9 = bulkShardRequest3.primaryTerm();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [1] is higher than the one provided [10]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfReplicas((int) '4');
        int int6 = builder3.numberOfReplicas();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int12 = indexMetaData0.getNumberOfShards();
        int int13 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = builder8.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = indexMetaData11.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap13 = indexMetaData11.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap14 = indexMetaData11.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap13);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int3 = builder2.getRoutingNumShards();
        int int4 = builder2.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = builder2.build();
        org.elasticsearch.Version version6 = indexMetaData5.getCreationVersion();
        java.lang.Class<?> wildcardClass7 = version6.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.version((long) (-1));
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder5.mapping("current version [-1] is higher than the one provided [10]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = builder5.mapping("current version [0] is different than the one provided [-1]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNull(mappingMetaData11);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getNumberOfReplicas();
        long long6 = indexMetaData4.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData4.includeFilters();
        boolean boolean9 = indexMetaData4.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData4);
        int int11 = indexMetaData4.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings12 = indexMetaData4.getSettings();
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder1.settings(settings13);
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings13);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(settings15);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        long long3 = versionType0.updateVersion((long) 10, 10L);
        boolean boolean5 = versionType0.validateVersionForReads((long) ' ');
        java.lang.String str9 = versionType0.explainConflictForWrites((long) (byte) 10, (-1L), false);
        byte byte10 = versionType0.getValue();
        byte byte11 = versionType0.getValue();
        boolean boolean13 = versionType0.validateVersionForWrites((long) (byte) 2);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [10] is higher than the one provided [-1]" + "'", str9, "current version [10] is higher than the one provided [-1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 2 + "'", byte10 == (byte) 2);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 2 + "'", byte11 == (byte) 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable5, writeResult6);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.setShardId(shardId8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest3.timeout(timeValue10);
        boolean boolean12 = bulkShardRequest11.getShouldPersistResult();
        bulkShardRequest11.primaryTerm((long) 'a');
        bulkShardRequest11.setParentTask("current version [3] is different than the one provided [35]", (long) (-1));
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, writeResult18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11);
        org.elasticsearch.action.update.UpdateHelper.Result result24 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException29 = bulkShardRequest27.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder32, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest33);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException35 = bulkShardRequest33.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result24, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, false, (java.lang.Throwable) actionRequestValidationException35, writeResult36);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest38 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest39 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest27);
        org.elasticsearch.common.collect.Tuple<java.lang.String, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>> strTuple40 = new org.elasticsearch.common.collect.Tuple<java.lang.String, org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>>("index.data_path", (org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        bulkShardRequest27.primaryTerm((long) 0);
        org.elasticsearch.tasks.TaskId taskId43 = bulkShardRequest27.getParentTask();
        bulkShardRequest11.setParentTask(taskId43);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy45 = bulkShardRequest11.getRefreshPolicy();
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(actionRequestValidationException29);
        org.junit.Assert.assertNotNull(actionRequestValidationException35);
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertTrue("'" + refreshPolicy45 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy45.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult11);
        bulkShardRequest7.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder18, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = bulkShardRequest19.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder24, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest25.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, false, (java.lang.Throwable) actionRequestValidationException27, writeResult28);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, true, (java.lang.Throwable) actionRequestValidationException27, writeResult30);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = bulkShardRequest7.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy33 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest35 = bulkShardRequest7.setShardId(shardId34);
        org.elasticsearch.action.update.UpdateHelper.Result result36 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result37 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable41 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result38, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, true, throwable41, writeResult42);
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest39.setShardId(shardId44);
        org.elasticsearch.common.unit.TimeValue timeValue46 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = bulkShardRequest39.timeout(timeValue46);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting49 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result51 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder53, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest54);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException56 = bulkShardRequest54.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder59, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = bulkShardRequest60.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult63 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult64 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result51, (org.elasticsearch.action.ActionRequest) bulkShardRequest54, false, (java.lang.Throwable) actionRequestValidationException62, writeResult63);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure66 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting49, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException62, "delete");
        java.lang.Throwable throwable67 = shardFailure66.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult68 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult69 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result37, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, true, throwable67, writeResult68);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult70 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult71 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result36, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult70);
        org.elasticsearch.action.support.IndicesOptions indicesOptions72 = bulkShardRequest39.indicesOptions();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel73 = bulkShardRequest39.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest74 = bulkShardRequest35.consistencyLevel(writeConsistencyLevel73);
        java.lang.String str75 = bulkShardRequest74.index();
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy33 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy33.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest35);
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(timeValue46);
        org.junit.Assert.assertNotNull(bulkShardRequest47);
        org.junit.Assert.assertNotNull(actionRequestValidationException56);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertNotNull(throwable67);
        org.junit.Assert.assertEquals(throwable67.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable67.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable67.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNotNull(indicesOptions72);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel73 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel73.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfReplicas();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        int int5 = indexMetaData1.getRoutingFactor();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData1.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap7 = indexMetaData1.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData1);
        boolean boolean10 = indexMetaData1.isSameUUID("index.blocks.write");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData1.mappingOrDefault("index.shared_filesystem");
        org.elasticsearch.common.collect.Tuple<java.lang.String, org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>> strTuple13 = new org.elasticsearch.common.collect.Tuple<java.lang.String, org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>>("current version [35] is different than the one provided [52]", (org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData1);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData1.mapping("current version [0] is higher than the one provided [33]");
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertNull(mappingMetaData15);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        int int8 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String str10 = builder9.index();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = builder9.build();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(indexMetaData11);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, true, throwable6, writeResult7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest4.setRefreshPolicy("");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, writeResult11);
        boolean boolean13 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest10.index("current version [1] is higher than the one provided [-1]");
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder22, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult27);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult29);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = bulkShardRequest23.validate();
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable36 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, true, throwable36, writeResult37);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest34.setShardId(shardId39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest40.setRefreshPolicy("");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest43 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy44 = bulkShardRequest42.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest23.setRefreshPolicy(refreshPolicy44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest10.setRefreshPolicy(refreshPolicy44);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult47 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult48 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest46, writeResult47);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertTrue("'" + refreshPolicy44 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy44.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        int int6 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData4.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        long long9 = indexMetaData4.getVersion();
        long long10 = indexMetaData4.getVersion();
        int int11 = indexMetaData4.getNumberOfShards();
        int int12 = indexMetaData4.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData4.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData4.includeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest9.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = bulkShardRequest15.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult18 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult19 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, (java.lang.Throwable) actionRequestValidationException17, writeResult18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest20 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult22);
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder29.putCustom("hi!", custom31);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException34 = bulkShardRequest33.validate();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder29, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest36 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest37 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest33);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting39 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting41 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting43 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple48 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder46, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest47);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException49 = bulkShardRequest47.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure51 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting43, "index.blocks.write", (java.lang.Throwable) actionRequestValidationException49, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure53 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting41, "_na_", (java.lang.Throwable) actionRequestValidationException49, "_na_");
        java.lang.Throwable throwable54 = shardFailure53.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure56 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting39, "indices:data/write/bulk[s]", throwable54, "index.shared_filesystem");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult57 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult58 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, true, throwable54, writeResult57);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult59 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult60 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, false, throwable54, writeResult59);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure62 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [1] is different than the one provided [10]", throwable54, "current version [1] is different than the one provided [-1]");
        java.lang.Throwable throwable63 = shardFailure62.cause;
        java.lang.Throwable throwable64 = shardFailure62.cause;
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(actionRequestValidationException34);
        org.junit.Assert.assertNotNull(actionRequestValidationException49);
        org.junit.Assert.assertNotNull(throwable54);
        org.junit.Assert.assertEquals(throwable54.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable54.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable54.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNotNull(throwable63);
        org.junit.Assert.assertEquals(throwable63.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable63.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable63.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNotNull(throwable64);
        org.junit.Assert.assertEquals(throwable64.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable64.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable64.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest2.setShardId(shardId7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = bulkShardRequest2.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        bulkShardRequest2.remoteAddress(transportAddress10);
        java.lang.Throwable throwable13 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable13, writeResult14);
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult24 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult25 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult24);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult27);
        bulkShardRequest23.primaryTerm(0L);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '#', (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.update.UpdateHelper.Result result32 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest38 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple39 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder37, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest38);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest40 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest41 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest38);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult42 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult43 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest38, writeResult42);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult44 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult45 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result32, (org.elasticsearch.action.ActionRequest) bulkShardRequest38, writeResult44);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException46 = bulkShardRequest38.validate();
        org.elasticsearch.action.update.UpdateHelper.Result result48 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable51 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult52 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult53 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result48, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, true, throwable51, writeResult52);
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = bulkShardRequest49.setShardId(shardId54);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = bulkShardRequest55.setRefreshPolicy("");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest58 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest57);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy59 = bulkShardRequest57.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = bulkShardRequest38.setRefreshPolicy(refreshPolicy59);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest61 = bulkShardRequest23.setRefreshPolicy(refreshPolicy59);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.action.bulk.BulkShardRequest> streamableTuple62 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.io.stream.Streamable, org.elasticsearch.action.bulk.BulkShardRequest>((org.elasticsearch.common.io.stream.Streamable) bulkShardRequest2, bulkShardRequest23);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException46);
        org.junit.Assert.assertNotNull(bulkShardRequest55);
        org.junit.Assert.assertNotNull(bulkShardRequest57);
        org.junit.Assert.assertTrue("'" + refreshPolicy59 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy59.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(bulkShardRequest60);
        org.junit.Assert.assertNotNull(bulkShardRequest61);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("current version [2] is higher or equal to the one provided [-1]", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        int int6 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData4.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = builder8.build();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfReplicas();
        long long12 = indexMetaData10.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData10.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData10.diff(indexMetaData14);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData10.getInitialRecoveryFilters();
        int int17 = indexMetaData10.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData10);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters19 = indexMetaData10.includeFilters();
        boolean boolean20 = indexMetaData9.equals((java.lang.Object) discoveryNodeFilters19);
        java.util.Set<java.lang.String> strSet22 = null; // flaky: indexMetaData9.activeAllocationIds(35);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData9);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) '4');
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("_na_");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.requireFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_shards");
        java.lang.String[] strArray17 = new java.lang.String[] { "state-", "index.creation_date_string", "index.version.created_string", "", "", "index.shared_filesystem.recover_on_any_node", "index.version.upgraded_string", "index.version.minimum_compatible", "index.creation_date", "index.creation_date_string", "index.version.upgraded", "delete", "index.version.upgraded", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder1.putActiveAllocationIds((int) (byte) 0, (java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder1.index("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.update.UpdateHelper.Result result29 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result29, (org.elasticsearch.action.ActionRequest) bulkShardRequest30, writeResult31);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple33 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest30);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest30);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest30);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple36 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder22, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest30);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int38 = indexMetaData37.getNumberOfReplicas();
        long long39 = indexMetaData37.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters40 = indexMetaData37.includeFilters();
        boolean boolean42 = indexMetaData37.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData37);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap44 = indexMetaData37.getActiveAllocationIds();
        org.elasticsearch.Version version45 = indexMetaData37.getCreationVersion();
        int int46 = indexMetaData37.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData37);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.common.io.stream.Writeable> bulkShardRequestReplicationRequestTuple49 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>, org.elasticsearch.common.io.stream.Writeable>((org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest30, (org.elasticsearch.common.io.stream.Writeable) indexMetaData37);
        org.elasticsearch.action.update.UpdateHelper.Result result51 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder53, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest54);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException56 = bulkShardRequest54.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder59, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = bulkShardRequest60.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult63 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult64 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result51, (org.elasticsearch.action.ActionRequest) bulkShardRequest54, false, (java.lang.Throwable) actionRequestValidationException62, writeResult63);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest65 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest54);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy66 = bulkShardRequest54.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest67 = bulkShardRequest30.setRefreshPolicy(refreshPolicy66);
        java.lang.String str68 = bulkShardRequest30.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest70 = bulkShardRequest30.timeout("current version [1] is higher than the one provided [10]");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [BulkShardRequest.timeout] with value [current version [1] is higher than the one provided [10]] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap44);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(actionRequestValidationException56);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertTrue("'" + refreshPolicy66 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy66.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest67);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int11 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        long long3 = versionType0.updateVersion((long) (short) 10, (long) 100);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) ' ', 1L);
        boolean boolean8 = versionType0.validateVersionForReads((long) 35);
        org.elasticsearch.index.VersionType versionType9 = versionType0.versionTypeForReplicationAndRecovery();
        long long12 = versionType0.updateVersion((long) 10, (long) (byte) 100);
        org.elasticsearch.index.VersionType versionType13 = versionType0.versionTypeForReplicationAndRecovery();
        long long16 = versionType0.updateVersion((long) (short) 10, 36L);
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36L + "'", long16 == 36L);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult12);
        bulkShardRequest8.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest20.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple27 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder25, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = bulkShardRequest26.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest20, false, (java.lang.Throwable) actionRequestValidationException28, writeResult29);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, true, (java.lang.Throwable) actionRequestValidationException28, writeResult31);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = bulkShardRequest8.consistencyLevel();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest34 = new org.elasticsearch.action.bulk.BulkItemRequest(52, (org.elasticsearch.action.ActionRequest) bulkShardRequest8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions35 = bulkShardRequest8.indicesOptions();
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions35);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable5, writeResult6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.setRefreshPolicy("");
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest14.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest20.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest14, false, (java.lang.Throwable) actionRequestValidationException22, writeResult23);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, (java.lang.Throwable) actionRequestValidationException22, writeResult25);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, writeResult27);
        boolean boolean29 = updateResult28.failure();
        org.elasticsearch.action.ActionRequest actionRequest30 = updateResult28.actionRequest;
        org.elasticsearch.action.support.replication.ReplicationRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicationRequest31 = updateResult28.request();
        org.elasticsearch.common.transport.TransportAddress transportAddress32 = bulkShardRequestReplicationRequest31.remoteAddress();
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(actionRequest30);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicationRequest31);
        org.junit.Assert.assertNull(transportAddress32);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("hi!");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = builder1.mapping("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.numberOfReplicas(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder5.setRoutingNumShards(32);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = builder5.primaryTerm((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mappingOrDefault("current version [-1] is different than the one provided [2]");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap12 = indexMetaData0.getActiveAllocationIds();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap12);
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("state-");
        int int2 = builder1.numberOfShards();
        java.lang.String str3 = builder1.index();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder1.mapping("current version [97] is higher than the one provided [100]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "state-" + "'", str3, "state-");
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting2 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHARED_FS_ALLOW_RECOVERY_ON_ANY_NODE_SETTING;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = bulkShardRequest6.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder11, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = bulkShardRequest12.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, false, (java.lang.Throwable) actionRequestValidationException14, writeResult15);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult> toXContentToBytesTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.support.ToXContentToBytes, org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult>((org.elasticsearch.action.support.ToXContentToBytes) booleanSetting2, updateResult16);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = updateResult16.request();
        boolean boolean19 = updateResult16.retry;
        org.elasticsearch.action.update.UpdateHelper.Result result20 = updateResult16.result;
        org.elasticsearch.action.update.UpdateHelper.Result result21 = updateResult16.result;
        org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestReplicatedWriteRequest22 = updateResult16.request();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest22, writeResult23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequestReplicatedWriteRequest22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = bulkShardRequestReplicatedWriteRequest22.validate();
        org.elasticsearch.action.update.UpdateHelper.Result result30 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable35 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult36 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult37 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result32, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, true, throwable35, writeResult36);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = bulkShardRequest33.setRefreshPolicy("");
        org.elasticsearch.action.update.UpdateHelper.Result result41 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest44 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple45 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder43, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest44);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException46 = bulkShardRequest44.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest50 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple51 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder49, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest50);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException52 = bulkShardRequest50.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult53 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult54 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result41, (org.elasticsearch.action.ActionRequest) bulkShardRequest44, false, (java.lang.Throwable) actionRequestValidationException52, writeResult53);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult55 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult56 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, false, (java.lang.Throwable) actionRequestValidationException52, writeResult55);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult57 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult58 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result30, (org.elasticsearch.action.ActionRequest) bulkShardRequest33, writeResult57);
        org.elasticsearch.action.update.UpdateHelper.Result result59 = updateResult58.result;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult60 = updateResult58.writeResult;
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest61 = updateResult58.request();
        org.elasticsearch.tasks.TaskId taskId62 = bulkShardRequestActionRequest61.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.tasks.Task task63 = bulkShardRequestReplicatedWriteRequest22.createTask((long) 100, "index.blocks.read_only", "index.uuid", taskId62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanSetting2);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(result20);
        org.junit.Assert.assertNull(result21);
        org.junit.Assert.assertNotNull(bulkShardRequestReplicatedWriteRequest22);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNotNull(bulkShardRequest39);
        org.junit.Assert.assertNotNull(actionRequestValidationException46);
        org.junit.Assert.assertNotNull(actionRequestValidationException52);
        org.junit.Assert.assertNull(result59);
        org.junit.Assert.assertNull(writeResult60);
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest61);
        org.junit.Assert.assertNotNull(taskId62);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int6 = indexMetaData5.getNumberOfReplicas();
        long long7 = indexMetaData5.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData5.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff10 = indexMetaData5.diff(indexMetaData9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData5.getInitialRecoveryFilters();
        int int12 = indexMetaData5.getNumberOfReplicas();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.diff(indexMetaData5);
        int int14 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNotNull(indexMetaDataDiff10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters15);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.creationDate(10L);
        int int11 = builder8.numberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, writeResult6);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.numberOfShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder1.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.index("current version [0] is different than the one provided [-1]");
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest17 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable19 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest17, true, throwable19, writeResult20);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = bulkShardRequest17.setShardId(shardId22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest17);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder14, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builderTuple25.v1();
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(bulkShardRequest23);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple4 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder2, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest3);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = bulkShardRequest3.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = bulkShardRequest9.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, (java.lang.Throwable) actionRequestValidationException11, writeResult12);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = updateResult13.writeResult;
        boolean boolean15 = updateResult13.retry;
        org.elasticsearch.action.update.UpdateResponse updateResponse16 = updateResult13.noopResult;
        boolean boolean17 = updateResult13.success();
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNull(writeResult14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(updateResponse16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap3 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        int int6 = indexMetaData0.getNumberOfReplicas();
        int int7 = indexMetaData0.getNumberOfShards();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfReplicas();
        long long12 = indexMetaData10.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData10);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap14 = indexMetaData10.getMappings();
        int int15 = indexMetaData10.getRoutingNumShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData10.getCustoms();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff17 = indexMetaData0.diff(indexMetaData10);
        org.elasticsearch.Version version18 = indexMetaData10.getUpgradedVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData10.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(indexMetaDataDiff17);
        org.junit.Assert.assertNotNull(version18);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting1 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_SHADOW_REPLICAS_SETTING;
        java.lang.Class<?> wildcardClass2 = booleanSetting1.getClass();
        org.elasticsearch.index.VersionType versionType3 = org.elasticsearch.index.VersionType.INTERNAL;
        boolean boolean5 = versionType3.validateVersionForReads((long) '4');
        org.elasticsearch.common.collect.Tuple<java.lang.reflect.Type, org.elasticsearch.index.VersionType> typeTuple6 = new org.elasticsearch.common.collect.Tuple<java.lang.reflect.Type, org.elasticsearch.index.VersionType>((java.lang.reflect.Type) wildcardClass2, versionType3);
        java.lang.String str9 = versionType3.explainConflictForReads((long) 0, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.VersionType versionType10 = org.elasticsearch.index.VersionType.fromString("current version [97] is different than the one provided [2]", versionType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No version type match [current version [97] is different than the one provided [2]]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanSetting1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "current version [0] is different than the one provided [-1]" + "'", str9, "current version [0] is different than the one provided [-1]");
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, writeResult6);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.numberOfShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder1.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom14 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder1.putCustom("", custom14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.index("current version [3] is higher than the one provided [97]");
        int int18 = builder15.numberOfShards();
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [-1] is higher than the one provided [10]");
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.putAlias(aliasMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest7.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest13.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, (java.lang.Throwable) actionRequestValidationException15, writeResult16);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest18 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest19 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult20);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int23 = indexMetaData22.getNumberOfReplicas();
        long long24 = indexMetaData22.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters25 = indexMetaData22.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData22.diff(indexMetaData26);
        int int28 = indexMetaData26.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData26);
        org.elasticsearch.action.update.UpdateHelper.Result result31 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder33, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = bulkShardRequest34.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple41 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder39, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest40);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException42 = bulkShardRequest40.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult43 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult44 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result31, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, false, (java.lang.Throwable) actionRequestValidationException42, writeResult43);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest45 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest34);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy46 = bulkShardRequest34.getRefreshPolicy();
        boolean boolean47 = indexMetaData26.equals((java.lang.Object) refreshPolicy46);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest48 = bulkShardRequest7.setRefreshPolicy(refreshPolicy46);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest49 = new org.elasticsearch.action.bulk.BulkItemRequest(3, (org.elasticsearch.action.ActionRequest) bulkShardRequest48);
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(actionRequestValidationException36);
        org.junit.Assert.assertNotNull(actionRequestValidationException42);
        org.junit.Assert.assertTrue("'" + refreshPolicy46 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy46.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest48);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, true, throwable6, writeResult7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest4.setShardId(shardId9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest4.timeout(timeValue11);
        java.lang.String str13 = bulkShardRequest4.index();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, writeResult15);
        long long17 = bulkShardRequest4.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = bulkShardRequest4.consistencyLevel();
        java.lang.String str19 = bulkShardRequest4.index();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult20 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult21 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, writeResult20);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [-1] is different than the one provided [0]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) (short) 100);
        int int4 = builder3.getRoutingNumShards();
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult10);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest12 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, writeResult13);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.tasks.TaskId taskId16 = bulkShardRequest12.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple17 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        bulkShardRequest12.setParentTask("update", (long) '4');
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest21 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest12);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [2] is higher or equal to the one provided [0]", (java.lang.Throwable) actionRequestValidationException22, "index.blocks.metadata");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.priority", (java.lang.Throwable) actionRequestValidationException22, "current version [35] is different than the one provided [3]");
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, writeResult11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple13 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        org.elasticsearch.tasks.TaskId taskId14 = bulkShardRequest10.getParentTask();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest10);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting17 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result19 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest22 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple23 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder21, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = bulkShardRequest22.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple29 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder27, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException30 = bulkShardRequest28.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result19, (org.elasticsearch.action.ActionRequest) bulkShardRequest22, false, (java.lang.Throwable) actionRequestValidationException30, writeResult31);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting17, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException30, "delete");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult35 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult36 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, false, (java.lang.Throwable) actionRequestValidationException30, writeResult35);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, writeResult37);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest10.setShardId(shardId39);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest41 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest40);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(actionRequestValidationException30);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest13 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest9);
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = bulkShardRequest9.timeout(timeValue14);
        org.elasticsearch.index.shard.ShardId shardId16 = bulkShardRequest15.shardId();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest17 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15);
        org.elasticsearch.index.shard.ShardId shardId18 = bulkShardRequest15.shardId();
        org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> charSequenceTuple19 = new org.elasticsearch.common.collect.Tuple<java.lang.CharSequence, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>>((java.lang.CharSequence) "index.number_of_shards", (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest15);
        bulkShardRequest15.setParentTask("current version [10] is higher than the one provided [97]", (long) 'a');
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, writeResult23);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(bulkShardRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNull(shardId18);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        int int6 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfReplicas();
        long long12 = indexMetaData10.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData10.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData10.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData16 = indexMetaData10.mapping("index.version.created");
        org.elasticsearch.common.settings.Settings settings17 = indexMetaData10.getSettings();
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder9.settings(settings18);
        boolean boolean20 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        boolean boolean21 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings18);
        boolean boolean22 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings18);
        boolean boolean23 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder7.settings(settings18);
        org.elasticsearch.transport.TransportService transportService25 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService26 = null;
        org.elasticsearch.indices.IndicesService indicesService27 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool28 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction29 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction30 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper31 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters32 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction34 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings18, transportService25, clusterService26, indicesService27, threadPool28, shardStateAction29, mappingUpdatedAction30, updateHelper31, actionFilters32, indexNameExpressionResolver33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNull(mappingMetaData16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("current version [10] is different than the one provided [100]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result12 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder17, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = bulkShardRequest18.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder23, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = bulkShardRequest24.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest18, false, (java.lang.Throwable) actionRequestValidationException26, writeResult27);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest29 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest30 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest18);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder33, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest34);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException36 = bulkShardRequest34.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result12, (org.elasticsearch.action.ActionRequest) bulkShardRequest18, false, (java.lang.Throwable) actionRequestValidationException36, writeResult37);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "_na_", (java.lang.Throwable) actionRequestValidationException36, "index.number_of_shards");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "current version [1] is different than the one provided [10]", (java.lang.Throwable) actionRequestValidationException36, "current version [10] is higher than the one provided [10]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "current version [0] is different than the one provided [10]", (java.lang.Throwable) actionRequestValidationException36, "current version [10] is higher than the one provided [35]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "current version [3] is different than the one provided [32]", (java.lang.Throwable) actionRequestValidationException36, "current version [10] is higher than the one provided [-1]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.shared_filesystem", (java.lang.Throwable) actionRequestValidationException36, "current version [2] is different than the one provided [52]");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [32] is different than the one provided [32]", (java.lang.Throwable) actionRequestValidationException36, "index.auto_expand_replicas");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting51 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result53 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest56 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple57 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder55, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest56);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException58 = bulkShardRequest56.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest62 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple63 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder61, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest62);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException64 = bulkShardRequest62.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult65 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult66 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result53, (org.elasticsearch.action.ActionRequest) bulkShardRequest56, false, (java.lang.Throwable) actionRequestValidationException64, writeResult65);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure68 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting51, "delete", (java.lang.Throwable) actionRequestValidationException64, "delete");
        java.lang.Class<?> wildcardClass69 = actionRequestValidationException64.getClass();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequestValidationException, java.lang.reflect.Type> actionRequestValidationExceptionTuple70 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.ActionRequestValidationException, java.lang.reflect.Type>(actionRequestValidationException36, (java.lang.reflect.Type) wildcardClass69);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNotNull(actionRequestValidationException36);
        org.junit.Assert.assertNotNull(actionRequestValidationException58);
        org.junit.Assert.assertNotNull(actionRequestValidationException64);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest7.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest13.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, (java.lang.Throwable) actionRequestValidationException15, writeResult16);
        org.elasticsearch.action.ActionRequest actionRequest18 = updateResult17.actionRequest;
        java.lang.Throwable throwable19 = updateResult17.error;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "current version [10] is different than the one provided [10]", throwable19, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable19, "current version [33] is higher than the one provided [1]");
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNotNull(actionRequest18);
        org.junit.Assert.assertNotNull(throwable19);
        org.junit.Assert.assertEquals(throwable19.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable19.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable19.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("delete");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.putCustom("_na_", custom3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.removeAlias("index.blocks.write");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.numberOfShards(100);
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable14 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult15 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult16 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest12, true, throwable14, writeResult15);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest12.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple19 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder8.removeAllAliases();
        org.elasticsearch.action.update.UpdateHelper.Result result21 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result22 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable25 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult26 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult27 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result22, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, true, throwable25, writeResult26);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest29 = bulkShardRequest23.setShardId(shardId28);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest23.timeout(timeValue30);
        java.lang.String str32 = bulkShardRequest23.index();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting34 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result36 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder38, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException41 = bulkShardRequest39.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple46 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder44, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest45);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException47 = bulkShardRequest45.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult48 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult49 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result36, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, false, (java.lang.Throwable) actionRequestValidationException47, writeResult48);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure51 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting34, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException47, "delete");
        java.lang.Throwable throwable52 = shardFailure51.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult53 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult54 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result21, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, true, throwable52, writeResult53);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder8, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest> bulkShardRequestActionRequest56 = builderTuple55.v2();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple57 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, bulkShardRequestActionRequest56);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder4.numberOfShards((-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(bulkShardRequest29);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(actionRequestValidationException41);
        org.junit.Assert.assertNotNull(actionRequestValidationException47);
        org.junit.Assert.assertNotNull(throwable52);
        org.junit.Assert.assertEquals(throwable52.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable52.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable52.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNotNull(bulkShardRequestActionRequest56);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        java.lang.String str4 = versionType0.explainConflictForWrites((long) 'a', (long) (byte) 0, true);
        java.lang.String str7 = versionType0.explainConflictForReads((long) (byte) 10, 10L);
        byte byte8 = versionType0.getValue();
        boolean boolean10 = versionType0.validateVersionForReads((-1L));
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "current version [97] is higher than the one provided [0]" + "'", str4, "current version [97] is higher than the one provided [0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "current version [10] is different than the one provided [10]" + "'", str7, "current version [10] is different than the one provided [10]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8 == (byte) 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.settings.Settings settings7 = indexMetaData0.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(settings7);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("current version [3] is higher than the one provided [97]");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.version((long) '4');
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder4.mapping("index.uuid");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(mappingMetaData6);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple5 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest4);
        org.elasticsearch.action.update.UpdateHelper.Result result6 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result6, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, writeResult8);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple10 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest11 = new org.elasticsearch.action.bulk.BulkItemRequest((int) 'a', (org.elasticsearch.action.ActionRequest) bulkShardRequest7);
        org.elasticsearch.index.shard.ShardId shardId12 = bulkShardRequest7.shardId();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = bulkShardRequest7.getRefreshPolicy();
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult22 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult23 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, true, throwable21, writeResult22);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest24 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 10, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest26 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable28 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest26, true, throwable28, writeResult29);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest26.setShardId(shardId31);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = bulkShardRequest26.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest35 = new org.elasticsearch.action.bulk.BulkItemRequest(1, (org.elasticsearch.action.ActionRequest) bulkShardRequest19);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting37 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting39 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result41 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result42 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest43 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable45 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult46 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult47 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result42, (org.elasticsearch.action.ActionRequest) bulkShardRequest43, true, throwable45, writeResult46);
        org.elasticsearch.action.update.UpdateHelper.Result result49 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest52 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple53 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder51, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest52);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException54 = bulkShardRequest52.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest58 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple59 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder57, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest58);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException60 = bulkShardRequest58.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult61 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult62 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result49, (org.elasticsearch.action.ActionRequest) bulkShardRequest52, false, (java.lang.Throwable) actionRequestValidationException60, writeResult61);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult63 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult64 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result41, (org.elasticsearch.action.ActionRequest) bulkShardRequest43, false, (java.lang.Throwable) actionRequestValidationException60, writeResult63);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure66 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting39, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException60, "delete");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure68 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting37, "index.shadow_replicas", (java.lang.Throwable) actionRequestValidationException60, "state-");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult69 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult70 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, false, (java.lang.Throwable) actionRequestValidationException60, writeResult69);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult71 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult72 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, (java.lang.Throwable) actionRequestValidationException60, writeResult71);
        boolean boolean73 = updateResult72.success();
        org.junit.Assert.assertNull(shardId12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest34);
        org.junit.Assert.assertNotNull(actionRequestValidationException54);
        org.junit.Assert.assertNotNull(actionRequestValidationException60);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        org.elasticsearch.index.VersionType versionType0 = org.elasticsearch.index.VersionType.EXTERNAL_GTE;
        boolean boolean3 = versionType0.isVersionConflictForReads((long) 100, (long) (byte) -1);
        boolean boolean6 = versionType0.isVersionConflictForReads((long) '4', (long) '#');
        boolean boolean8 = versionType0.validateVersionForReads((long) (short) -1);
        java.lang.String str11 = versionType0.explainConflictForReads((long) ' ', (long) 1);
        boolean boolean15 = versionType0.isVersionConflictForWrites((long) (byte) 3, (-1L), false);
        byte byte16 = versionType0.getValue();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            versionType0.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "current version [32] is different than the one provided [1]" + "'", str11, "current version [32] is different than the one provided [1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 2 + "'", byte16 == (byte) 2);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.update.UpdateHelper.Result result7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result7, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult9);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple11 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult12 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult13 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest8, writeResult12);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest8);
        org.elasticsearch.action.update.UpdateHelper.Result result15 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest19 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple20 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder18, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest19);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = bulkShardRequest19.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest25 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple26 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder24, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest25);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException27 = bulkShardRequest25.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result16, (org.elasticsearch.action.ActionRequest) bulkShardRequest19, false, (java.lang.Throwable) actionRequestValidationException27, writeResult28);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest31 = bulkShardRequest19.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy32 = bulkShardRequest31.getRefreshPolicy();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult33 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult34 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result15, (org.elasticsearch.action.ActionRequest) bulkShardRequest31, writeResult33);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple35 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest31);
        org.elasticsearch.action.support.IndicesOptions indicesOptions36 = bulkShardRequest31.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId37 = bulkShardRequest31.shardId();
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(actionRequestValidationException27);
        org.junit.Assert.assertNotNull(bulkShardRequest31);
        org.junit.Assert.assertTrue("'" + refreshPolicy32 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy32.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(indicesOptions36);
        org.junit.Assert.assertNull(shardId37);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest5.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder10, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest11.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, false, (java.lang.Throwable) actionRequestValidationException13, writeResult14);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest16 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest5);
        org.elasticsearch.action.ActionRequest actionRequest17 = bulkItemRequest16.request();
        org.elasticsearch.cluster.routing.ShardRouting shardRouting19 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting21 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting23 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result25 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, true, throwable29, writeResult30);
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder35, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest36);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = bulkShardRequest36.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple43 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder41, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest42);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException44 = bulkShardRequest42.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult45 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult46 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest36, false, (java.lang.Throwable) actionRequestValidationException44, writeResult45);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult47 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult48 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result25, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, false, (java.lang.Throwable) actionRequestValidationException44, writeResult47);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting23, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException44, "delete");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure52 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting21, "current version [10] is different than the one provided [35]", (java.lang.Throwable) actionRequestValidationException44, "index.shared_filesystem");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting19, "current version [10] is different than the one provided [100]", (java.lang.Throwable) actionRequestValidationException44, "indices:data/write/bulk[s]");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult55 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult56 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, actionRequest17, true, (java.lang.Throwable) actionRequestValidationException44, writeResult55);
        boolean boolean57 = updateResult56.failure();
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNotNull(actionRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
        org.junit.Assert.assertNotNull(actionRequestValidationException44);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        org.elasticsearch.tasks.TaskId taskId0 = null;
        org.elasticsearch.index.VersionType versionType1 = org.elasticsearch.index.VersionType.INTERNAL;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfShards(100);
        org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder> versionTypeEnumTuple6 = new org.elasticsearch.common.collect.Tuple<java.lang.Enum<org.elasticsearch.index.VersionType>, org.elasticsearch.cluster.metadata.IndexMetaData.Builder>((java.lang.Enum<org.elasticsearch.index.VersionType>) versionType1, builder3);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.tasks.TaskId, org.elasticsearch.index.VersionType> taskIdTuple7 = org.elasticsearch.common.collect.Tuple.tuple(taskId0, versionType1);
        boolean boolean10 = versionType1.isVersionConflictForReads((long) (byte) 100, (long) (byte) 0);
        boolean boolean12 = versionType1.validateVersionForReads((long) 2);
        byte byte13 = versionType1.getValue();
        boolean boolean16 = versionType1.isVersionConflictForReads((long) (byte) 3, 0L);
        org.junit.Assert.assertNotNull(versionType1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(taskIdTuple7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap3 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("current version [100] is higher than the one provided [100]");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("_na_");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData0.mapping("index.priority");
        // The following exception was thrown during execution in test generation
        try {
            long long13 = indexMetaData0.primaryTerm((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNull(mappingMetaData11);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int2 = indexMetaData1.getNumberOfReplicas();
        long long3 = indexMetaData1.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData1.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData1.diff(indexMetaData5);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData1.getInitialRecoveryFilters();
        int int8 = indexMetaData1.getNumberOfReplicas();
        org.elasticsearch.index.Index index9 = indexMetaData1.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData1.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int14 = indexMetaData13.getNumberOfReplicas();
        long long15 = indexMetaData13.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData13.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap17 = indexMetaData13.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap18 = indexMetaData13.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData13);
        int int20 = indexMetaData13.getNumberOfShards();
        java.util.Set<java.lang.String> strSet22 = indexMetaData13.activeAllocationIds(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder11.putActiveAllocationIds(32, strSet22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder11.setRoutingNumShards((int) '#');
        org.elasticsearch.action.update.UpdateHelper.Result result27 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest28 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result27, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, writeResult29);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest31 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest33 = bulkShardRequest28.setShardId(shardId32);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple34 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder11, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest28);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting36 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result38 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest41 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder40, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest41);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException43 = bulkShardRequest41.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest47 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple48 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder46, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest47);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException49 = bulkShardRequest47.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult50 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult51 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result38, (org.elasticsearch.action.ActionRequest) bulkShardRequest41, false, (java.lang.Throwable) actionRequestValidationException49, writeResult50);
        org.elasticsearch.action.ActionRequest actionRequest52 = updateResult51.actionRequest;
        java.lang.Throwable throwable53 = updateResult51.error;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure55 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting36, "index.number_of_shards", throwable53, "current version [32] is different than the one provided [1]");
        java.lang.Throwable throwable56 = shardFailure55.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult57 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult58 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest28, true, throwable56, writeResult57);
        org.elasticsearch.action.update.UpdateResponse updateResponse59 = updateResult58.noopResult;
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertNotNull(strImmutableOpenMap18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(bulkShardRequest33);
        org.junit.Assert.assertNotNull(actionRequestValidationException43);
        org.junit.Assert.assertNotNull(actionRequestValidationException49);
        org.junit.Assert.assertNotNull(actionRequest52);
        org.junit.Assert.assertNotNull(throwable53);
        org.junit.Assert.assertEquals(throwable53.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable53.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable53.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNotNull(throwable56);
        org.junit.Assert.assertEquals(throwable56.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable56.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable56.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertNull(updateResponse59);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple3 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest2);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, writeResult6);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder1.numberOfShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state11 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder1.state(state11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder12.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.version((long) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder12.numberOfShards(35);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.action.update.UpdateHelper.Result result21 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest24 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple25 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder23, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest24);
        org.elasticsearch.action.update.UpdateHelper.Result result26 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult28 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult29 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result26, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, writeResult28);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple30 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder23, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult31 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult32 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result21, (org.elasticsearch.action.ActionRequest) bulkShardRequest27, writeResult31);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple33 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder20, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder20.index("current version [35] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple40 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder38, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.update.UpdateHelper.Result result41 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult43 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult44 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result41, (org.elasticsearch.action.ActionRequest) bulkShardRequest42, writeResult43);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple45 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder38, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest42);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder38.numberOfShards(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state48 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder38.state(state48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom51 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder38.putCustom("", custom51);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        int int56 = builder55.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = builder55.numberOfShards((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_shards");
        java.lang.String[] strArray77 = new java.lang.String[] { "state-", "index.creation_date_string", "index.version.created_string", "", "", "index.shared_filesystem.recover_on_any_node", "index.version.upgraded_string", "index.version.minimum_compatible", "index.creation_date", "index.creation_date_string", "index.version.upgraded", "delete", "index.version.upgraded", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder80 = builder61.putActiveAllocationIds((int) (byte) 0, (java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder81 = builder55.putActiveAllocationIds((int) (short) -1, (java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder82 = builder38.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder83 = builder35.putActiveAllocationIds(0, (java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder84 = builder12.putActiveAllocationIds(32, (java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder85 = builder12.removeAllAliases();
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + state11 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state11.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + state48 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state48.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.index.Index index8 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfReplicas();
        long long12 = indexMetaData10.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData10.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData10.diff(indexMetaData14);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData10.getInitialRecoveryFilters();
        int int17 = indexMetaData10.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData10);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData10.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData10.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff21 = indexMetaData0.diff(indexMetaData10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.creationDate((long) (byte) 2);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertNotNull(indexMetaDataDiff21);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest3 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable5 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult6 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult7 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, true, throwable5, writeResult6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = bulkShardRequest3.setRefreshPolicy("");
        org.elasticsearch.action.update.UpdateHelper.Result result11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple15 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder13, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = bulkShardRequest14.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest20 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder19, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = bulkShardRequest20.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult23 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult24 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result11, (org.elasticsearch.action.ActionRequest) bulkShardRequest14, false, (java.lang.Throwable) actionRequestValidationException22, writeResult23);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult25 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult26 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, false, (java.lang.Throwable) actionRequestValidationException22, writeResult25);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest3, writeResult27);
        boolean boolean29 = updateResult28.failure();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest30 = updateResult28.request();
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest32 = bulkShardRequest30.setShardId(shardId31);
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest36 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple37 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder35, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest36);
        org.elasticsearch.action.update.UpdateHelper.Result result38 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest39 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult40 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult41 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result38, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult40);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple42 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder35, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest39);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult43 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult44 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest39, writeResult43);
        bulkShardRequest39.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result47 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result48 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest49 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable51 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult52 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult53 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result48, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, true, throwable51, writeResult52);
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest55 = bulkShardRequest49.setShardId(shardId54);
        org.elasticsearch.common.unit.TimeValue timeValue56 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest57 = bulkShardRequest49.timeout(timeValue56);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting59 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result61 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest64 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple65 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder63, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest64);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException66 = bulkShardRequest64.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest70 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple71 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder69, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest70);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException72 = bulkShardRequest70.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult73 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult74 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result61, (org.elasticsearch.action.ActionRequest) bulkShardRequest64, false, (java.lang.Throwable) actionRequestValidationException72, writeResult73);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure76 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting59, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException72, "delete");
        java.lang.Throwable throwable77 = shardFailure76.cause;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult78 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult79 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result47, (org.elasticsearch.action.ActionRequest) bulkShardRequest49, true, throwable77, writeResult78);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel80 = bulkShardRequest49.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel81 = bulkShardRequest49.consistencyLevel();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest82 = bulkShardRequest39.consistencyLevel(writeConsistencyLevel81);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest83 = bulkShardRequest30.consistencyLevel(writeConsistencyLevel81);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy84 = bulkShardRequest83.getRefreshPolicy();
        org.junit.Assert.assertNotNull(bulkShardRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest30);
        org.junit.Assert.assertNotNull(bulkShardRequest32);
        org.junit.Assert.assertNotNull(bulkShardRequest55);
        org.junit.Assert.assertNotNull(timeValue56);
        org.junit.Assert.assertNotNull(bulkShardRequest57);
        org.junit.Assert.assertNotNull(actionRequestValidationException66);
        org.junit.Assert.assertNotNull(actionRequestValidationException72);
        org.junit.Assert.assertNotNull(throwable77);
        org.junit.Assert.assertEquals(throwable77.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable77.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable77.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel80 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel80.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel81 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel81.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(bulkShardRequest82);
        org.junit.Assert.assertNotNull(bulkShardRequest83);
        org.junit.Assert.assertTrue("'" + refreshPolicy84 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy84.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards(100);
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable7 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult8 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult9 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, true, throwable7, writeResult8);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = bulkShardRequest5.setRefreshPolicy("");
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder1, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        long long14 = builder1.primaryTerm((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int16 = indexMetaData15.getNumberOfReplicas();
        long long17 = indexMetaData15.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData15.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData15.diff(indexMetaData19);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData15.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = indexMetaData15.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder1.state(state22);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int25 = indexMetaData24.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData24);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap27 = indexMetaData24.getCustoms();
        org.elasticsearch.common.settings.Settings settings28 = indexMetaData24.getSettings();
        boolean boolean29 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings28);
        boolean boolean30 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder1.settings(settings28);
        java.lang.String str32 = builder1.index();
        long long33 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder1.numberOfReplicas((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(bulkShardRequest11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(indexMetaData24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest5 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple6 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder4, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest5);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = bulkShardRequest5.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder10, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = bulkShardRequest11.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest5, false, (java.lang.Throwable) actionRequestValidationException13, writeResult14);
        java.lang.Throwable throwable16 = updateResult15.error;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "current version [100] is different than the one provided [-1]", throwable16, "current version [100] is different than the one provided [-1]");
        java.lang.String str19 = shardFailure18.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting20 = shardFailure18.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals(throwable16.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "current version [100] is different than the one provided [-1]" + "'", str19, "current version [100] is different than the one provided [-1]");
        org.junit.Assert.assertNull(shardRouting20);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.action.update.UpdateHelper.Result result5 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult9 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult10 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result5, (org.elasticsearch.action.ActionRequest) bulkShardRequest6, true, throwable8, writeResult9);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest12 = bulkShardRequest6.setShardId(shardId11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest14 = bulkShardRequest6.timeout(timeValue13);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest15 = new org.elasticsearch.action.bulk.BulkItemRequest((-1), (org.elasticsearch.action.ActionRequest) bulkShardRequest6);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple16 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder3, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest18 = bulkShardRequest6.index("current version [0] is different than the one provided [0]");
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = bulkShardRequest6.remoteAddress();
        long long20 = bulkShardRequest6.primaryTerm();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(bulkShardRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(bulkShardRequest14);
        org.junit.Assert.assertNotNull(bulkShardRequest18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        int int6 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData4.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder8.removeAllAliases();
        long long10 = builder8.version();
        int int11 = builder8.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder8.numberOfShards((int) (byte) 3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.removeAlias("current version [35] is different than the one provided [100]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.setRoutingNumShards((int) (byte) 1);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        java.lang.String str3 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_na_" + "'", str3, "_na_");
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result4 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest7 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple8 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder6, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest7);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = bulkShardRequest7.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest13 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple14 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder12, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = bulkShardRequest13.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result4, (org.elasticsearch.action.ActionRequest) bulkShardRequest7, false, (java.lang.Throwable) actionRequestValidationException15, writeResult16);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "index.number_of_shards", (java.lang.Throwable) actionRequestValidationException15, "delete");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException15, "current version [97] is higher than the one provided [0]");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = shardFailure21.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertNull(shardRouting22);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.excludeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int7 = indexMetaData6.getNumberOfReplicas();
        long long8 = indexMetaData6.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData6.includeFilters();
        boolean boolean11 = indexMetaData6.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData6);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap13 = indexMetaData6.getActiveAllocationIds();
        org.elasticsearch.Version version14 = indexMetaData6.getCreationVersion();
        int int15 = indexMetaData6.getNumberOfReplicas();
        org.elasticsearch.Version version16 = indexMetaData6.getCreationVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData18 = indexMetaData6.mapping("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap19 = indexMetaData6.getMappings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData0.diff(indexMetaData6);
        java.lang.String str21 = indexMetaData0.getIndexUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNull(mappingMetaData18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_na_" + "'", str21, "_na_");
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        boolean boolean5 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap7 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.Index index10 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int12 = indexMetaData11.getNumberOfReplicas();
        long long13 = indexMetaData11.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData11.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData11.diff(indexMetaData15);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData11.getInitialRecoveryFilters();
        int int18 = indexMetaData11.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = indexMetaData11.getActiveAllocationIds();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap20 = indexMetaData11.getAliases();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>> indexMetaDataDiffableTuple21 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>, org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>>((org.elasticsearch.cluster.Diffable<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData0, (org.elasticsearch.common.xcontent.FromXContentBuilder<org.elasticsearch.cluster.metadata.IndexMetaData>) indexMetaData11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.elasticsearch.cluster.metadata.IndexMetaData.getRoutingFactor(indexMetaData0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of source shards [1] must be a must be a multiple of [1]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNotNull(indexMetaData15);
        org.junit.Assert.assertNotNull(indexMetaDataDiff16);
        org.junit.Assert.assertNull(discoveryNodeFilters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertNotNull(strImmutableOpenMap20);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap3 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.index.shard.IndexShardState[] indexShardStateArray6 = new org.elasticsearch.index.shard.IndexShardState[] {};
        java.util.LinkedHashSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet7 = new java.util.LinkedHashSet<org.elasticsearch.index.shard.IndexShardState>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet7, indexShardStateArray6);
        org.elasticsearch.action.update.UpdateHelper.Result result9 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result10 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest11 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable13 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult14 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult15 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result10, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, true, throwable13, writeResult14);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result9, (org.elasticsearch.action.ActionRequest) bulkShardRequest11, writeResult16);
        org.elasticsearch.common.collect.Tuple<java.util.Set<org.elasticsearch.index.shard.IndexShardState>, org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> indexShardStateSetTuple18 = org.elasticsearch.common.collect.Tuple.tuple((java.util.Set<org.elasticsearch.index.shard.IndexShardState>) indexShardStateSet7, (org.elasticsearch.action.support.WriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom>, org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>> strImmutableOpenMapTuple19 = org.elasticsearch.common.collect.Tuple.tuple(strImmutableOpenMap5, (org.elasticsearch.action.support.replication.ReplicatedWriteRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest11);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(indexShardStateArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexShardStateSetTuple18);
        org.junit.Assert.assertNotNull(strImmutableOpenMapTuple19);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        org.elasticsearch.action.update.UpdateHelper.Result result0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest4 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult7 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult8 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest4, true, throwable6, writeResult7);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest4.setRefreshPolicy("");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult11 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult12 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest10, writeResult11);
        boolean boolean13 = bulkShardRequest10.getShouldPersistResult();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest14 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (byte) 2, (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest16 = bulkShardRequest10.index("current version [1] is higher than the one provided [-1]");
        org.elasticsearch.action.update.UpdateHelper.Result result17 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest23 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple24 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder22, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) -1, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest26 = new org.elasticsearch.action.bulk.BulkItemRequest(100, (org.elasticsearch.action.ActionRequest) bulkShardRequest23);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult27 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult28 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult27);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult29 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult30 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result17, (org.elasticsearch.action.ActionRequest) bulkShardRequest23, writeResult29);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = bulkShardRequest23.validate();
        org.elasticsearch.action.update.UpdateHelper.Result result33 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest34 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable36 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult37 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult38 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result33, (org.elasticsearch.action.ActionRequest) bulkShardRequest34, true, throwable36, writeResult37);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest40 = bulkShardRequest34.setShardId(shardId39);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest42 = bulkShardRequest40.setRefreshPolicy("");
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest43 = new org.elasticsearch.action.bulk.BulkItemRequest(0, (org.elasticsearch.action.ActionRequest) bulkShardRequest42);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy44 = bulkShardRequest42.getRefreshPolicy();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest45 = bulkShardRequest23.setRefreshPolicy(refreshPolicy44);
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest46 = bulkShardRequest10.setRefreshPolicy(refreshPolicy44);
        org.elasticsearch.action.update.UpdateHelper.Result result48 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result49 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result50 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result51 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest54 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple55 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder53, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest54);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException56 = bulkShardRequest54.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest60 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple61 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder59, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest60);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException62 = bulkShardRequest60.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult63 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult64 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result51, (org.elasticsearch.action.ActionRequest) bulkShardRequest54, false, (java.lang.Throwable) actionRequestValidationException62, writeResult63);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel65 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest66 = bulkShardRequest54.consistencyLevel(writeConsistencyLevel65);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult67 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult68 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result50, (org.elasticsearch.action.ActionRequest) bulkShardRequest66, writeResult67);
        org.elasticsearch.index.shard.ShardId shardId69 = bulkShardRequest66.shardId();
        java.lang.String str70 = bulkShardRequest66.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel71 = bulkShardRequest66.consistencyLevel();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult72 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult73 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result49, (org.elasticsearch.action.ActionRequest) bulkShardRequest66, writeResult72);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder76 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest77 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple78 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder76, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest77);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException79 = bulkShardRequest77.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest80 = new org.elasticsearch.action.bulk.BulkItemRequest((int) '4', (org.elasticsearch.action.ActionRequest) bulkShardRequest77);
        org.elasticsearch.common.unit.TimeValue timeValue81 = bulkShardRequest77.timeout();
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest82 = bulkShardRequest66.timeout(timeValue81);
        org.elasticsearch.cluster.routing.ShardRouting shardRouting84 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder87 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest88 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple89 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder87, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest88);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException90 = bulkShardRequest88.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure92 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting84, "index.blocks.write", (java.lang.Throwable) actionRequestValidationException90, "");
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult93 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult94 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result48, (org.elasticsearch.action.ActionRequest) bulkShardRequest66, true, (java.lang.Throwable) actionRequestValidationException90, writeResult93);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult95 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult96 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result0, (org.elasticsearch.action.ActionRequest) bulkShardRequest46, true, (java.lang.Throwable) actionRequestValidationException90, writeResult95);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bulkShardRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(bulkShardRequest40);
        org.junit.Assert.assertNotNull(bulkShardRequest42);
        org.junit.Assert.assertTrue("'" + refreshPolicy44 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy44.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(bulkShardRequest45);
        org.junit.Assert.assertNotNull(bulkShardRequest46);
        org.junit.Assert.assertNotNull(actionRequestValidationException56);
        org.junit.Assert.assertNotNull(actionRequestValidationException62);
        org.junit.Assert.assertNotNull(bulkShardRequest66);
        org.junit.Assert.assertNull(shardId69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(writeConsistencyLevel71);
        org.junit.Assert.assertNotNull(actionRequestValidationException79);
        org.junit.Assert.assertNotNull(timeValue81);
        org.junit.Assert.assertNotNull(bulkShardRequest82);
        org.junit.Assert.assertNotNull(actionRequestValidationException90);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest1 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException2 = bulkShardRequest1.validate();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest3 = new org.elasticsearch.action.bulk.BulkItemRequest((int) (short) 1, (org.elasticsearch.action.ActionRequest) bulkShardRequest1);
        org.junit.Assert.assertNotNull(actionRequestValidationException2);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap1 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap3 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult13);
        bulkShardRequest9.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder20, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = bulkShardRequest21.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException29 = bulkShardRequest27.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest21, false, (java.lang.Throwable) actionRequestValidationException29, writeResult30);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, true, (java.lang.Throwable) actionRequestValidationException29, writeResult32);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.shadow_replicas", (java.lang.Throwable) actionRequestValidationException29, "update");
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(actionRequestValidationException29);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        org.elasticsearch.action.update.UpdateHelper.Result result1 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest2 = new org.elasticsearch.action.bulk.BulkShardRequest();
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult5 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult6 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result1, (org.elasticsearch.action.ActionRequest) bulkShardRequest2, true, throwable4, writeResult5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest8 = bulkShardRequest2.setShardId(shardId7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest10 = bulkShardRequest2.timeout(timeValue9);
        bulkShardRequest10.primaryTerm((long) (short) 1);
        org.elasticsearch.tasks.TaskId taskId13 = bulkShardRequest10.getParentTask();
        org.elasticsearch.action.update.UpdateHelper.Result result14 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest15 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult16 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult17 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result14, (org.elasticsearch.action.ActionRequest) bulkShardRequest15, writeResult16);
        java.lang.Throwable throwable18 = updateResult17.error;
        org.elasticsearch.action.update.UpdateHelper.Result result19 = updateResult17.result;
        java.lang.Class<?> wildcardClass20 = updateResult17.getClass();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.action.bulk.BulkShardRequest, java.lang.reflect.GenericDeclaration> bulkShardRequestTuple21 = org.elasticsearch.common.collect.Tuple.tuple(bulkShardRequest10, (java.lang.reflect.GenericDeclaration) wildcardClass20);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = null;
        bulkShardRequest10.remoteAddress(transportAddress22);
        long long24 = bulkShardRequest10.primaryTerm();
        org.elasticsearch.action.bulk.BulkItemRequest bulkItemRequest25 = new org.elasticsearch.action.bulk.BulkItemRequest((int) ' ', (org.elasticsearch.action.ActionRequest) bulkShardRequest10);
        org.junit.Assert.assertNotNull(bulkShardRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(bulkShardRequest10);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNull(throwable18);
        org.junit.Assert.assertNull(result19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(bulkShardRequestTuple21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        long long5 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData0.getSettings();
        boolean boolean7 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings6);
        org.elasticsearch.transport.TransportService transportService8 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService9 = null;
        org.elasticsearch.indices.IndicesService indicesService10 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool11 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction12 = null;
        org.elasticsearch.cluster.action.index.MappingUpdatedAction mappingUpdatedAction13 = null;
        org.elasticsearch.action.update.UpdateHelper updateHelper14 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters15 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.bulk.TransportShardBulkAction transportShardBulkAction17 = new org.elasticsearch.action.bulk.TransportShardBulkAction(settings6, transportService8, clusterService9, indicesService10, threadPool11, shardStateAction12, mappingUpdatedAction13, updateHelper14, actionFilters15, indexNameExpressionResolver16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap3 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version7 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result2 = null;
        org.elasticsearch.action.update.UpdateHelper.Result result3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest6 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple7 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest6);
        org.elasticsearch.action.update.UpdateHelper.Result result8 = null;
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest9 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult10 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult11 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result8, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult10);
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple12 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder5, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest9);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult13 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult14 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result3, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, writeResult13);
        bulkShardRequest9.primaryTerm(0L);
        org.elasticsearch.action.update.UpdateHelper.Result result18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest21 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple22 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder20, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest21);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = bulkShardRequest21.validate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("hi!");
        org.elasticsearch.action.bulk.BulkShardRequest bulkShardRequest27 = new org.elasticsearch.action.bulk.BulkShardRequest();
        org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>> builderTuple28 = new org.elasticsearch.common.collect.Tuple<org.elasticsearch.cluster.metadata.IndexMetaData.Builder, org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>>(builder26, (org.elasticsearch.action.ActionRequest<org.elasticsearch.action.bulk.BulkShardRequest>) bulkShardRequest27);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException29 = bulkShardRequest27.validate();
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult30 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult31 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result18, (org.elasticsearch.action.ActionRequest) bulkShardRequest21, false, (java.lang.Throwable) actionRequestValidationException29, writeResult30);
        org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult writeResult32 = null;
        org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult updateResult33 = new org.elasticsearch.action.bulk.TransportShardBulkAction.UpdateResult(result2, (org.elasticsearch.action.ActionRequest) bulkShardRequest9, true, (java.lang.Throwable) actionRequestValidationException29, writeResult32);
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "index.data_path", (java.lang.Throwable) actionRequestValidationException29, "current version [-1] is different than the one provided [32]");
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(actionRequestValidationException29);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff5 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.index.Index index8 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getNumberOfReplicas();
        long long12 = indexMetaData10.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData10.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData10.diff(indexMetaData14);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData10.getInitialRecoveryFilters();
        int int17 = indexMetaData10.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData10);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData10.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters20 = indexMetaData10.includeFilters();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff21 = indexMetaData0.diff(indexMetaData10);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters22 = indexMetaData10.includeFilters();
        org.elasticsearch.common.settings.Settings settings23 = indexMetaData10.getSettings();
        int int24 = indexMetaData10.getRoutingNumShards();
        org.elasticsearch.index.Index index25 = indexMetaData10.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters26 = indexMetaData10.requireFilters();
        int int27 = indexMetaData10.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNotNull(indexMetaDataDiff5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(discoveryNodeFilters20);
        org.junit.Assert.assertNotNull(indexMetaDataDiff21);
        org.junit.Assert.assertNull(discoveryNodeFilters22);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(index25);
        org.junit.Assert.assertNull(discoveryNodeFilters26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("current version [1] is higher than the one provided [-1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.setRoutingNumShards(0);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder4.putAlias(aliasMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfReplicas();
        long long2 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.index.Index index5 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mappingOrDefault("current version [97] is different than the one provided [10]");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNull(mappingMetaData9);
    }
}
