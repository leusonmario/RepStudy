import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "hi!", (java.lang.Throwable) retryOnPrimaryException12);
        java.lang.String str14 = retryOnPrimaryException13.getResourceType();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException13.addHeader("hi!", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", (java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "hi!", (java.lang.Throwable) retryOnPrimaryException27);
        java.lang.String str29 = retryOnPrimaryException28.getResourceType();
        retryOnPrimaryException22.addSuppressed((java.lang.Throwable) retryOnPrimaryException28);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException28);
        java.lang.String str32 = retryOnPrimaryException4.toString();
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray34 = retryOnPrimaryException4.guessRootCauses();
        java.lang.Throwable[] throwableArray35 = retryOnPrimaryException4.getSuppressed();
        retryOnPrimaryException4.setShard("RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) 'a');
        java.lang.String str39 = retryOnPrimaryException4.getDetailedMessage();
        java.lang.String str40 = retryOnPrimaryException4.getDetailedMessage();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "RetryOnPrimaryException[]" + "'", str32, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str39, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str40, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", (java.lang.Throwable) retryOnPrimaryException10);
        java.lang.String str12 = retryOnPrimaryException11.getResourceType();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        retryOnPrimaryException11.addHeader("hi!", (java.util.List<java.lang.String>) strList17);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.rest.RestStatus restStatus21 = retryOnPrimaryException20.status();
        java.lang.Throwable[] throwableArray22 = retryOnPrimaryException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = retryOnPrimaryException20.getSuppressed();
        java.lang.String str24 = retryOnPrimaryException20.getDetailedMessage();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException20);
        java.util.List<java.lang.String> strList26 = retryOnPrimaryException25.getResourceId();
        java.lang.String str27 = retryOnPrimaryException25.toString();
        java.util.List<java.lang.String> strList29 = retryOnPrimaryException25.getHeader("RetryOnPrimaryException[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; [][[][-1]] RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        java.lang.Throwable throwable30 = retryOnPrimaryException25.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException25);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + restStatus21 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus21.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str24, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RetryOnPrimaryException[RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];" + "'", str27, "RetryOnPrimaryException[RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertEquals(throwable30.toString(), "RetryOnPrimaryException[RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.index.shard.ShardId shardId8 = retryOnPrimaryException6.getShardId();
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException6);
        java.lang.Throwable throwable10 = retryOnPrimaryException6.getRootCause();
        java.lang.String str11 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.index.shard.ShardId shardId13 = retryOnPrimaryException12.getShardId();
        java.util.List<java.lang.String> strList14 = retryOnPrimaryException12.getResourceId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException16 = org.elasticsearch.ElasticsearchException.writeStackTraces((java.lang.RuntimeException) retryOnPrimaryException12, streamOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "retry_on_primary_exception" + "'", str11, "retry_on_primary_exception");
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNull(strList14);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "hi!", (java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId20, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId18, "hi!", (java.lang.Throwable) retryOnPrimaryException22);
        java.lang.String str24 = retryOnPrimaryException23.getResourceType();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        retryOnPrimaryException23.addHeader("hi!", (java.util.List<java.lang.String>) strList29);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "hi!", (java.lang.Throwable) retryOnPrimaryException23);
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "hi!", (java.lang.Throwable) retryOnPrimaryException37);
        java.lang.String str39 = retryOnPrimaryException38.getResourceType();
        retryOnPrimaryException32.addSuppressed((java.lang.Throwable) retryOnPrimaryException38);
        retryOnPrimaryException14.addSuppressed((java.lang.Throwable) retryOnPrimaryException38);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException42 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException38);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "RetryOnPrimaryException[RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException38);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException38);
        org.elasticsearch.rest.RestStatus restStatus45 = retryOnPrimaryException38.status();
        java.lang.String str46 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException38);
        java.util.List<java.lang.String> strList47 = retryOnPrimaryException38.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException48 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException38);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + restStatus45 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus45.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "retry_on_primary_exception" + "'", str46, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList47);
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId10 = retryOnPrimaryException8.getShardId();
        boolean boolean11 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        retryOnPrimaryException8.setShard(shardId12);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.String str15 = retryOnPrimaryException14.getResourceType();
        org.elasticsearch.index.Index index16 = retryOnPrimaryException14.getIndex();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = org.elasticsearch.ElasticsearchException.writeStackTraces(retryOnPrimaryException14, streamOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(index16);
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.shard.ShardId shardId10 = retryOnPrimaryException8.getShardId();
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException8.getHeader("");
        java.lang.String str13 = retryOnPrimaryException8.toString();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "hi!", (java.lang.Throwable) retryOnPrimaryException18);
        org.elasticsearch.index.shard.ShardId shardId20 = retryOnPrimaryException18.getShardId();
        java.lang.String[] strArray26 = new java.lang.String[] { "RetryOnPrimaryException[]", "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", "retry_on_primary_exception", "retry_on_primary_exception" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        retryOnPrimaryException18.addHeader("RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", (java.util.List<java.lang.String>) strList27);
        retryOnPrimaryException8.addSuppressed((java.lang.Throwable) retryOnPrimaryException18);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException18);
        java.util.Set<java.lang.String> strSet32 = retryOnPrimaryException18.getHeaderKeys();
        java.lang.Throwable[] throwableArray33 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException18);
        java.util.Set<java.lang.String> strSet35 = retryOnPrimaryException18.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        org.elasticsearch.index.shard.ShardId shardId46 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException48 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId46, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId44, "hi!", (java.lang.Throwable) retryOnPrimaryException48);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!", (java.lang.Throwable) retryOnPrimaryException48);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException51 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "", (java.lang.Throwable) retryOnPrimaryException50);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException52 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException50);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException53 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId36, "hi!", (java.lang.Throwable) retryOnPrimaryException50);
        boolean boolean54 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException53);
        retryOnPrimaryException18.addSuppressed((java.lang.Throwable) retryOnPrimaryException53);
        java.lang.String str56 = retryOnPrimaryException53.getDetailedMessage();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException58 = org.elasticsearch.ElasticsearchException.writeStackTraces(retryOnPrimaryException53, streamOutput57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RetryOnPrimaryException[]" + "'", str13, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(shardId20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str56, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", (java.lang.Throwable) retryOnPrimaryException10);
        org.elasticsearch.index.shard.ShardId shardId12 = retryOnPrimaryException10.getShardId();
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException10);
        java.lang.Throwable throwable14 = retryOnPrimaryException10.getRootCause();
        java.lang.String str15 = retryOnPrimaryException10.toString();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "RetryOnPrimaryException[RetryOnPrimaryException[RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]", (java.lang.Throwable) retryOnPrimaryException10);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", (java.lang.Throwable) retryOnPrimaryException23);
        org.elasticsearch.index.shard.ShardId shardId25 = retryOnPrimaryException23.getShardId();
        java.lang.Throwable throwable26 = retryOnPrimaryException23.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", throwable26);
        org.elasticsearch.index.Index index28 = retryOnPrimaryException27.getIndex();
        java.util.Set<java.lang.String> strSet29 = retryOnPrimaryException27.getHeaderKeys();
        java.lang.Throwable throwable30 = retryOnPrimaryException27.getRootCause();
        java.lang.Throwable throwable31 = retryOnPrimaryException27.getRootCause();
        retryOnPrimaryException16.addSuppressed((java.lang.Throwable) retryOnPrimaryException27);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNull(shardId12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RetryOnPrimaryException[]" + "'", str15, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(shardId25);
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "");
        org.junit.Assert.assertEquals(throwable26.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "");
        org.junit.Assert.assertEquals(throwable30.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "");
        org.junit.Assert.assertEquals(throwable31.toString(), "RetryOnPrimaryException[]");
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [RetryOnPrimaryException[]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        java.util.List<java.lang.String> strList4 = retryOnPrimaryException2.getHeader("[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        retryOnPrimaryException2.setShard(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        retryOnPrimaryException2.setShard(shardId7);
        java.lang.String str9 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str10 = retryOnPrimaryException2.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable12 = org.elasticsearch.ElasticsearchException.readStackTrace((java.lang.Throwable) retryOnPrimaryException2, streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "retry_on_primary_exception" + "'", str9, "retry_on_primary_exception");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [RetryOnPrimaryException[]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];]" + "'", str10, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [RetryOnPrimaryException[]; nested: RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];]");
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException6);
        java.lang.String str8 = retryOnPrimaryException7.getResourceType();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        retryOnPrimaryException7.addHeader("hi!", (java.util.List<java.lang.String>) strList13);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "hi!", (java.lang.Throwable) retryOnPrimaryException21);
        java.lang.String str23 = retryOnPrimaryException22.getResourceType();
        retryOnPrimaryException16.addSuppressed((java.lang.Throwable) retryOnPrimaryException22);
        java.lang.String str25 = retryOnPrimaryException22.toString();
        org.elasticsearch.index.Index index26 = null;
        retryOnPrimaryException22.setIndex(index26);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!", (java.lang.Throwable) retryOnPrimaryException34);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "hi!", (java.lang.Throwable) retryOnPrimaryException34);
        boolean boolean37 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        java.lang.String str41 = retryOnPrimaryException40.getResourceType();
        retryOnPrimaryException36.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray43 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException36);
        retryOnPrimaryException22.addSuppressed((java.lang.Throwable) retryOnPrimaryException36);
        java.lang.Throwable throwable45 = retryOnPrimaryException36.getRootCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray46 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.rest.RestStatus restStatus47 = retryOnPrimaryException36.status();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];" + "'", str25, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray43);
        org.junit.Assert.assertNotNull(throwable45);
        org.junit.Assert.assertEquals(throwable45.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable45.getMessage(), "");
        org.junit.Assert.assertEquals(throwable45.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray46);
        org.junit.Assert.assertTrue("'" + restStatus47 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus47.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.index.shard.ShardId shardId8 = retryOnPrimaryException6.getShardId();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException6.setShard(shardId9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.index.shard.ShardId shardId12 = retryOnPrimaryException6.getShardId();
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNull(shardId12);
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.String str6 = retryOnPrimaryException5.getResourceType();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        retryOnPrimaryException5.addHeader("hi!", (java.util.List<java.lang.String>) strList11);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "hi!", (java.lang.Throwable) retryOnPrimaryException19);
        java.lang.String str21 = retryOnPrimaryException20.getResourceType();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        retryOnPrimaryException20.addHeader("hi!", (java.util.List<java.lang.String>) strList26);
        retryOnPrimaryException5.addHeader("rest.exception.stacktrace.skip", (java.util.List<java.lang.String>) strList26);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "hi!", (java.lang.Throwable) retryOnPrimaryException36);
        java.lang.String str38 = retryOnPrimaryException37.getResourceType();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        retryOnPrimaryException37.addHeader("hi!", (java.util.List<java.lang.String>) strList43);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!", (java.lang.Throwable) retryOnPrimaryException37);
        java.lang.String str47 = retryOnPrimaryException46.toString();
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException46);
        retryOnPrimaryException5.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", 0);
        org.elasticsearch.rest.RestStatus restStatus52 = retryOnPrimaryException5.status();
        java.lang.String str53 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable throwable54 = retryOnPrimaryException5.unwrapCause();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];" + "'", str47, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertTrue("'" + restStatus52 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus52.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "retry_on_primary_exception" + "'", str53, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable54);
        org.junit.Assert.assertEquals(throwable54.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable54.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable54.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][0]] RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", (java.lang.Throwable) retryOnPrimaryException10);
        java.lang.String str12 = retryOnPrimaryException11.getResourceType();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        retryOnPrimaryException11.addHeader("hi!", (java.util.List<java.lang.String>) strList17);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException11);
        java.lang.String str21 = retryOnPrimaryException20.toString();
        java.util.List<java.lang.String> strList23 = retryOnPrimaryException20.getHeader("");
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException20.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException20);
        java.lang.Throwable throwable26 = retryOnPrimaryException20.unwrapCause();
        java.lang.String str27 = retryOnPrimaryException20.getResourceType();
        java.lang.Throwable throwable28 = retryOnPrimaryException20.getRootCause();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, throwable28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];" + "'", str21, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.toString(), "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(throwable28);
        org.junit.Assert.assertEquals(throwable28.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable28.getMessage(), "");
        org.junit.Assert.assertEquals(throwable28.toString(), "RetryOnPrimaryException[]");
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.String str10 = retryOnPrimaryException9.getResourceType();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        retryOnPrimaryException9.addHeader("hi!", (java.util.List<java.lang.String>) strList15);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", (java.lang.Throwable) retryOnPrimaryException23);
        java.lang.String str25 = retryOnPrimaryException24.getResourceType();
        retryOnPrimaryException18.addSuppressed((java.lang.Throwable) retryOnPrimaryException24);
        org.elasticsearch.index.shard.ShardId shardId27 = retryOnPrimaryException18.getShardId();
        java.lang.Throwable throwable28 = retryOnPrimaryException18.unwrapCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", throwable28);
        java.util.List<java.lang.String> strList30 = retryOnPrimaryException29.getResourceId();
        java.util.Set<java.lang.String> strSet31 = retryOnPrimaryException29.getHeaderKeys();
        java.util.List<java.lang.String> strList32 = retryOnPrimaryException29.getResourceId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = org.elasticsearch.ElasticsearchException.writeStackTraces(retryOnPrimaryException29, streamOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(shardId27);
        org.junit.Assert.assertNotNull(throwable28);
        org.junit.Assert.assertEquals(throwable28.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.toString(), "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(strList32);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.String str10 = retryOnPrimaryException9.getResourceType();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        retryOnPrimaryException9.addHeader("hi!", (java.util.List<java.lang.String>) strList15);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.rest.RestStatus restStatus19 = retryOnPrimaryException18.status();
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException18.getSuppressed();
        java.lang.Throwable[] throwableArray22 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "hi!", (java.lang.Throwable) retryOnPrimaryException28);
        java.lang.String str30 = retryOnPrimaryException29.getResourceType();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        retryOnPrimaryException29.addHeader("hi!", (java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "RetryOnPrimaryException[]", "", "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];", "rest.exception.cause.skip" };
        retryOnPrimaryException29.setResources("rest.exception.stacktrace.skip", strArray43);
        retryOnPrimaryException18.setResources("", strArray43);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException18);
        java.lang.String str47 = retryOnPrimaryException18.getResourceType();
        java.lang.String str48 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException18);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + restStatus19 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus19.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "retry_on_primary_exception" + "'", str48, "retry_on_primary_exception");
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[];");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.index.shard.ShardId shardId11 = retryOnPrimaryException9.getShardId();
        boolean boolean12 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException9);
        java.lang.Throwable throwable13 = retryOnPrimaryException9.getRootCause();
        java.lang.String str14 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.index.shard.ShardId shardId16 = retryOnPrimaryException15.getShardId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException15);
        boolean boolean18 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException15);
        java.lang.String str19 = retryOnPrimaryException15.toString();
        org.junit.Assert.assertNull(shardId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "retry_on_primary_exception" + "'", str14, "retry_on_primary_exception");
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];" + "'", str19, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        java.lang.String str10 = retryOnPrimaryException9.getResourceType();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        retryOnPrimaryException9.addHeader("hi!", (java.util.List<java.lang.String>) strList15);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.rest.RestStatus restStatus19 = retryOnPrimaryException18.status();
        boolean boolean20 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException18);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException18);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException18.getResourceId();
        org.elasticsearch.index.Index index23 = retryOnPrimaryException18.getIndex();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + restStatus19 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus19.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNull(index23);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException8);
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray13 = retryOnPrimaryException8.guessRootCauses();
        java.lang.Class<?> wildcardClass14 = elasticsearchExceptionArray13.getClass();
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

