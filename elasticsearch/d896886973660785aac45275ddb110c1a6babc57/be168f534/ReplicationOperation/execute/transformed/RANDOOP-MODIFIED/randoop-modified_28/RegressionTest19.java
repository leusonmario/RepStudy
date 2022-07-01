import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9501");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.Index index7 = retryOnPrimaryException2.getIndex();
        java.lang.Throwable throwable8 = retryOnPrimaryException2.unwrapCause();
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str10 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][0]] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        java.util.List<java.lang.String> strList13 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray14 = retryOnPrimaryException2.guessRootCauses();
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "");
        org.junit.Assert.assertEquals(throwable8.toString(), "[RetryOnPrimaryException[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][0]] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str10, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray14);
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];");
        boolean boolean3 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.String str11 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException8);
        java.lang.Throwable[] throwableArray12 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.Throwable throwable15 = retryOnPrimaryException8.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][0]] RetryOnPrimaryException[hi!]", throwable15);
        org.elasticsearch.index.Index index17 = retryOnPrimaryException16.getIndex();
        java.lang.Throwable throwable18 = retryOnPrimaryException16.getRootCause();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "retry_on_primary_exception" + "'", str11, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwable15);
        org.junit.Assert.assertEquals(throwable15.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable15.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable15.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNotNull(throwable18);
        org.junit.Assert.assertEquals(throwable18.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable18.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable18.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!");
        retryOnPrimaryException8.setShard("", 0);
        java.lang.String str12 = retryOnPrimaryException8.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        retryOnPrimaryException8.setShard(shardId13);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "[][[][0]] RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.Throwable throwable17 = retryOnPrimaryException8.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId18, "[hi!][[hi!][-1]] RetryOnPrimaryException[]");
        java.lang.String str21 = retryOnPrimaryException20.toString();
        java.lang.String str22 = retryOnPrimaryException20.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "hi!");
        java.util.List<java.lang.String> strList28 = retryOnPrimaryException27.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "", (java.lang.Throwable) retryOnPrimaryException27);
        org.elasticsearch.index.Index index30 = null;
        retryOnPrimaryException27.setIndex(index30);
        java.lang.Throwable throwable32 = retryOnPrimaryException27.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray33 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException27);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "hi!");
        boolean boolean41 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException40);
        java.util.List<java.lang.String> strList42 = retryOnPrimaryException40.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId36, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException40);
        java.util.List<java.lang.String> strList44 = retryOnPrimaryException40.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId45 = retryOnPrimaryException40.getShardId();
        org.elasticsearch.index.shard.ShardId shardId46 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException48 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId46, "");
        org.elasticsearch.index.shard.ShardId shardId49 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException51 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId49, "hi!");
        retryOnPrimaryException48.addSuppressed((java.lang.Throwable) retryOnPrimaryException51);
        org.elasticsearch.index.Index index53 = retryOnPrimaryException48.getIndex();
        retryOnPrimaryException40.addSuppressed((java.lang.Throwable) retryOnPrimaryException48);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException48);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray56 = retryOnPrimaryException55.guessRootCauses();
        retryOnPrimaryException27.addSuppressed((java.lang.Throwable) retryOnPrimaryException55);
        java.util.List<java.lang.String> strList59 = null;
        retryOnPrimaryException55.addHeader("[RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]] RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[hi!];", strList59);
        retryOnPrimaryException20.addSuppressed((java.lang.Throwable) retryOnPrimaryException55);
        throwable17.addSuppressed((java.lang.Throwable) retryOnPrimaryException55);
        org.elasticsearch.index.Index index63 = retryOnPrimaryException55.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(throwable17);
        org.junit.Assert.assertEquals(throwable17.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable17.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable17.toString(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[[hi!][[hi!][-1]] RetryOnPrimaryException[]]" + "'", str21, "RetryOnPrimaryException[[hi!][[hi!][-1]] RetryOnPrimaryException[]]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [hi!][[hi!][-1]] RetryOnPrimaryException[]" + "'", str22, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [hi!][[hi!][-1]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNotNull(throwable32);
        org.junit.Assert.assertEquals(throwable32.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable32.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable32.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strList42);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNull(shardId45);
        org.junit.Assert.assertNull(index53);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray56);
        org.junit.Assert.assertNull(index63);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!");
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.Index index9 = retryOnPrimaryException4.getIndex();
        java.lang.Throwable throwable10 = retryOnPrimaryException4.unwrapCause();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.index.Index index12 = null;
        retryOnPrimaryException4.setIndex(index12);
        java.lang.Throwable throwable14 = retryOnPrimaryException4.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.String str16 = retryOnPrimaryException4.toString();
        java.lang.String str17 = retryOnPrimaryException4.getResourceType();
        retryOnPrimaryException4.setIndex("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "");
        org.junit.Assert.assertEquals(throwable10.toString(), "[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "");
        org.junit.Assert.assertEquals(throwable14.toString(), "[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]] RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RetryOnPrimaryException[]" + "'", str16, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!");
        boolean boolean5 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!");
        retryOnPrimaryException8.addSuppressed((java.lang.Throwable) retryOnPrimaryException11);
        java.util.List<java.lang.String> strList14 = null;
        retryOnPrimaryException11.addHeader("hi!", strList14);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = retryOnPrimaryException11.guessRootCauses();
        java.lang.Throwable throwable18 = retryOnPrimaryException11.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][0]] RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException11);
        java.lang.String str20 = retryOnPrimaryException19.getResourceType();
        java.lang.String str21 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException19);
        java.lang.Throwable[] throwableArray22 = retryOnPrimaryException19.getSuppressed();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException24 = org.elasticsearch.ElasticsearchException.writeStackTraces((java.lang.RuntimeException) retryOnPrimaryException19, streamOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
        org.junit.Assert.assertNotNull(throwable18);
        org.junit.Assert.assertEquals(throwable18.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable18.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable18.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "retry_on_primary_exception" + "'", str21, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "[][[][0]] RetryOnPrimaryException[hi!]");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!");
        retryOnPrimaryException8.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray12 = retryOnPrimaryException8.guessRootCauses();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException8.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList19);
        retryOnPrimaryException8.setIndex("RetryOnPrimaryException[hi!]");
        java.lang.String str24 = retryOnPrimaryException8.toString();
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "");
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "hi!");
        retryOnPrimaryException30.addSuppressed((java.lang.Throwable) retryOnPrimaryException33);
        java.util.List<java.lang.String> strList35 = retryOnPrimaryException30.getResourceId();
        org.elasticsearch.index.Index index36 = retryOnPrimaryException30.getIndex();
        java.lang.Throwable throwable37 = retryOnPrimaryException30.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException30);
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException42 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "hi!");
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId44, "");
        retryOnPrimaryException46.setShard("hi!", (int) (short) -1);
        java.util.Set<java.lang.String> strSet50 = retryOnPrimaryException46.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId52 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException54 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId52, "hi!");
        retryOnPrimaryException54.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray58 = retryOnPrimaryException54.guessRootCauses();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        retryOnPrimaryException54.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList65);
        retryOnPrimaryException46.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList65);
        retryOnPrimaryException42.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList65);
        retryOnPrimaryException38.addHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", (java.util.List<java.lang.String>) strList65);
        retryOnPrimaryException8.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList65);
        retryOnPrimaryException4.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList65);
        java.lang.Throwable throwable73 = retryOnPrimaryException4.getRootCause();
        org.elasticsearch.rest.RestStatus restStatus74 = retryOnPrimaryException4.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException75 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[][[][10]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.Index index76 = retryOnPrimaryException4.getIndex();
        java.lang.String str77 = retryOnPrimaryException4.toString();
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][0]] RetryOnPrimaryException[hi!]" + "'", str24, "[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNull(index36);
        org.junit.Assert.assertNotNull(throwable37);
        org.junit.Assert.assertEquals(throwable37.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable37.getMessage(), "");
        org.junit.Assert.assertEquals(throwable37.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(throwable73);
        org.junit.Assert.assertEquals(throwable73.getLocalizedMessage(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals(throwable73.getMessage(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals(throwable73.toString(), "RetryOnPrimaryException[[][[][0]] RetryOnPrimaryException[hi!]]");
        org.junit.Assert.assertTrue("'" + restStatus74 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus74.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(index76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "RetryOnPrimaryException[[][[][0]] RetryOnPrimaryException[hi!]]" + "'", str77, "RetryOnPrimaryException[[][[][0]] RetryOnPrimaryException[hi!]]");
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!");
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.Index index9 = retryOnPrimaryException4.getIndex();
        java.lang.Throwable throwable10 = retryOnPrimaryException4.unwrapCause();
        java.lang.Throwable throwable11 = retryOnPrimaryException4.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "rest.exception.stacktrace.skip");
        retryOnPrimaryException17.setShard("rest.exception.stacktrace.skip", 0);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException17);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException21.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException21);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray24 = retryOnPrimaryException4.guessRootCauses();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray25 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray26 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId27, "rest.exception.stacktrace.skip");
        retryOnPrimaryException29.setShard("rest.exception.stacktrace.skip", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray33 = retryOnPrimaryException29.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "RetryOnPrimaryException[]");
        retryOnPrimaryException29.addSuppressed((java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        java.lang.String str44 = retryOnPrimaryException43.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId45 = null;
        org.elasticsearch.index.shard.ShardId shardId47 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId47, "hi!");
        retryOnPrimaryException49.setShard("", 0);
        boolean boolean53 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException49);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray54 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException49);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId45, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException49);
        java.lang.String str56 = retryOnPrimaryException55.toString();
        retryOnPrimaryException43.addSuppressed((java.lang.Throwable) retryOnPrimaryException55);
        java.lang.Throwable throwable58 = retryOnPrimaryException43.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException59 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId39, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", (java.lang.Throwable) retryOnPrimaryException43);
        java.lang.Throwable throwable60 = retryOnPrimaryException59.unwrapCause();
        java.lang.String str61 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException59);
        java.util.List<java.lang.String> strList62 = retryOnPrimaryException59.getResourceId();
        retryOnPrimaryException59.setIndex("RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.index.shard.ShardId shardId66 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException68 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId66, "");
        retryOnPrimaryException68.setShard("hi!", (int) (short) -1);
        java.util.Set<java.lang.String> strSet72 = retryOnPrimaryException68.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId74 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException76 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId74, "hi!");
        retryOnPrimaryException76.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray80 = retryOnPrimaryException76.guessRootCauses();
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        retryOnPrimaryException76.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList87);
        retryOnPrimaryException68.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList87);
        retryOnPrimaryException59.addHeader("[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][52]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]", (java.util.List<java.lang.String>) strList87);
        retryOnPrimaryException36.addHeader("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList87);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.rest.RestStatus restStatus94 = retryOnPrimaryException4.status();
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "");
        org.junit.Assert.assertEquals(throwable11.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray24);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray25);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray26);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str44, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" + "'", str56, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(throwable58);
        org.junit.Assert.assertEquals(throwable58.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable58.getMessage(), "");
        org.junit.Assert.assertEquals(throwable58.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable60);
        org.junit.Assert.assertEquals(throwable60.getLocalizedMessage(), "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.junit.Assert.assertEquals(throwable60.getMessage(), "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.junit.Assert.assertEquals(throwable60.toString(), "[RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "retry_on_primary_exception" + "'", str61, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList62);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + restStatus94 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus94.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "hi!");
        java.util.List<java.lang.String> strList11 = retryOnPrimaryException10.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException10);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException14);
        retryOnPrimaryException15.setIndex("");
        org.elasticsearch.rest.RestStatus restStatus18 = retryOnPrimaryException15.status();
        java.lang.String str19 = retryOnPrimaryException15.toString();
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertTrue("'" + restStatus18 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus18.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[] RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];" + "'", str19, "[] RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];");
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!");
        java.util.List<java.lang.String> strList5 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.Throwable throwable7 = retryOnPrimaryException6.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!");
        retryOnPrimaryException11.setShard("", 0);
        boolean boolean15 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray16 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException11);
        java.lang.String str18 = retryOnPrimaryException11.toString();
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException11.getHeaderKeys();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray20 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "");
        org.elasticsearch.rest.RestStatus restStatus29 = retryOnPrimaryException28.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException28);
        retryOnPrimaryException30.setShard("", 10);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "", (java.lang.Throwable) retryOnPrimaryException30);
        java.lang.Throwable throwable35 = retryOnPrimaryException34.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!");
        retryOnPrimaryException39.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray43 = retryOnPrimaryException39.guessRootCauses();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        retryOnPrimaryException39.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList50);
        retryOnPrimaryException39.setIndex("RetryOnPrimaryException[hi!]");
        retryOnPrimaryException39.setShard("hi!", (int) ' ');
        org.elasticsearch.index.shard.ShardId shardId59 = null;
        org.elasticsearch.index.shard.ShardId shardId61 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException63 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId61, "hi!");
        java.util.List<java.lang.String> strList64 = retryOnPrimaryException63.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException65 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId59, "", (java.lang.Throwable) retryOnPrimaryException63);
        org.elasticsearch.rest.RestStatus restStatus66 = retryOnPrimaryException65.status();
        org.elasticsearch.index.shard.ShardId shardId68 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException70 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId68, "hi!");
        retryOnPrimaryException70.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray74 = retryOnPrimaryException70.guessRootCauses();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        retryOnPrimaryException70.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList81);
        retryOnPrimaryException65.addHeader("rest.exception.stacktrace.skip", (java.util.List<java.lang.String>) strList81);
        retryOnPrimaryException39.addHeader("", (java.util.List<java.lang.String>) strList81);
        java.lang.String[] strArray89 = new java.lang.String[] { "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", "[][[][0]] RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException39.setResources("RetryOnPrimaryException[]", strArray89);
        retryOnPrimaryException34.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray89);
        retryOnPrimaryException11.setResources("[][[][10]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray89);
        retryOnPrimaryException6.addHeader("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]", strArray89);
        org.elasticsearch.index.Index index94 = retryOnPrimaryException6.getIndex();
        java.util.List<java.lang.String> strList96 = retryOnPrimaryException6.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];");
        java.lang.String str97 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException6);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray16);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[][[][0]] RetryOnPrimaryException[hi!]" + "'", str18, "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray20);
        org.junit.Assert.assertTrue("'" + restStatus29 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus29.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "");
        org.junit.Assert.assertEquals(throwable35.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(strList64);
        org.junit.Assert.assertTrue("'" + restStatus66 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus66.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray74);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNull(index94);
        org.junit.Assert.assertNull(strList96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "retry_on_primary_exception" + "'", str97, "retry_on_primary_exception");
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!");
        retryOnPrimaryException8.addSuppressed((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId18, "hi!");
        org.elasticsearch.index.Index index21 = null;
        retryOnPrimaryException20.setIndex(index21);
        java.lang.String str23 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException20);
        java.lang.Throwable[] throwableArray24 = retryOnPrimaryException20.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException20);
        retryOnPrimaryException20.setIndex("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        java.util.List<java.lang.String> strList28 = retryOnPrimaryException20.getResourceId();
        boolean boolean29 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException20);
        java.lang.Throwable throwable30 = retryOnPrimaryException20.unwrapCause();
        retryOnPrimaryException15.addSuppressed(throwable30);
        java.util.List<java.lang.String> strList32 = retryOnPrimaryException15.getResourceId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException15.writeTo(streamOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "retry_on_primary_exception" + "'", str23, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable30.toString(), "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList32);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.Index index7 = retryOnPrimaryException2.getIndex();
        java.lang.Throwable throwable8 = retryOnPrimaryException2.unwrapCause();
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "hi!");
        retryOnPrimaryException13.setShard("", 0);
        boolean boolean17 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException13);
        java.util.List<java.lang.String> strList19 = retryOnPrimaryException13.getHeader("retry_on_primary_exception");
        java.lang.String[] strArray24 = new java.lang.String[] { "[][[][0]] RetryOnPrimaryException[hi!]", "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" };
        retryOnPrimaryException13.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray24);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", strArray24);
        retryOnPrimaryException2.setShard("[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip];", (int) (byte) 10);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "");
        org.junit.Assert.assertEquals(throwable8.toString(), "[[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip];][[[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip];][10]] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.lang.String str5 = retryOnPrimaryException4.getResourceType();
        java.lang.Throwable throwable6 = retryOnPrimaryException4.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.cause.skip", throwable6);
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus9 = retryOnPrimaryException7.status();
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException7.getHeaderKeys();
        java.lang.Class<?> wildcardClass11 = retryOnPrimaryException7.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + restStatus9 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus9.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.lang.String str3 = retryOnPrimaryException2.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!");
        retryOnPrimaryException8.setShard("", 0);
        boolean boolean12 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray13 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.String str15 = retryOnPrimaryException14.toString();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String str17 = retryOnPrimaryException2.toString();
        java.util.List<java.lang.String> strList18 = retryOnPrimaryException2.getResourceId();
        boolean boolean19 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException2.getSuppressed();
        java.lang.String str21 = retryOnPrimaryException2.toString();
        org.elasticsearch.index.shard.ShardId shardId22 = retryOnPrimaryException2.getShardId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray23 = retryOnPrimaryException2.guessRootCauses();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str3, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" + "'", str15, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RetryOnPrimaryException[]" + "'", str17, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[]" + "'", str21, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray23);
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!");
        retryOnPrimaryException4.setShard("", 0);
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException4);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException4.getHeader("retry_on_primary_exception");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.Throwable throwable12 = retryOnPrimaryException4.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "hi!");
        retryOnPrimaryException17.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray21 = retryOnPrimaryException17.guessRootCauses();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "", (java.lang.Throwable) retryOnPrimaryException17);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException22.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "rest.exception.stacktrace.skip");
        retryOnPrimaryException27.setShard("rest.exception.stacktrace.skip", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray31 = retryOnPrimaryException27.guessRootCauses();
        retryOnPrimaryException22.addSuppressed((java.lang.Throwable) retryOnPrimaryException27);
        throwable12.addSuppressed((java.lang.Throwable) retryOnPrimaryException22);
        java.lang.String str34 = retryOnPrimaryException22.toString();
        java.util.List<java.lang.String> strList36 = retryOnPrimaryException22.getHeader("");
        java.lang.Throwable[] throwableArray37 = retryOnPrimaryException22.getSuppressed();
        java.lang.Throwable throwable38 = retryOnPrimaryException22.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!");
        retryOnPrimaryException44.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray48 = retryOnPrimaryException44.guessRootCauses();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "", (java.lang.Throwable) retryOnPrimaryException44);
        java.lang.String str50 = retryOnPrimaryException44.getResourceType();
        retryOnPrimaryException44.setShard("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (-1));
        java.lang.String str54 = retryOnPrimaryException44.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId56 = null;
        org.elasticsearch.index.shard.ShardId shardId58 = null;
        org.elasticsearch.index.shard.ShardId shardId60 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException62 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId60, "hi!");
        java.util.List<java.lang.String> strList63 = retryOnPrimaryException62.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException64 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId58, "", (java.lang.Throwable) retryOnPrimaryException62);
        java.lang.String str65 = retryOnPrimaryException62.toString();
        org.elasticsearch.index.shard.ShardId shardId67 = null;
        org.elasticsearch.index.shard.ShardId shardId69 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException71 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId69, "hi!");
        boolean boolean72 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException71);
        org.elasticsearch.index.shard.ShardId shardId73 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException75 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId73, "");
        org.elasticsearch.index.shard.ShardId shardId76 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException78 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId76, "hi!");
        retryOnPrimaryException75.addSuppressed((java.lang.Throwable) retryOnPrimaryException78);
        java.util.List<java.lang.String> strList81 = null;
        retryOnPrimaryException78.addHeader("hi!", strList81);
        retryOnPrimaryException71.addSuppressed((java.lang.Throwable) retryOnPrimaryException78);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException84 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId67, "", (java.lang.Throwable) retryOnPrimaryException78);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!" };
        retryOnPrimaryException84.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray87);
        retryOnPrimaryException62.setResources("rest.exception.stacktrace.skip", strArray87);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException90 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId56, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException62);
        java.util.List<java.lang.String> strList91 = retryOnPrimaryException62.getResourceId();
        retryOnPrimaryException44.addHeader("hi!", strList91);
        retryOnPrimaryException22.addHeader("RetryOnPrimaryException[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][0]] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[hi!];", strList91);
        java.lang.String str94 = retryOnPrimaryException22.getResourceType();
        boolean boolean95 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException22);
        org.elasticsearch.index.Index index96 = retryOnPrimaryException22.getIndex();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray97 = retryOnPrimaryException22.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId98 = retryOnPrimaryException22.getShardId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.toString(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray21);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];" + "'", str34, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwable38);
        org.junit.Assert.assertEquals(throwable38.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable38.getMessage(), "");
        org.junit.Assert.assertEquals(throwable38.toString(), "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str54, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str65, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(index96);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray97);
        org.junit.Assert.assertNull(shardId98);
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "hi!");
        retryOnPrimaryException6.addSuppressed((java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.index.Index index11 = retryOnPrimaryException6.getIndex();
        java.util.List<java.lang.String> strList13 = retryOnPrimaryException6.getHeader("RetryOnPrimaryException[hi!]");
        retryOnPrimaryException6.setShard("[][[][10]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) (byte) 1);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.rest.RestStatus restStatus18 = retryOnPrimaryException6.status();
        java.lang.Throwable[] throwableArray19 = retryOnPrimaryException6.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertTrue("'" + restStatus18 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus18.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!");
        retryOnPrimaryException8.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray12 = retryOnPrimaryException8.guessRootCauses();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId14 = retryOnPrimaryException13.getShardId();
        java.lang.Throwable throwable15 = retryOnPrimaryException13.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = retryOnPrimaryException13.guessRootCauses();
        java.lang.String str18 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException13);
        java.lang.String str19 = retryOnPrimaryException13.getDetailedMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray12);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertNotNull(throwable15);
        org.junit.Assert.assertEquals(throwable15.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable15.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable15.toString(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "retry_on_primary_exception" + "'", str18, "retry_on_primary_exception");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str19, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!");
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.Index index9 = retryOnPrimaryException4.getIndex();
        boolean boolean10 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "hi!");
        retryOnPrimaryException13.setShard("", 0);
        boolean boolean17 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray18 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray19 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException13.setShard(shardId20);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "hi!");
        org.elasticsearch.index.Index index26 = null;
        retryOnPrimaryException25.setIndex(index26);
        java.util.Set<java.lang.String> strSet28 = retryOnPrimaryException25.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus29 = retryOnPrimaryException25.status();
        retryOnPrimaryException13.addSuppressed((java.lang.Throwable) retryOnPrimaryException25);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException25);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "hi!");
        retryOnPrimaryException34.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray38 = retryOnPrimaryException34.guessRootCauses();
        retryOnPrimaryException31.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        java.lang.Throwable[] throwableArray40 = retryOnPrimaryException34.getSuppressed();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray41 = retryOnPrimaryException34.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];]; nested: RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];");
        java.lang.String str45 = retryOnPrimaryException44.getResourceType();
        org.elasticsearch.index.Index index46 = retryOnPrimaryException44.getIndex();
        retryOnPrimaryException34.addSuppressed((java.lang.Throwable) retryOnPrimaryException44);
        java.lang.Throwable[] throwableArray48 = retryOnPrimaryException34.getSuppressed();
        java.lang.String str49 = retryOnPrimaryException34.toString();
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray18);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray19);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + restStatus29 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus29.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(index46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[][[][0]] RetryOnPrimaryException[hi!]" + "'", str49, "[][[][0]] RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        retryOnPrimaryException2.setShard("hi!", (int) (short) -1);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException2.setShard(shardId6);
        java.lang.String str8 = retryOnPrimaryException2.getResourceType();
        java.util.List<java.lang.String> strList9 = retryOnPrimaryException2.getResourceId();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable throwable7 = retryOnPrimaryException5.getRootCause();
        java.lang.Throwable throwable8 = retryOnPrimaryException5.getRootCause();
        java.util.List<java.lang.String> strList9 = retryOnPrimaryException5.getResourceId();
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.Index index7 = retryOnPrimaryException2.getIndex();
        java.lang.Throwable throwable8 = retryOnPrimaryException2.getRootCause();
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        retryOnPrimaryException2.setShard(shardId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "hi!");
        org.elasticsearch.index.Index index17 = null;
        retryOnPrimaryException16.setIndex(index17);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        java.lang.Throwable throwable22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId20, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", throwable22);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "hi!");
        retryOnPrimaryException27.setShard("", 0);
        boolean boolean31 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException27);
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException27.getHeader("retry_on_primary_exception");
        java.lang.String[] strArray38 = new java.lang.String[] { "[][[][0]] RetryOnPrimaryException[hi!]", "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" };
        retryOnPrimaryException27.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray38);
        retryOnPrimaryException23.setResources("[][[][0]] RetryOnPrimaryException[hi!]", strArray38);
        retryOnPrimaryException16.setResources("retry_on_primary_exception", strArray38);
        java.util.List<java.lang.String> strList42 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException2.addHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];", strList42);
        boolean boolean44 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        java.util.Set<java.lang.String> strSet45 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str46 = retryOnPrimaryException2.getResourceType();
        retryOnPrimaryException2.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];", (int) (short) 10);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "");
        org.junit.Assert.assertEquals(throwable8.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];][10]] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        retryOnPrimaryException2.setShard(shardId3);
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException2.getShardId();
        org.elasticsearch.rest.RestStatus restStatus7 = retryOnPrimaryException2.status();
        java.lang.String str8 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "hi!");
        java.util.List<java.lang.String> strList15 = retryOnPrimaryException14.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "", (java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.index.Index index17 = null;
        retryOnPrimaryException14.setIndex(index17);
        java.lang.Throwable throwable19 = retryOnPrimaryException14.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray20 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "hi!");
        java.util.List<java.lang.String> strList29 = retryOnPrimaryException28.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "", (java.lang.Throwable) retryOnPrimaryException28);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "", (java.lang.Throwable) retryOnPrimaryException30);
        java.lang.Throwable[] throwableArray32 = retryOnPrimaryException31.getSuppressed();
        boolean boolean33 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException31);
        java.lang.String str34 = retryOnPrimaryException31.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId36, "");
        retryOnPrimaryException38.setShard("hi!", (int) (short) -1);
        java.util.Set<java.lang.String> strSet42 = retryOnPrimaryException38.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId44, "hi!");
        retryOnPrimaryException46.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray50 = retryOnPrimaryException46.guessRootCauses();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        retryOnPrimaryException46.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList57);
        retryOnPrimaryException38.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList57);
        retryOnPrimaryException31.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.util.List<java.lang.String>) strList57);
        retryOnPrimaryException14.addHeader("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList57);
        retryOnPrimaryException2.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", (java.util.List<java.lang.String>) strList57);
        java.lang.Throwable[] throwableArray64 = retryOnPrimaryException2.getSuppressed();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + restStatus7 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus7.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "retry_on_primary_exception" + "'", str8, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(throwable19);
        org.junit.Assert.assertEquals(throwable19.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable19.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable19.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray20);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable throwable7 = retryOnPrimaryException5.getRootCause();
        java.lang.Throwable throwable8 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "hi!");
        retryOnPrimaryException12.setShard("", 0);
        boolean boolean16 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray18 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        retryOnPrimaryException12.setShard(shardId19);
        retryOnPrimaryException12.setShard("[][[][10]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", 0);
        retryOnPrimaryException12.setIndex("RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        retryOnPrimaryException12.setShard("RetryOnPrimaryException[rest.exception.stacktrace.skip]", (int) 'a');
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "hi!");
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException36.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "", (java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.rest.RestStatus restStatus39 = retryOnPrimaryException38.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException38);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray41 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException38);
        java.lang.Throwable throwable42 = retryOnPrimaryException38.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId43 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId43, "hi!");
        java.util.List<java.lang.String> strList46 = retryOnPrimaryException45.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray47 = retryOnPrimaryException45.guessRootCauses();
        java.util.List<java.lang.String> strList48 = retryOnPrimaryException45.getResourceId();
        retryOnPrimaryException38.addSuppressed((java.lang.Throwable) retryOnPrimaryException45);
        org.elasticsearch.index.shard.ShardId shardId51 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException53 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId51, "");
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException56 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId54, "hi!");
        retryOnPrimaryException53.addSuppressed((java.lang.Throwable) retryOnPrimaryException56);
        org.elasticsearch.index.Index index58 = retryOnPrimaryException53.getIndex();
        boolean boolean59 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException53);
        org.elasticsearch.index.shard.ShardId shardId60 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException62 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId60, "hi!");
        retryOnPrimaryException62.setShard("", 0);
        boolean boolean66 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException62);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray67 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException62);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray68 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException62);
        org.elasticsearch.index.shard.ShardId shardId69 = null;
        retryOnPrimaryException62.setShard(shardId69);
        retryOnPrimaryException53.addSuppressed((java.lang.Throwable) retryOnPrimaryException62);
        org.elasticsearch.index.shard.ShardId shardId73 = null;
        org.elasticsearch.index.shard.ShardId shardId75 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException77 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId75, "hi!");
        boolean boolean78 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException77);
        org.elasticsearch.index.shard.ShardId shardId79 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException81 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId79, "");
        org.elasticsearch.index.shard.ShardId shardId82 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException84 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId82, "hi!");
        retryOnPrimaryException81.addSuppressed((java.lang.Throwable) retryOnPrimaryException84);
        java.util.List<java.lang.String> strList87 = null;
        retryOnPrimaryException84.addHeader("hi!", strList87);
        retryOnPrimaryException77.addSuppressed((java.lang.Throwable) retryOnPrimaryException84);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException90 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId73, "", (java.lang.Throwable) retryOnPrimaryException84);
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!" };
        retryOnPrimaryException90.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray93);
        retryOnPrimaryException53.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray93);
        retryOnPrimaryException45.addHeader("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray93);
        retryOnPrimaryException12.addHeader("RetryOnPrimaryException[]", strArray93);
        retryOnPrimaryException5.setResources("[RetryOnPrimaryException[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];][[RetryOnPrimaryException[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];][97]] RetryOnPrimaryException[rest.exception.cause.skip]", strArray93);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray18);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertTrue("'" + restStatus39 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus39.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray41);
        org.junit.Assert.assertNotNull(throwable42);
        org.junit.Assert.assertEquals(throwable42.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable42.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable42.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList46);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray47);
        org.junit.Assert.assertNull(strList48);
        org.junit.Assert.assertNull(index58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray67);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray68);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!");
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException6.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        retryOnPrimaryException8.setShard(shardId10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "hi!");
        retryOnPrimaryException14.addSuppressed((java.lang.Throwable) retryOnPrimaryException17);
        org.elasticsearch.index.Index index19 = retryOnPrimaryException14.getIndex();
        java.lang.Throwable throwable20 = retryOnPrimaryException14.unwrapCause();
        boolean boolean21 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException14);
        retryOnPrimaryException8.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.util.List<java.lang.String> strList23 = retryOnPrimaryException14.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray24 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.Throwable throwable25 = retryOnPrimaryException14.getRootCause();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "");
        org.junit.Assert.assertEquals(throwable20.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray24);
        org.junit.Assert.assertNotNull(throwable25);
        org.junit.Assert.assertEquals(throwable25.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable25.getMessage(), "");
        org.junit.Assert.assertEquals(throwable25.toString(), "RetryOnPrimaryException[]");
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.rest.RestStatus restStatus7 = retryOnPrimaryException6.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException6);
        java.lang.Throwable throwable9 = retryOnPrimaryException6.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException6);
        java.lang.String str11 = retryOnPrimaryException10.getDetailedMessage();
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException10.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "");
        java.lang.String str16 = retryOnPrimaryException15.getResourceType();
        java.lang.Throwable throwable17 = retryOnPrimaryException15.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray18 = retryOnPrimaryException15.guessRootCauses();
        retryOnPrimaryException15.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip");
        retryOnPrimaryException10.addSuppressed((java.lang.Throwable) retryOnPrimaryException15);
        java.lang.String str22 = retryOnPrimaryException10.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "");
        retryOnPrimaryException26.setShard("hi!", (int) (short) -1);
        java.lang.String str30 = retryOnPrimaryException26.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId36, "hi!");
        java.util.List<java.lang.String> strList39 = retryOnPrimaryException38.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "", (java.lang.Throwable) retryOnPrimaryException38);
        java.lang.String str41 = retryOnPrimaryException38.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = null;
        org.elasticsearch.index.shard.ShardId shardId45 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException47 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId45, "hi!");
        boolean boolean48 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException47);
        org.elasticsearch.index.shard.ShardId shardId49 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException51 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId49, "");
        org.elasticsearch.index.shard.ShardId shardId52 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException54 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId52, "hi!");
        retryOnPrimaryException51.addSuppressed((java.lang.Throwable) retryOnPrimaryException54);
        java.util.List<java.lang.String> strList57 = null;
        retryOnPrimaryException54.addHeader("hi!", strList57);
        retryOnPrimaryException47.addSuppressed((java.lang.Throwable) retryOnPrimaryException54);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException60 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId43, "", (java.lang.Throwable) retryOnPrimaryException54);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        retryOnPrimaryException60.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray63);
        retryOnPrimaryException38.setResources("rest.exception.stacktrace.skip", strArray63);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException66 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException38);
        java.util.List<java.lang.String> strList67 = retryOnPrimaryException38.getResourceId();
        retryOnPrimaryException26.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strList67);
        retryOnPrimaryException10.addHeader("[[rest.exception.cause.skip] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[[rest.exception.cause.skip] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][100]] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];", strList67);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder70 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params71 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder72 = retryOnPrimaryException10.toXContent(xContentBuilder70, params71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + restStatus7 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus7.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str11, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(throwable17);
        org.junit.Assert.assertEquals(throwable17.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable17.getMessage(), "");
        org.junit.Assert.assertEquals(throwable17.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str22, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str41, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(params71);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!");
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException6.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException8);
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException8.getHeaderKeys();
        java.lang.String str11 = retryOnPrimaryException8.toString();
        java.lang.String str12 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException8);
        java.lang.String str13 = retryOnPrimaryException8.getDetailedMessage();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];" + "'", str11, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "retry_on_primary_exception" + "'", str12, "retry_on_primary_exception");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str13, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[hi!][[hi!][-1]] RetryOnPrimaryException[]");
        java.lang.String str3 = retryOnPrimaryException2.toString();
        java.lang.String[] strArray7 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip" };
        retryOnPrimaryException2.setResources("[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", strArray7);
        java.lang.String str9 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RetryOnPrimaryException[[hi!][[hi!][-1]] RetryOnPrimaryException[]]" + "'", str3, "RetryOnPrimaryException[[hi!][[hi!][-1]] RetryOnPrimaryException[]]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "retry_on_primary_exception" + "'", str9, "retry_on_primary_exception");
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!");
        retryOnPrimaryException4.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = retryOnPrimaryException4.guessRootCauses();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        retryOnPrimaryException4.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList15);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "");
        java.lang.String str24 = retryOnPrimaryException23.getResourceType();
        java.lang.Throwable throwable25 = retryOnPrimaryException23.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "rest.exception.cause.skip", throwable25);
        boolean boolean27 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException(throwable25);
        retryOnPrimaryException18.addSuppressed(throwable25);
        retryOnPrimaryException18.setIndex("[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][0]] RetryOnPrimaryException[hi!]");
        java.lang.Throwable throwable31 = retryOnPrimaryException18.getRootCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray32 = retryOnPrimaryException18.guessRootCauses();
        java.util.List<java.lang.String> strList34 = retryOnPrimaryException18.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        boolean boolean35 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException18);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(throwable25);
        org.junit.Assert.assertEquals(throwable25.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable25.getMessage(), "");
        org.junit.Assert.assertEquals(throwable25.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable31.toString(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray32);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!");
        retryOnPrimaryException2.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray6 = retryOnPrimaryException2.guessRootCauses();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        retryOnPrimaryException2.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList13);
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[hi!]");
        java.lang.String str18 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        retryOnPrimaryException2.setShard("retry_on_primary_exception", 100);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "hi!");
        retryOnPrimaryException27.addSuppressed((java.lang.Throwable) retryOnPrimaryException30);
        org.elasticsearch.index.Index index32 = retryOnPrimaryException27.getIndex();
        java.lang.Throwable throwable33 = retryOnPrimaryException27.unwrapCause();
        java.util.Set<java.lang.String> strSet34 = retryOnPrimaryException27.getHeaderKeys();
        java.lang.String str35 = retryOnPrimaryException27.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException42 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "hi!");
        retryOnPrimaryException39.addSuppressed((java.lang.Throwable) retryOnPrimaryException42);
        org.elasticsearch.index.Index index44 = retryOnPrimaryException39.getIndex();
        java.lang.Throwable throwable45 = retryOnPrimaryException39.unwrapCause();
        boolean boolean46 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException39);
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "hi!");
        retryOnPrimaryException50.setShard("", 0);
        boolean boolean54 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException50);
        java.util.List<java.lang.String> strList56 = retryOnPrimaryException50.getHeader("retry_on_primary_exception");
        java.lang.String[] strArray61 = new java.lang.String[] { "[][[][0]] RetryOnPrimaryException[hi!]", "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" };
        retryOnPrimaryException50.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray61);
        retryOnPrimaryException39.setResources("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", strArray61);
        retryOnPrimaryException27.addHeader("RetryOnPrimaryException[hi!]", strArray61);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException65 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException27);
        org.elasticsearch.index.shard.ShardId shardId67 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException69 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId67, "");
        retryOnPrimaryException69.setShard("hi!", (int) (short) -1);
        java.util.Set<java.lang.String> strSet73 = retryOnPrimaryException69.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId75 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException77 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId75, "hi!");
        retryOnPrimaryException77.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray81 = retryOnPrimaryException77.guessRootCauses();
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        retryOnPrimaryException77.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList88);
        retryOnPrimaryException69.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList88);
        retryOnPrimaryException65.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList88);
        retryOnPrimaryException2.addHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.util.List<java.lang.String>) strList88);
        java.lang.Throwable throwable94 = retryOnPrimaryException2.unwrapCause();
        java.util.Set<java.lang.String> strSet95 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str96 = retryOnPrimaryException2.getResourceType();
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "retry_on_primary_exception" + "'", str18, "retry_on_primary_exception");
        org.junit.Assert.assertNull(index32);
        org.junit.Assert.assertNotNull(throwable33);
        org.junit.Assert.assertEquals(throwable33.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable33.getMessage(), "");
        org.junit.Assert.assertEquals(throwable33.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(index44);
        org.junit.Assert.assertNotNull(throwable45);
        org.junit.Assert.assertEquals(throwable45.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable45.getMessage(), "");
        org.junit.Assert.assertEquals(throwable45.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(strList56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray81);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(throwable94);
        org.junit.Assert.assertEquals(throwable94.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable94.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable94.toString(), "[retry_on_primary_exception][[retry_on_primary_exception][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!");
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException6.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];", (java.lang.Throwable) retryOnPrimaryException8);
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException8.getHeaderKeys();
        org.elasticsearch.index.Index index11 = retryOnPrimaryException8.getIndex();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "hi!");
        retryOnPrimaryException14.addSuppressed((java.lang.Throwable) retryOnPrimaryException17);
        java.lang.String str19 = retryOnPrimaryException14.toString();
        java.lang.Throwable throwable20 = retryOnPrimaryException14.unwrapCause();
        retryOnPrimaryException8.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.index.shard.ShardId shardId22 = retryOnPrimaryException8.getShardId();
        org.elasticsearch.rest.RestStatus restStatus23 = retryOnPrimaryException8.status();
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException8.getHeader("[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip];");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RetryOnPrimaryException[]" + "'", str19, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "");
        org.junit.Assert.assertEquals(throwable20.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertTrue("'" + restStatus23 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus23.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList25);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!");
        retryOnPrimaryException6.setShard("", 0);
        boolean boolean10 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException6);
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException6.getHeader("retry_on_primary_exception");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "", (java.lang.Throwable) retryOnPrimaryException6);
        java.lang.Throwable throwable14 = retryOnPrimaryException6.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "hi!");
        retryOnPrimaryException19.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray23 = retryOnPrimaryException19.guessRootCauses();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "", (java.lang.Throwable) retryOnPrimaryException19);
        java.util.List<java.lang.String> strList26 = retryOnPrimaryException24.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId27, "rest.exception.stacktrace.skip");
        retryOnPrimaryException29.setShard("rest.exception.stacktrace.skip", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray33 = retryOnPrimaryException29.guessRootCauses();
        retryOnPrimaryException24.addSuppressed((java.lang.Throwable) retryOnPrimaryException29);
        throwable14.addSuppressed((java.lang.Throwable) retryOnPrimaryException24);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", throwable14);
        java.lang.String str37 = retryOnPrimaryException36.getDetailedMessage();
        org.elasticsearch.common.io.stream.StreamInput streamInput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable39 = org.elasticsearch.ElasticsearchException.readStackTrace((java.lang.Throwable) retryOnPrimaryException36, streamInput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "[][[][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray23);
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str37, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!");
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "hi!");
        retryOnPrimaryException13.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = retryOnPrimaryException13.guessRootCauses();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        retryOnPrimaryException13.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList24);
        retryOnPrimaryException13.setIndex("RetryOnPrimaryException[hi!]");
        retryOnPrimaryException13.setShard("hi!", (int) ' ');
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "hi!");
        java.util.List<java.lang.String> strList38 = retryOnPrimaryException37.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "", (java.lang.Throwable) retryOnPrimaryException37);
        org.elasticsearch.rest.RestStatus restStatus40 = retryOnPrimaryException39.status();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!");
        retryOnPrimaryException44.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray48 = retryOnPrimaryException44.guessRootCauses();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        retryOnPrimaryException44.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList55);
        retryOnPrimaryException39.addHeader("rest.exception.stacktrace.skip", (java.util.List<java.lang.String>) strList55);
        retryOnPrimaryException13.addHeader("", (java.util.List<java.lang.String>) strList55);
        java.lang.String[] strArray63 = new java.lang.String[] { "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", "[][[][0]] RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException13.setResources("RetryOnPrimaryException[]", strArray63);
        retryOnPrimaryException4.addHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", strArray63);
        org.elasticsearch.index.shard.ShardId shardId67 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException69 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId67, "");
        retryOnPrimaryException69.setShard("hi!", (int) (short) -1);
        java.util.Set<java.lang.String> strSet73 = retryOnPrimaryException69.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId75 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException77 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId75, "hi!");
        retryOnPrimaryException77.setShard("", 0);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray81 = retryOnPrimaryException77.guessRootCauses();
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "retry_on_primary_exception", "", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        retryOnPrimaryException77.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList88);
        retryOnPrimaryException69.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList88);
        retryOnPrimaryException4.addHeader("hi!", (java.util.List<java.lang.String>) strList88);
        java.lang.String str93 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException elasticsearchException95 = org.elasticsearch.ElasticsearchException.writeStackTraces((org.elasticsearch.ElasticsearchException) retryOnPrimaryException4, streamOutput94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(strList38);
        org.junit.Assert.assertTrue("'" + restStatus40 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus40.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray81);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "retry_on_primary_exception" + "'", str93, "retry_on_primary_exception");
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!");
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.Index index10 = null;
        retryOnPrimaryException4.setIndex(index10);
        org.elasticsearch.rest.RestStatus restStatus12 = retryOnPrimaryException4.status();
        java.lang.Throwable[] throwableArray13 = retryOnPrimaryException4.getSuppressed();
        java.lang.Throwable throwable14 = retryOnPrimaryException4.getRootCause();
        org.junit.Assert.assertTrue("'" + restStatus12 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus12.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[]");
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!");
        retryOnPrimaryException2.setShard("", 0);
        boolean boolean6 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str8 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setShard("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) (short) 0);
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str13 = retryOnPrimaryException2.getResourceType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str8, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "hi!");
        retryOnPrimaryException10.setShard("", 0);
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException10.setIndex(index14);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", (java.lang.Throwable) retryOnPrimaryException10);
        retryOnPrimaryException10.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException10);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException19.setShard(shardId20);
        boolean boolean22 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException19);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray23 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException19);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "", (java.lang.Throwable) retryOnPrimaryException19);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException19);
        org.elasticsearch.index.shard.ShardId shardId26 = retryOnPrimaryException19.getShardId();
        retryOnPrimaryException19.setShard("RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray23);
        org.junit.Assert.assertNull(shardId26);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException4.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException6.getHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        java.lang.String str9 = retryOnPrimaryException6.toString();
        java.lang.String[] strArray14 = new java.lang.String[] { "RetryOnPrimaryException[]", "retry_on_primary_exception", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        retryOnPrimaryException6.setResources("", strArray14);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!");
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException21.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "", (java.lang.Throwable) retryOnPrimaryException21);
        java.lang.String str24 = retryOnPrimaryException21.toString();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId29, "");
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "hi!");
        retryOnPrimaryException31.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId27, "RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException31);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException31);
        retryOnPrimaryException21.addSuppressed((java.lang.Throwable) retryOnPrimaryException37);
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "");
        org.elasticsearch.rest.RestStatus restStatus45 = retryOnPrimaryException44.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "", (java.lang.Throwable) retryOnPrimaryException44);
        java.util.List<java.lang.String> strList48 = retryOnPrimaryException46.getHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        java.lang.String str49 = retryOnPrimaryException46.toString();
        java.lang.String[] strArray54 = new java.lang.String[] { "RetryOnPrimaryException[]", "retry_on_primary_exception", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        retryOnPrimaryException46.setResources("", strArray54);
        retryOnPrimaryException37.addHeader("RetryOnPrimaryException[hi!]", strArray54);
        retryOnPrimaryException6.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip", strArray54);
        java.lang.String str58 = retryOnPrimaryException6.getResourceType();
        java.util.List<java.lang.String> strList60 = retryOnPrimaryException6.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput61 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException6.writeTo(streamOutput61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];" + "'", str9, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str24, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus45 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus45.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];" + "'", str49, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip" + "'", str58, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip");
        org.junit.Assert.assertNull(strList60);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!");
        boolean boolean3 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "hi!");
        retryOnPrimaryException6.addSuppressed((java.lang.Throwable) retryOnPrimaryException9);
        java.util.List<java.lang.String> strList12 = null;
        retryOnPrimaryException9.addHeader("hi!", strList12);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray15 = retryOnPrimaryException9.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "");
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId20, "hi!");
        retryOnPrimaryException19.addSuppressed((java.lang.Throwable) retryOnPrimaryException22);
        org.elasticsearch.index.Index index24 = retryOnPrimaryException19.getIndex();
        java.lang.Throwable throwable25 = retryOnPrimaryException19.unwrapCause();
        boolean boolean26 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException19);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "hi!");
        retryOnPrimaryException30.setShard("", 0);
        boolean boolean34 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException30);
        java.util.List<java.lang.String> strList36 = retryOnPrimaryException30.getHeader("retry_on_primary_exception");
        java.lang.String[] strArray41 = new java.lang.String[] { "[][[][0]] RetryOnPrimaryException[hi!]", "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" };
        retryOnPrimaryException30.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray41);
        retryOnPrimaryException19.setResources("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", strArray41);
        retryOnPrimaryException9.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray41);
        retryOnPrimaryException9.setIndex("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        java.lang.Throwable[] throwableArray47 = retryOnPrimaryException9.getSuppressed();
        org.elasticsearch.rest.RestStatus restStatus48 = retryOnPrimaryException9.status();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray15);
        org.junit.Assert.assertNull(index24);
        org.junit.Assert.assertNotNull(throwable25);
        org.junit.Assert.assertEquals(throwable25.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable25.getMessage(), "");
        org.junit.Assert.assertEquals(throwable25.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + restStatus48 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus48.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.lang.String str5 = retryOnPrimaryException4.getResourceType();
        java.lang.Throwable throwable6 = retryOnPrimaryException4.unwrapCause();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException4.getHeader("rest.exception.cause.skip");
        java.util.List<java.lang.String> strList9 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException4.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!");
        retryOnPrimaryException8.setShard("", 0);
        org.elasticsearch.index.Index index12 = null;
        retryOnPrimaryException8.setIndex(index12);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", (java.lang.Throwable) retryOnPrimaryException8);
        retryOnPrimaryException8.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "hi!");
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException23.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "", (java.lang.Throwable) retryOnPrimaryException23);
        java.lang.String str26 = retryOnPrimaryException23.toString();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!");
        boolean boolean33 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException32);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "");
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!");
        retryOnPrimaryException36.addSuppressed((java.lang.Throwable) retryOnPrimaryException39);
        java.util.List<java.lang.String> strList42 = null;
        retryOnPrimaryException39.addHeader("hi!", strList42);
        retryOnPrimaryException32.addSuppressed((java.lang.Throwable) retryOnPrimaryException39);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "", (java.lang.Throwable) retryOnPrimaryException39);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        retryOnPrimaryException45.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray48);
        retryOnPrimaryException23.setResources("rest.exception.stacktrace.skip", strArray48);
        retryOnPrimaryException8.addHeader("RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray48);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException52 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.Throwable throwable53 = retryOnPrimaryException8.getRootCause();
        java.lang.String str54 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException8);
        java.util.List<java.lang.String> strList55 = retryOnPrimaryException8.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId56 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException58 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId56, "");
        org.elasticsearch.index.shard.ShardId shardId59 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException61 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId59, "hi!");
        retryOnPrimaryException58.addSuppressed((java.lang.Throwable) retryOnPrimaryException61);
        java.util.List<java.lang.String> strList63 = retryOnPrimaryException58.getResourceId();
        java.lang.String str64 = retryOnPrimaryException58.getDetailedMessage();
        java.lang.Throwable throwable65 = retryOnPrimaryException58.getRootCause();
        java.lang.String str66 = retryOnPrimaryException58.getResourceType();
        retryOnPrimaryException8.addSuppressed((java.lang.Throwable) retryOnPrimaryException58);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str26, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(throwable53);
        org.junit.Assert.assertEquals(throwable53.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable53.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable53.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][0]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "retry_on_primary_exception" + "'", str54, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList55);
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str64, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable65);
        org.junit.Assert.assertEquals(throwable65.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable65.getMessage(), "");
        org.junit.Assert.assertEquals(throwable65.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.Index index7 = retryOnPrimaryException2.getIndex();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!");
        retryOnPrimaryException11.setShard("", 0);
        boolean boolean15 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray16 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        retryOnPrimaryException11.setShard(shardId18);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException11);
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException11.getSuppressed();
        retryOnPrimaryException11.setShard("[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[hi!]", (-1));
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray16);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!");
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException6.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException8);
        java.util.List<java.lang.String> strList11 = retryOnPrimaryException9.getHeader("");
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException9.getHeaderKeys();
        org.elasticsearch.index.Index index13 = retryOnPrimaryException9.getIndex();
        java.util.List<java.lang.String> strList15 = retryOnPrimaryException9.getHeader("[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]");
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "hi!");
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException23.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "", (java.lang.Throwable) retryOnPrimaryException23);
        java.lang.String str26 = retryOnPrimaryException23.toString();
        boolean boolean27 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException23);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "", (java.lang.Throwable) retryOnPrimaryException23);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "");
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "hi!");
        retryOnPrimaryException32.addSuppressed((java.lang.Throwable) retryOnPrimaryException35);
        org.elasticsearch.index.Index index37 = retryOnPrimaryException32.getIndex();
        java.lang.Throwable throwable38 = retryOnPrimaryException32.unwrapCause();
        java.util.Set<java.lang.String> strSet39 = retryOnPrimaryException32.getHeaderKeys();
        java.lang.String str40 = retryOnPrimaryException32.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "");
        org.elasticsearch.index.shard.ShardId shardId45 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException47 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId45, "hi!");
        retryOnPrimaryException44.addSuppressed((java.lang.Throwable) retryOnPrimaryException47);
        org.elasticsearch.index.Index index49 = retryOnPrimaryException44.getIndex();
        java.lang.Throwable throwable50 = retryOnPrimaryException44.unwrapCause();
        boolean boolean51 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException44);
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "hi!");
        retryOnPrimaryException55.setShard("", 0);
        boolean boolean59 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException55);
        java.util.List<java.lang.String> strList61 = retryOnPrimaryException55.getHeader("retry_on_primary_exception");
        java.lang.String[] strArray66 = new java.lang.String[] { "[][[][0]] RetryOnPrimaryException[hi!]", "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];" };
        retryOnPrimaryException55.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray66);
        retryOnPrimaryException44.setResources("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", strArray66);
        retryOnPrimaryException32.addHeader("RetryOnPrimaryException[hi!]", strArray66);
        retryOnPrimaryException28.setResources("[rest.exception.cause.skip] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];", strArray66);
        retryOnPrimaryException9.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray66);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder72 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params73 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder74 = retryOnPrimaryException9.toXContent(xContentBuilder72, params73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str26, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(throwable38);
        org.junit.Assert.assertEquals(throwable38.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable38.getMessage(), "");
        org.junit.Assert.assertEquals(throwable38.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(index49);
        org.junit.Assert.assertNotNull(throwable50);
        org.junit.Assert.assertEquals(throwable50.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable50.getMessage(), "");
        org.junit.Assert.assertEquals(throwable50.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(strList61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(params73);
    }
}

